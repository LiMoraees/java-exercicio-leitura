import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file = "aula.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
            System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

        System.out.println("O sistema foi finalizado.");
    }
}
