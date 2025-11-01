package ch04.sec07;

import com.horstmann.crypt.Cipher;

import java.util.Arrays;
import java.util.ServiceLoader;

/*

Compile the service interface and implementation:
  
javac com/horstmann/crypt/Cipher.java com/horstmann/crypt/impl/CaesarCipher.java 

Be sure that the file META-INF/services/com.horstmann.crypt.Cipher is present.

Compile and run the program:

javac ch04/sec06/ServiceLoaderDemo.java
java ch04.sec06.ServiceLoaderDemo

*/

public class ServiceLoaderDemo {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);
    
    public static void main(String[] args) {
        
        String message = "Hello";
        byte[] key = { 3 };
        Cipher cipher = cipherLoader.findFirst().orElseThrow();
        byte[] encrypted = cipher.encrypt(message.getBytes(), key);
        System.out.println(Arrays.toString(encrypted));
        System.out.println(new String(cipher.decrypt(encrypted, key)));
    }    
}
