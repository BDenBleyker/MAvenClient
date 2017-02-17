/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands.beans;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Reply {

    final boolean clientSide;
    String message;

    public Reply(boolean clientSide, String message) {
        this.clientSide = clientSide;
        this.message = message;
    }
    
    public Reply(String message) {
        this.clientSide = false;
        this.message = message;
    }

    public boolean isClientSide() {
        return clientSide;
    }

    public String getMessage() {
        return message;
    }
}
