package problem2.battle;

public class BattleResult {
    private int experience;
    private String message;

    public BattleResult() {
        this.experience = 0;
        this.message = "";
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
