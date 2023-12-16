import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        char hi[] = {'H', 'e', 'l', '1', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Jim\\VS\\Class\\CH14\\hello.txt", true);

            fileWriter.write(hi);

            fileWriter.write("Welcome!");

            fileWriter.close();

            readAndPrintFile("C:\\Users\\Jim\\VS\\Class\\CH14\\hello.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndPrintFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        System.out.println("File content:");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
