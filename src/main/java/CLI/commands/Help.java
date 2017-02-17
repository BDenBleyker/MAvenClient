/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands;

import CLI.CLI;
import CLI.commands.beans.HelpBean;
import CLI.commands.beans.Reply;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Help implements ICommand {

    @Override
    public String getName() {
        return "Help";
    }

    @Override
    public Reply response(String[] args) {
        String criteria = args[0];
        String result="";
        List<ICommand> matchedCommands = new ArrayList();
        for (ICommand command : CLI.commands) {
            if (command.getName().toLowerCase().contains(criteria)) {
                matchedCommands.add(command);
            }
        }
        if (matchedCommands.isEmpty()) {
            matchedCommands.addAll(CLI.commands);
        }
        for(ICommand command : matchedCommands){
            String keys="";
            for(int i = 0; i < command.getKeys().length; i++){
                keys+=command.getKeys()[i]+", ";
            }
            result += ("Name: "+command.getName()+", Keys: "+keys+"\n");
        }
        return new Reply(true, result);
    }

    @Override
    public String[] getKeys() {
        return new String[] {"h","help"};
    }

    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!Help (SEARCH_CRITERIA)");
    }
    
}
