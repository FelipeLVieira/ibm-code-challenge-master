package problem2.warrior;

import problem2.battle.BattleController;
import problem2.battle.BattleResult;
import problem2.rank.RankController;

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
        this.rank = new RankController().getRankByLevel(this.level);
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public String getRank() {
        return rank;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public String battle(int level){

        BattleController battleController = new BattleController();
        BattleResult battleResult = battleController.handleBattle(this.level, level);
        handleLevelUp(battleResult.getExperience());
        System.out.println(battleResult.getMessage());
        return battleResult.getMessage();
    }

    private void handleLevelUp(int experienceEarned){
        int previousLevelRefecence = this.experience/100;
        int newLevelReference = (this.experience + experienceEarned)/100;
        this.experience += experienceEarned;

        if (newLevelReference - previousLevelRefecence > 0){
            this.level = newLevelReference - previousLevelRefecence;
            this.rank = new RankController().getRankByLevel(this.level);
        }
    }

    public String training(String challenge, int experience, int levelRequirement){
        if(this.level < levelRequirement){
            System.out.println("Not strong enough");
            return "Not strong enough";
        }
        return "";
    }

}
