package ch10.sec08;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 1; i <= 100; i++) System.out.print(i + " ");  };
        Thread thread = Thread.ofPlatform().start(task); 
        System.out.println("Started thread.");
        thread.join();
        System.out.println("\nJoined thread.");
        
        Runnable interruptibleTask = () -> {
            System.out.print("\nInterruptible: ");
            try {
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                    Thread.sleep(100);
                }
            }
            catch (InterruptedException ex) {
                System.out.println("Interrupted!");
            }
        };
        
        thread = Thread.ofPlatform().start(interruptibleTask);
        Thread.sleep(1000);
        thread.interrupt();         
        
        Runnable exceptionalTask = () -> {
            System.out.print("\nExceptional: ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
                if (i == 42) throw new IllegalStateException();
            }            
        };
        Thread.ofPlatform()
            .uncaughtExceptionHandler((t, ex) -> System.out.println("Yikes!"))
            .start(exceptionalTask)
            .join();
        
        Runnable daemonTask = () -> {
            System.out.print("\nDaemon: ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }            
        };
        Thread.ofPlatform()
           .daemon(true)
           .start(daemonTask);
        System.out.println("\nGoodbye daemon!");
    }    
}
