package in.kgcoding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the file Not Found Exception Handling:");
        System.out.println(" Please enter the file name");
        String filename = sc.nextLine();

        try (FileReader reader = new FileReader((filename))) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%s not found", filename);
        } catch (IOException e) {
            System.out.printf("Exception Occurred: %s", e.getMessage());
        }
    }
}
