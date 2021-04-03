import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Give me the path to the database you would like to parse: (example: /databases/actresses.txt) ");
        String file = in.nextLine();
        

       //String file = "/databases/actresses.txt";
        String regex = "([A-Za-z,.'$&*,-/,0-9,@?,\" ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader reader = new Reader();
        Parser parser = new Parser();
        Writer writer = new Writer();
        //removeExtension remover = new removeExtension();
        
        ArrayList<String> list = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = parser.Parse(list, regex);
        String newFile = removeExtension.RemoveExtension(file);
       
        writer.createFile(newFile);
        writer.writeToFile(parsed, newFile);
 
        
    }

}
