Change the loop to:

    for (int i = 0; i < args.length; i++) {
        String arg = args[i];
        if (arg.equals("-h")) arg = "Hello";
        else if (arg.equals("-g")) arg = "Goodbye";
        else if (arg.equals("-w")) arg = "🌐";
        if (i > 0) System.out.print(" ");
        System.out.print(arg);
    }
    System.out.println();