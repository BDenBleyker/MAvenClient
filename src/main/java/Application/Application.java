/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import CLI.CLI;
import CLI.commands.beans.Reply;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CLI cli = new CLI();

        Reply result;
        while (true) {
            result = cli.processString(cli.nextString());
            Context.communicator.send(result.toString());
            System.out.println(Context.communicator.recieve());
        }
    }

}
