import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //String uitgebreideRegex = "/([A-Za-z,. ]*)?([\t]*)(.+?)([ ]*)?(\\([0-9]*\\))([ ]*)?(\\{.+?\\})?(\\(.+?\\))?([ ]*)?(\\[.+?\\])?([ ]*)?(<[0-9]*>)?/g";

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of the database you would like to parse?");
        System.out.println("Possible options: actors / actresses / movies / countries / genres / ratings");
        String file = "/databases/" + in.nextLine() + ".txt";
        String newFile = removeExtension.RemoveExtension(file);

        String regexActor = "([A-Za-z,.'$&*,-/,0-9,@?ï»¿#,\" ]*)?([\t]*)(.+?)([ ]*)\\(([0-9]{4})(.+?\\n{2})?";
        String regexRating = ".{27}([0-9]\\.[0-9])[ ]*([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\"@?:, ]*)\\(([0-9]{4})\\)([ ]*)([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\"@?{}():, ]*)";
        String regexGenres = "(.+?) \\(([0-9]{4})(/[I]*)?\\) ?(\\{.+?\\}?\\})?(\\(.+?\\))?(\\t*)([A-z\\-]*)";
        String regexCountries = "(.+?) \\(([0-9]{4})(/?I*)\\) ?(\\{.+?\\})?(\\t)*([A-z,.s -].+)";
        String regexMovies = "(.+?)\\(([0-9]{4})/?I*";

        Reader reader = new Reader();
        Writer writer = new Writer();



        if(newFile.equalsIgnoreCase("actors")  || newFile.equalsIgnoreCase("actresses")){
            writer.createFile(newFile);
            ParserActor parserActor = new ParserActor();
            ArrayList<String> list = reader.Read(file);
            ArrayList<ArrayList<String>> parsed = parserActor.Parse(list, regexActor);
            writer.writeToFile(parsed, newFile);
        } else if(newFile.equalsIgnoreCase("ratings")){
            writer.createFile(newFile);
            ParserRating parserRating = new ParserRating();
            ArrayList<String> list = reader.Read(file);
            ArrayList<ArrayList<String>> parsed = parserRating.Parse(list, regexRating);
            writer.writeToFile(parsed, newFile);
        } else if(newFile.equalsIgnoreCase("genres")){
            writer.createFile(newFile);
            ParserGenres parserGenres = new ParserGenres();
            ArrayList<String> list = reader.Read(file);
            ArrayList<ArrayList<String>> parsed = parserGenres.Parse(list, regexGenres);
            writer.writeToFile(parsed, newFile);
        }  else if(newFile.equalsIgnoreCase("countries")){
            writer.createFile(newFile);
            ParserCountries parserCountries = new ParserCountries();
            ArrayList<String> list = reader.Read(file);
            ArrayList<ArrayList<String>> parsed = parserCountries.Parse(list, regexCountries);
            writer.writeToFile(parsed, newFile);
        } else if(newFile.equalsIgnoreCase("movies")){
            writer.createFile(newFile);
            ParserMovies parserMovies = new ParserMovies();
            ArrayList<String> list = reader.Read(file);
            ArrayList<ArrayList<String>> parsed = parserMovies.Parse(list, regexMovies);
            writer.writeToFile(parsed, newFile);
        } else { 
            System.out.println("Verkeerd bestand gekozen.");
        }
        in.close();
    }

}
