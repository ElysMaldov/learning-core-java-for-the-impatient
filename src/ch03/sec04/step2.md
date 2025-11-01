The book uses the `ButtonDemo` program to demonstrate the `ActionListener` interface. 

However, this online environment can't show a Swing UI application. Instead, write a `TimerDemo` program. Use a `javax.swing.Timer` to schedule a task that is executed later:

    int delay = 1000; //milliseconds
    ActionListener taskPerformer = ...;
    new Timer(delay, taskPerformer).start();
    
Use a lambda expression to print "Thanks for waiting!"

End the `main` method with

    System.out.println("Hit Enter to terminate");
    new java.util.Scanner(System.in).nextLine();
    System.exit(0);

so that you can see the timer output.
