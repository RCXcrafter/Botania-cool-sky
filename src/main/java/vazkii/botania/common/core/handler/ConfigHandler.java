/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jan 13, 2014, 9:01:32 PM (GMT)]
 */
package vazkii.botania.common.core.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public final class ConfigHandler {

	public static Configuration config;
	//public static ConfigAdaptor adaptor;

	public static boolean enableFancySkybox = true;
	public static boolean enableFancySkyboxInNormalWorlds = true;

	public static void loadConfig(File configFile) {
		config = new Configuration(configFile);

		config.load();
		load();
	}

	public static void load() {
		String desc;

		desc = "Set this to false to disable the fancy skybox in Garden of Glass.";
		enableFancySkybox = loadPropBool("fancySkybox.enable", desc, enableFancySkybox);

		desc = "Set this to true to enable the fancy skybox in non Garden of Glass worlds. (Does not require Garden of Glass loaded to use, needs 'fancySkybox.enable' to be true as well)";
		enableFancySkyboxInNormalWorlds = loadPropBool("fancySkybox.normalWorlds", desc, enableFancySkyboxInNormalWorlds);

		if(config.hasChanged())
			config.save();
	}

	public static int loadPropInt(String propName, String desc, int default_) {
		Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
		prop.comment = desc;

		return prop.getInt(default_);
	}

	public static double loadPropDouble(String propName, String desc, double default_) {
		Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
		prop.comment = desc;

		return prop.getDouble(default_);
	}

	public static boolean loadPropBool(String propName, String desc, boolean default_) {
		Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
		prop.comment = desc;

		return prop.getBoolean(default_);
	}
}
