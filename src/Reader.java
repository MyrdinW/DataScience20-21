import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {

    
    ArrayList<String> regels = new ArrayList<String>();
    public ArrayList<String> Read(String dbFile){
        try {

            File readable = new File(Reader.class.getResource(dbFile).getFile());
            Scanner dbScanner = new Scanner(readable);
            while (dbScanner.hasNextLine()) {
                String data = dbScanner.nextLine();
                regels.add(data);
            }
            dbScanner.close();
             

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return regels;
        

        
    }
    //public static File changeExtension(File f, String newExtension) {
    //    int i = f.getName().lastIndexOf('.');
    //    String name = f.getName().substring(0,i);
    //    return new File(f.getParent(), name + newExtension);
    //}
}