If you add a statement

    text += "!";
    
either inside or outside the lambda expression, you get an error message: “local variables referenced from a lambda expression must be final or effectively final”.

If you actually want to modify the `text` variable in the lambda expression, copy it into another variable and mutate that:

    Runnable r = () -> {
        String text1 = text; 
        for (int i = 0; i < count; i++) {
            System.out.println(text1);
            text1 += "!";
        }
    };

If you want to modify the variable both inside and outside the lambda expression, then you could consider the trick of using an array of length 1 instead:

    String[] text = new String[1];
    ...
    text[0] += '!';
    
But you should probably rethink your approach and find a cleaner solution.    
