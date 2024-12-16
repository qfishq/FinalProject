/**
 * a subclass of Item for events that are assignments or tests
 * @author kimmy
 */
public class Assignment extends Item{
    private double points;
    private String subject;

    /**
     * creates an Assignment object
     * @param assignmentName name of the assignment
     * @param time time the assignment is due
     * @param dueDate day the assignment is due
     * @param points number of points the assignment is worth
     * @param subject subject that the assignment belongs to
     */
    public Assignment(String assignmentName, String time, String dueDate, double points, String subject){
        super(assignmentName, time, dueDate);
        this.points = points;
        this.subject = subject;
    }

    /**
     * creates an Assignment object
     * @param assignmentName name of the assignment
     * @param urgent urgency of the assignment
     * @param time time the assignment is due
     * @param dueDate day the assignment is due
     * @param points number of points the assignment is worth
     * @param subject subject that the assignment belongs to
     */
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
