package net.frostbyte.slabsandstairs.block.custom.oxidizable;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OxidizablePressurePlateBlock extends PressurePlateBlock implements WeatheringCopper {
    private final WeatherState oxidationLevel;

    public OxidizablePressurePlateBlock(WeatheringCopper.WeatherState oxidationLevel, BlockSetType type, BlockBehaviour.Properties settings) {
        super(type, settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.oxidationLevel;
    }
}
