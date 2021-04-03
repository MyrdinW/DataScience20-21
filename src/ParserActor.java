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

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());

            if(matcher.find()) {

                if (matcher.group(1) != null) {
                    String actor = matcher.group(1).toString();
                    //lijst.add(actor.replaceAll("[,]", ""));   
                    
                    if(actor == ""){
                        collectie.get(i+1).add(collectie.get(i).get(0).replaceAll("[,]", "").toString().replaceAll("[']", ""));
                        //System.out.println(collectie.get(i+1).get(0));
                         
                    } else {
                        collectie.get(i+1).add(actor.replaceAll("[,]", ""));
                        //System.out.println(collectie.get(i+1).get(0));
                    }     
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
