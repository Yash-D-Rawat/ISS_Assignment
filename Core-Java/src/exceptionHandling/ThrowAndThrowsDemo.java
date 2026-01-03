package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowAndThrowsDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
