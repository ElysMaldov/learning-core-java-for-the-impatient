package ch04.sec05;

public class PatternDemo {
    public static void main(String[] args) {        
        Employee edgar = new Employee("Edgar Employee", 100000);
        Manager mike = new Manager("Mike Manager", 1000000);
        mike.setBonus(50000);
        Executive elaine = new Executive("Elaine Excecutive", 10000000);
        elaine.setTitle("Associate Vice President of Execution");
        
        // Pattern matching with instanceof                
        double r = Math.random();    
        Employee e = r < 0.33 ? edgar : r < 0.67 ? mike : elaine;
        String description;
        if (e instanceof Executive exec)
            description = "An executive with a title of " + exec.getTitle();
        else if (e instanceof Manager mgr)
            description = "A manager with a bonus of " + mgr.getBonus();
        else
            description = "A lowly employee with a salary of " + e.getSalary();
        System.out.println(description);
        
        // Pattern matching with switch
        r = Math.random();    
        e = r < 0.33 ? edgar : r < 0.67 ? mike : elaine;        
        description = switch (e) {
            case Executive exec -> "An executive with a title of " + exec.getTitle();
            case Manager mgr -> "A manager with a bonus of " + mgr.getBonus();
            default -> "A lowly employee with a salary of " + e.getSalary();
        };        
        System.out.println(description);      
        
        // A guard
        description = switch (e) {
            case Executive exec when exec.getTitle().length() >= 20 ->
                "An executive with an impressive title";
            case Executive exec -> "An executive with a title of " + exec.getTitle();
            case Manager mgr -> "A manager with a bonus of " + mgr.getBonus();
            default -> "A lowly employee with a salary of " + e.getSalary();
        };        
        System.out.println(description);      
        
        // A null case
        e = r < 0.25 ? edgar : r < 0.5 ? mike : r < 0.75 ? elaine : null;        
        description = switch (e) {
            case Executive exec -> "An executive with a title of " + exec.getTitle();
            case Manager mgr -> "A manager with a bonus of " + mgr.getBonus();
            case null -> "No employee";
            default -> "A lowly employee with a salary of " + e.getSalary();
        };
        System.out.println(description);
    }
}
