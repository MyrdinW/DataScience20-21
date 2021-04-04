import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ParserGenres {

    public ArrayList<ArrayList<String>> Parse(ArrayList<String> input, String regex) {

        //init regex pattern and Arraylist to save the lines to write
        Pattern pattern = Pattern.compile(regex);
        ArrayList<ArrayList<String>> collectie = new ArrayList<ArrayList<String> >();

        collectie.add(new ArrayList<String>());

        //write row "names" to arraylist in first line
        collectie.get(0).add("Movie Title");
        collectie.get(0).add("Year");
        collectie.get(0).add("Genre");

        //for loop to read each line
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());
            
            //add matches to arraylist according to regex group matches
            if(matcher.find()) {

                if (matcher.group(1) != null) {
                    String movie = matcher.group(1).toString();

                    if(movie == ""){
                        collectie.get(i+1).add(collectie.get(i).get(0).toString().replaceAll("[']", ""));
                    } else {
                        collectie.get(i+1).add(movie.replaceAll("[,]", ""));
                    }
                }

                if (matcher.group(2) != null) {
                    collectie.get(i+1).add(matcher.group(2).toString());
                }

                if (matcher.group(7) != null) {
                    collectie.get(i+1).add(matcher.group(7));
                }
            }

        }

        return collectie;
    }
}
