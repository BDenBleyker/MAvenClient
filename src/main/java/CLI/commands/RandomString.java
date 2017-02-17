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
public class RandomString implements ICommand{

    @Override
    public String getName() {
        return "Random String";
    }

    @Override
    public Reply response(String[] args) {
        int length = Integer.parseInt(args[1]);
        int range = Integer.parseInt(args[2]);
        String result = "";
        //Construct String:
        for(int i = 0; i < length; i++){
            result+=(char)(int)(Math.random()*range);
        }
        return new Reply(true, result);
    }

    @Override
    public String[] getKeys() {
        return new String[]{"rs","randstring"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!RandString <LENGTH> <RANGE>");
    }
    
}
