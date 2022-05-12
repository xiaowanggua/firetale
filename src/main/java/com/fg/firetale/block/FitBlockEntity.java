package com.fg.firetale.block;


import com.fg.firetale.firetale;
import com.fg.firetale.gui.FitContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;


public class FitBlockEntity extends BlockEntity implements MenuProvider {

    private NonNullList<ItemStack> items;
    public FitBlockEntity( BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityReg.fitBlockEntity.get(), pWorldPosition, pBlockState);
        this.items = NonNullList.withSize(3, ItemStack.EMPTY);
    }


    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("gui."+ firetale.MODID+".fit_gui_container");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return new FitContainer(i,inventory, this.getBlockPos(), this.level);
    }


    public NonNullList<ItemStack> getInventory() {
        return items;
    }

    public static void clientTick(Level level, BlockPos pos, BlockState blockState, FitBlockEntity fitBlockEntity) {
    }

    public static <E extends BlockEntity> void serverTick(Level level, BlockPos pos, BlockState blockState, E e) {
    }
}
