package problem2;

import java.util.List;

public class Warrior {

    private int level;
    private int experience;
    private String rank;
    private List<String> achievements;

    public Warrior() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    public String battle(int level){
        return "";
    }

    public String training(List<Object> enemy){
        return "";
    }

}
