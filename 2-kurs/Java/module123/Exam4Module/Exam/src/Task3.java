import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fout = null;
        double sum = 0;

        try {
            fis = new FileInputStream("D:\\University\\2-kurs\\Java\\module123\\Exam4Module\\Exam\\sum.txt");

            fout = new FileOutputStream("D:\\University\\2-kurs\\Javamodule123\\Exam4Module\\Exam\\result.txt");

            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] numbers = line.split(" ");

                for (String num : numbers) {
                    for (int j = 0; j < num.length(); j++) {
                        if (!Character.isDigit(num.charAt(j))) {
                            System.out.println("Invalid number found.");
                            return;
                        }
                    }
                    sum += Integer.parseInt(num);
                }
            }
            String writeFile = String.valueOf(sum);
            try {
                fout.write(writeFile.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
