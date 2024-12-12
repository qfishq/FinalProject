/**
 *  a subclass of Item that is for personal events that do not fall under the assignment category
 */
public class PersonalEvent extends Item{
    private String location;
    private String additionalInfo;

    /**
     * creates a PersonalEvent object
     * @param eventName name of the event
     * @param time time the event takes place
     * @param date day the event takes place
     * @param location location the event takes place
     */
    public PersonalEvent(String eventName, String time, String date, String location){
        super(eventName, time, date);
        this.location = location;
        additionalInfo = "N/A";
    }

    /**
     * creates a PersonalEvent object
     * @param eventName name of the event
     * @param urgent urgency of the event
     * @param time time the event takes place
     * @param date day the event takes place
     * @param location location the event takes place
     */
    public PersonalEvent(String eventName, boolean urgent, String time, String date, String location){
        super(eventName, urgent, time, date);
        this.location = location;
        additionalInfo = "N/A";
    }

    /**
     * creates a PersonalEvent object
     * @param eventName name of the event
     * @param time time the event takes place
     * @param date day the event takes place
     * @param location location the event takes place
     * @param additionalInfo any extra info for the event
     */
    public PersonalEvent(String eventName, String time, String date, String location, String additionalInfo){
        super(eventName, time, date);
        this.location = location;
        this.additionalInfo = additionalInfo;
    }

    /**
     * creates a PersonalEvent object
     * @param eventName name of the event
     * @param urgent urgency of the event
     * @param time time the event takes place
     * @param date day the event takes place
     * @param location location the event takes place
     * @param additionalInfo any extra info for the event
     */
    public PersonalEvent(String eventName, boolean urgent, String time, String date, String location, String additionalInfo){
        super(eventName, urgent, time, date);
        this.location = location;
        this.additionalInfo = additionalInfo;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getAdditionalInfo(){
        if (additionalInfo.equals("N/A")){
            return "There is no additional info for this event.";
        }
        else{
            return additionalInfo;
        }
    }
    public void setAdditionalInfo(String additionalInfo){
        this.additionalInfo = additionalInfo;
    }
    public String toString(){
        return super.toString() + "Location: " + location + "\nAdditional info: " + additionalInfo;
    }
}
