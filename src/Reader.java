import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void Read(dbFile){
        try {
            File readable = new File(dbFile);
            Scanner dbScanner = new Scanner(readable);
            while (dbScanner.hasNextLine()) {
                String data = dbScanner.nextLine();
                System.out.println(data);
            }
            dbScanner.close();

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}