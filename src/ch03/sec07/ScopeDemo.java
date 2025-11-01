package ch03.sec07;

public class ScopeDemo {
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        Thread.ofPlatform().start(r);                  
    }
   
    public static void main(String[] args) {
        repeatMessage("Hello", 10);
                
        for (String a : args) 
            Thread.ofPlatform().start(() -> System.out.println(a));
    }
}
