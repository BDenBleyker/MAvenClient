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
public class HexCode implements ICommand{

    @Override
    public String getName() {
        return "Hex Code";
    }

    @Override
    public Reply response(String[] args) {
        String result = "";
        for(int i = 1; i < args.length; i++){
            for(int e = 0; e < args[i].length();e++){
                result+=Integer.toHexString(args[i].charAt(e))+" ";
            }
            if(i < args.length-1)
            result+=Integer.toHexString(' ')+" ";
        }
        return new Reply(true, result);
    }

    @Override
    public String[] getKeys() {
        return new String[]{"hc","hex"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!Hex <TO_DECODE>");
    }
    
}
