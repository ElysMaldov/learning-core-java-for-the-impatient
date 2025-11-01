package ch03.sec08;

public record Person(String firstName, String middleName, String lastName) {
    public Person(String first, String last) {
       this(first, null, last);
    }
    
    public String name() {
        if (middleName == null) {
            return firstName + " " + lastName;
        }
        else {
            return firstName + " " + middleName + " " + lastName;
        }
    }
    
    public String toString() {
        return name();
    }
}
