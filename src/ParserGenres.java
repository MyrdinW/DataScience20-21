import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//String regex = "(.+?) \\(([0-9]{4})(/[I]*)?\\) ?(\\{.+?\\}?\\})?(\\(.+?\\))?(\\t*)([A-z\\-]*)";

public class ParserGenres {

    public ArrayList<ArrayList<String>> Parse(ArrayList<String> input, String regex) {
        Pattern pattern = Pattern.compile(regex);

        //ArrayList<String> lijst = new ArrayList<String>();

        ArrayList<ArrayList<String>> collectie = new ArrayList<ArrayList<String> >();

        collectie.add(new ArrayList<String>());

        collectie.get(0).add("Movie Title");
        collectie.get(0).add("Year");
        collectie.get(0).add("Genre");

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());

            if(matcher.find()) {

                if (matcher.group(1) != null) {
                    String movie = matcher.group(1).toString();
                    //lijst.add(movie.replaceAll("[,]", ""));

                    if(movie == ""){
                        collectie.get(i+1).add(collectie.get(i).get(0).toString().replaceAll("[']", ""));
                        //System.out.println(collectie.get(i+1).get(0));

                    } else {
                        collectie.get(i+1).add(movie.replaceAll("[,]", ""));
                        //System.out.println(collectie.get(i+1).get(0));
                    }
                }

                if (matcher.group(2) != null) {
                    //lijst.add(matcher.group(3));

                    collectie.get(i+1).add(matcher.group(2).toString());
                }

                if (matcher.group(7) != null) {
                    //lijst.add(matcher.group(5));
                    collectie.get(i+1).add(matcher.group(7));
                }
            }

        }

        return collectie;
    }
}
