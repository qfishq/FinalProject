import java.util.*;
public class Goal{
    private Map<String, double> progressList = new HashMap<String, double>();
    private String goalName;
    private int steps;
    private int stepsCompleted = 0;
    private double progress;

    public Goal(String g){
        goalName = g;
        steps = 5;
    }
    public Goal(String g, int numSteps){
        goalName = g;
        steps = numSteps;
    }

    public void completeStep(){
        if(stepsCompleted < steps) {
            stepsCompleted++;
            progress();
        }
    }

    public void progress(){
        progress = stepsCompleted/steps;
    }

    public double getProgress(){
        return progress;
    }

    public void addToProgressList(){
        progressList.add(goalName, progress);
    }

    public Map<String, double> getProgressList() {
        return progressList;
    }

    public void resetProgressList(){
        progressList = new HashMap<String, double>();
    }

}