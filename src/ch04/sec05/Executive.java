package ch04.sec05;

public class Executive extends Manager {
    private String title;
    
    public Executive(String name, double salary) {
        super(name, salary);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}

