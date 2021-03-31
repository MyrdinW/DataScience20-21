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
        
        Reader reader = new Reader();
        Parser parser = new Parser();
        String file = "/databases/actors.txt";
        String regex = "([A-Za-zÀ-ú,.'$&* ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";
        ArrayList<String> lijst = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = parser.ParseActors(lijst, regex);

        ArrayList<String> lijst2 = reader.Read(file2);
        ArrayList<ArrayList<String>> parsed2 = parser.Parse(lijst2, regex);

     
        writer.createFile();
        writer.writeToFile(parsed, "actors");
        writer.writeToFile(parsed2, "directors");
    }

}
