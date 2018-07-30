package day15;

import java.util.LinkedList;
import java.util.Queue;

public class EeneyMeeneyMineyMoe {

    public static String eeneyMeeneyMineyMoe (int killNum) {
        Queue<String> qq = new LinkedList<>();
        qq.add("Josephus");
        qq.add("Soldier1");
        qq.add("Soldier2");
        qq.add("Soldier3");
        qq.add("Soldier4");
        qq.add("Soldier5");
        qq.add("Soldier6");
        qq.add("Soldier7");
        qq.add("Soldier8");
        qq.add("Soldier9");
        qq.add("Soldier10");
        qq.add("Soldier11");
        qq.add("Soldier12");
        qq.add("Soldier13");
        qq.add("Soldier14");
        qq.add("Soldier15");

        // Run the while loop until there is only one person left
        while (qq.size() > 1) {
            // Iterate through the queue based on kill number
            for (int i = 0; i < killNum; i++) {
                // Remove and then re-add each person to the queue until
                // the kill number is reached
                String person = qq.remove();
                qq.add(person);
            }
            // When the kill number is reached, remove the person who is
            // at the front of the queue
            String fatality = qq.remove();
            System.out.println("Fatality: " + fatality);
        }
        // When there is only one person left, remove him from the queue
        // and return him
        String survivor = qq.remove();
        System.out.println("You win: " + survivor);
        return survivor;
    }
}
