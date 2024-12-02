import java.util.Map;
import java.util.TreeMap;

public class TodoList {
    //replace first String with Item later
    private Map<String, String> todolist;
    public TodoList(){
        todolist = new TreeMap<>();
    }
    //replace first String with Item later
    public void Add(String k, String v) {
        todolist.put(k, v);
    }
    //replace first String with Item later
    public void Remove(String k, String v) {
        todolist.remove(k, v);
    }

    public String toString() {

        return super.toString();
    }
}
