import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserActor {

    public ArrayList<ArrayList<String>> Parse(ArrayList<String> input, String regex) {
        Pattern pattern = Pattern.compile(regex);

        //ArrayList<String> lijst = new ArrayList<String>();

        ArrayList<ArrayList<String>> collectie = new ArrayList<ArrayList<String> >();

        collectie.add(new ArrayList<String>());

        collectie.get(0).add("Person Name");
        collectie.get(0).add("Movie Title");
        collectie.get(0).add("Year");
        String actor = "";
        String test = "";

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());

            if(matcher.find()) {

                if (matcher.group(1) != null) {
                   if(matcher.group(1).toString().equals(test))
                   {
                        //nothing
                   } else {
                       actor = matcher.group(1).toString();
                   }
                        collectie.get(i+1).add(actor.replaceAll("[,]", ""));
                }

                if (matcher.group(3) != null) {
                    //lijst.add(matcher.group(3));

                    collectie.get(i+1).add(matcher.group(3).replaceAll("[\",]", "").replaceAll("[,]", "").toString());
                }

                if (matcher.group(5) != null) {
                    //lijst.add(matcher.group(5));
                    collectie.get(i+1).add(matcher.group(5));
                }

                if (matcher.group(6) != null) {
                    //lijst.add("null");
                }

            }

        }
        
        return collectie;
    }
}
