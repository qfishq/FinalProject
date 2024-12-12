import java.util.Map;
import java.util.TreeMap;

public class GoalList {

    private static Map<Integer, Goal> list;
    private Integer[] keys;
    private int num;

    /**
     * class constructor that instantiates Map list
     * **/
    public GoalList(){
        list = new TreeMap<Integer, Goal>();
    }

    /**
     * @param bob goal that needs to be added to the goalList
     * **/
    public void addToGoals(Goal bob){
        list.put(bob.getRank(), bob);
        keys = list.keySet().toArray(new Integer[0]);
        num++;
    }

    /**
     * @param bob the map that you want to set the goal list as
     * **/
    public void setList(Map<Integer, Goal> bob){
        list = bob;
    }

    /**
     * resets list, emptying it
     * **/
    public void reRank(){
        list = new TreeMap<Integer, Goal>();
    }

    /**
     * @return the length of the goalList
     * **/
    public int getNumGoals(){
        //keys = list.keySet().toArray(new Integer[0]);
        //return keys.length;
        return num;
    }

    /**
     * @return the goalList
     * **/
    public Map<Integer, Goal> getList(){
        return list;
    }

    /**
     * displays the list of goals with their rankings
     * **/
    public void view(){
        for(int i = 0; i < getNumGoals(); i++){
            System.out.println("(" + (i+1) + ") " + list.get(keys[i]));
            //System.out.println();
        }
    }
}
