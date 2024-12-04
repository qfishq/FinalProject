package src;

public class tester {
    public static void main (String[] args) {
        TodoList kimmy = new TodoList();
        System.out.println("Please type dates as YYYY/MM/DD");
        kimmy.Add("2040/05/14", "hide the trash");
        kimmy.Add("2012/15/34", "eat rabbit");
        System.out.println(kimmy);
        kimmy.Remove("2040/05/14");
        System.out.println(kimmy);

    }
}