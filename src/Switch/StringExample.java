package Switch;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
        String personalised = myGreet("good Morning");
        System.out.println(personalised);
    }
    static String myGreet(String greet){
        String message = "hello " +greet;
        return message;
    }

    static String greet(){
        return "How are you.";
    }

}
