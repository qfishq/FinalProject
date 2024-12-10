package src;

import java.util.*;

public class TodoList{
    private Map<String, String> m;
    private ArrayList<Map> todolist;
    /**
     * class constructor that instantiates ArrayList todolist and Map m
     * **/
    public TodoList(){
        todolist = new ArrayList<>();
        m = new TreeMap<>();
    }

    /**
     * @param k date of the event user wants to add
     * @param v name of event user wants to add
     * **/
    public void Add(String k, String v) {
        m.put(k, v);
        todolist.add(m);
    }
    /**
     * @param k date of the event user wants to remove
     * **/
    public void Remove(String k) {
        m.remove(k);
    }
    /**
     * @return all events in calendar with date and event name
     * **/
    public String toString() {
        String res = "";
        for (String key : m.keySet()) {
            res += "Task: " + m.get(key) + " | Date to complete by: " + key + "\n";
        }

        return res;
    }
}
