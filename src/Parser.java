import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public ArrayList<String> Parse(ArrayList<String> input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> lijst = new ArrayList<String>();

        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i).trim());

            if(matcher.find()) {
                lijst.add(matcher.group(1));
                lijst.add(matcher.group(3));
                lijst.add(matcher.group(5));
            }

        }
        return lijst;
    }
}
