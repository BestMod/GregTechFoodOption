package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitMAX {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[MAX]).duration(300)
                        .input(circuit, Tier.MAX, 1)
                        .input(MINERAL_WATER, 64)
                        .input(MINERAL_WATER, 64)
                        .fluidInputs(GTFOMaterialHandler.PurpleDrink.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_14, 1)
                        .buildAndRegister();
        }
}