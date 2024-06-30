package com.anajuliacodes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = ComfyStuff.MODID,
	name = ComfyStuff.NAME,
	version = ComfyStuff.VERSION
)
public class ComfyStuff {
	public static final String MODID = "comfystuff";
	public static final String NAME = "Comfy Stuff";
	public static final String VERSION = "1.0";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
