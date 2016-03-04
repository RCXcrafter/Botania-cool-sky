/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jul 23, 2014, 5:28:55 PM (GMT)]
 */
package vazkii.botania.common.block.mana;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import vazkii.botania.api.lexicon.ILexiconable;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.common.block.BlockMod;
import vazkii.botania.common.block.tile.TileSpawnerClaw;
import vazkii.botania.common.lexicon.LexiconData;
import vazkii.botania.common.lib.LibBlockNames;

public class BlockSpawnerClaw extends BlockMod implements ILexiconable {

	public BlockSpawnerClaw() {
		super(Material.iron);
		setHardness(3.0F);
		setUnlocalizedName(LibBlockNames.SPAWNER_CLAW);

		float f = 1F / 8F;
		float f1 = 1F / 16F;
		setBlockBounds(f, 0F, f, 1F - f, f1, 1F - f);
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list) {
		list.add(new ItemStack(item));
		list.add(new ItemStack(Blocks.mob_spawner));
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileSpawnerClaw();
	}

	@Override
	public LexiconEntry getEntry(World world, BlockPos pos, EntityPlayer player, ItemStack lexicon) {
		return LexiconData.spawnerClaw;
	}

}
