import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Main2 {
    public static void main(String[] args) {
        String fileName = "aula.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }

        System.out.println("O sistema foi finalizado.");
    }
}