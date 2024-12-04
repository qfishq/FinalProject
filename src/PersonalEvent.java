public class PersonalEvent extends Item{
    private String location;
    private String additionalInfo;

    public PersonalEvent(String eventName, String time, String date, String location){
        super(eventName, time, date);
        this.location = location;
        additionalInfo = "N/A";
    }
    public PersonalEvent(String eventName, boolean urgent, String time, String date, String location){
        super(eventName, urgent, time, date);
        this.location = location;
        additionalInfo = "N/A";
    }
    public PersonalEvent(String eventName, String time, String date, String location, String additionalInfo){
        super(eventName, time, date);
        this.location = location;
        this.additionalInfo = additionalInfo;
    }
    public PersonalEvent(String eventName, boolean urgent, String time, String date, String location, String additionalInfo){
        super(eventName, urgent, time, date);
        this.location = location;
        this.additionalInfo = additionalInfo;
    }

    public String location(){
        return location;
    }
    public void setLocation(){
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
