package ch09.sec03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostDemo {
    public static void main(String[] args) throws IOException {
        var url = URI.create("https://codecheck.io/run").toURL();
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("Accept-Charset", "UTF-8");
        connection.setDoOutput(true);
        try (var out = new OutputStreamWriter(
                connection.getOutputStream())) {
            var postData = new HashMap<String, String>();
            
            postData.put("Main.java", prog);
            postData.put("Input", "");
            boolean first = true;
            for (Map.Entry<String, String> entry : postData.entrySet()) {
                if (first) first = false;
                else out.write("&");
                out.write(URLEncoder.encode(entry.getKey(), "UTF-8"));
                out.write("=");
                out.write(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        }
        
        Map<String, List<String>> headers = connection.getHeaderFields();
        System.out.println("Response headers: " + headers);
        try (InputStream in = connection.getInputStream()) {
            var contents = new String(in.readAllBytes());
            System.out.println(contents);
        }
    }
    
    public static String prog = """
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
""";
}
