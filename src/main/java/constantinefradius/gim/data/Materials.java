package constantinefradius.gim.data;

import constantinefradius.gim.Ref;
import constantinefradius.gim.utils.EnumHelper;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.materials.Element;
import muramasa.antimatter.materials.Material;

import static muramasa.antimatter.materials.Element.*;
import static muramasa.antimatter.materials.MaterialType.*;
import static muramasa.antimatter.materials.TextureSet.*;
import static muramasa.gti.data.Materials.*;

public class Materials {
    //TODO Melting points
    //TODO Blasting Temperatures
    //TODO Metal parts
    //TODO Tool materials
    //TODO Set fuel powers
    //TODO Set check colors

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

    public static Material Chromium = new Material(Ref.ID, "chromium", 0xffdcdc, SHINY, Cr).asMetal();
    public static Material Flourine = new Material(Ref.ID, "flourine", 0xffdcdc, NONE, F).asFluid();
    public static Material Iodine = new Material(Ref.ID, "iodine", 0xffdcdc, DULL, I).asMetal();
    public static Material Thulium = new Material(Ref.ID, "thulium", 0xffdcdc, DULL, Tm).asMetal();
    public static Material Gadlinium = new Material(Ref.ID, "gadlinium", 0xffdcdc, DULL, Gd).asMetal();
    //endregion

    //region Isotopes
    private static Element Li6;
    private static Element C13;
    private static Element C14;
    private static Element Co60;
    private static Element Pu239;

    static {
        Li6 = EnumHelper.addEnum(Element.class, "Li6", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{3, 3, 0, -1, null, "Lithium-6", true});
        C13 = EnumHelper.addEnum(Element.class, "C13", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{6, 7, 0, -1, null, "Carbon-13", true});
        C14 = EnumHelper.addEnum(Element.class, "C14", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{6, 8, 0, -1, null, "Carbon-14", true});
        Co60 = EnumHelper.addEnum(Element.class, "Co60", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{27, 33, 0, -1, null, "Cobalt-60", true});
        Pu239 = EnumHelper.addEnum(Element.class, "Pu239", new Class[]{int.class, int.class, int.class, int.class, String.class, String.class, boolean.class}, new Object[]{94, 145, 0, -1, "U235", "Plutonium-239", true});
    }

    public static Material Lithium6 = new Material(Ref.ID, "lithium_6", 0xc9c1f6, DULL, Li6).asSolid(454, 0, ORE);
    public static Material Carbon13 = new Material(Ref.ID, "carbon_13", 0x1f1c1c, DULL, C13).asSolid();
    public static Material Carbon14 = new Material(Ref.ID, "carbon_14", 0x1a1414, DULL, C14).asSolid();
    public static Material Cobalt60 = new Material(Ref.ID, "cobalt_60", 0x2323f9, METALLIC, Co60).asMetal(1768, 0).addTools(8.0F, 512, 3);
    public static Material Plutonium239 = new Material(Ref.ID, "plutonium_239", 0x2323f9, METALLIC, Pu239).asMetal();
    //endregion

    //region placeholders
    //TODO Replace with proper materials
    public static Material Powelite = new Material(Ref.ID, "powelite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Pyrochlore = new Material(Ref.ID, "pyrochlore_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Lazurite = new Material(Ref.ID, "lazurite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Sodalite = new Material(Ref.ID, "sodalite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Monazite = new Material(Ref.ID, "monazite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Sapphire = new Material(Ref.ID, "sapphire_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Molybendite = new Material(Ref.ID, "molybendite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material PotasiumPersulfate = new Material(Ref.ID, "potasium_persulfate_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Stibinite = new Material(Ref.ID, "stibinite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Apatite = new Material(Ref.ID, "apatite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material Quartz = new Material(Ref.ID, "quartz_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    public static Material CertusQuartz = new Material(Ref.ID, "certus_quartz_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL);
    //regionend

    //region Gems and Ores? //TODO Organize into groups
    public static Material Chromite = new Material(Ref.ID, "chromite", 0x1e1e1e, METALLIC).asDust(ORE).add(Iron, 1, Chrome, 2, Oxygen, 4);
    public static Material Amazonite = new Material(Ref.ID, "amazonite", 0xa7faf0, FINE).asDust().add(Potassium, 3, Aluminium, 3, Silicon, 9, Oxygen, 24);
    public static Material Muscovite = new Material(Ref.ID, "muscovite", 0xf7fcfc, FINE).asDust().add(Potassium, 1, Aluminium, 3, Silicon, 3, Oxygen, 12, Flourine, 1);
    public static Material Fuchsite = new Material(Ref.ID, "fuchsite", 0x7bdbc2, FINE).asDust().add(Potassium, 1, Aluminium, 2, Chromium, 1, Silicon, 3, Oxygen, 12, Flourine, 1);
    public static Material PurpleSapphire = new Material(Ref.ID, "purple_sapphire", 0xc300ff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 20, Oxygen, 30, Vanadium, 1);
    public static Material YellowSapphire = new Material(Ref.ID, "yellow_sapphire", 0xfcec00, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 20, Oxygen, 30, Rutile, 1);
    public static Material OrangeSapphire = new Material(Ref.ID, "orange_sapphire", 0xf7a60f, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 20, Oxygen, 30, Copper, 1);
    public static Material BlackSapphire = new Material(Ref.ID, "black_sapphire", 0x140f05, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 2, Oxygen, 3);
    public static Material PinkSapphire = new Material(Ref.ID, "pink_sapphire", 0xffc7d2, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Chrome, 1, Aluminium, 4, Oxygen, 6);
    public static Material WhiteSapphire = new Material(Ref.ID, "white_sapphire", 0xfcf7f8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 2, Oxygen, 3);
    public static Material Alumina = new Material(Ref.ID, "alumina", 0xc3d2e0, GEM_V).asDust(ORE, ORE_SMALL).add(Aluminium, 2, Oxygen, 3);
    public static Material Realgar = new Material(Ref.ID, "realgar", 0xbf1900, GEM_V).asDust(ORE, ORE_SMALL).add(Arsenic, 2, Sulfur, 3);
    public static Material Moissanite = new Material(Ref.ID, "moissanite", 0xebe7e6, GEM_V).asDust(ORE, ORE_SMALL).add(Silicon, 1, Carbon, 1);
    public static Material Turquoise = new Material(Ref.ID, "turquoise", 0x77ecf2, GEM_V).asDust(ORE, ORE_SMALL).add(Copper, 1, Aluminium, 6, Water, 12, Hydrogen, 32);
    public static Material Sugilite = new Material(Ref.ID, "sugilite", 0x4f0e8f, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Aluminium, 1, Oxygen, 30, Iron, 1, Manganese, 1, Potassium, 1, Lithium, 3, Silicon, 12);
    public static Material Tourmaline = new Material(Ref.ID, "tourmaline", 0x030201, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Lithium, 1, Manganese, 1, Magnesium, 2, Chromium, 1, Vanadium, 1, Boron, 5, Flourine, 1);
    public static Material Carnelian = new Material(Ref.ID, "carnelian", 0xed5615, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material Agate = new Material(Ref.ID, "agate", 0x965e45, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material Heliotrope = new Material(Ref.ID, "chrysoprase", 0x359c78, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material Chrysoprase = new Material(Ref.ID, "heliotrope", 0x210a0a, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material MossAgate = new Material(Ref.ID, "moss_agate", 0xafb5ac, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material Chalcedony = new Material(Ref.ID, "chalcedony", 0x639968, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material Onyx = new Material(Ref.ID, "onyx", 0x080201, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material TigersEye = new Material(Ref.ID, "tigers_eye", 0xa3762e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material RedOnyx = new Material(Ref.ID, "red_onyx", 0xb80d07, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material TigerIron = new Material(Ref.ID, "tigers_iron", 0x6464c8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 10, Oxygen, 20, BandedIron, 2);
    public static Material Reibeckite = new Material(Ref.ID, "riebeckite", 0x050402, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 8, Oxygen, 22);
    public static Material RedJasper = new Material(Ref.ID, "red_jasper", 0xf56d58, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 1, Oxygen, 2);
    public static Material GreenJasper = new Material(Ref.ID, "green_jasper", 0x1a522d, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 1, Oxygen, 2);
    public static Material YellowJasper = new Material(Ref.ID, "yellow_jasper", 0x918e26, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 1, Oxygen, 2);
    public static Material BlackJasper = new Material(Ref.ID, "black_jasper", 0x0a0a06, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 1, Oxygen, 2);
    public static Material BrownJasper = new Material(Ref.ID, "brown_jasper", 0x453127, GEM_V).asGem(true, ORE, ORE_SMALL).add(Silicon, 1, Oxygen, 2);
    public static Material Aquamarine = new Material(Ref.ID, "aquamarine", 0x67f5eb, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Heliodor = new Material(Ref.ID, "heliodor", 0xd9d900, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Goshenite = new Material(Ref.ID, "goshenite", 0xffffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Bixbite = new Material(Ref.ID, "bixbite", 0xe80c00, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Maxixe = new Material(Ref.ID, "maxixe", 0x0210ad, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Morganite = new Material(Ref.ID, "morganite", 0xfacde7, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Chrsoberyl = new Material(Ref.ID, "chrysoberyl", 0xe0facd, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material Alexandrite = new Material(Ref.ID, "alexandrite", 0xa6edc8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material Cymophane = new Material(Ref.ID, "cymophane", 0xf7ff59, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material TrapicheEmerald = new Material(Ref.ID, "trapiche_emerald", 0x0a5218, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18);
    public static Material Bertrandite = new Material(Ref.ID, "bertrandite", 0xfafaed, FINE).asDust().add(Beryllium, 4, Silicon, 2, Hydrogen, 2);
    public static Material BalasRuby = new Material(Ref.ID, "balas_ruby", 0x8f0a0e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material BalasSapphire = new Material(Ref.ID, "balas_sapphire", 0x0f6abf, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material BalasAmeythest = new Material(Ref.ID, "balas_ameythest", 0x8c08c4, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material BalasEmerald = new Material(Ref.ID, "balas_emerald", 0x1d9927, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material BlackSpinel = new Material(Ref.ID, "black_spinel", 0x0b0f0b, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material WhiteSpinel = new Material(Ref.ID, "white_spinel", 0xf5f7f5, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Magnesium, 1, Aluminium, 2, Oxygen, 4);
    public static Material YellowDiamond = new Material(Ref.ID, "yellow_diamond", 0xe9f02e, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material PinkDiamond = new Material(Ref.ID, "pink_diamond", 0xf5a2ef, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material BlueDiamond = new Material(Ref.ID, "blue_diamond", 0x1527c2, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material GreenDiamond = new Material(Ref.ID, "green_diamond", 0x0a590a, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material LimeDiamond = new Material(Ref.ID, "lime_diamond", 0x2fed2f, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material BlackDiamond = new Material(Ref.ID, "black_diamond", 0x0e1211, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material MagentaDiamond = new Material(Ref.ID, "magenta_diamond", 0xe04cd7, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material BrownDiamond = new Material(Ref.ID, "brown_diamond", 0x47413e, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material OrangeDiamond = new Material(Ref.ID, "orange_diamond", 0xf7682f, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material GrayDiamond = new Material(Ref.ID, "gray_diamond", 0x6e6d6d, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material RedDiamond = new Material(Ref.ID, "red_diamond", 0xf20202, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material CyanDiamond = new Material(Ref.ID, "cyan_diamond", 0x21ffcf, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material PurpleDiamond = new Material(Ref.ID, "purple_diamond", 0xb214de, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material GoldDiamond = new Material(Ref.ID, "gold_diamond", 0xc9c14d, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).add(Carbon, 1);
    public static Material NephriteJade = new Material(Ref.ID, "nephrite_jade", 0xc8ffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Calcium, 2, Magnesium, 3, Iron, 2, Silicon, 8, Oxygen);
    public static Material WhiteJade = new Material(Ref.ID, "white_jade", 0xe4f5eb, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Sodium, 2, Aluminium, 1, Iron, 1, Silicon, 4, Oxygen, 8);
    public static Material CyanJade = new Material(Ref.ID, "cyan_jade", 0x93dbd3, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Sodium, 2, Aluminium, 1, Iron, 1, Silicon, 4, Oxygen, 8);
    public static Material BlackJade = new Material(Ref.ID, "black_jade", 0xc8ffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Sodium, 2, Aluminium, 1, Iron, 1, Silicon, 4, Oxygen, 8);
    public static Material GreenJade = new Material(Ref.ID, "green_jade", 0x3af284, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Sodium, 2, Aluminium, 1, Iron, 1, Silicon, 4, Oxygen, 8);
    public static Material PurpleJade = new Material(Ref.ID, "purple_jade", 0x965ae0, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Sodium, 2, Aluminium, 1, Iron, 1, Silicon, 4, Oxygen, 8);
    public static Material GreenAventurine = new Material(Ref.ID, "green_aventurine", 0x2fa15c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material RedAventurine = new Material(Ref.ID, "red_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material YellowAventurine = new Material(Ref.ID, "yellow_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material OrangeAventurine = new Material(Ref.ID, "brown_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material BlueAventurine = new Material(Ref.ID, "blue_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material GreyAventurine = new Material(Ref.ID, "grey_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 1, Oxygen, 2);
    public static Material AventurineGroup = new Material(Ref.ID, "aventurine_group", 0x960000, SHINY).asDust(ORE, ORE_SMALL).add(YellowAventurine, 1, GreyAventurine, 1, GreenAventurine, 2, BlueAventurine, 1, RedAventurine, 1, OrangeAventurine);
    public static Material Sunstone = new Material(Ref.ID, "sunstone", 0xd6a978, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Calcium, 1, Aluminium, 2, Silicon, 6, Oxygen, 16);
    public static Material RedSunstone = new Material(Ref.ID, "red_sunstone", 0xde614e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Calcium, 1, Aluminium, 2, Silicon, 6, Oxygen, 16);
    public static Material GreenSunstone = new Material(Ref.ID, "green_sunstone", 0x306318, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Calcium, 1, Aluminium, 2, Silicon, 6, Oxygen, 16);
    public static Material VioletSunstone = new Material(Ref.ID, "violet_sunstone", 0x4a1863, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Calcium, 1, Aluminium, 2, Silicon, 6, Oxygen, 16);
    public static Material Amber = new Material(Ref.ID, "amber", 0xb8891c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2);
    public static Material BlueAmber = new Material(Ref.ID, "blue_amber", 0x173278, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2);
    public static Material Moonstone = new Material(Ref.ID, "moonstone", 0xf0d7fa, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Potassium, 1, Aluminium, 2, Silicon, 6, Oxygen, 8);
    public static Material BlueMoonstone = new Material(Ref.ID, "blue_moonstone", 0x68bcd4, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Sodium, 1, Potassium, 1, Aluminium, 2, Silicon, 6, Oxygen, 8);
    public static Material SnowFlakeObsidian = new Material(Ref.ID, "snowflake_obsidian", 0x252626, DULL).asDust().add(Magnesium, 1, Iron, 1, Silicon, 2, Oxygen, 8);
    public static Material Dumortierite = new Material(Ref.ID, "dumortierite", 0x134363, FINE).asDust().add(Aluminium, 7, Boron, 1, Silicon, 3, Oxygen, 18);
    public static Material Rhodonite = new Material(Ref.ID, "rhodonite", 0xfad7f2, FINE).asDust().add(Manganese, 6, Calcium, 1, Iron, 1, Magnesium, 1, Zinc, 1, Oxygen, 30, Silicon, 10);
    public static Material YellowLabradorite = new Material(Ref.ID, "yellow_laboradorite", 0xe6e070, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material OrangeLabradorite = new Material(Ref.ID, "orange_laboradorite", 0xa3763b, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material BlueLabradorite = new Material(Ref.ID, "blue_laboradorite", 0x68abde, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material GreenLabradorite = new Material(Ref.ID, "green_laboradorite", 0x68de8e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 1, Aluminium, 2, Oxygen, 4);
    public static Material Larimar = new Material(Ref.ID, "larimar", 0xb3eaf2, FINE).asDust().add(Sodium, 1, Calcium, 1, Copper, 1, Silicon, 3, Oxygen, 9, Hydrogen, 1);
    public static Material Pectolite = new Material(Ref.ID, "pectolite", 0xe3e0d1, FINE).asDust().add(Sodium, 1, Calcium, 2, Silicon, 3, Oxygen, 9, Hydrogen, 1);
    public static Material Tinaksite = new Material(Ref.ID, "tinaksite", 0x944393, FINE).asDust().add(Sodium, 1, Calcium, 1, Silicon, 7, Oxygen, 20, Titanium, 1, Manganese, 1);
    public static Material Charioite = new Material(Ref.ID, "charoite", 0xefd0f5, FINE).asDust().add(Sodium, 1, Calcium, 1, Silicon, 4, Oxygen, 14, Hydrogen, 2, Potassium, 1, Flourine, 1);
    public static Material Epidote = new Material(Ref.ID, "epidote", 0x8f8c33, FINE).asDust().add(Calcium, 2, Iron, 1, Aluminium, 2, Silicon, 3, Oxygen, 13, Hydrogen, 1);
    public static Material Ukanite = new Material(Ref.ID, "ukanite", 0x628052, FINE).asDust().add(PotassiumFeldspar, 1, Epidote, 5);
    public static Material Gypsum = new Material(Ref.ID, "gypsum", 0xf0efce, FINE).asDust().add(Calcium, 1, Sulfur, 1, Oxygen, 4, Water, 6);
    public static Material Kunzite = new Material(Ref.ID, "kunzite", 0xe3d5e3, DULL).asDust(ORE).add(Lithium, 5, Aluminium, 5, Silicon, 9, Oxygen, 29, Manganese, 1);
    public static Material Citrine = new Material(Ref.ID, "citrine", 0xf0cc60, QUARTZ).asDust().add(Silicon, 1, Oxygen, 2);
    public static Material Zircon = new Material(Ref.ID, "red_zircon", 0x470b10, QUARTZ).asDust().add(Zirconium, 10, Silicon, 10, Oxygen, 40, Hafnium, 1, Pitchblende, 1);
    public static Material WhiteZircon = new Material(Ref.ID, "white_zircon", 0xf0eee4, QUARTZ).asDust().add(Zirconium, 10, Silicon, 10, Oxygen, 40, Hafnium, 1, Pitchblende, 1);
    public static Material YellowZircon = new Material(Ref.ID, "yellow_zircon", 0xfff5ba, QUARTZ).asDust().add(Zirconium, 10, Silicon, 10, Oxygen, 40, Hafnium, 1, Pitchblende, 1);
    public static Material Azurite = new Material(Ref.ID, "azurite", 0x1782cf, DULL).asDust().add(Copper, 3, Carbon, 2, Oxygen, 5, Hydrogen, 1);
    public static Material Covelite = new Material(Ref.ID, "covelite", 0x101747, DULL).asDust().add(Copper, 1, Sulfur, 1);
    public static Material Chalcocite = new Material(Ref.ID, "chalcocite", 0x2b373b, DULL).asDust().add(Copper, 2, Sulfur, 1);
    public static Material Bornite = new Material(Ref.ID, "bornite", 0x736f58, DULL).asDust().add(Copper, 5, Sulfur, 4, Iron, 1);
    public static Material Tennanite = new Material(Ref.ID, "tennanite", 0x2b2a2a, DULL).asDust().add(Copper, 10, Sulfur, 13, Arsenic, 4, Zinc, 1, Iron, 1);
    public static Material Digenite = new Material(Ref.ID, "digenite", 0x272b2e, DULL).asDust().add(Copper, 9, Sulfur, 5);
    public static Material Dioptase = new Material(Ref.ID, "dioptase", 0x246949, DULL).asDust().add(Copper, 1, Silicon, 1, Oxygen, 3, Hydrogen, 2);
    public static Material Chrysocolla = new Material(Ref.ID, "chrysocolla", 0x4890a1, DULL).asDust().add(Copper, 1, Aluminium, 1, Hydrogen, 8, Silicon, 2, Oxygen, 10);
    public static Material Siderite = new Material(Ref.ID, "siderite", 0x918f4e, DULL).asDust().add(Iron, 1, Carbon, 1, Oxygen, 3);
    public static Material BrownFlourite = new Material(Ref.ID, "brown_fluorite", 0x473b1a, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material BlackFlourite = new Material(Ref.ID, "black_fluorite", 0x0d0d0c, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material WhiteFlourite = new Material(Ref.ID, "white_fluorite", 0xf2f2f0, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material YellowFlourite = new Material(Ref.ID, "yellow_fluorite", 0xf0d802, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material RedFlourite = new Material(Ref.ID, "red_fluorite", 0x9e0b03, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material BlueFlourite = new Material(Ref.ID, "blue_fluorite", 0x03109e, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material GreenFlourite = new Material(Ref.ID, "green_fluorite", 0x039e2f, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material PurpleFlourite = new Material(Ref.ID, "purple_fluorite", 0xaf21cf, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material MagentaFlourite = new Material(Ref.ID, "magenta_fluorite", 0xf01ad3, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material OrangeFlourite = new Material(Ref.ID, "orange_fluorite", 0xcf8621, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material PinkFlourite = new Material(Ref.ID, "pink_fluorite", 0xd15ec2, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material CyanFlourite = new Material(Ref.ID, "cyan_fluorite", 0x0d9184, DULL).asDust().add(Calcium, 1, Flourine, 2);
    public static Material TungstenTrioxide = new Material(Ref.ID, "tungsten_trioxide", 0xf5efb3, DULL).asDust().add(Tungsten, 1, Oxygen, 3);
    public static Material ManganeseChloride = new Material(Ref.ID, "manganese_chloride", 0xffd6fa, DULL).asDust().add(Manganese, 1, Chlorine, 2);
    public static Material FerrousChloride = new Material(Ref.ID, "ferrous_chloride", 0x9ac98b, DULL).asDust().add(Iron, 1, Chlorine, 2);
    public static Material FerricChloride = new Material(Ref.ID, "ferric_chloride", 0x172114, DULL).asDust().add(Iron, 1, Chlorine, 3);
    public static Material Terlinguaite = new Material(Ref.ID, "terlinguaite", 0xad6c0a, DULL).asDust().add(Mercury, 2, Chlorine, 1, Oxygen, 1);
    public static Material CalciumChloride = new Material(Ref.ID, "calcium_chloride", 0xfaf9f7, DULL).asDust().add(Calcium, 1, Chlorine, 2);
    public static Material CalciumSulfate = new Material(Ref.ID, "calcium_sulfate", 0xe8e4e3, DULL).asDust().add(Calcium, 1, Sulfur, 1, Oxygen, 2);
    public static Material LithiumChloride = new Material(Ref.ID, "lithium_chloride", 0xe8e4e3, DULL).asDust().add(Lithium, 1, Chlorine, 2);
    public static Material LithiumChlorate = new Material(Ref.ID, "lithium_chlorate", 0xe8e4e3, DULL).asDust().add(Lithium, 1, Chlorine, 1, Oxygen, 3);
    public static Material LithiumPerchlorate = new Material(Ref.ID, "lithium_perchlorate", 0xe8e4e3, DULL).asDust().add(Lithium, 1, Chlorine, 1, Oxygen, 4);
    public static Material LithiumOxide = new Material(Ref.ID, "lithium_oxide", 0xe8e4e3, DULL).asDust().add(Lithium, 2, Oxygen, 1);
    public static Material Ferrite = new Material(Ref.ID, "ferrite", 0x806a66, DULL).asDust().add(Lithium, 2, Iron, 2, Oxygen, 4);
    public static Material LithiumHydroxide = new Material(Ref.ID, "lithium_hydroxide", 0xe8e4e3, DULL).asDust().add(Lithium, 2, Oxygen, 1, Hydrogen, 1);
    public static Material SodiumNitrate = new Material(Ref.ID, "sodium_nitrate", 0xe8e4e3, DULL).asDust().add(Sodium, 1, Oxygen, 3, Nitrogen, 1);
    public static Material SodiumSulfite = new Material(Ref.ID, "sodium_sulfite", 0xe8e4e3, NONE).asDust().add(Sodium, 2, Sulfur, 2, Oxygen, 3);
    public static Material SodiumSulfate = new Material(Ref.ID, "sodium_sulfate", 0xe8e4e3, NONE).asDust().add(Sodium, 2, Sulfur, 2, Oxygen, 4);
    public static Material SodiumPyrosulfate = new Material(Ref.ID, "sodium_pyrosulfate", 0xe8e4e3, NONE).asDust().add(Sodium, 2, Sulfur, 2, Oxygen, 7);
    public static Material SodiumAluminate = new Material(Ref.ID, "sodium_aluminate", 0xe8e4e3, DULL).asDust().add(Sodium, 1, Oxygen, 2, Aluminium, 1);
    public static Material Cryolite = new Material(Ref.ID, "cyrolite", 0xe8e4e3, DULL).asDust().add(Sodium, 3, Flourine, 6, Aluminium, 3);
    public static Material CobaltHexaHydrate = new Material(Ref.ID, "cobalt_hexahydrate", 0x84faf8, DULL).asDust().add(Cobalt, 1, Water, 6);
    public static Material PotassiumHydroxide = new Material(Ref.ID, "potassium_hydroxide", 0xe8e4e3, DULL).asDust().add(Oxygen, 1, Hydrogen, 1, Potassium, 1);
    public static Material PotassiumBisulfate = new Material(Ref.ID, "potassium_bisulfate", 0xe8e4e3, DULL).asDust().add(Oxygen, 4, Hydrogen, 1, Potassium, 1, Sulfur, 1);
    public static Material PotassiumPersulfate = new Material(Ref.ID, "potassium_persulfate", 0xe8e4e3, DULL).asDust().add(Oxygen, 4, Potassium, 1, Sulfur, 1);
    public static Material PotassiumSulfide = new Material(Ref.ID, "potassium_sulfide", 0xe8e4e3, DULL).asDust().add(Potassium, 2, Sulfur, 1);
    public static Material PotassiumSulfate = new Material(Ref.ID, "potassium_sulfate", 0xe8e4e3, DULL).asDust().add(Oxygen, 4, Potassium, 2, Sulfur, 1);
    public static Material PotassiumPyrosulfate = new Material(Ref.ID, "potassium_pyrosulfate", 0xe8e4e3, DULL).asDust().add(Oxygen, 7, Potassium, 2, Sulfur, 2);
    public static Material PotassiumCarbonate = new Material(Ref.ID, "potassium_carbonate", 0xe8e4e3, DULL).asDust().add(Oxygen, 3, Potassium, 2, Carbon, 1);
    public static Material PotassiumAluminate = new Material(Ref.ID, "potassium_aluminate", 0xe8e4e3, DULL).asDust().add(Oxygen, 2, Potassium, 1, Aluminium, 1);
    public static Material Hubnerite = new Material(Ref.ID, "hubnerite", 0x949384, METALLIC).asDust(ORE, ORE_SMALL).add(Manganese, 1, Tungsten, 1, Oxygen, 4);
    public static Material Litharge = new Material(Ref.ID, "litharge", 0xfa7069, METALLIC).asDust(ORE, ORE_SMALL).add(Lead, 1, Oxygen, 1);
    public static Material IodineSalt = new Material(Ref.ID, "iodine_salt", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).add(Potassium, 1, Iodine, 1, Oxygen, 3);
    public static Material Ferberite = new Material(Ref.ID, "ferberite", 0x0a0909, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Tungsten, 1, Oxygen, 4);
    public static Material Lautarite = new Material(Ref.ID, "lautarite", 0xf2f1d5, METALLIC).asDust(ORE, ORE_SMALL).add(Calcium, 1, Iodine, 2, Oxygen, 6);
    public static Material Arquerite = new Material(Ref.ID, "arquerite", 0xe6cdbc, METALLIC).asDust(ORE, ORE_SMALL).add(Mercury, 1, Silver, 8);
    public static Material SilverIodide = new Material(Ref.ID, "silver_iodide", 0xe3dccf, METALLIC).asDust(ORE, ORE_SMALL).add(Silver, 1, Iodine, 1);
    public static Material Datolite = new Material(Ref.ID, "datolite", 0xfae8f8, METALLIC).asDust(ORE, ORE_SMALL).add(Calcium, 1, Boron, 1, Silicon, 1, Oxygen, 5, Hydrogen, 1);
    public static Material BoronicAcid = new Material(Ref.ID, "boronic_acid", 0xe3dccf, METALLIC).asDust(ORE, ORE_SMALL).add(Boron, 1, Oxygen, 3, Hydrogen, 3);
    public static Material Gibbsite = new Material(Ref.ID, "gibbsite", 0xcee3ca, METALLIC).asDust(ORE, ORE_SMALL).add(Aluminium, 1, Oxygen, 3, Hydrogen, 1);
    public static Material Rosenbergite = new Material(Ref.ID, "rosenbergite", 0xffffc8, METALLIC).asDust(ORE, ORE_SMALL).add(Aluminium, 1, Flourine, 1);
    public static Material VanadiumPentoxide = new Material(Ref.ID, "vanadiumpentoxide", 0xcc9c43, METALLIC).asDust(ORE, ORE_SMALL).add(Vanadium, 2, Oxygen, 5);
    public static Material Hercynite = new Material(Ref.ID, "hercynite", 0x212621, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 2, Aluminium, 2, Oxygen, 4);
    public static Material Sperrylite = new Material(Ref.ID, "sperrylite", 0xccd1cb, METALLIC).asDust(ORE, ORE_SMALL).add(Platinum, 1, Arsenic, 2);
    public static Material ArsenoPyrite = new Material(Ref.ID, "arsenopyrite", 0xccd1cb, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Arsenic, 1, Sulfur, 1);
    public static Material Aurostibite = new Material(Ref.ID, "aurostibite", 0xd2add7, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 1, Antimony, 2);
    public static Material Dzarkenite = new Material(Ref.ID, "dyzarkenite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Selenium, 2);
    public static Material Erlichmanite = new Material(Ref.ID, "erlichmanite", 0xa7afb8, METALLIC).asDust(ORE, ORE_SMALL).add(Osmium, 1, Sulfur, 2);
    public static Material Fukuchilite = new Material(Ref.ID, "fukuchilite", 0x4a4440, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Sulfur, 8, Copper, 3);
    public static Material Gaotaiite = new Material(Ref.ID, "gaotaiite", 0x4a4440, METALLIC).asDust(ORE, ORE_SMALL).add(Iridium, 3, Tellurium, 8);
    public static Material Gersdorffite = new Material(Ref.ID, "gersdorffite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Sulfur, 1, Arsenic, 1);
    public static Material Kaolinite = new Material(Ref.ID, "kaolinite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).add(Aluminium, 2, Silicon, 2, Oxygen, 9);
    public static Material Glaucodot = new Material(Ref.ID, "glaucodut", 0xbec5cc, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Cobalt, 1, Arsenic, 2, Sulfur, 2);
    public static Material Geversite = new Material(Ref.ID, "geversite", 0xadada5, METALLIC).asDust(ORE, ORE_SMALL).add(Platinum, 1, Antimony, 2);
    public static Material Hauerite = new Material(Ref.ID, "hauerite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).add(Manganese, 1, Sulfur, 1);
    public static Material Insizwaite = new Material(Ref.ID, "insizwaite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).add(Platinum, 1, Bismuth, 1, Lead, 1);
    public static Material Krutaite = new Material(Ref.ID, "krutaite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).add(Copper, 1, Selenium, 2);
    public static Material Laurite = new Material(Ref.ID, "laurite", 0x1c1c1a, METALLIC).asDust(ORE, ORE_SMALL).add(Ruthenium, 1, Sulfur, 2);
    public static Material Loellingite = new Material(Ref.ID, "loellingite", 0xdededc, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Arsenic, 2);
    public static Material Penroseite = new Material(Ref.ID, "penroseite", 0xdededc, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Copper, 1, Cobalt, 1, Selenium, 6);
    public static Material Rammelsbergite = new Material(Ref.ID, "rammelsbergite", 0x93948a, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Arsenic, 2);
    public static Material Safflorite = new Material(Ref.ID, "safflorite", 0xc1c2b8, METALLIC).asDust(ORE, ORE_SMALL).add(Cobalt, 1, Arsenic, 2);
    public static Material Trogtalite = new Material(Ref.ID, "trogtalite", 0x734d5d, METALLIC).asDust(ORE, ORE_SMALL).add(Cobalt, 1, Selenium, 2);
    public static Material Vaesite = new Material(Ref.ID, "vaesite", 0xbfbeb6, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Sulfur, 2);
    public static Material Villamaininite = new Material(Ref.ID, "villamaninite", 0x3b3b3b, METALLIC).asDust(ORE, ORE_SMALL).add(Cobalt, 1, Nickel, 1, Copper, 1, Iron, 1, Sulfur, 2);
    public static Material Acanthite = new Material(Ref.ID, "acanthite", 0x7d7c74, METALLIC).asDust(ORE, ORE_SMALL).add(Silver, 2, Sulfur, 1);
    public static Material Angelsite = new Material(Ref.ID, "angelsite", 0x7d7c74, METALLIC).asDust(ORE, ORE_SMALL).add(Lead, 2, Sulfur, 1, Oxygen, 4);
    public static Material Petalite = new Material(Ref.ID, "petalite", 0xededeb, METALLIC).asDust(ORE, ORE_SMALL).add(Lithium, 1, Aluminium, 1, Silicon, 4, Oxygen, 10);
    public static Material Thortveitite = new Material(Ref.ID, "thortveitite", 0xf0dbce, METALLIC).asDust(ORE, ORE_SMALL).add(Scandium, 1, Yttrium, 1, Silicon, 2, Oxygen, 7);
    public static Material Gadolinite = new Material(Ref.ID, "gadolinite", 0x666564, METALLIC).asDust(ORE, ORE_SMALL).add(Neodymium, 1, Yttrium, 1, Lanthanum, 1, Cerium, 1, Beryllium, 4, Iron, 2, Oxygen, 10);
    public static Material Euxenite = new Material(Ref.ID, "euxenite", 0xebbfa4, METALLIC).asDust(ORE, ORE_SMALL).add(Yttrium, 1, Cerium, 1, Uranium, 1, Thorium, 1, Niobium, 1, Tantalum, 1, Oxygen, 12);
    public static Material Patronite = new Material(Ref.ID, "patronite", 0x141211, METALLIC).asDust(ORE, ORE_SMALL).add(Vanadium, 1, Sulfur, 4);
    public static Material Carnotite = new Material(Ref.ID, "carnotite", 0xeded18, METALLIC).asDust(ORE, ORE_SMALL).add(Vanadium, 2, Uranium, 2, Potassium, 2, Oxygen, 12, Water, 9);
    public static Material Vanadinite = new Material(Ref.ID, "vanadinite", 0xe33627, METALLIC).asDust(ORE, ORE_SMALL).add(Vanadium, 3, Lead, 5, Oxygen, 12, Chlorine, 1);
    public static Material Crocoite = new Material(Ref.ID, "crocoite", 0xf21905, METALLIC).asDust(ORE, ORE_SMALL).add(Lead, 1, Chrome, 1, Oxygen, 4);
    public static Material Rhodochrosite = new Material(Ref.ID, "rhodochrosite", 0xeb8178, METALLIC).asDust(ORE, ORE_SMALL).add(Manganese, 1, Carbon, 1, Oxygen, 3);
    public static Material Psilomelane = new Material(Ref.ID, "psilomelane", 0x332d2d, METALLIC).asDust(ORE, ORE_SMALL).add(Manganese, 5, Water, 2, Barium, 2, Oxygen, 10);
    public static Material Cattierite = new Material(Ref.ID, "cattierite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).add(Cobalt, 1, Sulfur, 2);
    public static Material Skutterudite = new Material(Ref.ID, "skutterudite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).add(Cobalt, 1, Arsenic, 3);
    public static Material Smithsonite = new Material(Ref.ID, "smithsonite", 0xfaf3e3, METALLIC).asDust(ORE, ORE_SMALL).add(Zinc, 1, Carbon, 1, Oxygen, 3);
    public static Material Gallite = new Material(Ref.ID, "gallite", 0x6b6455, METALLIC).asDust(ORE, ORE_SMALL).add(Copper, 1, Gallium, 1, Sulfur, 2);
    public static Material Argyrodite = new Material(Ref.ID, "argyrodite", 0x5a6163, METALLIC).asDust(ORE, ORE_SMALL).add(Silver, 8, Germanium, 1, Sulfur, 6);
    public static Material Germanite = new Material(Ref.ID, "germanite", 0x594c44, METALLIC).asDust(ORE, ORE_SMALL).add(Copper, 13, Germanium, 2, Iron, 2, Sulfur, 16);
    public static Material Drysdallite = new Material(Ref.ID, "drysdallite", 0xada52d, METALLIC).asDust(ORE, ORE_SMALL).add(Molybdenum, 1, Selenium, 2);
    public static Material Clausthalite = new Material(Ref.ID, "clausthalite", 0xa39e84, METALLIC).asDust(ORE, ORE_SMALL).add(Lead, 1, Selenium, 1);
    public static Material Eskebornite = new Material(Ref.ID, "eskebornite", 0xb3a070, METALLIC).asDust(ORE, ORE_SMALL).add(Copper, 1, Iron, 1, Selenium, 2);
    public static Material Ferroselite = new Material(Ref.ID, "ferroselite", 0x70706d, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 1, Selenium, 2);
    public static Material Tiemannite = new Material(Ref.ID, "tiemannite", 0x98998d, METALLIC).asDust(ORE, ORE_SMALL).add(Mercury, 1, Selenium, 1);
    public static Material Stilleite = new Material(Ref.ID, "stilleite", 0xa1a19f, METALLIC).asDust(ORE, ORE_SMALL).add(Zinc, 1, Selenium, 1);
    public static Material SodiumBromide = new Material(Ref.ID, "sodium_bromide", 0xf4f5ed, METALLIC).asDust(ORE, ORE_SMALL).add(Sodium, 1, Bromine, 1);
    public static Material PotassiumBromide = new Material(Ref.ID, "potassium_bromide", 0xf4f5ed, METALLIC).asDust(ORE, ORE_SMALL).add(Potassium, 1, Bromine, 1);
    public static Material RubidiumOxide = new Material(Ref.ID, "rubidium_oxide", 0xf7facd, METALLIC).asDust(ORE, ORE_SMALL).add(Rubidium, 1, Oxygen, 2);
    public static Material Rublicine = new Material(Ref.ID, "rublicine", 0xc7c9c1, METALLIC).asDust(ORE, ORE_SMALL).add(Rubidium, 2, Aluminium, 1, Silicon, 3, Oxygen, 8);
    public static Material Pollucite = new Material(Ref.ID, "pollucite", 0xc9d4b6, METALLIC).asDust(ORE, ORE_SMALL).add(Caesium, 1, Silicon, 2, Aluminium, 1, Water, 6);
    public static Material Celestine = new Material(Ref.ID, "celestine", 0xb6d0d4, METALLIC).asDust(ORE, ORE_SMALL).add(Strontium, 1, Sulfur, 1, Oxygen, 4);
    public static Material Strontianite = new Material(Ref.ID, "strontianite", 0xe8e8e1, METALLIC).asDust(ORE, ORE_SMALL).add(Strontium, 1, Carbon, 1, Oxygen, 3);
    public static Material Xenotime = new Material(Ref.ID, "xenotime", 0x787366, METALLIC).asDust(ORE, ORE_SMALL).add(Yttrium, 1, Phosphorus, 1, Oxygen, 4);
    public static Material ZirconiumChloride = new Material(Ref.ID, "zirconiun_chloride", 0xe8e8e8, METALLIC).asDust(ORE, ORE_SMALL).add(Zirconium, 1, Chlorine, 4);
    public static Material Baddeleyite = new Material(Ref.ID, "baddeleyite", 0xc4bfb1, METALLIC).asDust(ORE, ORE_SMALL).add(Zirconium, 1, Oxygen, 2);
    public static Material Columbite = new Material(Ref.ID, "columbite", 0xa6966d, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 2, Manganese, 2, Niobium, 2, Tantalum, 2, Oxygen, 12);
    public static Material RuthOsmoxide = new Material(Ref.ID, "ruthosm_oxide", 0x524e46, METALLIC).asDust(ORE, ORE_SMALL).add(Ruthenium, 1, Osmium, 1, Oxygen, 8);
    public static Material Polarite = new Material(Ref.ID, "polarite", 0xe8e3d8, METALLIC).asDust(ORE, ORE_SMALL).add(Palladium, 2, Bismuth, 1, Lead, 1);
    public static Material Greenocklite = new Material(Ref.ID, "greenocklite", 0xf7bf31, METALLIC).asDust(ORE, ORE_SMALL).add(Cadmium, 1, Sulfur, 1);
    public static Material Calaverite = new Material(Ref.ID, "calaverite", 0x574e37, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 1, Tellurium, 2);
    public static Material Sylvanite = new Material(Ref.ID, "sylvanite", 0xb3b3b3, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 1, Tellurium, 4, Silver, 1);
    public static Material Melonite = new Material(Ref.ID, "melonite", 0xf2ebf2, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Tellurium, 1);
    public static Material Petzite = new Material(Ref.ID, "petzite", 0xffffc8, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 1, Tellurium, 2, Silver, 3);
    public static Material Loparite = new Material(Ref.ID, "loparite", 0x736872, METALLIC).asDust(ORE, ORE_SMALL).add(Cerium, 1, Sodium, 1, Calcium, 1, Titanium, 1, Niobium, 1, Oxygen, 3);
    public static Material TantalumPentoxide = new Material(Ref.ID, "tantalumpentoxide", 0xd6d4d4, METALLIC).asDust(ORE, ORE_SMALL).add(Tantalum, 2, Oxygen, 5);
    public static Material NiobiumPentoxide = new Material(Ref.ID, "niobiumpentoxide", 0xa39e9d, METALLIC).asDust(ORE, ORE_SMALL).add(Niobium, 2, Oxygen, 5);
    public static Material Molybdite = new Material(Ref.ID, "molybdite", 0xa2a341, METALLIC).asDust(ORE, ORE_SMALL).add(Molybdenum, 1, Oxygen, 3);
    public static Material RutheniumOxide = new Material(Ref.ID, "ruthenium_oxide", 0x1b1e36, METALLIC).asDust(ORE, ORE_SMALL).add(Ruthenium, 2, Oxygen, 3);
    public static Material Chlorargyrite = new Material(Ref.ID, "chlorargyrite", 0xa1a09d, METALLIC).asDust(ORE, ORE_SMALL).add(Silver, 1, Chlorine, 1);
    public static Material Dzhalindite = new Material(Ref.ID, "dzhalindite", 0xd4d1c7, METALLIC).asDust(ORE, ORE_SMALL).add(Indium, 1, Oxygen, 3);
    public static Material Bismuthinite = new Material(Ref.ID, "bismuthinite", 0xd4cbb0, METALLIC).asDust(ORE, ORE_SMALL).add(Bismuth, 2, Sulfur, 3);
    public static Material Bismite = new Material(Ref.ID, "bismite", 0xfcf3d4, METALLIC).asDust(ORE, ORE_SMALL).add(Bismuth, 2, Oxygen, 3);
    public static Material Lorandite = new Material(Ref.ID, "lorandite", 0xbf950a, METALLIC).asDust(ORE, ORE_SMALL).add(Thallium, 1, Arsenic, 1, Sulfur, 2);
    public static Material Auricupride = new Material(Ref.ID, "auricupride", 0xebe7d3, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 3, Copper, 2);
    public static Material IridiumOxide = new Material(Ref.ID, "iridium_oxide", 0x474442, METALLIC).asDust(ORE, ORE_SMALL).add(Iridium, 3, Oxygen, 2);
    public static Material IridiumChloride = new Material(Ref.ID, "iridium_chloride", 0x080707, METALLIC).asDust(ORE, ORE_SMALL).add(Iridium, 3, Chlorine, 2);
    public static Material Millerite = new Material(Ref.ID, "millerite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Sulfur, 1);
    public static Material Nickeline = new Material(Ref.ID, "nickeline", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Arsenic, 1);
    public static Material Taenite = new Material(Ref.ID, "taenite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).add(Nickel, 1, Iron, 2);
    public static Material RareEarthsA = new Material(Ref.ID, "rare_earth_a", 0x646464, METALLIC).asDust(ORE, ORE_SMALL).add(Lanthanum, 7, Neodymium, 7, Samarium, 2, Cerium, 13, Yttrium, 6, Scandium, 5);
    public static Material RareEarthsB = new Material(Ref.ID, "rare_earths_b", 0xbfbfbf, METALLIC).asDust(ORE, ORE_SMALL).add(Samarium, 3, Europium, 1, Gadlinium, 1, Terbium, 1, Dysprosium, 1, Holmium, 1);
    public static Material RareEarthsC = new Material(Ref.ID, "rare_earths_c", 0xffff1e, METALLIC).asDust(ORE, ORE_SMALL).add(Erbium, 1, Thulium, 1, Ytterbium, 1, Lutetium, 1, Hafnium, 1, Thorium, 1);
    public static Material RareEarths = new Material(Ref.ID, "rare_earths", 0xffffff, METALLIC).asDust(ORE, ORE_SMALL).add(RareEarthsA, 40, RareEarthsB, 8, RareEarthsC, 6);
    public static Material Eudialyte = new Material(Ref.ID, "eudialyte", 0x8f471e, DULL).asDust().add(Pyrolusite, 2, Zircon, 3, Sodium, 15, Chlorine, 2, Calcium, 6, Silicon, 24, RareEarths, 2); //note I ignored Oxygen and Hydrogen to keep the actual value here reasonable
    public static Material PreciousMetalsGroup = new Material(Ref.ID, "precious_metals_group", 0xffff1e, METALLIC).asDust(ORE, ORE_SMALL).add(Gold, 1, Silver, 4, Indium, 3, Mercury, 3, Copper, 3, Cadmium, 2, Thallium, 2);
    public static Material IronMetalsGroup = new Material(Ref.ID, "iron_metals_group", 0xc8c8fa, METALLIC).asDust(ORE, ORE_SMALL).add(Iron, 10, Nickel, 2, Cobalt, 1, Chrome, 1, Vanadium, 1, Scandium, 1);
    public static Material WorkingMetalsGroup = new Material(Ref.ID, "working_metals_group", 0xff6400, METALLIC).asDust(ORE, ORE_SMALL).add(Zinc, 5, Gallium, 1, Copper, 4, Nickel, 3, Cobalt, 2, Manganese, 3);
    public static Material PrePlatinumTransition = new Material(Ref.ID, "preplatinum_transition", 0xb4b4dc, METALLIC).asDust(ORE, ORE_SMALL).add(Molybdenum, 5, Zirconium, 4, Niobium, 2, Hafnium, 1, Tantalum, 2, Tungsten, 2);
    public static Material NuclearGroup = new Material(Ref.ID, "nuclear_group", 0x32f032, METALLIC).asDust(ORE, ORE_SMALL).add(Thorium, 16, Uranium, 10, Uranium235, 1, Plutonium, 1);
    public static Material HeavyMetalsGroup = new Material(Ref.ID, "heavy_metals_group", 0x8c648c, METALLIC).asDust(ORE, ORE_SMALL).add(Mercury, 2, Bismuth, 5, Lead, 10, Silver, 2, Tin, 4, NuclearGroup, 3);
    public static Material RubyGroup = new Material(Ref.ID, "ruby_group", 0xff6464, SHINY).asDust(ORE, ORE_SMALL).add(Ruby, 2, PinkSapphire, 4, OrangeSapphire, 2, YellowSapphire, 2, PurpleSapphire, 1);
    public static Material SapphireGroupA = new Material(Ref.ID, "sapphire_group_a", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).add(GreenSapphire, 2, BlueSapphire, 10, WhiteSapphire, 4, BlackSapphire, 2);
    public static Material SapphireGroup = new Material(Ref.ID, "sapphire_group", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).add(SapphireGroupA, 5, RubyGroup, 1, Alumina, 2);
    public static Material BerylGroupA = new Material(Ref.ID, "beryl_group_a", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).add(Emerald, 6, Goshenite, 10, Morganite, 4, Bixbite, 1, Heliodor, 3, Aquamarine, 4);
    public static Material BerylGroupB = new Material(Ref.ID, "beryl_group_b", 0xfafaed, SHINY).asDust(ORE, ORE_SMALL).add(Chrsoberyl, 8, Alexandrite, 6, Cymophane, 3, Bertrandite, 10);
    public static Material BerylGroup = new Material(Ref.ID, "beryl_group", 0x50ff50, SHINY).asDust(ORE, ORE_SMALL).add(BerylGroupA, 4, BerylGroupB, 4);
    public static Material SpinelGroup = new Material(Ref.ID, "spinel_group", 0x0b0f0b, SHINY).asDust(ORE, ORE_SMALL).add(WhiteSpinel, 5, BlackSpinel, 10, BalasAmeythest, 3, BalasEmerald, 3, BalasRuby, 5, BalasSapphire, 4);
    public static Material JadeGroup = new Material(Ref.ID, "jade_group", 0x3af284, SHINY).asDust(ORE, ORE_SMALL).add(WhiteJade, 3, NephriteJade, 5, BlackJade, 4, GreenJade, 4, PurpleJade, 1, CyanJade, 1);
    public static Material FlouriteGroupA = new Material(Ref.ID, "flourite_groupa", 0x0d0d0c, GEM_V).asGem(true, ORE, ORE_SMALL).add(BlackFlourite, 1, WhiteFlourite, 1, CyanFlourite, 1, YellowFlourite, 1, GreenFlourite, 1, BrownFlourite, 1);
    public static Material FlouriteGroupB = new Material(Ref.ID, "flourite_groupb", 0x9e0b03, GEM_V).asGem(true, ORE, ORE_SMALL).add(RedFlourite, 1, BlueFlourite, 1, PurpleFlourite, 1, MagentaFlourite, 1, PinkFlourite, 1, OrangeFlourite, 1);
    public static Material FlouriteGroup = new Material(Ref.ID, "flourite_group", 0xf2f2f0, GEM_V).asGem(true, ORE, ORE_SMALL).add(FlouriteGroupA, 6, FlouriteGroupB, 6);
    public static Material Alkali = new Material(Ref.ID, "alkali", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Lithium, 8, Sodium, 12, Potassium, 6, Caesium, 2, Rubidium, 2);
    public static Material Alkaline = new Material(Ref.ID, "alkaline", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(Beryllium, 4, Magnesium, 10, Calcium, 10, Strontium, 4, Barium, 6);
    public static Material MagnesiumMineralsA = new Material(Ref.ID, "magnesium_minerals_a", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).add(Olivine, 6, Magnesite, 10, Magnesia, 1, Biotite, 3);
    public static Material MagnesiumMineralsB = new Material(Ref.ID, "magnesium_minerals_b", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).add(Glauconite, 1, Bentonite, 1, Talc, 1, Soapstone, 1, MagnesiumChloride, 10, NephriteJade, 2);
    public static Material MagnesiumMineralsC = new Material(Ref.ID, "magnesium_minerals_c", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).add(SpinelGroup, 5, Rhodonite, 2, SnowFlakeObsidian, 2, Pyrope, 4, Obsidian, 5);
    public static Material MagnesiumMinerals = new Material(Ref.ID, "magnesium_minerals", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).add(MagnesiumMineralsA, 20, MagnesiumMineralsB, 20, MagnesiumMineralsC, 10);
    public static Material Metalloids = new Material(Ref.ID, "metalloids", 0xffffff, DULL).asDust(ORE, ORE_SMALL).add(Boron, 8, Germanium, 1, Arsenic, 2, Antimony, 2, Tellurium, 1, Selenium, 1);
    public static Material ReactiveMetalsGroup = new Material(Ref.ID, "reactive_metals_group", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).add(Alkali, 10, Alkaline, 8, RareEarths, 4, Metalloids, 3, Alumina, 20, Rutile, 6);
    public static Material MetalsGroup = new Material(Ref.ID, "metals_group", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).add(PreciousMetalsGroup, 2, HeavyMetalsGroup, 4, ReactiveMetalsGroup, 3, IronMetalsGroup, 10, PrePlatinumTransition, 3, WorkingMetalsGroup, 5);
    public static Material DiamondGroupA = new Material(Ref.ID, "diamond_group_a", 0xc8ffff, SHINY).asDust(ORE, ORE_SMALL).add(Diamond, 10, YellowDiamond, 4, GrayDiamond, 3, BrownDiamond, 3);
    public static Material DiamondGroupB = new Material(Ref.ID, "diamond_group_b", 0xf7682f, SHINY).asDust(ORE, ORE_SMALL).add(GoldDiamond, 2, OrangeDiamond, 3, RedDiamond, 1, PinkDiamond, 1, MagentaDiamond, 1, BlackDiamond, 1);
    public static Material DiamondGroupC = new Material(Ref.ID, "diamond_group_c", 0x21ffcf, SHINY).asDust(ORE, ORE_SMALL).add(LimeDiamond, 2, BlueDiamond, 2, PurpleDiamond, 1, PinkDiamond, 1, CyanDiamond, 2, GreenDiamond, 1);
    public static Material DiamondGroup = new Material(Ref.ID, "diamond_group", 0xc8ffff, SHINY).asDust(ORE, ORE_SMALL).add(DiamondGroupA, 20, DiamondGroupB, 10, DiamondGroupC, 3, Diamond, 5, MagnesiumMinerals, 2, MetalsGroup, 1);
    public static Material LithiumSalts = new Material(Ref.ID, "lithium_salts", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).add(LithiumChlorate, 2, LithiumChloride, 2, LithiumHydroxide, 2, LithiumOxide, 2, LithiumPerchlorate, 2);
    public static Material LithiumMinerals = new Material(Ref.ID, "lithium_minerals", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).add(Petalite, 4, Sugilite, 1, Tourmaline, 1, Tungstate, 2, Spodumene, 8, Lepidolite, 8);
    public static Material Charoite = new Material(Ref.ID, "charoite", 0xf75394, DULL).asDust(ORE, ORE_SMALL).add(Potassium, 2, Calcium, 1, Sodium, 1, Silicon, 4, Flourine, 1);
    public static Material CalciumSulfite = new Material(Ref.ID, "calcium_sulfite", 0xe8e4e3, DULL).asDust().add(Calcium, 1, Sulfur, 1, Oxygen, 3);
    public static Material CalciumMineralsA = new Material(Ref.ID, "calcium_minerals_a", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).add(Tanzanite, 1, Scheelite, 1, Grossular, 1, Andradite, 1, Powelite, 1, Pyrochlore, 1);
    public static Material CalciumMineralsB = new Material(Ref.ID, "calcium_minerals_b", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).add(Quicklime, 10, Bentonite, 4, Lazurite, 3, CalciumSulfite, 1, Phosphorus, 8, CalciumChloride, 8);
    public static Material CalciumMineralsC = new Material(Ref.ID, "calcium_minerals_c", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).add(FlouriteGroup, 12, Loparite, 3, Eudialyte, 2, Lautarite, 2, Datolite, 2, Euxenite, 1);
    public static Material CalciumMinerals = new Material(Ref.ID, "calcium_minerals", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).add(CalciumMineralsA, 1, CalciumMineralsB, 8, CalciumMineralsC, 2);
    public static Material PotassiumMineralsA = new Material(Ref.ID, "potassium_mineralsa", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(Fuchsite, 5, Amazonite, 8, Turquoise, 1, Sugilite, 1, Pyrochlore, 1, Charoite, 1);
    public static Material PotassiumMineralsB = new Material(Ref.ID, "potassium_mineralsb", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(RockSalt, 10, Potash, 10, PotassiumFeldspar, 10, Lepidolite, 5, Glauconite, 5, Muscovite, 10);
    public static Material PotassiumMineralsC = new Material(Ref.ID, "potassium_mineralsc", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(Carnotite, 1, PotassiumBromide, 2, PotassiumCarbonate, 1, Moonstone, 3, Ukanite, 2, PotassiumAluminate, 3);
    public static Material PotassiumMineralsD = new Material(Ref.ID, "potassium_minerals_d", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(PotassiumHydroxide, 1, PotassiumBisulfate, 1, PotassiumPersulfate, 1, PotassiumSulfide, 1, PotassiumSulfate, 1, PotassiumPyrosulfate, 1);
    public static Material PotassiumMinerals = new Material(Ref.ID, "potassium_minerals", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(PotassiumMineralsA, 4, PotassiumMineralsB, 8, PotassiumMineralsC, 5, PotassiumMineralsD, 4);
    public static Material CobaltOresA = new Material(Ref.ID, "cobalt_ores_a", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).add(Skutterudite, 3, Cattierite, 2, Glaucodot, 2, Penroseite, 2);
    public static Material CobaltOres = new Material(Ref.ID, "cobalt_ores", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).add(Cobaltite, 10, Villamaininite, 1, Glaucodot, 2, CobaltOresA, 2, Trogtalite, 2, Safflorite, 2);
    public static Material ChromeChalcedony = new Material(Ref.ID, "chrome_chalcedony", 0x639968, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).add(Silicon, 4, Oxygen, 8);
    public static Material ChromeOres = new Material(Ref.ID, "chrome_ores", 0xffe6e6, SHINY).asDust(ORE, ORE_SMALL).add(Chromite, 10, Ruby, 1, Uvarovite, 1, Crocoite, 2, ChromeChalcedony, 2, PinkSapphire, 2);
    public static Material TungstenOres = new Material(Ref.ID, "tungsten_ores", 0x323232, SHINY).asDust(ORE, ORE_SMALL).add(TungstenTrioxide, 3, Hubnerite, 4, Ferberite, 8, Tungsten, 1, Tungstate, 20);
    public static Material ManganeseOresA = new Material(Ref.ID, "manganese_ores_a", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(Psilomelane, 2, Columbite, 2, Rhodochrosite, 2, Rhodonite, 1);
    public static Material ManganeseOresB = new Material(Ref.ID, "manganese_ores_b", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(Tinaksite, 2, Kunzite, 2, Spessartine, 2, Tourmaline, 2, Sugilite, 2, ManganeseOresA);
    public static Material ManganeseOresC = new Material(Ref.ID, "manganese_ores_c", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(ManganeseChloride, 2, Tantalite, 3, Pyrolusite, 8, Hauerite, 2, Hubnerite, 2, ManganeseOresB, 5);
    public static Material PlatinumGroupSludgeRaw = new Material(Ref.ID, "platinum_group_sludge_raw", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).add(Erlichmanite, 2, RuthOsmoxide, 2, IridiumOxide, 2, IridiumChloride, 2, Polarite, 4, Laurite, 2);
    public static Material CooperSperyliteGroup = new Material(Ref.ID, "cooper_sperylite_group", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).add(PlatinumGroupSludge, 4, Cooperite, 8, Sperrylite, 16, Geversite, 4, Insizwaite, 4, PlatinumGroupSludgeRaw, 8);
    public static Material ZirconiumGroup = new Material(Ref.ID, "zirconium_group", 0x4a0505, GEM_V).asGem(true, ORE, ORE_SMALL).add(Zircon, 10, WhiteZircon, 3, YellowZircon, 1, ZirconiumChloride, 2, Baddeleyite, 2);
    public static Material BismuthGroup = new Material(Ref.ID, "bismuth_group", 0x64a0a0, SHINY).asDust(ORE, ORE_SMALL).add(Insizwaite, 8, Polarite, 6, Bismuthinite, 6, Bismite, 8, Bismuth, 2);
    public static Material RareEarthOres = new Material(Ref.ID, "rare_earth_ores", 0x324632, SHINY).asDust(ORE, ORE_SMALL).add(RareEarths, 5, Monazite, 5, Eudialyte, 3, Gadolinite, 3, Euxenite, 3, Loparite, 2);
    public static Material SilverOres = new Material(Ref.ID, "silver_ores", 0xdcdcff, SHINY).asDust(ORE, ORE_SMALL).add(Silver, 6, Arquerite, 6, SilverIodide, 2, Acanthite, 18, Argyrodite, 6, Chlorargyrite, 6);
    public static Material GoldOres = new Material(Ref.ID, "gold_ores", 0xffff1e, SHINY).asDust(ORE, ORE_SMALL).add(Gold, 48, Calaverite, 2, Sylvanite, 2, Petzite, 1, Aurostibite, 1, Auricupride, 3);
    public static Material TantalumOre = new Material(Ref.ID, "tantalum_ore", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).add(Tantalite, 30, Euxenite, 10, TantalumPentoxide, 8, Tantalum, 2);
    public static Material LeadOres = new Material(Ref.ID, "lead_ores", 0x8c648c, SHINY).asDust(ORE, ORE_SMALL).add(Lead, 5, Galena, 10, Litharge, 2, Angelsite, 8, Vanadinite, 2, Clausthalite, 2);
    public static Material NickelOresA = new Material(Ref.ID, "nickel_ores_a", 0xc8c8fa, SHINY).asDust(ORE, ORE_SMALL).add(Nickel, 1, Taenite, 2, Nickeline, 2, Millerite, 10, Gersdorffite, 4, Rammelsbergite, 2);
    public static Material NickelOres = new Material(Ref.ID, "nickel_ores", 0x32c846, SHINY).asDust(ORE, ORE_SMALL).add(Garnierite, 10, Pentlandite, 5, NickelOresA, 2, Penroseite, 3, Vaesite, 3, Villamaininite, 2);
    public static Material TitaniumOres = new Material(Ref.ID, "titanium_ores", 0xdca0f0, SHINY).asDust(ORE, ORE_SMALL).add(Rutile, 10, Ilmenite, 4, Loparite, 2, Tinaksite, 2);
    public static Material Nikolite = new Material(Ref.ID, "nikolite", 0x270f91, METALLIC).asDust(ORE, ORE_SMALL).add(Acanthite, 3, Azurite, 1, Galena, 5, Sapphire, 1);
    public static Material LapisGroup = new Material(Ref.ID, "lapis_group", 0x4646dc, SHINY).asDust(ORE, ORE_SMALL).add(Lapis, 6, Lazurite, 6, Sodalite, 6, SapphireGroupA, 4, Pyrite, 4, Nikolite, 6); //this is the equivalent of the redstone group
    public static Material LabradoriteGroup = new Material(Ref.ID, "labradorite_group", 0xe6e070, SHINY).asDust(ORE, ORE_SMALL).add(YellowLabradorite, 3, GreenLabradorite, 3, BlueLabradorite, 3, OrangeLabradorite, 3, BlueTopaz, 3, Topaz, 8);
    public static Material SunstoneGroup = new Material(Ref.ID, "sunstone_group", 0x57ba7f, SHINY).asDust(ORE, ORE_SMALL).add(Sunstone, 10, RedSunstone, 3, GreenSunstone, 2, VioletSunstone, 1, Topaz, 12, BlueTopaz, 3);
    public static Material AluminiumOresA = new Material(Ref.ID, "aluminium_ores_a", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).add(GarnetRed, 3, GarnetYellow, 3, Alumina, 4, Bauxite, 40, Spodumene, 5, Dumortierite, 3);
    public static Material AluminiumOresB = new Material(Ref.ID, "aluminium_ores_b", 0xf7fcfc, SHINY).asDust(ORE, ORE_SMALL).add(Amazonite, 3, Muscovite, 3, Fuchsite, 3, Turquoise, 3, Sugilite, 2, Tourmaline, 2);
    public static Material AluminiumOresC = new Material(Ref.ID, "aluminium_ores_c", 0x0b0f0b, SHINY).asDust(ORE, ORE_SMALL).add(SpinelGroup, 8, JadeGroup, 6, SunstoneGroup, 6, BerylGroup, 3, LabradoriteGroup, 3, SapphireGroup, 5);
    public static Material AluminiumOresD = new Material(Ref.ID, "aluminium_ores_d", 0x8f8c33, SHINY).asDust(ORE, ORE_SMALL).add(Epidote, 3, Kunzite, 3, Chrysocolla, 3, SodiumAluminate, 3, Cryolite, 3, Gibbsite, 3);
    public static Material AluminiumOresE = new Material(Ref.ID, "aluminium_ores_e", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).add(Rosenbergite, 2, Hercynite, 2, Petalite, 2, Rublicine, 2, Tanzanite, 2, Kaolinite, 12);
    public static Material AluminiumOres = new Material(Ref.ID, "aluminium_ores", 0x80c8f0, SHINY).asDust(ORE, ORE_SMALL).add(AluminiumOresA, 30, AluminiumOresB, 5, LapisGroup, 5, AluminiumOresC, 5, AluminiumOresD, 3, AluminiumOresE, 3);
    public static Material MolyOres = new Material(Ref.ID, "moly_ores", 0xb4b4dc, SHINY).asDust(ORE, ORE_SMALL).add(Molybendite, 20, Wulfenite, 6, Drysdallite, 4, Molybdite, 4, Molybdenum, 1);
    public static Material Roquesite = new Material(Ref.ID, "roquesite", 0xf7f2eb, DULL).asDust(ORE, ORE_SMALL).add(Copper, 1, Indium, 1, Sulfur, 2);
    public static Material SulfurOresFe = new Material(Ref.ID, "sulfur_ores_fe", 0x967828, SHINY).asDust(ORE, ORE_SMALL).add(Sulfur, 20, Pyrite, 10, ArsenoPyrite, 2, Villamaininite, 2, Tetrahedrite, 10, Fukuchilite, 2);
    public static Material SulfurOresCu = new Material(Ref.ID, "sulfur_ores_cu", 0xa07828, SHINY).asDust(ORE, ORE_SMALL).add(Chalcopyrite, 10, Germanite, 5, Tennanite, 5, Digenite, 4, Bornite, 2, Covelite, 2);
    public static Material SulfurOresNiCo = new Material(Ref.ID, "sulfur_ores_ni_co", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).add(Millerite, 10, Pentlandite, 20, Cobaltite, 7, Gersdorffite, 4, Cattierite, 2, Glaucodot, 2);
    public static Material SulfurOresNa = new Material(Ref.ID, "sulfur_ores_na", 0x000096, SHINY).asDust(ORE, ORE_SMALL).add(SodiumBisulfate, 5, SodiumPyrosulfate, 5, SodiumSulfate, 5, SodiumSulfide, 5, SodiumSulfite, 5, SodiumPersulfate, 5);
    public static Material SulfurOresCa = new Material(Ref.ID, "sulfur_ores_ca", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).add(Gypsum, 10, CalciumSulfate, 5, CalciumSulfite, 5, Barite, 5, Alkaline, 3, Celestine, 4);
    public static Material SulfurOresK = new Material(Ref.ID, "sulfur_ores_k", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).add(PotasiumPersulfate, 5, PotassiumBisulfate, 5, PotassiumSulfide, 5, PotassiumPyrosulfate, 5, Alkali, 3, Sulfur, 20);
    public static Material SulfurOresPt = new Material(Ref.ID, "sulfur_ores_pt", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).add(Cooperite, 6, Laurite, 1, Cinnabar, 5, Erlichmanite, 1, Lorandite, 1, Realgar, 4);
    public static Material SulfurOresAgPbBi = new Material(Ref.ID, "sulfur_ores_ag_pb_bi", 0x643c64, SHINY).asDust(ORE, ORE_SMALL).add(Galena, 10, Angelsite, 10, Acanthite, 10, Argyrodite, 10, Bismite, 3, Bismuthinite, 2);
    public static Material SulfurOresTrans = new Material(Ref.ID, "sulfur_ores_trans", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).add(Hauerite, 3, Patronite, 3, Stibinite, 5, Sphalerite, 5, Vaesite, 2);
    public static Material SulfurOresPostTrans = new Material(Ref.ID, "sulfuroresposttrans", 0x91919, SHINY).asDust(ORE, ORE_SMALL).add(Molybendite, 4, Greenocklite, 3, Gallite, 3, Roquesite, 2);
    public static Material SulfurGroup = new Material(Ref.ID, "sulfur_group", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).add(SulfurOresK, 5, SulfurOresPostTrans, 3, SulfurOresCa, 3, SulfurOresTrans, 3, Sulfur, 10, SulfurOresNa, 3);
    public static Material SulfurMegaGroup = new Material(Ref.ID, "sulfur_mega_group", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).add(SulfurOresFe, 16, SulfurOresCu, 12, SulfurOresNiCo, 8, SulfurOresAgPbBi, 4, SulfurOresPt, 2, SulfurGroup, 12);
    public static Material RedStoneOres = new Material(Ref.ID, "redstone_ores", 0xc80000, SHINY).asDust(ORE, ORE_SMALL).add(Redstone, 30, Pyrite, 10, Cinnabar, 5, ChromeOres, 3, Ruby, 2, SulfurMegaGroup, 10);
    public static Material CopperOxides = new Material(Ref.ID, "copper_oxides", 0x1782cf, SHINY).asDust(ORE, ORE_SMALL).add(Malachite, 5, CupricOxide, 10, Azurite, 7, Turquoise, 2, Larimar, 1, Chrysocolla, 2);
    public static Material CopperSelenAntim = new Material(Ref.ID, "copper_selen_antim", 0x464646, SHINY).asDust(ORE, ORE_SMALL).add(Stibinite, 3, Tetrahedrite, 5, Krutaite, 2, Penroseite, 2, Eskebornite, 2, Auricupride, 1);
    public static Material CopperOres = new Material(Ref.ID, "copper_ores", 0x2b373b, SHINY).asDust(ORE, ORE_SMALL).add(SulfurOresCu, 2, CopperOxides, 2, CopperSelenAntim, 1, SulfurOresPostTrans, 1);
    public static Material ClayMinerals = new Material(Ref.ID, "clay_minerals", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).add(Kaolinite, 12, Glauconite, 8, Garnierite, 6, BrownLimonite, 10, YellowLimonite, 10, Bauxite, 10);
    public static Material GalliumTelluride = new Material(Ref.ID, "gallium_telleride", 0x141414, METALLIC).asDust(ORE, ORE_SMALL).add(Gallium, 2, Tellurium, 3);
    public static Material Tellurides = new Material(Ref.ID, "tellurides", 0xf2ebf2, SHINY).asDust(ORE, ORE_SMALL).add(Calaverite, 3, Sylvanite, 2, Melonite, 3, Petzite, 3, GalliumTelluride, 2);
    public static Material GalliumSelenide = new Material(Ref.ID, "gallium_selenide", 0x3b0e0e, METALLIC).asDust(ORE, ORE_SMALL).add(Gallium, 2, Selenium, 3);
    public static Material SelenidesA = new Material(Ref.ID, "selenides_a", 0xe8e4e3, SHINY).asDust(ORE, ORE_SMALL).add(Dzarkenite, 2, Trogtalite, 3, Clausthalite, 2, Eskebornite, 2, Ferroselite, 1, GalliumSelenide, 1);
    public static Material SelenidesB = new Material(Ref.ID, "selenides_b", 0x94948f, SHINY).asDust(ORE, ORE_SMALL).add(Krutaite, 3, Penroseite, 3, Trogtalite, 3, Drysdallite, 2, Tiemannite, 1, Stilleite, 1);
    public static Material Selenides = new Material(Ref.ID, "selenides", 0x57ba7f, SHINY).asDust(ORE, ORE_SMALL).add(SelenidesA, 5, SelenidesB, 2);
    public static Material ArsenicOresA = new Material(Ref.ID, "arsenic_ores_a", 0xccd1cb, SHINY).asDust(ORE, ORE_SMALL).add(Gersdorffite, 3, Nickeline, 6, Safflorite, 3, Tennanite, 4, Rammelsbergite, 3, Skutterudite, 2);
    public static Material ArsenicOresB = new Material(Ref.ID, "arsenic_ores_b", 0xbf1900, SHINY).asDust(ORE, ORE_SMALL).add(Sperrylite, 4, Lorandite, 8, Realgar, 12, Arsenic, 3);
    public static Material ArsenicOres = new Material(Ref.ID, "arsenic_ores", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).add(Realgar, 12, ArsenicOresA, 15, ArsenicOresB, 15, ArsenoPyrite, 10, Glaucodot, 4, Loellingite, 3);
    public static Material PhosphorOres = new Material(Ref.ID, "phosphor_ores", 0xffff00, SHINY).asDust(ORE, ORE_SMALL).add(Xenotime, 2, Phosphor, 10, Phosphorus, 10, Apatite, 6, Phosphate, 10, PhosphorousPentoxide, 5);
    public static Material IodineOres = new Material(Ref.ID, "iodine_ores", 0x140f05, SHINY).asDust(ORE, ORE_SMALL).add(Iodine, 5, IodineSalt, 5, SilverIodide, 3, Lautarite, 4);
    public static Material MagnetBan = new Material(Ref.ID, "magnet_ban", 0x1e1e1e, SHINY).asDust(ORE, ORE_SMALL).add(Magnetite, 10, Vanadinite, 2, Ilmenite, 4, Chromite, 5, BandedIron, 10, Gadolinite, 2);
    public static Material IronClay = new Material(Ref.ID, "iron_clay", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).add(BrownLimonite, 12, YellowLimonite, 12, Glauconite, 8, Ferrosilite, 3, BandedIron, 4, Magnetite, 4);
    public static Material IronGems = new Material(Ref.ID, "iron_gems", 0x96ff96, SHINY).asDust(ORE, ORE_SMALL).add(Andradite, 4, Tanzanite, 3, Obsidian, 4, Olivine, 10, Amethyst, 5, Sugilite, 2);
    public static Material IronOresA = new Material(Ref.ID, "iron_ores_b", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).add(Siderite, 4, Bornite, 4, Chalcocite, 4, Ferrite, 4, Ferberite, 4, Glaucodot, 3);
    public static Material IronOresB = new Material(Ref.ID, "iron_ores_c", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).add(Epidote, 4, FerricChloride, 6, FerrousChloride, 5, Hercynite, 4, Columbite, 4);
    public static Material IronOresC = new Material(Ref.ID, "iron_ores_a", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).add(FerriteMixture, 1, Tetrahedrite, 5, TigerIron, 2, Rhodonite, 2, IronOresB, 10, IronOresA, 20);
    public static Material IronOres = new Material(Ref.ID, "iron_ores", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).add(MagnetBan, 15, IronClay, 15, IronGems, 5, SulfurOresFe, 4, JadeGroup, 5, IronOresA, 20);
    public static Material NativeMetal = new Material(Ref.ID, "native_metal", 0xff6400, SHINY).asDust(ORE, ORE_SMALL).add(Copper, 5, Gold, 3, Silver, 3, PlatinumGroupSludge, 2, Electrum, 3, Taenite, 4);
    public static Material QuartzGroupA = new Material(Ref.ID, "quartz_group_a", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).add(Amethyst, 4, Citrine, 2, CertusQuartz, 3, Reibeckite, 3, Onyx, 4, RedOnyx, 4);
    public static Material QuartzGroupB = new Material(Ref.ID, "quartz_group_b", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).add(RedJasper, 5, GreenJasper, 5, YellowJasper, 5, BlackJasper, 5, BrownJasper, 5, Carnelian, 4);
    public static Material QuartzGroupC = new Material(Ref.ID, "quartz_group_c", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).add(TigerIron, 2, TigersEye, 5, MossAgate, 5, Agate, 5, Chrysoprase, 5, Heliotrope, 5);
    public static Material QuartzGroupD = new Material(Ref.ID, "quartz_group_d", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).add(ChromeChalcedony, 4, Chalcedony, 2, Olivine, 4, Moissanite, 3);
    public static Material QuartzGroup = new Material(Ref.ID, "quartz_group", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).add(Quartz, 20, QuartzGroupA, 5, QuartzGroupB, 5, QuartzGroupC, 5, QuartzGroupD);
    public static Material Hafnon = new Material(Ref.ID, "hafnon", 0xa8340d, METALLIC).asDust(ORE, ORE_SMALL).add(Hafnium, 1, Silicon, 1, Oxygen, 4);
    public static Material Thorite = new Material(Ref.ID, "thorite", 0xd1b28c, METALLIC).asDust(ORE, ORE_SMALL).add(Thorium, 1, Silicon, 1, Oxygen, 4);
    public static Material Plutonite = new Material(Ref.ID, "plutonite", 0xdb0202, METALLIC).asDust(ORE, ORE_SMALL).add(Plutonium239, 1, Oxygen, 1);
    public static Material ScandiumOxide = new Material(Ref.ID, "scandium_oxide", 0xf2f0f0, METALLIC).asDust(ORE, ORE_SMALL).add(Scandium, 2, Oxygen, 3);
    public static Material Livingstonite = new Material(Ref.ID, "livingstonite", 0xf7f2eb, METALLIC).asDust(ORE, ORE_SMALL).add(Mercury, 1, Antimony, 1, Sulfur, 8);
    public static Material Antimonides = new Material(Ref.ID, "antimonides", 0x464646, SHINY).asDust(ORE, ORE_SMALL).add(Aurostibite, 2, Geversite, 5, Livingstonite, 1, Stibinite, 5, Tetrahedrite, 5, AntimonyTrioxide, 2);
    public static Material MercuryGroup = new Material(Ref.ID, "mercury_group", 0x960000, SHINY).asDust(ORE, ORE_SMALL).add(Terlinguaite, 4, Cinnabar, 20, Arquerite, 8, Tiemannite, 6, Livingstonite, 5, Mercury, 1);
    public static Material MolyRhen = new Material(Ref.ID, "moly_rhen", 0xf7f2eb, DULL).asDust(ORE, ORE_SMALL).add(Molybdenum, 63, Rhenium, 1);
    public static Material Asbestos = new Material(Ref.ID, "asbestos", 0xffffff, DULL).asDust(ORE, ORE_SMALL).add(Magnesium, 3, SiliconDioxide, 6, Oxygen, 5);
    //ForgottenByMe
    public static Material Bischofite = new Material(Ref.ID, "bischifite", 0xffffff, DULL).asDust().add(MagnesiumChloride, Water, 6);//TODO Ask if ore
    public static Material Trona = new Material(Ref.ID, "trona", 0xffffff, DULL).asDust().add(Sodium, 3, Carbon, 2, Oxygen, 8);//TODO Ask if ore
    public static Material InfusedFire = new Material(Ref.ID, "infused_fire", 0xffffff, GEM_V).asDust();
    public static Material InfusedWater = new Material(Ref.ID, "infused_water", 0xffffff, GEM_V).asDust();
    public static Material InfusedEarth = new Material(Ref.ID, "infused_earth", 0xffffff, GEM_V).asDust();
    public static Material InfusedAir = new Material(Ref.ID, "infused_air", 0xffffff, GEM_V).asDust();
    public static Material InfusedOrder = new Material(Ref.ID, "infused_order", 0xffffff, GEM_V).asDust();
    public static Material InfusedEntropy = new Material(Ref.ID, "infused_entropy", 0xffffff, GEM_V).asDust();
    public static Material InfusedFlux = new Material(Ref.ID, "infused_flux", 0xffffff, GEM_V).asDust();
    //endregion

    ////region Stones
    //public static Material Rhyolite = new Material(Ref.ID, "rhyolite", 0xf5f5f2, ROUGH).asDust().addTools(4.0F, 64, 3).add(Silicon, 1, Oxygen, 2);
    //public static Material YellowGranite = new Material(Ref.ID, "yellow_granite", 0xf5ed82, ROUGH).asDust().addTools(4.0F, 64, 3).add(SiliconDioxide, 4, Muscovite, 1);
    //public static Material GreenGranite = new Material(Ref.ID, "green_granite", 0x88b54e, ROUGH).asDust().addTools(4.0F, 64, 3).add(SiliconDioxide, 4, Ampibole, 1);
    ////Marble
    //public static Material GreenSchist = new Material(Ref.ID, "green_schist", 0x69be69, ROCK).asDust(Muscovite, 5, Epidote, 5, Serpentine, 5, Magnesite, 1, Magnesite, 1, Alumina, 1); //Replace default
    //public static Material BlueSchist = new Material(Ref.ID, "blue_schist", 0x0569be, ROCK).asDust(PotassiumFeldspar, 1, Olivine, 1, Calcite, 3, Flint, 8, DarkAsh, 4); //Replace default
    //public static Material GreenMarble = new Material(Ref.ID, "green_marble", 0xb3cf8f, ROCK).asDust().add(Magnesite, 1, Calcite, 7, Serpentine, 2);
    //public static Material BlackMarble = new Material(Ref.ID, "black_marble", 0x1f211c, ROCK).asDust().add(Magnesite, 1, Calcite, 7, Coal, 1, Lignite, 3);
    //public static Material PinkMarble = new Material(Ref.ID, "pink_marble", 0xd9bfe0, ROCK).asDust().add(Magnesite, 1, Calcite, 7, BandedIron, 1,);
    //public static Material RedMarble = new Material(Ref.ID, "red_marble", 0xe05431, ROCK).asDust().add(Magnesite, 1, Calcite, 7, BandedIron, 3,);
    ////Basalt
    //public static Material Black_Basalt = new Material(Ref.ID, "black_basalt", 0x1e1414, ROCK).asDust().add(Olivine, 1, Calcite, 3, Flint, 8, DarkAsh, 4, PotassiumFeldspar); //Black Basalt
    //public static Material Tan_Basalt = new Material(Ref.ID, "tan_basalt", 0xd9c1ad, ROCK).asDust().add(Olivine, 1, Calcite, 3, Flint, 8, DarkAsh, 4, PotassiumFeldspar, 3); //Tannish White Basalt
    //public static Material Gabbro = new Material(Ref.ID, "gabbro", 0x1f1a17, ROUGH).asDust().add(Olivine, 1, Calcite, 3, Flint, 8, DarkAsh, 1, PotassiumFeldspar, 3); //Gabbro
    //public static Material Peridotite = new Material(Ref.ID, "peridotite", 0x709665, ROUGH).asDust().add(Olivine, 5, Calcite, 1, Flint, 2, DarkAsh, 1, Chromite);
    //public static Material Boninite = new Material(Ref.ID, "boninite", 0x909190, ROUGH).asDust().add(Olivine, 1, Calcite, 1, Flint, 12, DarkAsh, 1, RareEarths, 1, Magnesite, 2);
    ////Dunite will be represented by amounts of peridot ore
    ////Schist
    //public static Material RedSchist = new Material(Ref.ID, "red_schist", 0xcc846c, ROCK).asDust(Quartz, 3, Graphite, 1, Talc, 2, Magnesite, 1 , GarnetYellow, 1, GarnetRed);
    //public static Material ZebraSchist = new Material(Ref.ID, "zebra_schist", 0x828387, ROCK).asDust(Talc, 5, Biotite, 2, Quartz, 3, PotassiumFeldspar, 1);
    //public static Material Soapstone = new Material(Ref.ID, "soapstone", 0xe8ede6, ROCK).asDust(ORE).add(Talc, 10, Magnesia, 2, Magnesite, 2); //TODO: Ore Gen
    ////Soapstone should generate as a stone here and not an ore
    ////Prismarine (Raw Natural Prismarine)
    //public static Material Prismarine = new Material(Ref.ID, "prismarine", 0x49a3a2, ROCK).asDust(LapisGroup, 1, Olivine, 4, InfusedWater, 4, Calcite, 8, Aquamarine, 4, Uvarovite, 1);
    //public static Material DarkPrismarine = new Material(Ref.ID, "dark_prismarine", 0x69be69, ROCK).asDust(LapisGroup, 1, Olivine, 4, InfusedWater, 2, InfusedEarth, 2, Chromite, 2, Magnetite, 4));
    //public static Material RedPrismarine = new Material(Ref.ID, "red_prismarine", 0x3d5928, ROCK).asDust(RedStoneOres, 1, Olivine, 12, InfusedFire, 2, InfusedEntropy, 2, Ruby, 1, Grossular, 2);
    //public static Material ElderPrismarine = new Material(Ref.ID, "elder_prismarine", 0xe0d9c8, ROCK).asDust(Uvarovite, 1, Olivine, 12, InfusedOrder, 1, InfusedAir, 1, YellowSapphire, 3, Andradite, 5);
    //public static Material PurplePrismarine = new Material(Ref.ID, "purple_prismarine", 0x2b1225, ROCK).asDust((PurpleSapphire, 1, Pyrope, 2, Olivine, 12, Tungstate, 1, Tanzanite, 1, InfusedFlux , 1);
    //public static Material BluePrismarine = new Material(Ref.ID, "blue_prismarine", 0x2b1225, ROCK).asDust((Spessartinee, 2, Olivine, 12, LapisGroup, 8, InfusedWater, 1, BlueSapphire, 2, BlueTopaz, 1);
//
    ////Igneous
    ////Yellow Komatite is handled
    //public static Material RedKomatiite = new Material(Ref.ID, "red_komatiite", 0xbf3a11, ROCK).asDust().add(Olivine, 8, Calcite, 2, DarkAsh, 3, Magnesia, 3, Magnesite, 3, Biotite, 2);
    //public static Material GreenKomatiite = new Material(Ref.ID, "green_komatiite", 0xc0cc64, ROCK).asDust().add(Olivine, 8, Calcite, 2, DarkAsh, 3, Magnesia, 3, Magnesite, 3, Biotite, 2);
    //public static Material Carbonaite = new Material(Ref.ID, "carbonaite", 0x2d2e26, ROCK).asDust().add(Calcite, 3, Graphite, 2, DiamondGroup, 2, DarkAsh, 2, Biotite, 2);
    //public static Material Pegmatite = new Material(Ref.ID, "pegmatite", 0xf0e8b9, ROCK).asDust(SapphireGroup, 1, Quartz, 8, PotassiumFeldspar, 4, Biotite, 2);
    //public static Material Pumice = new Material(Ref.ID, "pumice", 0xfae4e1, ROCK).asDust(Basalt, 1, RedGranite, 1, Rhyolite, 1, Diorite, 1, Andesite, 1);
    //public static Material Latite = new Material(Ref.ID, "latite", 0xba5b5b, ROCK).asDust(PotassiumFeldspar, 5, LabradoriteGroup, 1);
    ////Metamorphic Minerals
    //public static Material Gneiss = new Material(Ref.ID, "gneiss", 0x918f8e, ROCK).asDust(SiliconDioxide, 4);
    //public static Material OrthoGneiss = new Material(Ref.ID, "orthogneiss", 0xd6aea3, ROCK).asDust(SiliconDioxide, 4, PotassiumFeldspar, 2, Olivine, 1);
//
    //public static Material Migmatite = new Material(Ref.ID, "migmatite", 0x4f4b4a, ROCK).asDust(SiliconDioxide, 4, Biotite, 1);
    //public static Material Amphibolite = new Material(Ref.ID, "amphibolite", 0xd2d4ba, ROCK).asDust(Ampibole, 4);
    //public static Material Quartzite = new Material(Ref.ID, "quartzite", 0xe6cdcd, QUARTZ).asGemBasic(false, ORE).add(Silicon, 7, Oxygen, 14, BandedIron, 1, ); //Overwrite Default
    //public static Material OrthoQuartzite = new Material(Ref.ID, "orthoquartzite", 0xe6cdcd, QUARTZ).asGemBasic(false, ORE).add(Silicon, 1, Oxygen, 2);
    //public static Material Hornfels = new Material(Ref.ID, "hornfels", 0x64460a, ROCK).asDust(SiliconDioxide, 2, Muscovite, 1, Clay, 2);
    //public static Material Skarn = new Material(Ref.ID, "skarn", 0x8a837c, NONE).asDust().add(Magnetite, 5, Chalcopyrite, 1, Pyrite, 1, Olivine, 2, Pyroxene, 6, GarnetSand, 2);
    //public static Material RedSlate = new Material(Ref.ID, "red_slate", 0x737373, NONE).asDust(SiliconDioxide, 2, Muscovite, 1);
    //public static Material BlueSlate = new Material(Ref.ID, "blue_slate", 0x737373, NONE).asDust(SiliconDioxide, 2, Muscovite, 1);
    //public static Material GreenSlate = new Material(Ref.ID, "green_slate", 0x737373, NONE).asDust(SiliconDioxide, 2, Muscovite, 1);
//
    //public static Material Eclogite = new Material(Ref.ID, "eclogite", 0x91d180, NONE).asDust(RedGarnet, 2, Quartz, 1, Pyroxene, 4);
    //public static Material Serpentine = new Material(Ref.ID, "serpentine", 0x5de637, NONE).asDust(NephriteJade, 2, Olivine, 4, Magnesite, 2,);
    //public static Material Granulite = new Material(Ref.ID, "granulite", 0xd6c0b2, NONE).asDust(SiliconDioxide, 4, Muscovite, 1, Magnesia, 1, Magnetite, 1, Olivine, 1, GarnetSand, 1);
    ////Minerals
    //public static Material Antharcite = new Material(Ref.ID, "antharcite", 0x1c1918, coal).asGemBasic(false, ORE, ORE_SMALL).add(Carbon, 1);
    //public static Material BandedIronFormation = new Material(Ref.ID, "banded_ironformation", 0x915a5a, DULL).asDust(ORE).add(Iron, 2, Oxygen, 3);
    //public static Material AsbestosStone = new Material(Ref.ID, "asbestos_stone", 0xffffff, DULL)asDust.(Magnesium, 3, SiliconDioxide, 6, Oxygen, 5);
//
    ////Sedimentary Minerals
    //public static Material BlackSand = new Material(Ref.ID, "black_sand", 0x915a5a, ROCK).asDust(ORE).add(Magnetite, 3, Pyroxene, 1);
    //public static Material GlauconiteSand = new Material(Ref.ID, "glauconite_sand", 0x915a5a, ROCK).asDust(ORE).add(Glauconite, 1);
    //public static Material CoralSand = new Material(Ref.ID, "coral_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Calcite, 1);
    //public static Material OlivineSand = new Material(Ref.ID, "olivine_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Olivine, 1);
    //public static Material ObsidianSand = new Material(Ref.ID, "obsidian_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Obsidian, 1);
    //public static Material GarnetSand = new Material(Ref.ID, "garnet_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(YellowGarnet, 1, RedGarnet, 5);
    //public static Material SulfurSand = new Material(Ref.ID, "sulfur_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Sulfur, 1);
    //public static Material SodaliteSand = new Material(Ref.ID, "sodialite_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Sodalite, 1);
    //public static Material VolcanicSand = new Material(Ref.ID, "volcanic_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Quartz, 6, PotassiumFeldspar, 1, Pyroxene, 1);
    //public static Material SpinelSand = new Material(Ref.ID, "spinel_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(SpinelGroup, 1);
    //public static Material CopperSand = new Material(Ref.ID, "copper_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Malachite, 3, Chrysocolla, 1, Chalcopyrite, 2);
    //public static Material BiotiteSand = new Material(Ref.ID, "biotite_sand", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Biotite, 1, Muscovite, 1);
    //public static Material BrownClay = new Material(Ref.ID, "brown_clay", 0xc86400, DULL).asDust(ORE).add(Clay, 1);
    //public static Material WhiteSand = new Material(Ref.ID, "white_sand", 0xf2f2f2, SEDIMENT, SEDIMENTSAND).asDust().add(Cassiterite, 1);
    //public static Material GravelStone = new Material(Ref.ID, "gravel_stone", 0x915a5a, ROCK).asDust(ORE).add(Flint, 1);
    //public static Material BlackSandstone = new Material(Ref.ID, "black_sandstone", 0x915a5a, ROCK).asDust(ORE).add(Magnetite, 3, Pyroxene, 1);
    //public static Material GlauconiteSandstone = new Material(Ref.ID, "glauconite_sandstone", 0x915a5a, ROCK).asDust(ORE).add(Glauconite, 1);
    //public static Material CoralSandstone = new Material(Ref.ID, "coral_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Calcite, 1);
    //public static Material OlivineSandstone = new Material(Ref.ID, "olivine_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Olivine, 1);
    //public static Material ObsidianSandstone = new Material(Ref.ID, "obsidian_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Obsidian, 1);
    //public static Material GarnetSandstone = new Material(Ref.ID, "garnet_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(YellowGarnet, 1, RedGarnet, 5);
    //public static Material SulfurSandstone = new Material(Ref.ID, "sulfur_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Sulfur, 1);
    //public static Material SodaliteSandstone = new Material(Ref.ID, "sodialite_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Sodalite, 1);
    //public static Material VolcanicSandstone = new Material(Ref.ID, "volcanic_sandstone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Quartz, 6, PotassiumFeldspar, 1, Pyroxene, 1);
    //public static Material SpinelSandstone = new Material(Ref.ID, "spinel_sandstonestone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(SpinelGroup, 1);
    //public static Material CopperSandstone = new Material(Ref.ID, "copper_sandstonestone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Malachite, 3, Chrysocolla, 1, Chalcopyrite, 2);
    //public static Material BiotiteSandstone = new Material(Ref.ID, "biotite_sandstonestone", 0xfcaf9f, SEDIMENT, SEDIMENTSAND).asDust().add(Biotite, 1, Muscovite, 1);
    //public static Material WhiteSandstone = new Material(Ref.ID, "white_sandstone", 0xf2f2f2, SEDIMENT, SEDIMENTSAND).asDust().add(Cassiterite, 1);
    //public static Material CassiteriteSandstone = new Material(Ref.ID, "cassiterite_sandstone", 0xf2f2f2, DULL).asDust(ORE).add(Quartz, 1);
    //public static Material GreyWacke = new Material(Ref.ID, "greywacke", 0x999699, SEDIMENT, SEDIMENTSAND).asDust().add(Quartz, 15. PotassiumFeldspar, 1, Clay, 1);
    //public static Material GreySand = new Material(Ref.ID, "grey_sand", 0x999699, SEDIMENT, SEDIMENTSAND).asDust().add(Quartz, 15. PotassiumFeldspar, 1, Clay, 1);
    //public static Material SoulSandstone = new Material(Ref.ID, "soul_sandstone", 0xf2f2f2, SEDIMENT, SEDIMENTSAND).asDust().add(Sulfur, 8, InfusedFire, 3, InfusedEntropy, 2, InfusedFlux, 1, Pyrite, 2, VolcanicSand, 48);
    //public static Material CassiteriteSand = new Material(Ref.ID, "cassiterite_sand", 0xf2f2f2, DULL).asDust(ORE).add(Quartz, 1);
    //public static Material PinkLimestone = new Material(Ref.ID, "pimk_limestone", 0xfcacf0, SEDIMENT, SEDIMENTSAND).asDust().add(Calcite, 1);
    //public static Material OrangeLimestone = new Material(Ref.ID, "orange_limestone", 0xe8965f, SEDIMENT, SEDIMENTSAND).asDust().add(Calcite, 1);
    //public static Material Chalk = new Material(Ref.ID, "chalk", 0xf2f2f2, SEDIMENT, SEDIMENTSAND).asDust().add(Calcite, 1);
    //public static Material Breccia = new Material(Ref.ID, "breccia", 0x999385, SEDIMENT).asDust(Quartz, 1, Biotite, 1, Calcite, 1,  RedGranite, 1); //Angular crystals
    //public static Material Conglomerate = new Material(Ref.ID, "conglomerate", 0xe6c882, SEDIMENT).asDust(Quartz, 1, Biotite, 1, Calcite, 1,  RedGranite, 1); //Circular crystals
    //public static Material Shale = new Material(Ref.ID, "shale", 0xa6a6a6, SEDIMENT).asDust(Clay, 4, Dirt, 1, Alumina, 1, BrownLimonite, 1);
    //public static Material Chert = new Material(Ref.ID, "chert", 0x99858d, SEDIMENT).asDust().add(Quartz, 1);;
//
    ////Nether Stones
    //public static Material Indigotite = new Material(Ref.ID, "indigotite", 0xbf3a11, ROCK).asDust().add(Cobaltite, 4, Lapis, 3, Sodalite, 4, Lazurite, 3, BlueTopaz, 2, Pyrope, 8);
    //public static Material WarpedNetherrack = new Material(Ref.ID, "warped_netherrack", 0xbf3a11, ROCK).asDust().add(PlatinumGroupSludge, 1, Nikolite, 4, Sulfur, 9, Coal, 2, Pyrite, 4, Pentlandite, 1);
    //public static Material Netherrack = new Material(Ref.ID, "netherrack", 0xbf3a11, ROCK).asDust().add(Auricupride, 1, Redstone, 2, Sulfur, 9, Coal, 2, Pyrite, 4, Pentlandite, 1);
    //public static Material PumpkinNetherrack = new Material(Ref.ID, "pumpkin_netherrack", 0xbf3a11, ROCK).asDust().add(Auricupride, 1, Redstone, 4, Sulfur, 16, Coal, 2, Pyrite, 4, Pentlandite, 1);
    //public static Material DeepNetherrack = new Material(Ref.ID, "deep_netherrack", 0xbf3a11, ROCK).asDust().add(Auricupride, 1, Redstone, 8, Sulfur, 8, Coal, 2, Pyrite, 6, Pentlandite, 1);
//
    ////RedGranite, BlackGranite, Basalt
    ////End Stones
    //public static Material Endstone = new Material(Ref.ID, "endstone", 0xbf3a11, ROCK).asDust().add(Helium, 3, Neon, 1, Sand, 40, Olivine, 8, Alumina, 6, Magnesia, 6);
    //public static Material PurpleEndstone = new Material(Ref.ID, "purple_endstone", 0xbf3a11, ROCK).asDust().add(Argon, 3, Tungstate, 1, Sand, 40, Olivine, 8, Alumina, 6, Magnesia, 6);
    //public static Material BlueEndstone = new Material(Ref.ID, "blue_endstone", 0xbf3a11, ROCK).asDust().add(Kypton, 3, Xenon , 1, Sand, 40, Olivine, 8, Alumina, 6, Magnesia, 6);
    //public static Material Imprine = new Material(Ref.ID, "imprine", 0xbf3a11, ROCK).asDust().add(Argon, 6, Xenon , 3, PlatinumGroupSludge, 2, Gold, 2, RareEarths, 2, Amethyst, 32);
    //public static Material Shavahan = new Material(Ref.ID, "shavahan", 0xbf3a11, ROCK).asDust().add(Argon, 3, Xenon , 1, Sand, 40, Cinnabar, 3, Rhodochrosite, 12, Rutile, 12);
    ////endregion
}
