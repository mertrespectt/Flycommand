// 
// Decompiled by Procyon v0.5.36
// 

package me.mertrespectt;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;

public class FlyCommand implements CommandExecutor
{
    public static ArrayList<Player> flymode;
    
    static {
        FlyCommand.flymode = new ArrayList<Player>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String s, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(String.valueOf(Main.pr) + Main.console);
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("fly")) {
            if (p.hasPermission("fly.use")) {
                if (args.length == 0) {
                    if (!FlyCommand.flymode.contains(p)) {
                        FlyCommand.flymode.add(p);
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(String.valueOf(Main.pr) + Main.fly_on);
                    }
                    else {
                        FlyCommand.flymode.remove(p);
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.sendMessage(String.valueOf(Main.pr) + Main.fly_off);
                    }
                }
                else if (args[0].equalsIgnoreCase("on")) {
                    if (!FlyCommand.flymode.contains(p)) {
                        FlyCommand.flymode.add(p);
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(String.valueOf(Main.pr) + Main.fly_on);
                    }
                    else {
                        p.sendMessage(String.valueOf(Main.pr) + Main.aon);
                    }
                }
                else if (args[0].equalsIgnoreCase("off")) {
                    if (FlyCommand.flymode.contains(p)) {
                        FlyCommand.flymode.remove(p);
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.sendMessage(String.valueOf(Main.pr) + Main.fly_off);
                    }
                    else {
                        p.sendMessage(String.valueOf(Main.pr) + Main.aoff);
                    }
                }
                else {
                    p.sendMessage(String.valueOf(Main.pr) + Main.invalid_args);
                }
            }
            else {
                p.sendMessage(String.valueOf(Main.pr) + Main.noperm);
            }
        }
        return false;
    }
}
