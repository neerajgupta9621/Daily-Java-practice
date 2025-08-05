package in.kgcoding;
import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String filename = "java-course.txt";

        try (FileWriter writer = new FileWriter(filename);) {
            writer.write("This is the best java course and springboot course.\n");
            for(int i=1; i<=1000; i++){
                writer.write("*");
            }
            writer.flush();//buffered data turant file me bhejta hai

            System.out.println("File Written Successfully");
        } catch (IOException e) {
            System.out.printf("Exception Occurred %s\n",
                    e.getMessage());
        }
    }
}
