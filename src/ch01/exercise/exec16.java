package ch01.exercise;

public class exec16 {
    public static void main(String[] args) {
        String msg = "Hello world";
        String program = """
                package ch01.exercise;
                
                 public class exec16 {
                     public static void main(String[] args) {
                         String msg = "Hello world";
                         String program = ""\"
                                 package ch01.exercise;
                
                                 public class exec16 {
                                     public static void main(String[] args) {
                                         String msg = "Hello world";
                                         String program = ""\\"
                                                 ""\\";
                                         System.out.println(msg);
                                         System.out.println(program);
                                     }
                                 }""\";
                         System.out.println(msg);
                         System.out.println(program);
                     }
                 }
                """;
        System.out.println(msg);
        System.out.println(program);
    }
}
