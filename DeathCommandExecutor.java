package com.republicasmp.dev.death;

import java.util.Random;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

public class DeathCommandExecutor implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("fireworkz"))
		{
			if (p.hasPermission("ziminiar.level"))
			{
			 for(int i = 0; i < 200; i++){	
		        	
		            //Spawn the Firework
		            Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
		            FireworkMeta fwm = fw.getFireworkMeta();

		            //random
		            Random ra = new Random();

		            //sets type
		            int rt = ra.nextInt(5) + 1;
		            Type type = Type.BALL;
		            if (rt == 1) type = Type.BALL;
		            if (rt == 2) type = Type.BALL_LARGE;
		            if (rt == 3) type = Type.BURST;
		            if (rt == 4) type = Type.CREEPER;
		            if (rt == 5) type = Type.STAR;

		            //colors
		            //To be Added
		            
		            
		            
		            int r = ra.nextInt(256);
		            int b = ra.nextInt(256);
		            int g = ra.nextInt(256);
		            Color c1 = Color.fromRGB(r, g, b);

		            r = ra.nextInt(256);
		            b = ra.nextInt(256);
		            g = ra.nextInt(256);
		            Color c2 = Color.fromRGB(r, g, b);


		            //effect
		            FireworkEffect effect = FireworkEffect.builder().flicker(ra.nextBoolean()).withColor(c1).withFade(c2).with(type).trail(ra.nextBoolean()).build();

		            //applied effects
		            fwm.addEffect(effect);

		            //random power! moar sulphur!
		            int rp = ra.nextInt(2) + 1;
		            fwm.setPower(rp);

		            //aaaaaand set it
		            fw.setFireworkMeta(fwm);
			 	}
			 }
			 return true;
		} 	
			return false;
	}

}
