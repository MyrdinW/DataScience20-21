import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of the database you would like to parse? (example: actresses)");
        String file = "/databases/" + in.nextLine() + ".txt";
        

       //String file = "/databases/actresses.txt";
        String regex = "(.+?) \\(([0-9]{4})(/[I]*)?\\) ?(\\{.+?\\}?\\})?(\\(.+?\\))?(\\t*)([A-z\\-]*)";

        Reader reader = new Reader();
        ParserGenres parser = new ParserGenres();
        Writer writer = new Writer();
        //removeExtension remover = new removeExtension();
        
        ArrayList<String> list = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = parser.Parse(list, regex);
        String newFile = removeExtension.RemoveExtension(file);
       
        writer.createFile(newFile);
        writer.writeToFile(parsed, newFile);
 
        
    }

}
