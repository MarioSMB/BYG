package voronoiaoc.byg.common.world.feature.features.overworld.trees.pine;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import voronoiaoc.byg.BYG;

import java.util.Random;

public class SmallPineTree extends Feature<NoFeatureConfig> {

    public SmallPineTree(Codec<NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean func_230362_a_(ISeedReader world, StructureManager structureManager, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if (pos.getX() == -8 && pos.getZ() == -9) {
            for (int checkX = pos.getX() + -16; checkX <= pos.getX() + 16; checkX++) {
                for (int checkY = pos.getY(); checkY <= 25; checkY++) {
                    for (int checkZ = pos.getZ() + -16; checkZ <= pos.getZ() + 16; checkZ++) {
                        BlockPos.Mutable block = new BlockPos.Mutable(checkX, checkY, checkZ);
                        world.setBlockState(block, Blocks.AIR.getDefaultState(), 2);
                    }
                }
            }

            TemplateManager templatemanager = ((ServerWorld) world.getWorld()).getStructureTemplateManager();
            Template template = templatemanager.getTemplate(new ResourceLocation(BYG.MOD_ID + ":features/trees/redwood_treexl_piece1"));
            Template template2 = templatemanager.getTemplate(new ResourceLocation(BYG.MOD_ID + ":features/trees/redwood_treexl_piece2"));

            if (template == null || template2 == null) {
                BYG.LOGGER.warn("NBT does not exist!");
                return false;
            }

            PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(null);
            template.func_237144_a_(world, pos, placementsettings, rand);
            template2.func_237144_a_(world, pos.up(32), placementsettings, rand);
            return true;
        }
        return false;
    }
}