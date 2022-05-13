package com.fg.firetale.gui;

import com.fg.firetale.block.FitBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;



public class FitContainer extends AbstractContainerMenu {


    private Container Con3 = new SimpleContainer(3);
    public FitContainer(int pContainerId, Inventory inventory, BlockPos pos, Level pLevel) {
        super(MenuTypeReg.fitGui.get(), pContainerId);
        FitBlockEntity fitBlockEntity=(FitBlockEntity)pLevel.getBlockEntity(pos);
        this.addSlot(new Slot(Con3,0,1,1));
        this.addSlot(new Slot(Con3,1,1,2));
        this.addSlot(new Slot(Con3,2,1,3){
            public boolean mayPlace(ItemStack p_40362_) {
                return false;
            }
            public void onTake(Player p_150672_, ItemStack p_150673_) {
                super.onTake(p_150672_, p_150673_);
            }
            });
        layoutPlayerInventorySlots(inventory, 8, 84);
    }
    @Override
    public boolean stillValid(Player player) {
        return false;
    }

    private int addSlotRange(Container inventory, int index, int x, int y, int amount, int dx) {
        for (int i = 0; i < amount; i++) {
            addSlot(new Slot(inventory, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(Container inventory, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0; j < verAmount; j++) {
            index = addSlotRange(inventory, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(Container inventory, int leftCol, int topRow) {
        addSlotBox(inventory, 9, leftCol, topRow, 9, 18, 3, 18);
        topRow += 58;
        addSlotRange(inventory, 0, leftCol, topRow, 9, 18);
    }

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        return ItemStack.EMPTY;
    }
}
