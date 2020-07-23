// 
// Decompiled by Procyon v0.5.36
// 

package me.mertrespectt;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    public static Main plugin;
    public static String pr;
    public static String noperm;
    public static String fly_on;
    public static String fly_off;
    public static String aon;
    public static String aoff;
    public static String invalid_args;
    public static String console;
    
    public void onEnable() {
        Main.plugin = this;
        Main.pr = this.getConfig().getString("Messages.Prefix").replace('&', '§');
        Main.noperm = this.getConfig().getString("Messages.NotPermission").replace('&', '§');
        Main.fly_on = this.getConfig().getString("Messages.Fly-ON").replace('&', '§');
        Main.fly_off = this.getConfig().getString("Messages.Fly-OFF").replace('&', '§');
        Main.aon = this.getConfig().getString("Messages.Fly-Already-ON").replace('&', '§');
        Main.aoff = this.getConfig().getString("Messages.Fly-Already-OFF").replace('&', '§');
        Main.invalid_args = this.getConfig().getString("Messages.InvalidArguments").replace('&', '§');
        Main.console = this.getConfig().getString("Messages.ConsoleMessage").replace('&', '§');
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§e§lFly Plugin §fby CrispyBow");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("");
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
    }
}
