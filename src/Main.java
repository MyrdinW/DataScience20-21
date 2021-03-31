import java.util.ArrayList;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        String file = "/databases/actorstest.txt";
        String file2 = "/databases/directors.txt";
        String regex = "([A-Za-z,.'$& ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader reader = new Reader();
        Parser parser = new Parser();
        Writer writer = new Writer();

        Reader reader2 = new Reader();
        Parser parser2 = new Parser();
        Writer writer2 = new Writer();
        

        
        ArrayList<String> actorList = reader.Read(file);
        ArrayList<ArrayList<String>> parsedActors = parser.Parse(actorList, regex);

        ArrayList<String> directorList = reader2.Read(file2);
        ArrayList<ArrayList<String>> parsedDirectors = parser2.Parse(directorList, regex);

     
        writer2.createFile("Directors");
        writer.createFile("Actors");

        writer2.writeToFile(parsedDirectors, "Directors");
        writer.writeToFile(parsedActors, "Actors");
        
    }

}
