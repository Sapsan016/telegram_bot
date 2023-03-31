package com.github.sapsan016.telegrambot.command_tests;

import com.github.sapsan016.telegrambot.command.Command;
import com.github.sapsan016.telegrambot.command.UnknownCommand;
import com.github.sapsan016.telegrambot.command_tests.AbstractCommandTest;
import org.junit.jupiter.api.DisplayName;

import static com.github.sapsan016.telegrambot.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/fdgdfgdfgdbd";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}