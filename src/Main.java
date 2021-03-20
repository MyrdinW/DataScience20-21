import java.util.ArrayList;

public class Main {
    String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        Reader reader = new Reader();
        Parser parser = new Parser();
        String file = "/databases/actorstest.txt";
        String regex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)(\\([0-9]*\\))/g";
        ArrayList<String> lijst = reader.Read(file);

        for(int i = 0; i < lijst.size(); i++) {
            parser.Parse(regex, lijst.get(i));
        }

//        System.out.println(lijst);
    }

}
