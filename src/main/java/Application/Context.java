/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Communication.EchoCom;
import Communication.ICommunicator;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Context {
    public static ICommunicator communicator = new EchoCom();
}
