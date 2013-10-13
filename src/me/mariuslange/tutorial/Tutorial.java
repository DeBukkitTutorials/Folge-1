package me.mariuslange.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin 
{
	@Override
	public void onEnable()
	{
		System.out.println("Das Plugin wurde erfolgreich geladen!");
	}
}