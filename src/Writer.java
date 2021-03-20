import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void createFile() {
        try {
            File myObj = new File("data.csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(ArrayList<String> parserOutput) {
        try {
            FileWriter myWriter = new FileWriter("data.csv");

            for (String item : parserOutput) {
                myWriter.write(item + "\n");
            }

            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
