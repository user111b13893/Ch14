package CH14;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("donkey.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("donkey.txt"), "UTF-8"));

            int charCount = 0;
            int intVal;

            while ((intVal = bufferedReader.read()) != -1) {
                charCount++;
                System.out.print((char) intVal);
            }

            fileReader.close();
            bufferedReader.close();

            int chineseCharacterCount = countChineseCharacters("donkey.txt");
            System.out.println("\nNumber of Chinese characters in donkey.txt: " + chineseCharacterCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countChineseCharacters(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

        int chineseCharCount = 0;
        int intVal;

        while ((intVal = reader.read()) != -1) {
            char currentChar = (char) intVal;

            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) {
                chineseCharCount++;
            }
        }
        reader.close();
        return chineseCharCount;
    }
}
