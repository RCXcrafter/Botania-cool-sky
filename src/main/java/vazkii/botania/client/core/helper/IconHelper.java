/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jan 14, 2014, 5:28:21 PM (GMT)]
 */
package vazkii.botania.client.core.helper;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import vazkii.botania.client.lib.LibResources;

public final class IconHelper {

	public static IIcon forName(IIconRegister ir, String name) {
		return ir.registerIcon(LibResources.PREFIX_MOD + name);
	}

	public static IIcon forName(IIconRegister ir, String name, String dir) {
		return ir.registerIcon(LibResources.PREFIX_MOD + dir + "/" + name);
	}
}