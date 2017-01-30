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
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public final class ConfigHandler {

	public static Configuration config;

	public static List<Integer> dimensionWhitelist = new ArrayList();
	public static int[] dimensionWhitelistArray = {0};

	public static void loadConfig(File configFile) {
		config = new Configuration(configFile);

		config.load();
		load();
	}

	public static void load() {
		Property prop = config.get(Configuration.CATEGORY_GENERAL, "dimensionWhitelist", dimensionWhitelistArray);
		prop.comment = "list of dimensions to apply the fancy sky to";
		
		dimensionWhitelistArray = prop.getIntList();
		
		for (int dim : dimensionWhitelistArray)
			dimensionWhitelist.add(dim);
		
		if(config.hasChanged())
			config.save();
	}
}
