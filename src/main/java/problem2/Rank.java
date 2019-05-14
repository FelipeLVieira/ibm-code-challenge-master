package problem2;

import java.util.ArrayList;

public class Rank {

    String[] rankList;

    String getRank(int level){
        return rankList[level/10];
    }
}
