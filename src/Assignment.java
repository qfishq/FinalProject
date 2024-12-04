public class Assignment extends Item{
    private double points;
    private String subject;

    public Assignment(String assignmentName, String time, String dueDate, double points, String subject){
        super(assignmentName, time, dueDate);
        this.points = points;
        this.subject = subject;
    }
    public Assignment(String assignmentName, boolean urgent, String time, String dueDate, double points, String subject){
        super(assignmentName, urgent, time, dueDate);
        this.points = points;
        this.subject = subject;
    }

    public double getPoints(){
        return points;
    }
    public void setPoints(double points){
        this.points = points;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String toString(){
        if (super.getUrgency()){
            return super.getEventName() + " due " + super.getDate() + " at " + super.getTime() + "\nVery important!\n";
        }
        else{
            return super.getEventName() + " due " + super.getDate() + " at " + super.getTime() + "\nNot important\n";
        }
    }
}
