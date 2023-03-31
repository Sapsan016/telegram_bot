package com.github.sapsan016.telegrambot.command_tests;

import com.github.sapsan016.telegrambot.command.Command;
import com.github.sapsan016.telegrambot.command.NoCommand;
import com.github.sapsan016.telegrambot.command_tests.AbstractCommandTest;
import org.junit.jupiter.api.DisplayName;

import static com.github.sapsan016.telegrambot.command.CommandName.NO;
import static com.github.sapsan016.telegrambot.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
