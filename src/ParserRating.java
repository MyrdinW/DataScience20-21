import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserRating {

    public ArrayList<ArrayList<String>> Parse(ArrayList<String> input, String regex) {
        Pattern pattern = Pattern.compile(regex);

        ArrayList<ArrayList<String>> collectie = new ArrayList<ArrayList<String>>();

        collectie.add(new ArrayList<String>());

        collectie.get(0).add("Rating");
        collectie.get(0).add("Movie Title");
        collectie.get(0).add("Year");

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));

            collectie.add(new ArrayList<String>());

            if (matcher.find()) {

                if (matcher.group(2) != null) {
                    String actor = matcher.group(2).toString();

                    if (actor == "") {
                        collectie.get(i + 1)
                                .add(collectie.get(i).get(0).replaceAll("[,]", "").toString().replaceAll("[']", ""));

                    } else {
                        collectie.get(i + 1).add(actor.replaceAll("[,]", ""));
                    }
                }

                if (matcher.group(4) != null) {
                    collectie.get(i + 1).add(matcher.group(4).replaceAll("[\",]", "").replaceAll("[,]", "").toString());
                } 

                if (matcher.group(6) != null) {
                    collectie.get(i + 1).add(matcher.group(6));
                }

            }

        }

        return collectie;
    }
}
