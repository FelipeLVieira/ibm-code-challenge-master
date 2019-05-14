package problem1;


import java.util.ArrayList;
import java.util.ListIterator;

public class WarnTheSheepProblem {

    void warnTheSheep(String[] arr){

        if(arr[arr.length-1].equals("wolf")){
            System.out.println("Pls go away and stop eating my sheep");
            return;
        }

        int position = 1;
        int index = arr.length-1;
        while(index >= 0){
            if(arr[index].equalsIgnoreCase("wolf") && arr[index+1].equalsIgnoreCase("sheep")){
                System.out.println(String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", position-1));
                break;
            }
            if(arr[index].equalsIgnoreCase("sheep")) position ++;
            index--;
        }
    }

    void warnTheSheep(ArrayList<String> arr){

        if(arr.get(arr.size()-1).equals("wolf")){
            System.out.println("Pls go away and stop eating my sheep");
            return;
        }

        int position = 1;
        int index = arr.size()-1;
        while(index >= 0){
            if(arr.get(index).equalsIgnoreCase("wolf") && arr.get(index+1).equalsIgnoreCase("sheep")){
                System.out.println(String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", position-1));
                break;
            }
            if(arr.get(index).equalsIgnoreCase("sheep")) position ++;
            index--;
        }
    }
}
