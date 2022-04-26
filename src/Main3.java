import java.io.*;
import java.util.*;

public class Main3 {
    public static void main(String [] args) throws IOException {
        String fileName = "aula.txt";
        try(Scanner scan = new Scanner(new File(fileName))){
            while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        System.out.println("Programa finalizado");
    }
}
