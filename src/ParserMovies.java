import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserMovies {

    public ArrayList<ArrayList<String>> Parse(ArrayList<String> input, String regex) {
        Pattern pattern = Pattern.compile(regex);


        ArrayList<ArrayList<String>> collectie = new ArrayList<ArrayList<String> >();

        collectie.add(new ArrayList<String>());

        collectie.get(0).add("Movie Title");
        collectie.get(0).add("Year");

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());

            if(matcher.find()) {

                if (matcher.group(1) != null) {
                    String actor = matcher.group(1).toString();
                    //lijst.add(actor.replaceAll("[,]", ""));   
                    
                    collectie.get(i+1).add(matcher.group(1).replaceAll("[\",]", "").replaceAll("[,]", "").toString());
                         
                }

                if (matcher.group(2) != null) {
                    //lijst.add(matcher.group(3));

                    collectie.get(i+1).add(matcher.group(2).replaceAll("[\",]", "").replaceAll("[,]", "").toString());
                }



            }

        }
        
        return collectie;
    }
}
