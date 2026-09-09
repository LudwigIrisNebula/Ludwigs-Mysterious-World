package io.github.ludwigirisnebula.ludwigsmysteriousworld.item.custom;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.block.custom.WhiteCrystalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

// TODO: It's a weird talking crystal

public class WhiteCrystalItem extends Item {

    public WhiteCrystalItem(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        return ActionResult.SUCCESS;
    }
}
