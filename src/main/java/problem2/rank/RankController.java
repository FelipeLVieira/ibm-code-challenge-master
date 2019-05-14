package problem2.rank;

public class RankController {

    String[] rankList;

    public RankController() {
        this.initializeRankList();
    }

    private void initializeRankList(){
        this.rankList = new String[]{"Pushover", "Novice", "Fighter", "Warrior", "Veteran",
                "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
    }

    public String getRankByLevel(int level){
        if (level >= 100) return this.rankList[9];
        return this.rankList[level/10];
    }
}
