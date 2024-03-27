package org.example.ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Task1 {
    public static void main(String[] args) {
        String text = "This is test for encoding";
        String filePath = "src/main/java/org/example/ex1/encoded_text.txt";

        String encodedText = Base64.getEncoder().encodeToString(text.getBytes());

        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
            fos.write(encodedText.getBytes());
            System.out.println("Text encoded successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
