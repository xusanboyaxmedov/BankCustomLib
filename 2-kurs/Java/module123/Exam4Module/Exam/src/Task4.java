import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {

            in= new FileInputStream("D:\\University\\2-kurs\\Java\\module123\\Exam4Module\\Exam\\original.txt");

            out=new FileOutputStream("copy.txt");


            int a;
            while((a=in.read())!=-1){
                out.write((char)a);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
