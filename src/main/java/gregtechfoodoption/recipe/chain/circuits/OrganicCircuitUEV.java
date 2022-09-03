package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitUEV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UEV]).duration(300)
                        .input(circuit, Tier.UEV, 1)
                        .input(CHEDDAR_SLICE, 64)
                        .output(ORGANIC_CIRCUIT_10, 1)
                        .buildAndRegister();
        }
}