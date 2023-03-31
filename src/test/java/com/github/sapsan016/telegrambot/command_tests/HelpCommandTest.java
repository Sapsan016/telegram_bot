package com.github.sapsan016.telegrambot.command_tests;


import com.github.sapsan016.telegrambot.command.Command;
import com.github.sapsan016.telegrambot.command.HelpCommand;
import com.github.sapsan016.telegrambot.command_tests.AbstractCommandTest;
import org.junit.jupiter.api.DisplayName;

import static com.github.sapsan016.telegrambot.command.CommandName.HELP;
import static com.github.sapsan016.telegrambot.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
