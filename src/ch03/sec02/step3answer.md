Here is a demo program:

    package ch03.sec02;
    
    public class EmployeeDemo {
        public static void main(String[] args) {
            var fred = new Employee("Fred Flintstone", 105000);
            System.out.println(fred.getId());
        }
    }

If you change the `getId` method to

    public int getId() { return Person.super.getId(); }

then the id is zero, because of the default method in the `Person` interface.

If you comment out the method

    // public int getId() { return Person.super.getId(); }
    
the class will not compile. It doesn't know which of the two implementations of `getId` to use.    
