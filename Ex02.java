import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input a string: ");
            str = buf.readLine();

            String upperCaseStr = str.toUpperCase();

            System.out.println("Original string: " + str);
            System.out.println("Uppercase string: " + upperCaseStr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buf != null) {
                    buf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
