package src;

import java.util.*;

public class TodoList{
    //replace second String with Item later
    /**key = date, value = item**/
    private Map<String, String> m;
    private ArrayList<Map> todolist;
    public TodoList(){
        todolist = new ArrayList<>();
        m = new TreeMap<>();
    }
    //replace second String with Item later
    public void Add(String k, String v) {
        m.put(k, v);
        todolist.add(m);
    }
    //replace second String with Item later
    public void Remove(String k) {
        m.remove(k);
    }

//    public void reorder() {
//        for (int i = 0; i < todolist.size(); i++) {
//
//        }
//    }

    public String toString() {
        String res = "";
        for (String key : m.keySet()) {
            res += "Task: " + m.get(key) + " | Date to complete by: " + key + "\n";
        }

        return res;
    }
}
