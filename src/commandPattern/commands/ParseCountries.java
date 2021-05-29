package commandPattern.commands;

import commandPattern.ICommand;
import commandPattern.RequestCommand;

import java.util.ArrayList;

public class ParseCountries implements ICommand {
    private final RequestCommand rq;
    private final ArrayList<String> input;
    private final String regex;
    private final ArrayList<ArrayList<String>> parsed;

    public ParseCountries(RequestCommand rq, ArrayList<String> input, String regex, ArrayList<ArrayList<String>> parsed) {
        this.rq = rq;
        this.input = input;
        this.regex = regex;
        this.parsed = parsed;
    }

    @Override
    public void execute() {
        rq.parseCountries(input, regex, parsed);
    }
}
