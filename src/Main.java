import java.util.ArrayList;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        String file = "/databases/actorstest.txt";
        String regex = "([A-Za-z,.'$&*,-/,0-9,@?,\"]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader actorReader = new Reader();
        Parser actorParser = new Parser();
        Writer actorWriter = new Writer();

        ArrayList<String> actorList = actorReader.Read(file);
        ArrayList<ArrayList<String>> parsedActors = actorParser.Parse(actorList, regex);
     
        actorWriter.createFile("Actors");
        actorWriter.writeToFile(parsedActors, "Actors");
 
        
    }

}
