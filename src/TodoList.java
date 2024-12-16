//package src;

import java.util.*;

/**
 * a class that keeps track of items and prioritizes them
 */

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
     * method that adds an event
     * @param k date of the event user wants to add
     * @param v name of event user wants to add
     * **/
    public void Add(String k, String v) {
        m.put(k, v);
        todolist.add(m);
    }
    /**
     * method that removes an event
     * @param k date of the event user wants to remove
     * **/
    public void Remove(String k) {
        m.remove(k);
    }
    /**
     * @return all events in calendar with date and event name
     * **/
    //Big O: O(N)
    //Big Omega: Omega(1)
    public String toString() {
        String res = "";
        for (String key : m.keySet()) {
            res += "Task: " + m.get(key) + " | Date to complete by: " + key + "\n";
        }

        return res;
    }
}
