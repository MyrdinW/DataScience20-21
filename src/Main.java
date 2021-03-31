import java.util.ArrayList;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        String file = "/databases/actors.txt";
        String file2 = "/databases/directors.txt";
        String regex = "([A-Za-z,.'$&*,-/,0-9,@?]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader actorReader = new Reader();
        Parser actorParser = new Parser();
        Writer actorWriter = new Writer();

        Reader directorReader = new Reader();
        Parser directorParser = new Parser();
        Writer directorWriter = new Writer();

        ArrayList<String> actorList = actorReader.Read(file);
        ArrayList<ArrayList<String>> parsedActors = actorParser.Parse(actorList, regex);

        ArrayList<String> directorList = directorReader.Read(file2);
        ArrayList<ArrayList<String>> parsedDirectors = directorParser.Parse(directorList, regex);
     
        directorWriter.createFile("Directors");
        actorWriter.createFile("Actors");

        directorWriter.writeToFile(parsedDirectors, "Directors");
        actorWriter.writeToFile(parsedActors, "Actors");
 
        
    }

}
