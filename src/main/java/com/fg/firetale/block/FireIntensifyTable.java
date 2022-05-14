package com.fg.firetale.block;

import com.fg.firetale.firetale;
import com.fg.firetale.gui.FitContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class FireIntensifyTable<E extends BlockEntity> extends BaseEntityBlock {


    public FireIntensifyTable() {
        super(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 8.0F));
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FitBlockEntity(blockPos, blockState);
    }
    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide&&pHand==InteractionHand.MAIN_HAND) {
            BlockEntity FitBE = pLevel.getBlockEntity(pPos);
            if(FitBE instanceof FitBlockEntity){
                    MenuProvider containerProvider = new MenuProvider() {
                        @Override
                        public Component getDisplayName() {
                            return new TranslatableComponent("screen."+ firetale.MODID+".fitgui");
                        }

                        @Nullable
                        @Override
                        public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
                            return new FitContainer(i,inventory,pPos,player);
                        }
                    };
                    NetworkHooks.openGui((ServerPlayer) pPlayer,containerProvider,FitBE.getBlockPos());
            }else {
                throw new IllegalStateException("container missing!");
            }
        }
        return InteractionResult.SUCCESS;
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return BaseEntityBlock.createTickerHelper(pBlockEntityType, BlockEntityReg.fitBlockEntity.get(),
                pLevel.isClientSide ? FitBlockEntity::clientTick : FitBlockEntity::serverTick);
    }

}
