package staticdemo;

class MyClass {
    public String message = "Hello World";
    public void displayMessage(){
        System.out.println("Message = " + message);    
    }
    public static String greetings = "Good Morning";
    public static void displayGretings(){
        System.out.println("greetings = " + greetings);
    }   
}
