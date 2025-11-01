package ch04.sec07;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Scanner;

/*

Compile this file:

javac ch04/sec06/ClassLoaderDemo.java

Add another greeter class for English or another language.

Compile the greeters:

javac ch04/sec06/*Greeter.java

Run the program

java ch04.sec06.ClassLoaderDemo

Provide an input such as "./ch04/sec06/GermanGreeter.class"
  
*/


interface Greeter {
    String greet(String subject);
}

public class ClassLoaderDemo {
    public static void main(String[] args) throws ReflectiveOperationException, IOException {
        System.out.print("Enter the path to the greeter class file name: ");
        var in = new Scanner(System.in);
        Path p = Path.of(in.nextLine());
        int n = p.getNameCount();
        String className = p.subpath(n - 3, n)
            .toString()
            .replace(".class", "")
            .replace("/", ".");
        URL[] urls = { p.subpath(0, n - 3).toUri().toURL() };
        try (var loader = new URLClassLoader(urls)) {
            Class<?> cl = Class.forName(className, true, loader);
            Greeter g = (Greeter) cl.getConstructor().newInstance();
            System.out.println(g.greet("Fred"));
        }
    }
}
