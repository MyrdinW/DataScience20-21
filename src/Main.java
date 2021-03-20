import java.util.ArrayList;

public class Main {
    String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        Reader reader = new Reader();
        Parser parser = new Parser();
        String file = "/databases/actorstest.txt";
        String regex = "([A-Za-z,.'$& ]*)?([\t]*)(.+?)([ ]*)\\(([0-9]{4})";
        ArrayList<String> lijst = reader.Read(file);
        ArrayList<String> parsed = parser.Parse(lijst, regex);


        System.out.println(parsed);
    }

}
