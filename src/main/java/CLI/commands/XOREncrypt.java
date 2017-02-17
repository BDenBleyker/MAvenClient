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
public class XOREncrypt implements ICommand {

    @Override
    public String getName() {
        return "XOR Encrypt";
    }

    @Override
    public Reply response(String[] args) {
        int shift = Integer.parseInt(args[1]);
        String response = "";
        for(int i = 2; i < args.length; i++){
            for(int e = 0; e < args[i].length();e++){
                response+=(char)(args[i].charAt(e)^shift);
            }
        }
        return new Reply(true, response);
    }

    @Override
    public String[] getKeys() {
        return new String[]{"xe","xor"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!XOR <STUFF>");
    }
    
}
