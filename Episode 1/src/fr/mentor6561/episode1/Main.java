package fr.mentor6561.episode1;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	/**
	 * Ce qui se passe au load du plugin
	 * 
	 */
	public void onLoad() {
		System.out.println("Episode 1 - Load");
	}
	
	/**
	 * Ce qui se passe au démarage du plugin
	 * 
	 */
	public void onEnable() {
		System.out.println("Episode 1 - Enable");
	}
	
	/**
	 * Ce qui se passe à la fermeture du plugin
	 * 	
	 */
	public void onDisable() {
		System.out.println("Episode 1 - Disable");
	}
	
}
