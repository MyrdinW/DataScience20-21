import java.util.ArrayList;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        String file = "/databases/Actresses.txt";
        String file2 = "/databases/running-times.txt";
        //String file2 = "/databases/directors.txt";
        String regex = "([A-Za-z,.'$&*,-/,0-9,@?]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";

        Reader actorReader = new Reader();
        Parser actorParser = new Parser();
        Writer actorWriter = new Writer();

        Reader directorReader = new Reader();
        Parser directorParser = new Parser();
        Writer directorWriter = new Writer();
        
        Reader runningReader = new Reader();
        Parser runningParser = new Parser();
        Writer runningWriter = new Writer();

        ArrayList<String> actorList = actorReader.Read(file);
        ArrayList<ArrayList<String>> parsedActors = actorParser.Parse(actorList, regex);

        ArrayList<String> directorList = directorReader.Read(file);
        ArrayList<ArrayList<String>> parsedDirectors = directorParser.Parse(directorList, regex);
        
        ArrayList<String> runningList = runningReader.Read(file2);
        ArrayList<ArrayList<String>> parsedRunners = runningParser.Parse(runningList, regex);
     
        directorWriter.createFile("Directors");
        actorWriter.createFile("Actresses");
        actorWriter.createFile("Running");


        directorWriter.writeToFile(parsedDirectors, "Directors");
        actorWriter.writeToFile(parsedActors, "Actresses");
        actorWriter.writeToFile(parsedRunners, "Running");
        
    }

}
