/**
 * a parent class to add any item to the organizer
 */
public class Item {
    private String eventName;
    private boolean urgent;
    private String time;
    private String date;

    /**
     * creates an Item object
     * @param eventName name of the event
     * @param time time the event takes place
     * @param date day the event takes place
     */
    public Item(String eventName, String time, String date){
        this.eventName = eventName;
        this.time = time;
        this.date = date;
        urgent = false;
    }

    /**
     * creates an Item object
     * @param eventName name of the event
     * @param urgent urgency of the event
     * @param time time the event takes place
     * @param date day the event takes place
     */
    public Item(String eventName, boolean urgent, String time, String date){
        this.eventName = eventName;
        this.urgent = urgent;
        this.time = time;
        this.date = date;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public boolean getUrgency(){
        return urgent;
    }
    public void setUrgency(boolean urgent){
        this.urgent = urgent;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String toString(){
        if (urgent){
            return eventName + " on " + date + " at " + time + "\nVery urgent!\n";
        }
        else{
            return eventName + " on " + date + " at " + time + "\nNot urgent\n";
        }
    }
}