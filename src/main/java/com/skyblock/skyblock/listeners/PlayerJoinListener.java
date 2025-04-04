package com.skyblock.skyblock.listeners;


import com.skyblock.skyblock.SkyblockPlayer;
import com.skyblock.skyblock.features.island.IslandManager;
import com.skyblock.skyblock.features.ranks.PlayerRank;
import com.skyblock.skyblock.utilities.Util;
import com.skyblock.skyblock.utilities.item.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;

import java.util.UUID;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void giveSkyblockMenu(PlayerJoinEvent event) {
        event.getPlayer().getInventory().setItem(8, Util.createSkyblockMenu());
        event.setJoinMessage(null);
        
        SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(event.getPlayer());
        Player player = event.getPlayer();
        PlayerRank rank = sbplayer.getRank();
        String rankColour = rank.getColour();
        String playerName = event.getPlayer().getName();
        String rankPrefix = rank.getPrefix();
        String playerRankedName = rankPrefix + " " + rankColour + playerName;
        
        player.setDisplayName(playerRankedName);
        player.setPlayerListName(playerRankedName);
    }
    
    @EventHandler(priority = EventPriority.LOW)
    public void Event(AsyncPlayerChatEvent e) {
    	Player player = e.getPlayer();
    	SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(player);
    	PlayerRank rank = sbplayer.getRank();
        String rankColour = rank.getColour();
        String playerName = e.getPlayer().getName();
        String rankPrefix = rank.getPrefix();
        String playerRankedName = rankPrefix + " " + rankColour + playerName;
        
        e.setFormat(playerRankedName + "§f: %s");
    }

}
