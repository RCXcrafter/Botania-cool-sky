/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 24, 2014, 3:59:06 PM (GMT)]
 */
package vazkii.botania.api.subtile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * A Sub-TileEntity, this is used for the flower system. Make sure to map subclasses
 * of this using BotaniaAPI.mapSubTile(String, Class). Any subclass of this must have
 * a no parameter constructor.
 */
public class SubTileEntity {
	
	TileEntity supertile;
	
	public void setSupertile(TileEntity tile) {
		supertile = tile;
	}
	
	public boolean canUpdate() { 
		return false;
	}
	
	public void onUpdate() { }
	
	/**
	 * Writes some extra data to a network packet. This data is read
	 * by readFromPacketNBT on the client that receives the packet. 
	 */
	public void writeToPacketNBT(NBTTagCompound cmp) { }
	
	/**
	 * Reads data from a network packet. This data is written by
	 * writeToPacketNBT in the server.
	 */
	public void readFromPacketNBT(NBTTagCompound cmp) { }

}
