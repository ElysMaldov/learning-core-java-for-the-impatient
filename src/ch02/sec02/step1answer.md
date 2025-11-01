Here is one example of a constructor.

    public Employee()
    {
        name = "";
        salary = 0;
    }

Here are the methods, rewritten with `this`:

    public String getName() {
        return this.name;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;    
    }
    
In the `raiseSalary` method, you can now clearly distinguish the local variables from the instance variables. 

A simple implementation of `randomRaise` is

    public void randomRaise() {
        raiseSalary(10 * Math.random()); // or this.raiseSalary(...)
    }

If you want to use a `RandomGenerator`, you should make it into a `static` variable (see Section 2.5).

    private static RandomGenerator generator = RandomGenerator.getDefault();
    
    public void randomRaise() {
        raiseSalary(10 * generator.nextDouble()); // or this.raiseSalary(...)
    }
