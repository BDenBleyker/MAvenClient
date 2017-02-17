/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands;
import CLI.commands.beans.HelpBean;
import CLI.commands.beans.Reply;
import CLI.commands.frac.Fraction;
/**
 *
 * @author Gabriel.Maxfield
 */
public class FractionCmd implements ICommand{

    @Override
    public String getName() {
        return "Fraction";
    }

    @Override
    public Reply response(String[] args) {
        String result = "";
        for(int i = 1; i < args.length; i++){
            result += args[i]+" ";
        }
        Fraction frac = Fraction.parseFrac(Fraction.exStr(result).trim());
        return new Reply(true, result+"= " + frac.reduce());
    }

    @Override
    public String[] getKeys() {
        return new String[]{"f","frac","fraction"};
    }
    
    @Override
    public HelpBean getHelp() {
        return new HelpBean(getKeys(), "!Fraction <FRACTION> (*||/||+||-) (FRACTION)");
    }
    
}
