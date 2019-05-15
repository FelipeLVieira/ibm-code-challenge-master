package problem2;

import problem2.warrior.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior bruceLee = new Warrior();
        bruceLee.getLevel();     // => 1
        bruceLee.getExperience();    // => 100
        bruceLee.getRank();          // => "Pushover"
        bruceLee.getAchievements(); // => []
        bruceLee.training("Defeated Chuck Norris", 9000, 1); // => "Defeated Chuck Norris"
        bruceLee.getExperience();   // => 9100
        bruceLee.getLevel();     // => 91
        bruceLee.getRank();      // => "Master"
        bruceLee.battle(90);    // => "A good fight"
        bruceLee.getExperience();    // => 9105
        bruceLee.getAchievements();  // => ["Defeated Chuck Norris"]
    }

}
