import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {   
    //init arraylist to save each line in
    ArrayList<String> regels = new ArrayList<String>();

    //init Read function
    public ArrayList<String> Read(String dbFile){
        try {

            //init File reader
            File readable = new File(Reader.class.getResource(dbFile).getFile());

            //init Scanner
            Scanner dbScanner = new Scanner(readable);

            //scanning lines and adding to regels arraylist, untill there is no nextline
            while (dbScanner.hasNextLine()) {
                String data = dbScanner.nextLine();
                regels.add(data);
            }

            // close input scanner
            dbScanner.close();

            //catch exception if path can't reach the file
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return regels;   
    }
}