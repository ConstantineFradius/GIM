package constantinefradius.gim.data;

import constantinefradius.gim.Ref;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.materials.Material;

import static muramasa.antimatter.materials.MaterialType.ROCK;
import static muramasa.antimatter.materials.TextureSet.NONE;
import static muramasa.gti.data.Materials.*;

public class Materials {
    public static Material Testrock = new Material(Ref.ID, "testrock", 0xffffff, NONE).asDust(ROCK).add(Olivine, 1, /*MgCO3, 2, */Flint, 6, DarkAsh, 3);

    public static void init() {

        AntimatterAPI.all(Material.class).forEach(Material::setChemicalFormula);
    }
}
