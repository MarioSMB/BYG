package corgiaoc.byg.common.world.biome;

import corgiaoc.byg.core.world.BYGConfiguredFeatures;
import corgiaoc.byg.core.world.BYGConfiguredStructures;
import corgiaoc.byg.core.world.BYGConfiguredSurfaceBuilders;
import corgiaoc.byg.mixin.access.VanillaBiomeAccess;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.SurfaceBuilders;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BYGOverworldBiomes {

    public static Biome alliumFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addAlliumFieldFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addSparseRedOakForestTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome amaranthFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addSparseJacarandaTrees(generationSettings);
        BYGDefaultBiomeFeatures.addAmaranthFieldFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome ancientForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
        generationSettings.addStructureStart(StructureFeatures.WOODLAND_MANSION);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addAncientTrees(generationSettings);
        BYGDefaultBiomeFeatures.addMeadowTrees(generationSettings);
        BYGDefaultBiomeFeatures.addShrubs(generationSettings);
        BYGDefaultBiomeFeatures.addHugeMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLolliPop(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addFairyslipper(generationSettings);
        BYGDefaultBiomeFeatures.addFairyslipper(generationSettings);
        BYGDefaultBiomeFeatures.addBlackRose(generationSettings);
        BYGDefaultBiomeFeatures.addRose(generationSettings);
        BYGDefaultBiomeFeatures.addLushBlueberries(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.05F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5406551).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome araucariaSavanna() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        BYGDefaultBiomeFeatures.addSparseAraucariaTrees(generationSettings);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_SAVANNA);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addSavannaExtraGrass(generationSettings);
        BiomeDefaultFeatures.addSavannaTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addSavannaExtraGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addFirecracker(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 1, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 1));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));


        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.SAVANNA).depth(0.2F).scale(0.15F).temperature(1.2F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10860373).foliageColorOverride(10860373).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome aspenForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addAspenTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addRose(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addYellowDaffodil(generationSettings);
        BYGDefaultBiomeFeatures.addOrangeDaisy(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);


        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.15F).temperature(0.7F).downfall(0.6F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11909994).foliageColorOverride(5406551).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome autumnalValley() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.MEADOW);

        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addMeadowShrubs(generationSettings);
        BYGDefaultBiomeFeatures.addLargePumpkins(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.15F).scale(0.1F).temperature(0.35F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11513689).foliageColorOverride(12435265).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome baobabSavanna() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_SAVANNA); //Savanna Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BYGDefaultBiomeFeatures.addBaobabTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addSavannaGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addSavannaExtraGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);


        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 1, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 1));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.SAVANNA).depth(0.2F).scale(0.15F).temperature(1.2F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10860373).foliageColorOverride(10860373).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome bayou() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.SWAMP);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_SWAMP); //Ruined Portal Swamp
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings); //Strongholds & Mineshafts
        BYGDefaultBiomeFeatures.addBayouVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addSwampClayDisk(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSwampExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        generationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_NORMAL);
        BYGDefaultBiomeFeatures.addBYGSwampVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addCattails(generationSettings);
        BYGDefaultBiomeFeatures.addPeachleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addVioletleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addRedorchid(generationSettings);
        BYGDefaultBiomeFeatures.addPurpleOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addPinkOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addMudDisks(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 1, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 1));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.SWAMP).depth(-0.38F).scale(0.01F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4815438).waterFogColor(6717479).grassColorOverride(7375928).foliageColorOverride(6337104).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome blackForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.BLACK_FOREST);
        generationSettings.addStructureStart(StructureFeatures.WOODLAND_MANSION); //Mansion
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);
        BYGDefaultBiomeFeatures.addBlackForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addLushBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addSages(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);
        BYGDefaultBiomeFeatures.addBlackRose(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 25, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.2F).scale(0.2F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5011004).foliageColorOverride(2263842).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome blueTaiga(boolean snowy) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addBlueTaigaTrees(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addTaigaGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);


        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(snowy ? Biome.Precipitation.SNOW : Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.2F).scale(0.2F).temperature(snowy ? -0.5F : 0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome bluffSteeps() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.OVERGROWN_STONE);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_MOUNTAIN); //Ruined Portal Mountain
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addBluffTrees(generationSettings);
        BYGDefaultBiomeFeatures.addSpruceTrees(generationSettings);
        BYGDefaultBiomeFeatures.addSparseAspenTrees(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addSages(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.EXTREME_HILLS).depth(2.0F).scale(0.2F).temperature(0.25F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome borealForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.BOREAL_FOREST);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addForestGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addBorealTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.25F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5011004).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome cherryBlossomForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addCherryTrees(generationSettings);
        BYGDefaultBiomeFeatures.addJapaneseOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addCherryFoliage(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.55F).scale(0.2F).temperature(0.7F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10999916).foliageColorOverride(10999916).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome cikaWoods() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GIANT_TREE_TAIGA);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addLargePumpkins(generationSettings);
        BYGDefaultBiomeFeatures.addCikaTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addFernGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.35F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(13414235).foliageColorOverride(13414235).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome coniferousForest(boolean snowy) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.PEAT_GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);
        BYGDefaultBiomeFeatures.addConiferousTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);
        if (snowy) {
            BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        }


        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(snowy ? EntityType.HUSK : EntityType.ZOMBIE, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 25, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(snowy ? Biome.Precipitation.SNOW : Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.2F).scale(0.2F).temperature(snowy ? -0.5F : 0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5011004).foliageColorOverride(2263842).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome cragGardens() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.CRAG_GARDENS);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE); //Jungle Temple
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addLargeLake(generationSettings);
        BYGDefaultBiomeFeatures.addCattails(generationSettings);
        BYGDefaultBiomeFeatures.addBYGLilyPad(generationSettings);
        BYGDefaultBiomeFeatures.addMarshGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGlowcane(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addCragRainbowTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BiomeDefaultFeatures.addJungleExtraVegetation(generationSettings);
        generationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_NORMAL);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).depth(-1.5F).scale(0.0F).temperature(1.0F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(8170451).waterFogColor(6200521).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome cypressSwamplands() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.MARSHLAND);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_SWAMP); //Ruined Portal Swamp
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addCypressTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addSwampClayDisk(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSwampExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BYGDefaultBiomeFeatures.addBYGSwampVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addCattails(generationSettings);
        BYGDefaultBiomeFeatures.addPeachleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addVioletleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addRedorchid(generationSettings);
        BYGDefaultBiomeFeatures.addPurpleOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addPinkOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addMudDisks(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.SWAMP).depth(-0.4F).scale(0.01F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(6337104).foliageColorOverride(6337104).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome deadSea() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.BLACK_SAND);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Ocean
        BiomeDefaultFeatures.addDefaultOverworldOceanStructures(generationSettings);
        BYGDefaultBiomeFeatures.addDeadSeaSpires(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addOceanCarvers(generationSettings);
        generationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_NORMAL);

        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 15, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.OCEAN).depth(-1.05F).scale(0.1F).temperature(2.0F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(9230578).waterFogColor(2835532).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome deciduousForest(boolean snowy) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addDeciduousTrees(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addHorseweed(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);
        if (snowy) {
            BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        }

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(snowy ? Biome.Precipitation.SNOW : Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(snowy ? -0.5F : 0.7F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(9230578).waterFogColor(2835532).grassColorOverride(snowy ? 8627537 : 12032353).foliageColorOverride(snowy ? 12215394 : 6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome doverMountains() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.FILL_DACITE_PODZOL);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Mountain
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BYGDefaultBiomeFeatures.addDoverMTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.EXTREME_HILLS).depth(2.0F).scale(0.6F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(9230578).waterFogColor(2835532).grassColorOverride(5011004).foliageColorOverride(2263842).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome dunes() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.FILL_SAND);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addFossilDecoration(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        generationSettings.addStructureStart(StructureFeatures.DESERT_PYRAMID); //Desert Temple

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).depth(1.3F).scale(0.5F).temperature(0.25F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome ebonyWoods() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.EBONY_WOODS);
        generationSettings.addStructureStart(StructureFeatures.WOODLAND_MANSION); //Mansion
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addEbonyTrees(generationSettings);
        BYGDefaultBiomeFeatures.addHugeMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addHorseweed(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(1.3F).scale(0.2F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5406551).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome enchantedForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addEnchantedTrees(generationSettings);
        BYGDefaultBiomeFeatures.addHugeMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addFairyslipper(generationSettings);
        BYGDefaultBiomeFeatures.addCyanRose(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.6F).scale(0.15F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(8560845).foliageColorOverride(11898572).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome enchantedGrove() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addEnchantedGroveTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addSages(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.25F).scale(0.1F).temperature(0.75F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(8560845).foliageColorOverride(11898572).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome evergreenTaiga(boolean snowy) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);
        BYGDefaultBiomeFeatures.addHollyTrees(generationSettings);
        BYGDefaultBiomeFeatures.addLushBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addIris(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        return new Biome.BiomeBuilder().precipitation(snowy ? Biome.Precipitation.SNOW : Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.75F).scale(0.1F).temperature(snowy ? -0.5F : 0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5011004).foliageColorOverride(2263842).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome greatLakes() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_OCEAN); //Ruined Portal Ocean
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addSwampClayDisk(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BiomeDefaultFeatures.addMountainEdgeTrees(generationSettings);
        BiomeDefaultFeatures.addMountainEdgeTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGLilyPad(generationSettings);
        BYGDefaultBiomeFeatures.addCattails(generationSettings);

        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 100, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(-0.55F).scale(0.0F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10662752).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome grove() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addGroveTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addSages(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.25F).scale(0.1F).temperature(0.75F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11190111).foliageColorOverride(11190111).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome guianaShield() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE); //Jungle Temple
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_JUNGLE); //Ruined Portal Jungle
        generationSettings.addStructureStart(BYGConfiguredStructures.VILLAGE_TROPICAL);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BYGDefaultBiomeFeatures.addRainForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addWeedGrass(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.OCELOT, 2, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).depth(6.0F).scale(0.25F).temperature(0.95F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(6208527).foliageColorOverride(6208527).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome jacarandaForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE); //Jungle Temple
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_JUNGLE); //Ruined Portal Jungle
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addJungleExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addJacarandaTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGBambooJungleVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addDelphinium(generationSettings);
        BYGDefaultBiomeFeatures.addJacarandaBushes(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).depth(0.2F).scale(0.2F).temperature(0.95F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10145074).foliageColorOverride(14180771).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome lushTundra() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.LUSH_TUNDRA);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_SNOWY); //Snowy Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addWinterScilla(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 10, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.POLAR_BEAR, 1, 1, 2));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 80, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.ICY).depth(0.15F).scale(0.1F).temperature(0.35F).downfall(0.4F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10044989).foliageColorOverride(10044989).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome mangroveMarshes() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.SWAMP);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_JUNGLE); //Ruined Portal Swamp
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addMangroveTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addSwampClayDisk(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSwampExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        generationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_NORMAL);
        BYGDefaultBiomeFeatures.addBYGSwampVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addCattails(generationSettings);
        BYGDefaultBiomeFeatures.addPeachleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addVioletleatherflower(generationSettings);
        BYGDefaultBiomeFeatures.addRedorchid(generationSettings);
        BYGDefaultBiomeFeatures.addPurpleOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addPinkOrchid(generationSettings);
        BYGDefaultBiomeFeatures.addMudDisks(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.SWAMP).depth(-0.4F).scale(0.01F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(6337104).foliageColorOverride(6337104).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome mapleTaiga() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addMapleTrees(generationSettings);
        BYGDefaultBiomeFeatures.addSmallSpruceTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addSages(generationSettings);
        BYGDefaultBiomeFeatures.addRose(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.65F).scale(0.1F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5406551).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome meadow() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.MEADOW);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addMeadowShrubs(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.15F).scale(0.1F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5406551).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome mojaveDesert() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.MOJAVE);
        BiomeDefaultFeatures.addFossilDecoration(generationSettings);
        generationSettings.addStructureStart(StructureFeatures.DESERT_PYRAMID); //Desert Temple
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_DESERT); //Desert Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_DESERT); //Ruined Portal Desert
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultGrass(generationSettings);
        BiomeDefaultFeatures.addDesertVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDesertExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addDesertExtraDecoration(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addMiniCactus(generationSettings);
        BYGDefaultBiomeFeatures.addJoshuaTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGDesertPlants(generationSettings);
        BYGDefaultBiomeFeatures.addFirecracker(generationSettings);
        BiomeDefaultFeatures.addDesertExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BiomeDefaultFeatures.addBadlandGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBushes(generationSettings);

        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 19, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 80, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).depth(0.125F).scale(0.05F).temperature(2.0F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome orchard() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addOrchardTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addCloverFlowerPatch(generationSettings);
        BYGDefaultBiomeFeatures.addLolliPop(generationSettings);
        BYGDefaultBiomeFeatures.addYellowDaffodil(generationSettings);
        BYGDefaultBiomeFeatures.addPinkAllium(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.3F).scale(0.15F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10210365).foliageColorOverride(10210365).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome prairie() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addPrairieTree(generationSettings);
        BYGDefaultBiomeFeatures.addSparseOakForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addPrairieGrass(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addCaliforniaPoppy(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.2F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10003745).foliageColorOverride(10003745).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome redDesert() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.RED_SAND);
        BiomeDefaultFeatures.addFossilDecoration(generationSettings);
        generationSettings.addStructureStart(StructureFeatures.DESERT_PYRAMID); //Desert Temple
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_DESERT); //Desert Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_DESERT); //Ruined Portal Desert
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDesertLakes(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultGrass(generationSettings);
        BiomeDefaultFeatures.addDesertVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDesertExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addDesertExtraDecoration(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addMiniCactus(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 19, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 80, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).depth(0.125F).scale(0.05F).temperature(2.0F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome redOakForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addForestGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addRedOakForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addShortGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);
        BYGDefaultBiomeFeatures.addHorseweed(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.8F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome redRockValley() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.RED_ROCK);
        generationSettings.addStructureStart(BYGConfiguredStructures.VILLAGE_ADOBE);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_DESERT); //Ruined Portal Desert
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addExtraGold(generationSettings);
        BiomeDefaultFeatures.addExtraEmeralds(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addTerracottaBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addPaloVerdeTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addFirecracker(generationSettings);
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.DESERT).depth(2.0F).scale(0.5F).temperature(1.2F).downfall(0.1F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10855786).foliageColorOverride(10855786).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome redwoodThicket() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GIANT_TREE_TAIGA);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addFernGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addRedwoodTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrasslandBoulders(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.9F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(8896351).foliageColorOverride(8896351).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome roseFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings); //Strongholds & Mineshafts
        BYGDefaultBiomeFeatures.addRoseFieldFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(8231780).foliageColorOverride(8231780).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome seasonalBirchForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addForestGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addSeasonalBirchForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.9F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11697214).foliageColorOverride(11697214).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome seasonalDeciduousForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addSeasonalDeciduousTrees(generationSettings);
        BYGDefaultBiomeFeatures.addDeciduousTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.8F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11697214).foliageColorOverride(12435265).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome seasonalForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addSeasonalForestTrees(generationSettings);
        BiomeDefaultFeatures.addOtherBirchTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));


        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.25F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(12435265).foliageColorOverride(12435265).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome seasonalTaiga() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addSeasonalTaigaTrees(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addTaigaGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSparseBerryBushes(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addLeafPile(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addWinterSucculent(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.2F).scale(0.2F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(11513689).foliageColorOverride(12435265).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome shatteredGlacier() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.SHATTERED_GLACIER);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_SNOWY); //Snowy Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addTaigaGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addWinterGrass(generationSettings);
        BYGDefaultBiomeFeatures.addWinterRose(generationSettings);
        BYGDefaultBiomeFeatures.addFrostMagmaLakes(generationSettings);
        generationSettings.addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, BYGConfiguredFeatures.BLACK_ICE_SNOW);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 10, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.POLAR_BEAR, 1, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SNOW_GOLEM, 1, 1, 2));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 80, 4, 4));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.ICY).depth(0.14F).scale(0.36F).temperature(-0.5F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome shrublands() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS); //Plains Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addShrubs(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addForestGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.DESERT).depth(0.1F).scale(0.1F).temperature(2.0F).downfall(0.4F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(9874031).foliageColorOverride(7048739).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome sierraValley() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.SIERRA_VALLEY);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addExtraGold(generationSettings);
        BiomeDefaultFeatures.addExtraEmeralds(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addTerracottaBoulder(generationSettings);
        BiomeDefaultFeatures.addBadlandGrass(generationSettings);
        BYGDefaultBiomeFeatures.addPaloVerdeTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addFirecracker(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.2F).scale(0.1F).temperature(1.2F).downfall(0.1F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10855786).foliageColorOverride(10855786).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome skyrisHighlands() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(BYGConfiguredStructures.VILLAGE_SKYRIS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_MOUNTAIN); //Ruined Portal Mountain
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addSkyrisTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addExtraEmeralds(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addFoxgloves(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addFairyslipper(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.EXTREME_HILLS).depth(3.0F).scale(0.3F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(6409356).foliageColorOverride(7135854).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome fragmentForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.STONE_FOREST);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addStoneForestTrees(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.OCELOT, 2, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.8F).scale(0.15F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10145074).foliageColorOverride(10145074).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome tropicalForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_JUNGLE); //Ruined Portal Jungle
        generationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE); //Jungle Temple
        generationSettings.addStructureStart(BYGConfiguredStructures.VILLAGE_TROPICAL);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addJungleExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addFungalRainForestTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addTropFungalMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addWeedGrass(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.OCELOT, 2, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).depth(0.2F).scale(0.25F).temperature(0.95F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10145074).foliageColorOverride(10145074).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome tropicalIslands() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.OCEAN_RUIN_COLD); //Ocean Ruin Cold
        generationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE); //Jungle Temple
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_JUNGLE); //Ruined Portal Jungle
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addCragRainbowTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBYGTropicFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addWarmFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addJungleExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addMGCoral(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).depth(0.05F).scale(0.35F).temperature(0.95F).downfall(0.9F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(10145074).foliageColorOverride(10145074).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome twilightValley() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.TWILIGHT_VALLEY);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addForestFlowers(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addBrownZelkovaTrees(generationSettings);
        BYGDefaultBiomeFeatures.addBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addFernGrass(generationSettings);
        BYGDefaultBiomeFeatures.addMossyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addRockyStoneBoulder(generationSettings);
        BYGDefaultBiomeFeatures.addGraniteBoulder(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.2F).scale(0.2F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(9470285).foliageColorOverride(9470285).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_CRIMSON_FOREST_MOOD, 6000, 8, 2.0D)).ambientParticle(new AmbientParticleSettings(ParticleTypes.END_ROD, 0.00028F)).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome weepingWitchForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(BYGConfiguredSurfaceBuilders.EBONY_WOODS);
        generationSettings.addStructureStart(StructureFeatures.SWAMP_HUT); //Swamp Hut
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addDeadHazelTrees(generationSettings);
        BYGDefaultBiomeFeatures.addHugeMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addSmallSpruceTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.35F).scale(0.05F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5406551).foliageColorOverride(6589494).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome temperateRainForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.WOODLAND_MANSION); //Mansion
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BYGDefaultBiomeFeatures.addWoodlandTrees(generationSettings);
        BYGDefaultBiomeFeatures.addMeadowTrees(generationSettings);
        BYGDefaultBiomeFeatures.addHugeMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BYGDefaultBiomeFeatures.addGrass(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addAzalea(generationSettings);
        BYGDefaultBiomeFeatures.addRose(generationSettings);
        BYGDefaultBiomeFeatures.addFairyslipper(generationSettings);
        BYGDefaultBiomeFeatures.addLushBlueberries(generationSettings);
        BYGDefaultBiomeFeatures.addBeeHive(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(0.35F).scale(0.15F).temperature(0.8F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(8034667).foliageColorOverride(8034667).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    public static Biome zelkovaForest() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilders.GRASS);
        generationSettings.addStructureStart(StructureFeatures.VILLAGE_TAIGA); //Taiga Village
        generationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST); //Pillager Outpost
        generationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD); //Ruined Portal Standard
        BiomeDefaultFeatures.addDefaultOverworldLandStructures(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
        BiomeDefaultFeatures.addDefaultCarvers(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(generationSettings);
        BiomeDefaultFeatures.addTaigaGrass(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
        BYGDefaultBiomeFeatures.addKovanFlower(generationSettings);
        BYGDefaultBiomeFeatures.addAnemones(generationSettings);
        BYGDefaultBiomeFeatures.addCrocus(generationSettings);
        BYGDefaultBiomeFeatures.addBYGMushrooms(generationSettings);
        BYGDefaultBiomeFeatures.addZelkovaTrees(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnSettings.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.TAIGA).depth(0.2F).scale(0.1F).temperature(0.25F).downfall(0.8F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColorOverride(5416309).foliageColorOverride(5416309).fogColor(12638463).skyColor(VanillaBiomeAccess.invokeCalculateSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }
}