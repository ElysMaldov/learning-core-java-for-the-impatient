Here is the code that goes inside the `main` method.


    int delay = 1000; //milliseconds
    ActionListener taskPerformer = event -> 
        System.out.println("Thanks for waiting!");
    new Timer(delay, taskPerformer).start();
    System.out.println("Hit Enter to terminate");
    new java.util.Scanner(System.in).nextLine();
    System.exit(0);

If you like, you can pass the lambda expression directly to the `Timer` constructor:

    new Timer(delay, event -> 
        System.out.println("Thanks for waiting!")).start();
