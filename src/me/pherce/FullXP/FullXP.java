package me.pherce.FullXP;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class FullXP extends JavaPlugin implements Listener {
	
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    public void onDisable() {
        System.out.println("FullXP disabled");
    }
    
	@EventHandler
    public void death(PlayerDeathEvent event){
		if(event.getEntity().getPlayer().hasPermission("fullxp.grant")){
		Player player = event.getEntity().getPlayer();
		int xp = event.getEntity().getTotalExperience();
		event.setDroppedExp(xp);
		player.sendMessage(ChatColor.GOLD + "You just dropped " + xp + " experience! Hurry back to collect it all.");
		}
	}
}
