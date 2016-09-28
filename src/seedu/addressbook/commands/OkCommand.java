package seedu.addressbook.commands;

import java.util.regex.Pattern;

/**
 * Created by yihangho on 9/27/16.
 */
public class OkCommand extends Command {
    public static final String COMMAND_WORD = "ok";

    private static final String OTHER_ASSISTANTS_FORMAT = "(?i)\\s*(google|siri|cortana|alexa)\\s*";
    private static final String ADDRESS_BOOK_FORMAT = "(?i)\\s*address\\s?book\\s*";

    private String assistant;

    public OkCommand(String assistant) {
        this.assistant = assistant;
    }

    @Override
    public CommandResult execute() {
        if (assistant.matches(OTHER_ASSISTANTS_FORMAT)) {
            return new CommandResult("Very funny");
        } else if (assistant.matches(ADDRESS_BOOK_FORMAT)) {
            return new CommandResult("Yes?");
        }

        return new CommandResult("Who's that?");
    }
}
