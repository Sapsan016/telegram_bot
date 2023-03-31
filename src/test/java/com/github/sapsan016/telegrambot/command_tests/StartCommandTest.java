package com.github.sapsan016.telegrambot.command_tests;

import com.github.sapsan016.telegrambot.command.Command;
import com.github.sapsan016.telegrambot.command.StartCommand;
import com.github.sapsan016.telegrambot.command_tests.AbstractCommandTest;
import org.junit.jupiter.api.DisplayName;

import static com.github.sapsan016.telegrambot.command.CommandName.START;
import static com.github.sapsan016.telegrambot.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}