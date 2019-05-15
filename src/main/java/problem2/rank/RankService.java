package problem2.rank;

public class RankService {

    String[] rankList;

    public RankService() {
        this.initializeRankList();
    }

    private void initializeRankList(){
        this.rankList = new RankRepository().findAll();
    }

    public String getRankTierByLevel(int level){
        if (level >= 100) return this.rankList[9];
        return this.rankList[level/10];
    }
}
