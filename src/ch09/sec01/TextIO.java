package ch09.sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextIO {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("alice.txt");
        String content = Files.readString(path);
        System.out.println("Characters: " + content.length());
        List<String> lines = Files.readAllLines(path);
        System.out.println("Lines: " + lines.size());
        try (Stream<String> lineStream = Files.lines(path)) {
            System.out.println("Average line length: " + lineStream.mapToInt(String::length).average().orElse(0));
        }
        try (var in = new Scanner(path)) {
            in.useDelimiter("\\PL+");
            int words = 0;
            while (in.hasNext()) {
                in.next();
                words++;
            }
            System.out.println("Words: " + words);
        }
        
        
        var url = URI.create("http://horstmann.com/index.html").toURL();
        try (var reader
                = new BufferedReader(new InputStreamReader(url.openStream()))) {
            Stream<String> lineStream = reader.lines();
            System.out.println("Average line length: " + lineStream.mapToInt(String::length).average().orElse(0));
        }
        
        path = Path.of("hello.txt");
        try (var out = new PrintWriter(Files.newBufferedWriter(path))) {
            out.println("Hello");
        }
        content = "World\n";
        Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
        path = Path.of("copyOfAlice.txt");
        Files.write(path, lines);
        
        var writer = new StringWriter();
        var throwable = new IllegalStateException();
        throwable.printStackTrace(new PrintWriter(writer));
        String stackTrace = writer.toString();
        System.out.println("Stack trace: " + stackTrace);
    }
}
