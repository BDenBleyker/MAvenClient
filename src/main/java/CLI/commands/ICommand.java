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
 * @author Gabriel.Maxfield
 */
public interface ICommand {
    public String getName();
    public Reply response(String[] args);
    public String[] getKeys();
    public HelpBean getHelp();
    
}
