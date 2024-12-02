//package src;
import java.util.*;

public class Tester {
    public static void main (String[] args) {
        //testing the Goal Class
        Scanner input = new Scanner(System.in);
        Goal reading = new Goal("read 4 books", 4);
        System.out.println("Goal: " + reading.getGoalName());
        while(reading.getProgress() != 1.0){
            System.out.println("Did you complete a step? (y/n): ");
            if(input.nextLine().equals("y")){
                reading.completeStep();
                System.out.println(reading.getProgress());
                System.out.println(reading.getStepsCompleted());
            }
        }
        System.out.println("Good Job, you completed a goal!");

    }
}