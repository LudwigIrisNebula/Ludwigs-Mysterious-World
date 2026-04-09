package io.github.ludwigirisnebula.ludwigsmysteriousworld.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;


/*
TODO: texture
      sound as a musical instruments
      when click the "special" block, the block will turn into another block, and leave some beautiful particle (also will play different sound)

*/

public class GoldenLeafItem extends Item {
    private static final Map<Block, Block> GoldenLeafMap =
            Map.of(
//                    TODO: add special block that will be change
            );

    public GoldenLeafItem(Settings settings) {
        super(settings);
    }



//    block changer
//    TODO: test it
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(GoldenLeafMap.containsKey(clickedBlock)){
            if(!world.isClient()){
                world.setBlockState(context.getBlockPos(), GoldenLeafMap.get(clickedBlock).getDefaultState());

                world.playSound(
                        null,
                        context.getBlockPos(),
                        SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME,
                        SoundCategory.PLAYERS,
                        1.0F,
                        1.0F
                );
                ((net.minecraft.server.world.ServerWorld) world).spawnParticles(
                        ParticleTypes.HAPPY_VILLAGER,
                        context.getBlockPos().getX() + 0.5,
                        context.getBlockPos().getY() + 1.0,
                        context.getBlockPos().getZ() + 0.5,
                        10,
                        0.3,
                        0.3,
                        0.3,
                        0.1
                );
            }
        }

        return ActionResult.SUCCESS;
    }
}
