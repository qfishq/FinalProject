import java.util.*;
/**
 * a class that keeps track of goals and their progress
 * @author Ameya
 */
public class Goal{
    private Map<String, Double> progressList = new HashMap<String, Double>();
    private String goalName;
    private int steps;
    private int stepsCompleted = 0;
    private double progress;
    private static int defaultRank = 0;
    private int rank;
    private static Set rankList = new TreeSet<>();
    private static Map<Integer, Goal> rankMap = new TreeMap<Integer, Goal>();
    private static int max = 300;

    /**
     * class constructor that instantiates String goalName, int Steps, and int rank
     * **/
    public Goal(String g){
        goalName = g;
        steps = 5;
        while(rankList.contains(defaultRank)){
            defaultRank++;
        }
        rank = defaultRank;

    }

    /**
     * class constructor that instantiates String goalName, int Steps, and int rank
     * **/
    // Big-O: O(n)
    // Big-Omega: O(1)
    public Goal(String g, int numSteps){
        goalName = g;
        steps = numSteps;
        defaultRank++;
        while(rankList.contains(defaultRank)){
            defaultRank++;
        }
        rank = defaultRank;
    }

    /**
     * class constructor that instantiates String goalName, int Steps, and int rank
     * **/
    public Goal(String goal, int numSteps, int rrank){
        goalName = goal;
        steps = numSteps;
        while(rankList.contains(rrank)){
            rrank++;
        }
        rank = rrank;
        rankList.add(rrank);
        //need to figure out ranking system
    }

    /**
     * @param r rank of the goal depending on priority
     * **/
    public void setRank(int r){
        rank = r;
    }

    /**
     * @return rank of the goal depending on priority
     * **/
    public int getRank(){
        return rank;
    }


    /**
     * @return number of steps completed of the goal
     * **/
    public int getStepsCompleted(){
        return stepsCompleted;
    }

    /**
     * increments stepsCompleted
     * **/
    public void completeStep(){
        if(stepsCompleted < steps) {
            stepsCompleted++;
            progress();
        }
    }

    /**
     * updates progress
     * **/
    public void progress(){
        progress = stepsCompleted*(1.0)/steps;
    }

    /**
     * @return name of the goal
     * **/
    public String getGoalName() {
        return goalName;
    }

    /**
     * @return percent of goal completed
     * **/
    public int getProgress(){
        return (int)(progress*100);
    }

    /**
     * adds goal to the progressList
     * **/
    public void addToProgressList(){
        progressList.put(goalName, progress);
    }

    /**
     * @return the map of goals and their completion status
     * **/
    public Map<String, Double> getProgressList() {
        return progressList;
    }

    /**
     * resets progressList
     * **/
    public void resetProgressList(){
        progressList = new HashMap<String, Double>();
    }

    /**
     * @return the goal name and completion status
     * **/
    public String toString(){
        return goalName + " - " + getProgress() + "% completed";
    }

}
