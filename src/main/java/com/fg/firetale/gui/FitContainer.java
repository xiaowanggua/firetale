package com.fg.firetale.gui;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;


public class FitContainer extends AbstractContainerMenu {


    public FitContainer(int pContainerId) {
        super(MenuTypeReg.fitGui.get(), pContainerId);
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
