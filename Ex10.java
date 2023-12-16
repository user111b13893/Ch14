import java.io.*;

class Data {
    private String name;
    private int english;
    private int math;

    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }

    public static void writeData(Data stul, Data stu2) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write(stul.toString() + "\n");
            writer.write(stu2.toString() + "\n");
            writer.close();
            System.out.println("Data stu1=new Data(Ariel,92,85)");
            System.out.println("Data stu2=new Data(Fione,67,89)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("English Score: " + english);
        System.out.println("Math Score: " + math);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println();
    }

    private double calculateAverage() {
        return (english + math) / 2.0;
    }

    public static void readData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int english = Integer.parseInt(parts[1]);
                int math = Integer.parseInt(parts[2]);
                Data student = new Data(name, english, math);
                student.show();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return name + " " + english + " " + math;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Data stul = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        Data.writeData(stul, stu2);

        Data.readData();
    }
}
