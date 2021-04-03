import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of the database you would like to parse? (example: actresses)");
        String file = "/databases/" + in.nextLine() + ".txt";
        String newFile = removeExtension.RemoveExtension(file);

        String regexActor = "([A-Za-z,.'$&*,-/,0-9,@?,\" ]*)?([\t]*)(.+?)([ ]*)\\(([0-9,?]{4})(.+?\\n{2})?";
        String regexRating = "(.{27})([0-9]\\.[0-9])([ ]*)([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\"@?:, ]*)(\\()([0-9,?]{4})(\\))([ ]*)([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\"@?{}():, ]*)";
        String regexGenres = "(.+?) \\(([0-9]{4})(/[I]*)?\\) ?(\\{.+?\\}?\\})?(\\(.+?\\))?(\\t*)([A-z\\-]*)";

        Reader reader = new Reader();
        ParserGenres parserGenres = new ParserGenres();
        ParserActor parserActor = new ParserActor();
        ParserRating parserRating = new ParserRating();
        Writer writer = new Writer();

        ArrayList<String> list = reader.Read(file);

        writer.createFile(newFile);
        if(newFile.equals("actors")  || newFile.equals("actresses")){
            ArrayList<ArrayList<String>> parsed = parserActor.Parse(list, regexActor);
            writer.writeToFile(parsed, newFile);
        } else if(newFile.equals("ratings")){ 
            ArrayList<ArrayList<String>> parsed = parserRating.Parse(list, regexRating);
            writer.writeToFile(parsed, newFile);
        } else if(newFile.equals("genres")){
            ArrayList<ArrayList<String>> parsed = parserGenres.Parse(list, regexGenres);
            writer.writeToFile(parsed, newFile);
        } else { 
            System.out.println("Verkeerd bestand gekozen.");
        }
 
    }

}
