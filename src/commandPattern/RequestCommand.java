package commandPattern;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This class contains all the functionality of the different functions
public class RequestCommand {

    public void parseActors(ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {

        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);

        parsed.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        parsed.get(0).add("Person Name");
        parsed.get(0).add("Movie Title");
        parsed.get(0).add("Year");

        //init test if empty variable and actor to save latest used actor
        String actor = "";
        String test = "";

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            parsed.add(new ArrayList<String>());

            //add matches to arraylist according to regex group matches
            if (matcher.find()) {

                if (matcher.group(1) != null) {
                    //check if group(1) has no actor, then keep previous actor in actor variable, otherwise update to new actor
                    if (matcher.group(1).equals(test)) {
                        //nothing
                    } else {
                        actor = matcher.group(1);
                    }
                    parsed.get(i + 1).add(actor.replaceAll("[,]", ""));
                }

                if (matcher.group(3) != null) {
                    parsed.get(i + 1).add(matcher.group(3).replaceAll("[\",]", "").replaceAll("[,]", ""));
                }

                if (matcher.group(5) != null) {
                    parsed.get(i + 1).add(matcher.group(5));
                }
            }
        }
    }

    public void parseCountries(ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {
        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);

        parsed.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        parsed.get(0).add("Movie Title");
        parsed.get(0).add("Year");
        parsed.get(0).add("Country");

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            parsed.add(new ArrayList<String>());

            //add matches to arraylist according to regex group matches
            if (matcher.find()) {

                if (matcher.group(1) != null) {
                    String movie = matcher.group(1);
                    parsed.get(i + 1).add(movie.replaceAll("[,]", ""));

                }

                if (matcher.group(2) != null) {
                    parsed.get(i + 1).add(matcher.group(2));
                }

                if (matcher.group(5) != null) {
                    parsed.get(i + 1).add(matcher.group(5));
                }
            }
        }
    }

    public void parseGenres(ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {
        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);

        parsed.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        parsed.get(0).add("Movie Title");
        parsed.get(0).add("Year");
        parsed.get(0).add("Genre");

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            parsed.add(new ArrayList<String>());

            //add matches to arraylist according to regex group matches
            if (matcher.find()) {

                if (matcher.group(1) != null) {
                    String movie = matcher.group(1);

                    if (movie == "") {
                        parsed.get(i + 1).add(parsed.get(i).get(0).replaceAll("[']", ""));
                    } else {
                        parsed.get(i + 1).add(movie.replaceAll("[,]", ""));
                    }
                }

                if (matcher.group(2) != null) {
                    parsed.get(i + 1).add(matcher.group(2));
                }

                if (matcher.group(7) != null) {
                    parsed.get(i + 1).add(matcher.group(7));
                }
            }

        }
    }

    public void parseMovies(ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {
        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);

        parsed.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        parsed.get(0).add("Movie Title");
        parsed.get(0).add("Year");

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            parsed.add(new ArrayList<String>());

            //add matches to arraylist according to regex group matches
            if (matcher.find()) {

                if (matcher.group(1) != null) {
                    parsed.get(i + 1).add(matcher.group(1).replaceAll("[\",]", "").replaceAll("[,]", ""));
                }

                if (matcher.group(2) != null) {
                    parsed.get(i + 1).add(matcher.group(2).replaceAll("[\",]", "").replaceAll("[,]", ""));
                }
            }
        }
    }

    public void parseRating(ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {
        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);

        parsed.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        parsed.get(0).add("Rating");
        parsed.get(0).add("Movie Title");
        parsed.get(0).add("Year");

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            parsed.add(new ArrayList<String>());

            //add matches to arraylist according to regex group matches
            if (matcher.find()) {
                if (matcher.group(2) != null) {
                    String actor = matcher.group(2);
                    parsed.get(i + 1).add(actor.replaceAll("[,]", ""));
                }

                if (matcher.group(4) != null) {
                    parsed.get(i + 1).add(matcher.group(4).replaceAll("[\",]", "").replaceAll("[,]", ""));
                }

                if (matcher.group(6) != null) {
                    parsed.get(i + 1).add(matcher.group(6));
                }
            }
        }
    }
}
