/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class EchoCom implements ICommunicator {

    static List<String> messages = new ArrayList();
    
    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public void send(String msg) {
        messages.add(msg);
    }

    @Override
    public String recieve() {
        if (!messages.isEmpty()) {
            String toSend = messages.get(0);
            messages.remove(0);
            return toSend;
        }
        return null;
    }
    
}
