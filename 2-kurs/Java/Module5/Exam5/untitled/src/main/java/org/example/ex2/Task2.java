package org.example.ex2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();

        Scanner scanner = new Scanner(new File("src/main/java/org/example/ex2/students.json"));
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine());
        }


        Type type = TypeToken.getParameterized(List.class, Student.class).getType();

        List<Student> students = gson.fromJson(builder.toString(), type);

        int sum = students.stream().mapToInt(Student::getAge).sum();

        double v = (double) sum / students.size();

        System.out.println(v);

    }
}
