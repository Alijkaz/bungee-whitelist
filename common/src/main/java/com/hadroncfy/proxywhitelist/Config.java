package com.hadroncfy.proxywhitelist;

public class Config {
    public String kickMessage = "You're not whitelisted!";
    public boolean enabled = false;
    public boolean broadcast = false;
    public void assign(Config c){
        kickMessage = c.kickMessage;
        enabled = c.enabled;
        broadcast = c.broadcast;
    }
}