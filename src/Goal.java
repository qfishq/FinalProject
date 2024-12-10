import java.util.*;
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

    public Goal(String g){
        goalName = g;
        steps = 5;
        while(rankList.contains(defaultRank)){
            defaultRank++;
        }
        rank = defaultRank;

    }
    public Goal(String g, int numSteps){
        goalName = g;
        steps = numSteps;
        defaultRank++;
        while(rankList.contains(defaultRank)){
            defaultRank++;
        }
        rank = defaultRank;
    }
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

    public void setRank(int r){
        rank = r;
    }

    public int getRank(){
        return rank;
    }

    public int getStepsCompleted(){
        return stepsCompleted;
    }

    public void completeStep(){
        if(stepsCompleted < steps) {
            stepsCompleted++;
            progress();
        }
    }

    public void progress(){
        progress = stepsCompleted*(1.0)/steps;
    }

    public String getGoalName() {
        return goalName;
    }

    public int getProgress(){
        return (int)(progress*100);
    }

    public void addToProgressList(){
        //progressList.add(goalName, progress);
    }

    public Map<String, Double> getProgressList() {
        return progressList;
    }

    public void resetProgressList(){
        progressList = new HashMap<String, Double>();
    }

    public String toString(){
        return goalName;
    }

}