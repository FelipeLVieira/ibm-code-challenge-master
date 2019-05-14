package problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        WarnTheSheepProblem warnTheSheepProblem = new WarnTheSheepProblem();

        warnTheSheepProblem.warnTheSheep(new String[]{"sheep", "sheep", "wolf", "sheep"});


        warnTheSheepProblem.warnTheSheep(new ArrayList<>(Arrays.asList("sheep", "sheep", "sheep", "wolf")));
    }
}
