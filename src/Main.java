import commandPattern.CommandInvoker;
import commandPattern.RequestCommand;
import commandPattern.commands.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        // Console output for Parsing
        System.out.println("What is the name of the database you would like to parse?");
        System.out.println("Possible options: actors / actresses / movies / countries / genres / ratings");

        //Save user input to variable including pathing
        String file = "/databases/" + in.nextLine() + ".txt";

        //Save user input without pathing
        String newFile = removeExtension.RemoveExtension(file);

        //Regex per imdb database file
        String regexActor = "([A-Za-z,.'$&*,-/,0-9,@?ï»¿#,\" ]*)?([\t]*)(.+?)([ ]*)\\(([0-9]{4})(.+?\\n{2})?";
        String regexRating = "(.{27})([0-9]\\.[0-9])([ ]*)([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\\\"@?:, ]*) (\\()([0-9]{4})(\\))([ ]*)([A-Za-zÀ-ú,.'$&*,-/,0-9,#!\\\"@?{}():, ]*)";
        String regexGenres = "(.+?) \\(([0-9]{4})(/[I]*)?\\) ?(\\{.+?\\}?\\})?(\\(.+?\\))?(\\t*)([A-z\\-]*)";
        String regexCountries = "(.+?) \\(([0-9]{4})(.+?)(\\t)+([A-zÀ-ú,. -].+)";
        String regexMovies = "(.+?) \\(([0-9]{4})/?I*";

        //Init Reader and Writer objects
        Reader reader = new Reader();
        Writer writer = new Writer();

        ArrayList<String> list = reader.Read(file);
        ArrayList<ArrayList<String>> parsed = new ArrayList<>();

        //Make a RequestCommand instance so it can be passed to the commands
        RequestCommand rq = new RequestCommand();

        //Make instances of all commands that will be used
        ParseActor parseActorCmd = new ParseActor(rq, list, regexActor, parsed);
        ParseCountries parseCountriesCmd = new ParseCountries(rq, list, regexCountries, parsed);
        ParseGenres parseGenresCmd = new ParseGenres(rq, list, regexGenres, parsed);
        ParseMovies parseMoviesCmd = new ParseMovies(rq, list, regexMovies, parsed);
        ParseRating parseRatingCmd = new ParseRating(rq, list, regexRating, parsed);

        //Make an invoker instance to set and execute commands
        CommandInvoker invoker = new CommandInvoker();


        // Use user input to select which database file to parse and parse
        // Optional upgrade (use switch statements)
        if (newFile.equalsIgnoreCase("actors") || newFile.equalsIgnoreCase("actresses")) {
            writer.createFile(newFile);
            //Give the command to be executed to the invoker and execute it.
            invoker.setCommand(parseActorCmd);
            invoker.executeCommand();
            //Write the parsed data to the new file.
            writer.writeToFile(parsed, newFile);
        } else if (newFile.equalsIgnoreCase("ratings")) {
            writer.createFile(newFile);
            //Give the command to be executed to the invoker and execute it.
            invoker.setCommand(parseRatingCmd);
            invoker.executeCommand();
            //Write the parsed data to the new file.
            writer.writeToFile(parsed, newFile);
        } else if (newFile.equalsIgnoreCase("genres")) {
            writer.createFile(newFile);
            //Give the command to be executed to the invoker and execute it.
            invoker.setCommand(parseGenresCmd);
            invoker.executeCommand();
            //Write the parsed data to the new file.
            writer.writeToFile(parsed, newFile);
        } else if (newFile.equalsIgnoreCase("countries")) {
            writer.createFile(newFile);
            //Give the command to be executed to the invoker and execute it.
            invoker.setCommand(parseCountriesCmd);
            invoker.executeCommand();
            //Write the parsed data to the new file.
            writer.writeToFile(parsed, newFile);
        } else if (newFile.equalsIgnoreCase("movies")) {
            writer.createFile(newFile);
            //Give the command to be executed to the invoker and execute it.
            invoker.setCommand(parseMoviesCmd);
            invoker.executeCommand();
            //Write the parsed data to the new file.
            writer.writeToFile(parsed, newFile);
        } else {
            //Security if input doesn't exist
            System.out.println("Verkeerd bestand gekozen.");
        }


        //close input Scanner
        in.close();


    }

}
