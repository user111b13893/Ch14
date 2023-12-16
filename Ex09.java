import java.io.*;

public class Ex09 {
    public static void main(String[] args) {
        try {
            String aaaContent = readFile("aaa.txt");
            String bbbContent = readFile("bbb.txt");

            String mergedContent = aaaContent + bbbContent;
            writeFile("ccc.txt", mergedContent);

            System.out.println("Content of aaa.txt:");
            System.out.println(aaaContent);

            System.out.println("Content of bbb.txt:");
            System.out.println(bbbContent);

            System.out.println("Content of ccc.txt:");
            String cccContent = readFile("ccc.txt");
            System.out.println(cccContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
    }

    private static void writeFile(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
}
