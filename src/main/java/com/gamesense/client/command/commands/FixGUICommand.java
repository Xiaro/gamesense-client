package com.gamesense.client.command.commands;

import com.gamesense.api.util.misc.MessageBus;
import com.gamesense.client.GameSense;
import com.gamesense.client.clickgui.GameSenseGUI;
import com.gamesense.client.command.Command;

/**
 * @Author Hoosiers on 11/05/2020
 */

public class FixGUICommand extends Command {

    public FixGUICommand() {
        super("FixGUI");

        setCommandSyntax(Command.getCommandPrefix() + "fixgui");
        setCommandAlias(new String[]{
                "fixgui", "gui", "resetgui"
        });
    }

    public void onCommand(String command, String[] message) throws Exception {
        GameSense.getInstance().gameSenseGUI = new GameSenseGUI();
        MessageBus.sendCommandMessage("ClickGUI positions reset!", true);
    }
}