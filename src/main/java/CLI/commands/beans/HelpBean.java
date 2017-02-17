/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLI.commands.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class HelpBean {

    private List<String> aliases = new ArrayList();
    private String usage;

    public HelpBean(String[] aliases, String usage) {
        this.aliases.addAll(Arrays.asList(aliases));
        this.usage = usage;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public String getUsage() {
        return usage;
    }

    public void setAliases(String[] aliases) {
        this.aliases.clear();
        this.aliases.addAll(Arrays.asList(aliases));
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
