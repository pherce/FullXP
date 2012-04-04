package me.pherce.FullXP;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
	
	@EventHandler
    public void death(PlayerDeathEvent event){
		Player player = event.getEntity().getPlayer();
		int xp = event.getEntity().getTotalExperience();
		event.setDroppedExp(xp);
		player.sendMessage(ChatColor.GOLD + "You just dropped " + xp + " experience! Hurry back to collect it all.");

	}

}
