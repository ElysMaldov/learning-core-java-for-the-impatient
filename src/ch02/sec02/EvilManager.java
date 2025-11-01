package ch02.sec02;

import java.util.random.RandomGenerator;

public class EvilManager {
    private RandomGenerator generator;      

    
    public EvilManager() {
        generator = RandomGenerator.getDefault();
    }
    
    public void giveRandomRaise(Employee e) {
        double percentage = 10 * generator.nextDouble();
        e.raiseSalary(percentage);
    }
    
    public void increaseRandomly(double x) { // Won't work
        double amount = x * 10 * generator.nextDouble();
        x += amount;
    }
    
    public void replaceWithZombie(Employee e) {
        e = new Employee("", 0);
    }
}