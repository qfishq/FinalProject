public class EventsTester {
    public static void main(String[] args){
        Assignment essay = new Assignment("AP Lang Essay", true, "8:30 am", "12/11/2024", 10, "AP Lang");
        System.out.println("The assignment is worth " + essay.getPoints() + " points.");
        System.out.println(essay);

        PersonalEvent beatUpEmily = new PersonalEvent("Beat up that bitch Emily", true, "4:20 pm", "12/10/2024", "At home");
        System.out.println(beatUpEmily);
    }
}
