One approach would be to make another list and also initialize it in a static intialization block:

    public static final ArrayList<Integer> MONTHS = new ArrayList<>();
    static {
        for (int i = 0; i < 12; i++)
            MONTHS.add(i);
    }
    
You can put the initialization into the existing static initialization block, or add a second one.    

But it might be better to use an enumeration. In fact, there is one: `java.time.Month`. Then `java.time.Month.values()` yields an array of all `Month` instances.
