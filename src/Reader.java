import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    public static void Read(String dbFile){
        try {
            File readable = new File(Reader.class.getResource(dbFile).getFile());
            Scanner dbScanner = new Scanner(changeExtension(readable, ".txt"));
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
    public static File changeExtension(File f, String newExtension) {
        int i = f.getName().lastIndexOf('.');
        String name = f.getName().substring(0,i);
        return new File(f.getParent(), name + newExtension);
    }
}