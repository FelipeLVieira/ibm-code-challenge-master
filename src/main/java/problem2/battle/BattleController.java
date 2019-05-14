package problem2.battle;

public class BattleController {

    public BattleController() {
    }

    public BattleResult handleBattle(int warriorLevel, int enemyLevel) {
        BattleResult battleResult = new BattleResult();

        if (1 < enemyLevel && enemyLevel > 100){
            battleResult.setMessage("Invalid level");
            battleResult.setExperience(0);
            return battleResult;
        }

        int levelDifference = enemyLevel - warriorLevel;

        if(levelDifference == 0){
            battleResult.setMessage("A good fight");
            battleResult.setExperience(10);
            return battleResult;
        }

        if(levelDifference == -1){
            battleResult.setMessage("A good fight");
            battleResult.setExperience(5);
            return battleResult;
        }

        if(levelDifference >= -2){
            battleResult.setMessage("Easy fight");
            battleResult.setExperience(0);
            return battleResult;
        }

        battleResult.setMessage("An intense fight");
        battleResult.setExperience(20 * levelDifference * levelDifference);
        return battleResult;
    }
}
