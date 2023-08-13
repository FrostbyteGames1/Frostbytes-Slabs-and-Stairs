package net.frostbyte.slabsandstairs.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableButtonBlock extends ButtonBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public OxidizableButtonBlock(Oxidizable.OxidationLevel oxidationLevel, AbstractBlock.Settings settings, Integer pressTicks) {
        super(settings, BlockSetType.GOLD, pressTicks, false);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}