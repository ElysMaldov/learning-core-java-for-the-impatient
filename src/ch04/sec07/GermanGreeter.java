package ch04.sec07;

public class GermanGreeter implements Greeter {
    @Override
    public String greet(String subject) {
        return "Hallo %s!".formatted(subject);
    }
}
