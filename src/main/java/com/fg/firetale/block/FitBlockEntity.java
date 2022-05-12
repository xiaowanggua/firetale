package com.fg.firetale.block;

import com.fg.firetale.firetale;
import com.fg.firetale.gui.FitContainer;
import com.fg.firetale.gui.MenuTypeReg;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;


public class FitBlockEntity extends BaseContainerBlockEntity {


    public FitBlockEntity( BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityReg.fitBlockEntity.get(), pWorldPosition, pBlockState);
    }

    @Override
    protected Component getDefaultName() {
        return new TranslatableComponent("gui"+ firetale.MODID+"fit_container");
    }

    @Nullable
    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new FitContainer(i);
    }

    @Override
    public int getContainerSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getItem(int i) {
        return null;
    }

    @Override
    public ItemStack removeItem(int i, int i1) {
        return null;
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        return null;
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {

    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }

    @Override
    public void clearContent() {

    }
}
