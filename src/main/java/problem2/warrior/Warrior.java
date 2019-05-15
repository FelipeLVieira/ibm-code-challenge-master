package problem2.warrior;

import problem2.battle.BattleResult;
import problem2.battle.BattleService;
import problem2.rank.RankService;

import java.util.ArrayList;
import java.util.List;

public class Warrior {

    private int level;
    private int experience;
    private String rank;
    private List<String> achievements;

    public Warrior() {
        this.initializeWarrior();
    }

    private void initializeWarrior(){
        this.level = 1;
        this.experience = 100;
        this.rank = new RankService().getRankTierByLevel(this.level);
        this.achievements = new ArrayList<>();
    }

    public int getLevel() {
        System.out.println(level);
        return level;
    }

    public int getExperience() {
        System.out.println(experience);
        return experience;
    }

    public String getRank() {
        System.out.println(rank);
        return rank;
    }

    public List<String> getAchievements() {
        System.out.println(achievements);
        return achievements;
    }

    public String battle(int enemyLevel){

        BattleService battleService = new BattleService();
        BattleResult battleResult = battleService.handleBattle(this.level, enemyLevel);

        handleLevelUp(battleResult.getExperience());

        System.out.println(battleResult.getMessage());
        return battleResult.getMessage();
    }

    private void handleLevelUp(int experienceEarned){
        int previousLevelRefecence = experience/100;
        int newLevelReference = (experience + experienceEarned)/100;

        this.experience += experienceEarned;

        if (newLevelReference - previousLevelRefecence > 0){
            this.level += newLevelReference - previousLevelRefecence;
            this.rank = new RankService().getRankTierByLevel(this.level);
        }
    }

    public String training(String challenge, int experience, int levelRequirement){
        if(this.level < levelRequirement){
            System.out.println("Not strong enough");
            return "Not strong enough";
        }

        handleLevelUp(experience);

        this.achievements.add(challenge);

        System.out.println(challenge);
        return challenge;
    }

}
