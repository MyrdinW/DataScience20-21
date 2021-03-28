import java.util.ArrayList;

public class Main {
    String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        Reader reader = new Reader();
        Parser parser = new Parser();
        String file = "/databases/actors.txt";
        String regex = "([A-Za-zÀ-ú,.'$&* ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";
        ArrayList<String> lijst = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = parser.ParseActors(lijst, regex);

        Writer writer = new Writer();
        writer.createFile();
        writer.writeToFile(parsed);
    }

}
