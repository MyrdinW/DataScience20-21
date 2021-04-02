import java.util.ArrayList;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        String file = "/databases/actorstest.txt";
        String regex = "([A-Za-z,.'$&*,-/,0-9,@?,\" ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader reader = new Reader();
        Parser parser = new Parser();
        Writer writer = new Writer();

        ArrayList<String> list = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = parser.Parse(list, regex);
     
        writer.createFile("Actors");
        writer.writeToFile(parsed, "Actors");
 
        
    }

}
