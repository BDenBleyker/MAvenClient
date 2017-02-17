/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands;

import CLI.CLI;
import CLI.commands.beans.HelpBean;
import CLI.commands.beans.Reply;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Name implements ICommand{
    
    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public Reply response(String[] args) {
        CLI.setUserName(args[1]);
        return null;
    }

    @Override
    public String[] getKeys() {
        return new String[]{"n","name"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!Name <NEW_NAME>");
    }
    
}
