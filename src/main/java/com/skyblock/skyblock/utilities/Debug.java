package com.skyblock.skyblock.utilities;

import com.skyblock.skyblock.SkyblockPlayer;

import org.bukkit.entity.Player;

public class Debug {
	public void info(Player player, String message) {
	   	SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(player);
	   	
	   	if (sbplayer.isDebug()) {
    	player.sendMessage("§a[SB INFO] §f" + message);
	   	}
    }
    
    public void warning(Player player, String message) {
    	SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(player);
	   	
	   	if (sbplayer.isDebug()) {
    	player.sendMessage("§e[SB WARNING] §f" + message);
	   	}
    }
    
    public void error(Player player, String message) {
    	SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(player);
	   	
	   	if (sbplayer.isDebug()) {
    	player.sendMessage("§b[SB ERROR] §f" + message);
	   	}
    }
}