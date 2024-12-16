import java.util.*;

/**
 * a class that combines all the other classes to form a runnable program that keeps track of goals and todos
 */
public class Combined {
    //going to put together all the components into a runnable program here

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GoalList gl = new GoalList();
        TodoList todos = new TodoList();
        int action;

        do {
            System.out.println("Type in a number to continue with Life Organizer!\n(1) Add to you todo list\n(2) Update your todo list\n(3) Add to your goals\n(4) Update your goals\n(5) View your lists \n(6) Quit");

            action = input.nextInt();
            input.nextLine();
            if(action == 1){

                System.out.println(todos.toString());
                Item fred;

                System.out.println("What is the ToDo's name:");
                String name = input.nextLine();

                System.out.println("This is an urgent TODO (True/False):");
                Boolean urgent = input.nextBoolean();
                input.nextLine();

                System.out.println("When is the due date (dd/mm):");
                String duedate = input.nextLine();

                System.out.println("How much time does it take to complete (hours):");
                int time = input.nextInt();
                input.nextLine();

                System.out.println("Is you ToDo an assignment(a), or personal event(p): ");
                String response = input.nextLine();

                if(response.equals("a")){
                    System.out.println("How many points is it worth:");
                    int points = input.nextInt();
                    input.nextLine();

                    System.out.println("What subject is it for: ");
                    String subject = input.nextLine();
                    fred = new Assignment(name, duedate, duedate, points, subject);
                }
                else if(response.equals("p")){
                    System.out.println("Where is the location:");
                    String location = input.nextLine();

                    System.out.println("additional info:");
                    String addInfo = input.nextLine();
                    fred = new PersonalEvent(name, urgent, duedate, location, addInfo);
                }

                todos.Add(duedate, name);

                System.out.println("Updated Todo List:");
                System.out.println(todos.toString());

            }
            else if(action == 2){
                System.out.println(todos.toString());
                System.out.println();
                System.out.println("Which task have you completed (enter the date)");
                String dateToRemove = input.nextLine();

                todos.Remove(dateToRemove);

                System.out.println("Updated Todo List:");
                System.out.println(todos.toString());
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
            else if(action == 5){

                //We'll put the todoList before
                System.out.println("GOALS:");
                gl.view();
                System.out.println("\nTODOs:");
                System.out.println(todos.toString());

            }
        }
        while(action != 6);

    }
}
