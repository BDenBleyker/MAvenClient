/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands;

import CLI.commands.beans.HelpBean;
import CLI.commands.beans.Reply;

/**
 *
 * @author Gabe
 */
public class AntiBinaryCode implements ICommand{

    @Override
    public String getName() {
        return "Anti-Binary Code";
    }

    @Override
    public Reply response(String[] args) {
        String result = "";
        for(int i = 1; i < args.length; i++){
            result+=(char)(Integer.parseInt(args[i], 2));
        }
        return new Reply(true, result);
    }

    @Override
    public String[] getKeys() {
        return new String[]{"abc","antibinary"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!AntiBinary <TO_DECODE>");
    }
    
}
