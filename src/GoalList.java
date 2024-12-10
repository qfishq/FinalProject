import java.util.Map;
import java.util.TreeMap;

public class GoalList {

    private static Map<Integer, Goal> list;
    private Integer[] keys;
    private int num;


    public GoalList(){
        list = new TreeMap<Integer, Goal>();
    }

    public void addToGoals(Goal bob){
        list.put(bob.getRank(), bob);
        keys = list.keySet().toArray(new Integer[0]);
        num++;
    }

    public void setList(Map<Integer, Goal> bob){
        list = bob;
    }

    public void reRank(){
        list = new TreeMap<Integer, Goal>();
    }

    public int getNumGoals(){
        //keys = list.keySet().toArray(new Integer[0]);
        //return keys.length;
        return num;
    }
    public Map<Integer, Goal> getList(){
        return list;
    }

    public void view(){

        for(int i = 0; i < getNumGoals(); i++){
            System.out.println("(" + (i+1) + ") " + list.get(keys[i]));
            //System.out.println();
        }
    }
}
