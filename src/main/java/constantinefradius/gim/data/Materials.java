package constantinefradius.gim.data;

import constantinefradius.gim.Ref;
import constantinefradius.gim.utils.EnumHelper;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.materials.Element;
import muramasa.antimatter.materials.Material;

import static muramasa.antimatter.materials.Element.*;
import static muramasa.antimatter.materials.MaterialType.*;
import static muramasa.antimatter.materials.TextureSet.*;
//import static muramasa.gti.data.Materials.*;

public class Materials {
    //TODO Melting points
    //TODO Blasting Temperatures
    //TODO Metal parts
    //TODO Tool materials
    //TODO Set fuel powers

    public static void init() {
        AntimatterAPI.all(Material.class).forEach(Material::setChemicalFormula);
    }

    //region Elements
    public static Material Neon = new Material(Ref.ID, "neon", 0xf23e02, NONE, Ne).asGas();
    public static Material Scandium = new Material(Ref.ID, "scandium", 0xd4d4d4, METALLIC, Sc).asDust(ORE, ORE_SMALL);
    public static Material Germanium = new Material(Ref.ID, "germanium", 0xe6e6e6, SHINY, Ge).asMetal(1211, 0, ORE);
    public static Material Selenium = new Material(Ref.ID, "selenium", 0xff333a, DULL, Se).asSolid(453, 0);
    public static Material Bromine = new Material(Ref.ID, "bromine", 0x660000, DULL, Br).asFluid(265);
    public static Material Kypton = new Material(Ref.ID, "krypton", 0xff00f0, NONE, Kr).asGas();
    public static Material Rubidium = new Material(Ref.ID, "rubidium", 0xff0000, METALLIC, Rb).asDust(312);
    public static Material Strontium = new Material(Ref.ID, "strontium", 0x0fde8a9, METALLIC, Sr).asDust(312);
    public static Material Zirconium = new Material(Ref.ID, "zirconium", 0x4a0505, METALLIC, Zr).asDust(2750, ORE);
    public static Material Technetium = new Material(Ref.ID, "technetium", 0xfa4646, SHINY, Tc).asMetal(2430, 0);
    public static Material Ruthenium = new Material(Ref.ID, "ruthenium", 0xf0f0f5, DULL, Ru).asMetal(2607, 0, FRAME, ORE, ORE_SMALL);
    public static Material Rhodium = new Material(Ref.ID, "rhodium", 0xf0f0f5, DULL, Rh).asMetal(2237, 0, FRAME, ORE, ORE_SMALL);
    public static Material Tellurium = new Material(Ref.ID, "tellrium", 0xafb0b3, SHINY, Te).asMetal(1261, 0);
    public static Material Xenon = new Material(Ref.ID, "xenon", 0x3b89ff, NONE, Xe).asGas();
    public static Material Praseodymium = new Material(Ref.ID, "praseodymium", 0xc7c6c1, METALLIC, Pr).asSolid(1208, 0);
    public static Material Promethium = new Material(Ref.ID, "promethium", 0x949494, METALLIC, Pm).asMetal(1315, 1315, PLATE, ROD, ORE);
    public static Material Samarium = new Material(Ref.ID, "samarium", 0xbfbfbf, METALLIC, Sm).asMetal(1345, 1345, PLATE, ROD, ORE);
    public static Material Gadolinium = new Material(Ref.ID, "gadolinium", 0xfaf8f5, METALLIC, Gd).asMetal(1585, 1585, PLATE, ROD, ORE);
    public static Material Terbium = new Material(Ref.ID, "terbium", 0xffff1e, SHINY, Tb).asMetal(1337, 0);
    public static Material Holmium = new Material(Ref.ID, "holmium", 0xffff1e, SHINY, Ho).asMetal(1734, 0);
    public static Material Erbium = new Material(Ref.ID, "erbium", 0xffff1e, SHINY, Er).asMetal(1802, 0);
    public static Material Ytterbium = new Material(Ref.ID, "ytterbium", 0xffff1e, SHINY, Yb).asMetal(1818, 0);
    public static Material Hafnium = new Material(Ref.ID, "hafnium", 0xffff1e, SHINY, Hf).asMetal(2506, 0);
    public static Material Rhenium = new Material(Ref.ID, "rhenium", 0x323232, METALLIC, Re).asMetal(3459, 3459, FOIL);
    public static Material Thallium = new Material(Ref.ID, "thalium", 0xffdcdc, SHINY, Tl).asMetal();
    public static Material Neptinium = new Material(Ref.ID, "neptunium", 0xfa4646, SHINY, Np).asMetal(912, 0).addTools(6.0F, 280, 3);
    //endregion

    //region Isotopes
    private static Element Li6;
    private static Element C13;
    private static Element C14;
    private static Element Co60;
    static {
        Li6 = EnumHelper.addEnum(Element.class, "Li6", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{3, 3, 0, -1, null, "Lithium-6", true});
        C13 = EnumHelper.addEnum(Element.class, "C13", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{6, 7, 0, -1, null, "Carbon-13", true});
        C14 = EnumHelper.addEnum(Element.class, "C14", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{6, 8, 0, -1, null, "Carbon-14", true});
        Co60 = EnumHelper.addEnum(Element.class, "Co60", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{27, 33, 0, -1, null, "Cobalt-60", true});
    }
    public static Material Lithium6 = new Material(Ref.ID, "lithium_6", 0xc9c1f6, DULL, Li6).asSolid(454, 0, ORE);
    public static Material Carbon13 = new Material(Ref.ID, "carbon_13", 0x1f1c1c, DULL, C13).asSolid();
    public static Material Carbon14 = new Material(Ref.ID, "carbon_14", 0x1a1414, DULL, C14).asSolid();
    public static Material Cobalt60 = new Material(Ref.ID, "cobalt_60", 0x2323f9, METALLIC, Co60).asMetal(1768, 0).addTools(8.0F, 512, 3);
    //endregion

    //region Gems
    public static Material Testrock = new Material(Ref.ID, "testrock", 0xffffff, NONE).asDust(ROCK);//.add(Olivine, 1, Scandium, 2, Flint, 6, DarkAsh, 3);
    //endregion
}
