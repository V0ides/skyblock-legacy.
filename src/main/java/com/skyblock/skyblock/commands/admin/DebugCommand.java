package com.skyblock.skyblock.commands.admin;

import java.util.HashMap;

import com.skyblock.skyblock.Skyblock;
import com.skyblock.skyblock.SkyblockPlayer;
import com.skyblock.skyblock.utilities.command.Command;
import com.skyblock.skyblock.utilities.command.annotations.Description;
import com.skyblock.skyblock.utilities.command.annotations.Permission;
import com.skyblock.skyblock.utilities.command.annotations.RequiresPlayer;
import com.skyblock.skyblock.utilities.command.annotations.Usage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

@RequiresPlayer
@Permission(permission = "skyblock.admin")
@Usage(usage = "/sb debug")
@Description(description = "Toggle debug mode")
public class DebugCommand implements Command {

    @Override
    public void execute(Player player, String[] args, Skyblock plugin) {
    	
    	SkyblockPlayer sbplayer = SkyblockPlayer.getPlayer(player);
    	HashMap<String, Object> extraData = sbplayer.getExtraData();
    	
    	if (sbplayer.isDebug() == false) {
    	player.sendMessage("§9[DEBUG] §fDebug mode has been activated!");
    	extraData.put("debug", true);
  	} else if (sbplayer.isDebug() == true) {
  	  player.sendMessage("§c[DEBUG] §fDebug mode has been deactivated!");
  	  extraData.put("debug", false);
  	}
    }
}
