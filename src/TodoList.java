package src;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class TodoList {
    //replace second String with Item later
    /**key = date, value = item**/
    private Map<String, String> bruh;
    private Queue<Map> todolist;
    public TodoList(){
        todolist = new PriorityQueue<>();
        bruh = new TreeMap<>();
    }
    //replace second String with Item later
    public void Add(String k, String v) {
        bruh.put(k, v);
        todolist.add(bruh);
    }
    //replace second String with Item later
    public void Remove(String k, String v) {
        bruh.remove(k, v);
        todolist.remove(bruh);
    }

    public String toString() {
        String res = "";
        for (String key : bruh.keySet()) {
            res += "key: " + key;
        }
        for (String value : bruh.values()) {
            res += "value: " + value;
        }
        return res;
    }
}
