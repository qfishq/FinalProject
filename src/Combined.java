import java.util.*;
public class Combined {
    //going to put together all the components into a runnable program here

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GoalList gl = new GoalList();
        int action;

        do {
            System.out.println("Welcome to the Life Organizer! Type in a number to continue!\n(1) Add to you todo list\n(2) Update your todo list\n(3) Add to your goals\n(4) Update your goals\n(5) View your lists \n(6) Quit");

            action = input.nextInt();
            input.nextLine();
            if(action == 1){

            }

            else if(action == 3) {

                System.out.println("What's you goal: ");
                String goalName = input.nextLine();

                System.out.println("How many steps are in you goal: ");
                int numSteps = input.nextInt();

                Goal newGoal = new Goal(goalName, numSteps);
                //System.out.println(newGoal.getRank());
                gl.addToGoals(newGoal);

                //System.out.println(gl.getNumGoals());

                gl.view();
                String bob;
                do {
                    System.out.println("To reprioritize your goals, type r, else type c to continue");
                    bob = input.nextLine();
                } while(!bob.equals("c") && !bob.equals("r"));

                if(bob.equals("r")){
                    System.out.println("Time to prioritize all you goals");
                    Map<Integer, Goal> temp = new TreeMap<Integer, Goal>();
                    for(int i = 0; i < gl.getNumGoals(); i++){
                        System.out.println("Which goal is the next most priority (enter the number):");
                        int key = input.nextInt();
                        temp.put(i+1, gl.getList().get(key));
                    }
                    gl.reRank();
                    gl.setList(temp);

                    gl.view();

                }
                else if(bob.equals("c")){
                    gl.view();
                }
            }
            else if(action == 4){
                gl.view();
                System.out.println("Which goal do you want to update (number):");
                int indexToUpdate = input.nextInt();
                input.nextLine();
                Goal goalToUpdate = gl.getGoal(indexToUpdate);

                while(goalToUpdate.getProgress() != 100){
                    System.out.println("Did you complete a step? (y/n): ");
                    String response = input.nextLine();
                    if(response.equals("y")){
                        goalToUpdate.completeStep();
                        System.out.println(goalToUpdate.getProgress() + "% complete");
                        //System.out.println(goalToUpdate.getStepsCompleted());
                    }
                    else if(response.equals("n")){
                        break;
                    }
                }
            }
        }
        while(action != 6);

    }
}
