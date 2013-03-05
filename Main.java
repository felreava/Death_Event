package com.republicasmp.dev.death;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

		private String pluginName = "Death Test";
		private DeathListener lst;
		private DeathCommandExecutor dce;
		
		
		public void onEnable(){
			getLogger().info(pluginName + " has been enabled!");
			
			PluginManager pm = this.getServer().getPluginManager();
			
			dce = new DeathCommandExecutor();
			getCommand("fireworkz").setExecutor(dce);	
			
			lst = new DeathListener(this, pm);
			
		}
}
