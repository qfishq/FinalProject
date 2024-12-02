package src;

import java.util.Map;
import java.util.TreeMap;

public class TodoList {
    //replace second String with Item later
    /**key = date, value = item**/
    private Map<String, String> todolist;
    public TodoList(){
        todolist = new TreeMap<>();
    }
    //replace second String with Item later
    public void Add(String k, String v) {
        todolist.put(k, v);
    }
    //replace second String with Item later
    public void Remove(String k, String v) {
        todolist.remove(k, v);
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < todolist.size(); i++) {

        }
        return super.toString();
    }
}
