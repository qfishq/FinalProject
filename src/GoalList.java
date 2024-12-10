import java.util.Map;
import java.util.TreeMap;

public class GoalList {

    private static Map<Integer, Goal> list;

    public GoalList(){
        list = new TreeMap<Integer, Goal>();
    }
}
