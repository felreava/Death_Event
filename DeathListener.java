package com.republicasmp.dev.death;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class DeathListener implements Listener{

	public DeathListener(Main ma, PluginManager pm)
	{
		pm.registerEvents(this, ma);
		
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e)
	{
		Player p = (Player) e.getEntity();
		
		 if (p.hasPermission("ziminiar.level")){
			 
			
			 p.sendMessage(ChatColor.RED + "Test");
		    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin) this, new FireworkDelayedBurster(p), 45L, 45L);    	
		    	
		    	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, new Runnable(){
		               public void run(){
		                   Bukkit.getScheduler().cancelAllTasks();
		               }
		           }, 2400L);
		    }
			 
		            
			 
		 
		 }
	}
	




	

