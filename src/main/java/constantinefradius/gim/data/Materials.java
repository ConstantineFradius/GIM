package constantinefradius.gim.data;

import constantinefradius.gim.Ref;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.materials.Element;
import muramasa.antimatter.materials.Material;

import static com.google.common.collect.ImmutableMap.of;
import static muramasa.antimatter.materials.Element.*;
import static muramasa.antimatter.materials.MaterialType.*;
import static muramasa.antimatter.materials.TextureSet.NONE;
import static muramasa.gti.data.Materials.*;
import static muramasa.gti.data.Textures.*;

public class Materials {
    //List for Constant
    //TODO Replace placeholders proper materials
    //TODO Give Amber and BlueAmber materials
    //TODO Invent magic elements
    //TODO Finnish adding names
    //LOW PRIO
    //TODO Check melting temps
    //TODO Check blast furnace recipes
    //TODO Check which metal parts should be added
    //TODO Check materials used in tool generation
    //TODO Check materials used as fuel inlc. fuel values
    //TODO Check material colors

    //List for Bass
    //TODO Fix .mats() with lambda used with less than 6 mats
    //TODO Implement By-Products
    //TODO Implement Stone

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
    public static Material Flourine = new Material(Ref.ID, "flourine", 0xffdcdc, NONE, F).asFluid();
    public static Material Iodine = new Material(Ref.ID, "iodine", 0xffdcdc, DULL, I).asMetal();
    public static Material Thulium = new Material(Ref.ID, "thulium", 0xffdcdc, DULL, Tm).asMetal();
    public static Material Gadlinium = new Material(Ref.ID, "gadlinium", 0xffdcdc, DULL, Gd).asMetal();
    //endregion

    //region Isotopes
    private static Element Li6 = new Element(3, 3, 0, -1, null, "Lithium-6", "Li6", true);
    private static Element C13 = new Element(6, 7, 0, -1, null, "Carbon-13", "C13", true);
    private static Element C14 = new Element(3, 3, 0, -1, null, "Lithium-6", "C14", true);
    private static Element Co60 = new Element(6, 8, 0, -1, null, "Carbon-14", "Co60", true);
    private static Element Pu239 = new Element(94, 145, 0, -1, "U235", "Plutonium-239", "Pu239", true);

    public static Material Lithium6 = new Material(Ref.ID, "lithium_6", 0xc9c1f6, DULL, Li6).asSolid(454, 0, ORE);
    public static Material Carbon13 = new Material(Ref.ID, "carbon_13", 0x1f1c1c, DULL, C13).asSolid();
    public static Material Carbon14 = new Material(Ref.ID, "carbon_14", 0x1a1414, DULL, C14).asSolid();
    public static Material Cobalt60 = new Material(Ref.ID, "cobalt_60", 0x2323f9, METALLIC, Co60).asMetal(1768, 0).addTools(8.0F, 512, 3);
    public static Material Plutonium239 = new Material(Ref.ID, "plutonium_239", 0x2323f9, METALLIC, Pu239).asMetal();
    //endregion

    //region placeholders
    public static Material Powelite = new Material(Ref.ID, "powelite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron,1));
    public static Material Pyrochlore = new Material(Ref.ID, "pyrochlore_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Lazurite = new Material(Ref.ID, "lazurite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Sodalite = new Material(Ref.ID, "sodalite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Monazite = new Material(Ref.ID, "monazite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Sapphire = new Material(Ref.ID, "sapphire_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Molybendite = new Material(Ref.ID, "molybendite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material PotasiumPersulfate = new Material(Ref.ID, "potasium_persulfate_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Stibinite = new Material(Ref.ID, "stibinite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Apatite = new Material(Ref.ID, "apatite_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material Quartz = new Material(Ref.ID, "quartz_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    public static Material CertusQuartz = new Material(Ref.ID, "certus_quartz_placeholder", 0x0055ff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1));
    //regionend

    //region Ores
    //Lithium
    public static Material LithiumChloride = new Material(Ref.ID, "lithium_chloride", 0xe8e4e3, DULL).asDust().mats(of(Lithium, 1, Chlorine, 2));
    public static Material LithiumChlorate = new Material(Ref.ID, "lithium_chlorate", 0xe8e4e3, DULL).asDust().mats(of(Lithium, 1, Chlorine, 1, Oxygen, 3));
    public static Material LithiumPerchlorate = new Material(Ref.ID, "lithium_perchlorate", 0xe8e4e3, DULL).asDust().mats(of(Lithium, 1, Chlorine, 1, Oxygen, 4));
    public static Material LithiumOxide = new Material(Ref.ID, "lithium_oxide", 0xe8e4e3, DULL).asDust().mats(of(Lithium, 2, Oxygen, 1));
    public static Material Ferrite = new Material(Ref.ID, "ferrite", 0x806a66, DULL).asDust().mats(of(Lithium, 2, Iron, 2, Oxygen, 4));
    public static Material LithiumHydroxide = new Material(Ref.ID, "lithium_hydroxide", 0xe8e4e3, DULL).asDust().mats(of(Lithium, 2, Oxygen, 1, Hydrogen, 1));
    public static Material Kunzite = new Material(Ref.ID, "kunzite", 0xe3d5e3, DULL).asDust(ORE).mats(b -> b.put(Lithium, 5).put(Aluminium, 5).put(Silicon, 9).put(Oxygen, 29));
    public static Material Petalite = new Material(Ref.ID, "petalite", 0xededeb, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lithium, 1, Aluminium, 1, Silicon, 4, Oxygen, 10));

    //Beryllium
    public static Material Bertrandite = new Material(Ref.ID, "bertrandite", 0xfafaed, FINE).asDust().mats(of(Beryllium, 4, Silicon, 2, Hydrogen, 2));
    public static Material Gadolinite = new Material(Ref.ID, "gadolinite", 0x666564, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Neodymium, 1).put(Yttrium, 1).put(Lanthanum, 1).put(Cerium, 1).put(Beryllium, 4).put(Iron, 2));
    public static Material Aquamarine = new Material(Ref.ID, "aquamarine", 0x67f5eb, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Heliodor = new Material(Ref.ID, "heliodor", 0xd9d900, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Goshenite = new Material(Ref.ID, "goshenite", 0xffffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Bixbite = new Material(Ref.ID, "bixbite", 0xe80c00, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Maxixe = new Material(Ref.ID, "maxixe", 0x0210ad, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Morganite = new Material(Ref.ID, "morganite", 0xfacde7, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));
    public static Material Chrsoberyl = new Material(Ref.ID, "chrysoberyl", 0xe0facd, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material Alexandrite = new Material(Ref.ID, "alexandrite", 0xa6edc8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material Cymophane = new Material(Ref.ID, "cymophane", 0xf7ff59, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material TrapicheEmerald = new Material(Ref.ID, "trapiche_emerald", 0x0a5218, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 3, Aluminium, 2, Silicon, 2, Oxygen, 18));

    //Labradorite
    public static Material YellowLabradorite = new Material(Ref.ID, "yellow_laboradorite", 0xe6e070, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material OrangeLabradorite = new Material(Ref.ID, "orange_laboradorite", 0xa3763b, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material BlueLabradorite = new Material(Ref.ID, "blue_laboradorite", 0x68abde, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));
    public static Material GreenLabradorite = new Material(Ref.ID, "green_laboradorite", 0x68de8e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Beryllium, 1, Aluminium, 2, Oxygen, 4));

    //Boron
    public static Material Datolite = new Material(Ref.ID, "datolite", 0xfae8f8, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Calcium, 1).put(Boron, 1).put(Silicon, 1).put(Oxygen, 5));
    public static Material BoronicAcid = new Material(Ref.ID, "boronic_acid", 0xe3dccf, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Boron, 1, Oxygen, 3, Hydrogen, 3));

    //Carbon
    public static Material Amber = new Material(Ref.ID, "amber", 0xb8891c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2);
    public static Material BlueAmber = new Material(Ref.ID, "blue_amber", 0x173278, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2);

    //Diamond
    public static Material YellowDiamond = new Material(Ref.ID, "yellow_diamond", 0xe9f02e, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material PinkDiamond = new Material(Ref.ID, "pink_diamond", 0xf5a2ef, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material BlueDiamond = new Material(Ref.ID, "blue_diamond", 0x1527c2, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material GreenDiamond = new Material(Ref.ID, "green_diamond", 0x0a590a, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material LimeDiamond = new Material(Ref.ID, "lime_diamond", 0x2fed2f, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material BlackDiamond = new Material(Ref.ID, "black_diamond", 0x0e1211, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material MagentaDiamond = new Material(Ref.ID, "magenta_diamond", 0xe04cd7, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material BrownDiamond = new Material(Ref.ID, "brown_diamond", 0x47413e, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material OrangeDiamond = new Material(Ref.ID, "orange_diamond", 0xf7682f, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material GrayDiamond = new Material(Ref.ID, "gray_diamond", 0x6e6d6d, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material RedDiamond = new Material(Ref.ID, "red_diamond", 0xf20202, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material CyanDiamond = new Material(Ref.ID, "cyan_diamond", 0x21ffcf, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material PurpleDiamond = new Material(Ref.ID, "purple_diamond", 0xb214de, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));
    public static Material GoldDiamond = new Material(Ref.ID, "gold_diamond", 0xc9c14d, DIAMOND).asGem(true, ORE, ORE_SMALL).addTools(8.0F, 1280, 3).mats(of(Carbon, 1));

    //Fluorine
    public static Material Rosenbergite = new Material(Ref.ID, "rosenbergite", 0xffffc8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Aluminium, 1, Flourine, 1));
    public static Material Cryolite = new Material(Ref.ID, "cyrolite", 0xe8e4e3, DULL).asDust().mats(of(Sodium, 3, Flourine, 6, Aluminium, 3));

    //Fluorite
    public static Material BrownFlourite = new Material(Ref.ID, "brown_fluorite", 0x473b1a, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material BlackFlourite = new Material(Ref.ID, "black_fluorite", 0x0d0d0c, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material WhiteFlourite = new Material(Ref.ID, "white_fluorite", 0xf2f2f0, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material YellowFlourite = new Material(Ref.ID, "yellow_fluorite", 0xf0d802, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material RedFlourite = new Material(Ref.ID, "red_fluorite", 0x9e0b03, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material BlueFlourite = new Material(Ref.ID, "blue_fluorite", 0x03109e, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material GreenFlourite = new Material(Ref.ID, "green_fluorite", 0x039e2f, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material PurpleFlourite = new Material(Ref.ID, "purple_fluorite", 0xaf21cf, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material MagentaFlourite = new Material(Ref.ID, "magenta_fluorite", 0xf01ad3, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material OrangeFlourite = new Material(Ref.ID, "orange_fluorite", 0xcf8621, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material PinkFlourite = new Material(Ref.ID, "pink_fluorite", 0xd15ec2, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));
    public static Material CyanFlourite = new Material(Ref.ID, "cyan_fluorite", 0x0d9184, DULL).asDust().mats(of(Calcium, 1, Flourine, 2));

    //Jade
    public static Material WhiteJade = new Material(Ref.ID, "white_jade", 0xe4f5eb, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Sodium, 2).put(Aluminium, 1).put(Iron, 1).put(Silicon, 4));
    public static Material CyanJade = new Material(Ref.ID, "cyan_jade", 0x93dbd3, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Sodium, 2).put(Aluminium, 1).put(Iron, 1).put(Silicon, 4));
    public static Material BlackJade = new Material(Ref.ID, "black_jade", 0xc8ffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Sodium, 2).put(Aluminium, 1).put(Iron, 1).put(Silicon, 4));
    public static Material GreenJade = new Material(Ref.ID, "green_jade", 0x3af284, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Sodium, 2).put(Aluminium, 1).put(Iron, 1).put(Silicon, 4));
    public static Material PurpleJade = new Material(Ref.ID, "purple_jade", 0x965ae0, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Sodium, 2).put(Aluminium, 1).put(Iron, 1).put(Silicon, 4));

    //Sodium Salts
    public static Material SodiumNitrate = new Material(Ref.ID, "sodium_nitrate", 0xe8e4e3, DULL).asDust().mats(of(Sodium, 1, Oxygen, 3, Nitrogen, 1));
    public static Material SodiumSulfite = new Material(Ref.ID, "sodium_sulfite", 0xe8e4e3, NONE).asDust().mats(of(Sodium, 2, Sulfur, 2, Oxygen, 3));
    public static Material SodiumSulfate = new Material(Ref.ID, "sodium_sulfate", 0xe8e4e3, NONE).asDust().mats(of(Sodium, 2, Sulfur, 2, Oxygen, 4));
    public static Material SodiumPyrosulfate = new Material(Ref.ID, "sodium_pyrosulfate", 0xe8e4e3, NONE).asDust().mats(of(Sodium, 2, Sulfur, 2, Oxygen, 7));
    public static Material SodiumAluminate = new Material(Ref.ID, "sodium_aluminate", 0xe8e4e3, DULL).asDust().mats(of(Sodium, 1, Oxygen, 2, Aluminium, 1));
    public static Material Trona = new Material(Ref.ID, "trona", 0xffffff, DULL).asDust().mats(of(Sodium, 3, Carbon, 2, Oxygen, 8));

    //Magnesium
    public static Material BalasRuby = new Material(Ref.ID, "balas_ruby", 0x8f0a0e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material BalasSapphire = new Material(Ref.ID, "balas_sapphire", 0x0f6abf, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material BalasAmeythest = new Material(Ref.ID, "balas_ameythest", 0x8c08c4, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material BalasEmerald = new Material(Ref.ID, "balas_emerald", 0x1d9927, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material BlackSpinel = new Material(Ref.ID, "black_spinel", 0x0b0f0b, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material WhiteSpinel = new Material(Ref.ID, "white_spinel", 0xf5f7f5, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(of(Magnesium, 1, Aluminium, 2, Oxygen, 4));
    public static Material Asbestos = new Material(Ref.ID, "asbestos", 0xffffff, DULL).asDust(ORE, ORE_SMALL).mats(of(Magnesium, 3, SiliconDioxide, 6, Oxygen, 5));
    public static Material NephriteJade = new Material(Ref.ID, "nephrite_jade", 0xc8ffff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Calcium, 2).put(Magnesium, 3).put(Iron, 2).put(Silicon, 8));
    public static Material SnowFlakeObsidian = new Material(Ref.ID, "snowflake_obsidian", 0x252626, DULL).asDust().mats(of(Magnesium, 1, Iron, 1, Silicon, 2, Oxygen, 8));
    public static Material Bischofite = new Material(Ref.ID, "bischifite", 0xffffff, DULL).asDust().mats(of(MagnesiumChloride, 1, Water, 6));
    public static Material Rhodonite = new Material(Ref.ID, "rhodonite", 0xfad7f2, FINE).asDust().mats(b -> b.put(Manganese, 6).put(Calcium, 1).put(Iron, 1).put(Magnesium, 1).put(Zinc, 1).put(Oxygen, 30));

    //Aluminium
    public static Material Gibbsite = new Material(Ref.ID, "gibbsite", 0xcee3ca, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Aluminium, 1, Oxygen, 3, Hydrogen, 1));
    public static Material Dumortierite = new Material(Ref.ID, "dumortierite", 0x134363, FINE).asDust().mats(of(Aluminium, 7, Boron, 1, Silicon, 3, Oxygen, 18));
    public static Material Hercynite = new Material(Ref.ID, "hercynite", 0x212621, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 2, Aluminium, 2, Oxygen, 4));
    public static Material Turquoise = new Material(Ref.ID, "turquoise", 0x77ecf2, GEM_V).asDust(ORE, ORE_SMALL).mats(of(Copper, 1, Aluminium, 6, Water, 12, Hydrogen, 32));
    public static Material Kaolinite = new Material(Ref.ID, "kaolinite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Aluminium, 2, Silicon, 2, Oxygen, 9));

    //Corundum
    public static Material PurpleSapphire = new Material(Ref.ID, "purple_sapphire", 0xc300ff, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Aluminium, 20, Oxygen, 30, Vanadium, 1));
    public static Material YellowSapphire = new Material(Ref.ID, "yellow_sapphire", 0xfcec00, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Aluminium, 20, Oxygen, 30, Rutile, 1));
    public static Material OrangeSapphire = new Material(Ref.ID, "orange_sapphire", 0xf7a60f, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Aluminium, 20, Oxygen, 30, Copper, 1));
    public static Material BlackSapphire = new Material(Ref.ID, "black_sapphire", 0x140f05, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Aluminium, 2, Oxygen, 3));
    public static Material PinkSapphire = new Material(Ref.ID, "pink_sapphire", 0xffc7d2, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Chrome, 1, Aluminium, 4, Oxygen, 6));
    public static Material WhiteSapphire = new Material(Ref.ID, "white_sapphire", 0xfcf7f8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Aluminium, 2, Oxygen, 3));
    public static Material Alumina = new Material(Ref.ID, "alumina", 0xc3d2e0, GEM_V).asDust(ORE, ORE_SMALL).mats(of(Aluminium, 2, Oxygen, 3));

    //Silicon
    public static Material Moissanite = new Material(Ref.ID, "moissanite", 0xebe7e6, GEM_V).asDust(ORE, ORE_SMALL).mats(of(Silicon, 1, Carbon, 1));

    //Quartz Variants
    public static Material Carnelian = new Material(Ref.ID, "carnelian", 0xed5615, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Agate = new Material(Ref.ID, "agate", 0x965e45, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Heliotrope = new Material(Ref.ID, "chrysoprase", 0x359c78, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Chrysoprase = new Material(Ref.ID, "heliotrope", 0x210a0a, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material MossAgate = new Material(Ref.ID, "moss_agate", 0xafb5ac, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Chalcedony = new Material(Ref.ID, "chalcedony", 0x639968, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Onyx = new Material(Ref.ID, "onyx", 0x080201, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material TigersEye = new Material(Ref.ID, "tigers_eye", 0xa3762e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material RedOnyx = new Material(Ref.ID, "red_onyx", 0xb80d07, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material TigerIron = new Material(Ref.ID, "tigers_iron", 0x6464c8, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 10, Oxygen, 20, BandedIron, 2));
    public static Material Reibeckite = new Material(Ref.ID, "riebeckite", 0x050402, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 8, Oxygen, 22));
    public static Material RedJasper = new Material(Ref.ID, "red_jasper", 0xf56d58, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 1, Oxygen, 2));
    public static Material GreenJasper = new Material(Ref.ID, "green_jasper", 0x1a522d, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 1, Oxygen, 2));
    public static Material YellowJasper = new Material(Ref.ID, "yellow_jasper", 0x918e26, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 1, Oxygen, 2));
    public static Material BlackJasper = new Material(Ref.ID, "black_jasper", 0x0a0a06, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 1, Oxygen, 2));
    public static Material BrownJasper = new Material(Ref.ID, "brown_jasper", 0x453127, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Silicon, 1, Oxygen, 2));
    public static Material GreenAventurine = new Material(Ref.ID, "green_aventurine", 0x2fa15c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material RedAventurine = new Material(Ref.ID, "red_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material YellowAventurine = new Material(Ref.ID, "yellow_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material OrangeAventurine = new Material(Ref.ID, "brown_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material BlueAventurine = new Material(Ref.ID, "blue_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material GreyAventurine = new Material(Ref.ID, "grey_aventurine", 0xe68f8c, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 1, Oxygen, 2));
    public static Material Citrine = new Material(Ref.ID, "citrine", 0xf0cc60, QUARTZ).asDust().mats(of(Silicon, 1, Oxygen, 2));

    //Potassium Sulfur
    public static Material PotassiumHydroxide = new Material(Ref.ID, "potassium_hydroxide", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 1, Hydrogen, 1, Potassium, 1));
    public static Material PotassiumBisulfate = new Material(Ref.ID, "potassium_bisulfate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 4, Hydrogen, 1, Potassium, 1, Sulfur, 1));
    public static Material PotassiumPersulfate = new Material(Ref.ID, "potassium_persulfate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 4, Potassium, 1, Sulfur, 1));
    public static Material PotassiumSulfide = new Material(Ref.ID, "potassium_sulfide", 0xe8e4e3, DULL).asDust().mats(of(Potassium, 2, Sulfur, 1));
    public static Material PotassiumSulfate = new Material(Ref.ID, "potassium_sulfate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 4, Potassium, 2, Sulfur, 1));
    public static Material PotassiumPyrosulfate = new Material(Ref.ID, "potassium_pyrosulfate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 7, Potassium, 2, Sulfur, 2));
    public static Material PotassiumCarbonate = new Material(Ref.ID, "potassium_carbonate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 3, Potassium, 2, Carbon, 1));
    public static Material PotassiumAluminate = new Material(Ref.ID, "potassium_aluminate", 0xe8e4e3, DULL).asDust().mats(of(Oxygen, 2, Potassium, 1, Aluminium, 1));
    public static Material PotassiumBromide = new Material(Ref.ID, "potassium_bromide", 0xf4f5ed, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Potassium, 1, Bromine, 1));
    public static Material Sugilite = new Material(Ref.ID, "sugilite", 0x4f0e8f, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Aluminium, 1).put(Oxygen, 30).put(Iron, 1).put(Manganese, 1).put(Potassium, 1).put(Lithium, 3).put(Silicon, 30));

    //Calcium
    public static Material Sunstone = new Material(Ref.ID, "sunstone", 0xd6a978, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material RedSunstone = new Material(Ref.ID, "red_sunstone", 0xde614e, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material GreenSunstone = new Material(Ref.ID, "green_sunstone", 0x306318, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material VioletSunstone = new Material(Ref.ID, "violet_sunstone", 0x4a1863, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material Epidote = new Material(Ref.ID, "epidote", 0x8f8c33, FINE).asDust().mats(b -> b.put(Calcium, 2).put(Iron, 1).put(Aluminium, 2).put(Silicon, 3).put(Oxygen, 13));
    public static Material Tinaksite = new Material(Ref.ID, "tinaksite", 0x944393, FINE).asDust().mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Silicon, 7).put(Oxygen, 20).put(Titanium, 1));
    public static Material Pectolite = new Material(Ref.ID, "pectolite", 0xe3e0d1, FINE).asDust().mats(b -> b.put(Sodium, 1).put(Calcium, 2).put(Silicon, 3).put(Oxygen, 9));
    public static Material Larimar = new Material(Ref.ID, "larimar", 0xb3eaf2, FINE).asDust().mats(b -> b.put(Sodium, 1).put(Calcium, 1).put(Copper, 1).put(Silicon, 3).put(Oxygen, 9));
    public static Material CalciumSulfite = new Material(Ref.ID, "calcium_sulfite", 0xe8e4e3, DULL).asDust().mats(of(Calcium, 1, Sulfur, 1, Oxygen, 3));

    //Potassium
    public static Material Amazonite = new Material(Ref.ID, "amazonite", 0xa7faf0, FINE).asDust().mats(of(Potassium, 3, Aluminium, 3, Silicon, 9, Oxygen, 24));
    public static Material Muscovite = new Material(Ref.ID, "muscovite", 0xf7fcfc, FINE).asDust().mats(b -> b.put(Potassium, 1).put(Aluminium, 3).put(Silicon, 3).put(Oxygen, 12));
    public static Material Fuchsite = new Material(Ref.ID, "fuchsite", 0x7bdbc2, FINE).asDust().mats(b -> b.put(Potassium, 1).put(Aluminium, 2).put(Chrome, 1).put(Silicon, 3));
    public static Material Moonstone = new Material(Ref.ID, "moonstone", 0xf0d7fa, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Potassium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material BlueMoonstone = new Material(Ref.ID, "blue_moonstone", 0x68bcd4, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Sodium, 1).put(Potassium, 1).put(Aluminium, 2).put(Silicon, 6));
    public static Material Ukanite = new Material(Ref.ID, "ukanite", 0x628052, FINE).asDust().mats(of(PotassiumFeldspar, 1, Epidote, 5));
    public static Material Charoite = new Material(Ref.ID, "charoite", 0xf75394, DULL).asDust(ORE, ORE_SMALL).mats(b -> b.put(Potassium, 2).put(Calcium, 1).put(Sodium, 1).put(Silicon, 4));

    //Calcium Evaporite
    public static Material Gypsum = new Material(Ref.ID, "gypsum", 0xf0efce, FINE).asDust().mats(of(Calcium, 1, Sulfur, 1, Oxygen, 4, Water, 6));
    public static Material CalciumChloride = new Material(Ref.ID, "calcium_chloride", 0xfaf9f7, DULL).asDust().mats(of(Calcium, 1, Chlorine, 2));
    public static Material CalciumSulfate = new Material(Ref.ID, "calcium_sulfate", 0xe8e4e3, DULL).asDust().mats(of(Calcium, 1, Sulfur, 1, Oxygen, 2));

    //Scandium
    public static Material ScandiumOxide = new Material(Ref.ID, "scandium_oxide", 0xf2f0f0, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Scandium, 2, Oxygen, 3));
    public static Material Thortveitite = new Material(Ref.ID, "thortveitite", 0xf0dbce, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Scandium, 1, Yttrium, 1, Silicon, 2, Oxygen, 7));

    //Vanadium
    public static Material VanadiumPentoxide = new Material(Ref.ID, "vanadiumpentoxide", 0xcc9c43, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Vanadium, 2, Oxygen, 5));
    public static Material Patronite = new Material(Ref.ID, "patronite", 0x141211, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Vanadium, 1, Sulfur, 4));
    public static Material Vanadinite = new Material(Ref.ID, "vanadinite", 0xe33627, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Vanadium, 3, Lead, 5, Oxygen, 12, Chlorine, 1));
    public static Material Tourmaline = new Material(Ref.ID, "tourmaline", 0x030201, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(b -> b.put(Lithium, 1).put(Manganese, 1).put(Magnesium, 2).put(Chrome, 1).put(Vanadium, 1).put(Boron, 5).put(Flourine, 1));

    //Chromium
    public static Material Chromite = new Material(Ref.ID, "chromite", 0x1e1e1e, METALLIC).asDust(ORE).mats(of(Iron, 1, Chrome, 2, Oxygen, 4));
    public static Material Crocoite = new Material(Ref.ID, "crocoite", 0xf21905, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lead, 1, Chrome, 1, Oxygen, 4));
    public static Material ChromeChalcedony = new Material(Ref.ID, "chrome_chalcedony", 0x639968, GEM_V).asGem(true, ORE, ORE_SMALL).addTools(7.0F, 256, 2).mats(of(Silicon, 4, Oxygen, 8));

    //Manganese
    public static Material ManganeseChloride = new Material(Ref.ID, "manganese_chloride", 0xffd6fa, DULL).asDust().mats(of(Manganese, 1, Chlorine, 2));
    public static Material Hauerite = new Material(Ref.ID, "hauerite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Manganese, 1, Sulfur, 1));
    public static Material Rhodochrosite = new Material(Ref.ID, "rhodochrosite", 0xeb8178, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Manganese, 1, Carbon, 1, Oxygen, 3));

    //Iron
    public static Material Siderite = new Material(Ref.ID, "siderite", 0x918f4e, DULL).asDust().mats(of(Iron, 1, Carbon, 1, Oxygen, 3));
    public static Material FerrousChloride = new Material(Ref.ID, "ferrous_chloride", 0x9ac98b, DULL).asDust().mats(of(Iron, 1, Chlorine, 2));
    public static Material FerricChloride = new Material(Ref.ID, "ferric_chloride", 0x172114, DULL).asDust().mats(of(Iron, 1, Chlorine, 3));

    //Cobalt
    public static Material CobaltHexaHydrate = new Material(Ref.ID, "cobalt_hexahydrate", 0x84faf8, DULL).asDust().mats(of(Cobalt, 1, Water, 6));
    public static Material Glaucodot = new Material(Ref.ID, "glaucodut", 0xbec5cc, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Cobalt, 1, Arsenic, 2, Sulfur, 2));
    public static Material Villamaininite = new Material(Ref.ID, "villamaninite", 0x3b3b3b, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Cobalt, 1).put(Nickel, 1).put(Copper, 1).put(Iron, 1));
    public static Material Safflorite = new Material(Ref.ID, "safflorite", 0xc1c2b8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Cobalt, 1, Arsenic, 2));
    public static Material Penroseite = new Material(Ref.ID, "penroseite", 0xdededc, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Copper, 1, Cobalt, 1, Selenium, 6));
    public static Material Cattierite = new Material(Ref.ID, "cattierite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Cobalt, 1, Sulfur, 2));
    public static Material Skutterudite = new Material(Ref.ID, "skutterudite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Cobalt, 1, Arsenic, 3));
    public static Material Trogtalite = new Material(Ref.ID, "trogtalite", 0x734d5d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Cobalt, 1, Selenium, 2));

    //Nickel
    public static Material Rammelsbergite = new Material(Ref.ID, "rammelsbergite", 0x93948a, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Arsenic, 2));
    public static Material Gersdorffite = new Material(Ref.ID, "gersdorffite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Sulfur, 1, Arsenic, 1));
    public static Material Millerite = new Material(Ref.ID, "millerite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Sulfur, 1));
    public static Material Vaesite = new Material(Ref.ID, "vaesite", 0xbfbeb6, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Sulfur, 2));
    public static Material Nickeline = new Material(Ref.ID, "nickeline", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Arsenic, 1));
    public static Material Taenite = new Material(Ref.ID, "taenite", 0xa3a09e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Iron, 2));

    //Copper
    public static Material Digenite = new Material(Ref.ID, "digenite", 0x272b2e, DULL).asDust().mats(of(Copper, 9, Sulfur, 5));
    public static Material Fukuchilite = new Material(Ref.ID, "fukuchilite", 0x4a4440, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Sulfur, 8, Copper, 3));
    public static Material Dioptase = new Material(Ref.ID, "dioptase", 0x246949, DULL).asDust().mats(of(Copper, 1, Silicon, 1, Oxygen, 3, Hydrogen, 2));
    public static Material Azurite = new Material(Ref.ID, "azurite", 0x1782cf, DULL).asDust().mats(of(Copper, 3, Carbon, 2, Oxygen, 5, Hydrogen, 1));
    public static Material Covelite = new Material(Ref.ID, "covelite", 0x101747, DULL).asDust().mats(of(Copper, 1, Sulfur, 1));
    public static Material Chalcocite = new Material(Ref.ID, "chalcocite", 0x2b373b, DULL).asDust().mats(of(Copper, 2, Sulfur, 1));
    public static Material Bornite = new Material(Ref.ID, "bornite", 0x736f58, DULL).asDust().mats(of(Copper, 5, Sulfur, 4, Iron, 1));
    public static Material Chrysocolla = new Material(Ref.ID, "chrysocolla", 0x4890a1, DULL).asDust().mats(b -> b.put(Copper, 1).put(Aluminium, 1).put(Hydrogen, 8).put(Silicon, 2));
    public static Material Tennanite = new Material(Ref.ID, "tennanite", 0x2b2a2a, DULL).asDust().mats(b -> b.put(Copper, 10).put(Sulfur, 13).put(Arsenic, 4).put(Zinc, 1));

    //Zinc
    public static Material Smithsonite = new Material(Ref.ID, "smithsonite", 0xfaf3e3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Zinc, 1, Carbon, 1, Oxygen, 3));

    //Gallium
    public static Material GalliumSelenide = new Material(Ref.ID, "gallium_selenide", 0x3b0e0e, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gallium, 2, Selenium, 3));
    public static Material GalliumTelluride = new Material(Ref.ID, "gallium_telleride", 0x141414, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gallium, 2, Tellurium, 3));
    public static Material Gallite = new Material(Ref.ID, "gallite", 0x6b6455, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Copper, 1, Gallium, 1, Sulfur, 2));

    //Germanium
    public static Material Germanite = new Material(Ref.ID, "germanite", 0x594c44, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Copper, 13, Germanium, 2, Iron, 2, Sulfur, 16));

    //Arsenic
    public static Material Loellingite = new Material(Ref.ID, "loellingite", 0xdededc, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Arsenic, 2));
    public static Material Realgar = new Material(Ref.ID, "realgar", 0xbf1900, GEM_V).asDust(ORE, ORE_SMALL).mats(of(Arsenic, 2, Sulfur, 3));
    public static Material ArsenoPyrite = new Material(Ref.ID, "arsenopyrite", 0xccd1cb, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Arsenic, 1, Sulfur, 1));

    //Selenium
    public static Material Krutaite = new Material(Ref.ID, "krutaite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Copper, 1, Selenium, 2));
    public static Material Dzarkenite = new Material(Ref.ID, "dyzarkenite", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Selenium, 2));
    public static Material Clausthalite = new Material(Ref.ID, "clausthalite", 0xa39e84, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lead, 1, Selenium, 1));
    public static Material Eskebornite = new Material(Ref.ID, "eskebornite", 0xb3a070, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Copper, 1, Iron, 1, Selenium, 2));
    public static Material Ferroselite = new Material(Ref.ID, "ferroselite", 0x70706d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Selenium, 2));
    public static Material Stilleite = new Material(Ref.ID, "stilleite", 0xa1a19f, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Zinc, 1, Selenium, 1));

    //Bromine
    public static Material SodiumBromide = new Material(Ref.ID, "sodium_bromide", 0xf4f5ed, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Sodium, 1, Bromine, 1));

    //Rubidium
    public static Material RubidiumOxide = new Material(Ref.ID, "rubidium_oxide", 0xf7facd, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Rubidium, 1, Oxygen, 2));
    public static Material Rublicine = new Material(Ref.ID, "rublicine", 0xc7c9c1, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Rubidium, 2, Aluminium, 1, Silicon, 3, Oxygen, 8));

    //Strontium
    public static Material Celestine = new Material(Ref.ID, "celestine", 0xb6d0d4, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Strontium, 1, Sulfur, 1, Oxygen, 4));
    public static Material Strontianite = new Material(Ref.ID, "strontianite", 0xe8e8e1, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Strontium, 1, Carbon, 1, Oxygen, 3));

    //Yttrium
    public static Material Xenotime = new Material(Ref.ID, "xenotime", 0x787366, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Yttrium, 1, Phosphorus, 1, Oxygen, 4));

    //Zirconium
    public static Material Zircon = new Material(Ref.ID, "red_zircon", 0x470b10, QUARTZ).asDust().mats(b -> b.put(Zirconium, 10).put(Silicon, 10).put(Oxygen, 40).put(Hafnium, 1));
    public static Material Eudialyte = new Material(Ref.ID, "eudialyte", 0x8f471e, DULL).asDust().mats(b -> b.put(Pyrolusite, 2).put(Zircon, 3).put(Sodium, 15).put(Chlorine, 2).put(Calcium, 6).put(Silicon, 24));
    public static Material WhiteZircon = new Material(Ref.ID, "white_zircon", 0xf0eee4, QUARTZ).asDust().mats(b -> b.put(Zirconium, 10).put(Silicon, 10).put(Oxygen, 40).put(Hafnium, 1));
    public static Material YellowZircon = new Material(Ref.ID, "yellow_zircon", 0xfff5ba, QUARTZ).asDust().mats(b -> b.put(Zirconium, 10).put(Silicon, 10).put(Oxygen, 40).put(Hafnium, 1));
    public static Material ZirconiumChloride = new Material(Ref.ID, "zirconiun_chloride", 0xe8e8e8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Zirconium, 1, Chlorine, 4));
    public static Material Baddeleyite = new Material(Ref.ID, "baddeleyite", 0xc4bfb1, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Zirconium, 1, Oxygen, 2));

    //Niobium
    public static Material Loparite = new Material(Ref.ID, "loparite", 0x736872, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Cerium, 1).put(Sodium, 1).put(Calcium, 1).put(Titanium, 1).put(Niobium, 1));
    public static Material NiobiumPentoxide = new Material(Ref.ID, "niobiumpentoxide", 0xa39e9d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Niobium, 2, Oxygen, 5));

    //Molybdenum
    public static Material Drysdallite = new Material(Ref.ID, "drysdallite", 0xada52d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Molybdenum, 1, Selenium, 2));
    public static Material Molybdite = new Material(Ref.ID, "molybdite", 0xa2a341, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Molybdenum, 1, Oxygen, 3));

    //Ruthenium
    public static Material Laurite = new Material(Ref.ID, "laurite", 0x1c1c1a, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Ruthenium, 1, Sulfur, 2));
    public static Material RutheniumOxide = new Material(Ref.ID, "ruthenium_oxide", 0x1b1e36, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Ruthenium, 2, Oxygen, 3));

    //Palladium
    public static Material Polarite = new Material(Ref.ID, "polarite", 0xe8e3d8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Palladium, 2, Bismuth, 1, Lead, 1));

    //Silver
    public static Material Chlorargyrite = new Material(Ref.ID, "chlorargyrite", 0xa1a09d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Silver, 1, Chlorine, 1));
    public static Material Acanthite = new Material(Ref.ID, "acanthite", 0x7d7c74, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Silver, 2, Sulfur, 1));
    public static Material Arquerite = new Material(Ref.ID, "arquerite", 0xe6cdbc, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Mercury, 1, Silver, 8));
    public static Material SilverIodide = new Material(Ref.ID, "silver_iodide", 0xe3dccf, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Silver, 1, Iodine, 1));
    public static Material Argyrodite = new Material(Ref.ID, "argyrodite", 0x5a6163, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Silver, 8, Germanium, 1, Sulfur, 6));

    //Cadmium
    public static Material Greenocklite = new Material(Ref.ID, "greenocklite", 0xf7bf31, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Cadmium, 1, Sulfur, 1));

    //Indium
    public static Material Roquesite = new Material(Ref.ID, "roquesite", 0xf7f2eb, DULL).asDust(ORE, ORE_SMALL).mats(of(Copper, 1, Indium, 1, Sulfur, 2));
    public static Material Dzhalindite = new Material(Ref.ID, "dzhalindite", 0xd4d1c7, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Indium, 1, Oxygen, 3));

    //Tellurium
    public static Material Melonite = new Material(Ref.ID, "melonite", 0xf2ebf2, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Nickel, 1, Tellurium, 1));

    //Iodine
    public static Material IodineSalt = new Material(Ref.ID, "iodine_salt", 0xe8e4e3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Potassium, 1, Iodine, 1, Oxygen, 3));
    public static Material Lautarite = new Material(Ref.ID, "lautarite", 0xf2f1d5, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Calcium, 1, Iodine, 2, Oxygen, 6));

    //Caesium
    public static Material Pollucite = new Material(Ref.ID, "pollucite", 0xc9d4b6, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Caesium, 1, Silicon, 2, Aluminium, 1, Water, 6));

    //Barium
    public static Material Psilomelane = new Material(Ref.ID, "psilomelane", 0x332d2d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Manganese, 5, Water, 2, Barium, 2, Oxygen, 10));

    //Hafnium
    public static Material Hafnon = new Material(Ref.ID, "hafnon", 0xa8340d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Hafnium, 1, Silicon, 1, Oxygen, 4));

    //Tantalum
    public static Material Euxenite = new Material(Ref.ID, "euxenite", 0xebbfa4, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Yttrium, 1).put(Cerium, 1).put(Uranium, 1).put(Thorium, 1).put(Niobium, 1).put(Tantalum, 1));
    public static Material Columbite = new Material(Ref.ID, "columbite", 0xa6966d, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Iron, 2).put(Manganese, 2).put(Niobium, 2).put(Tantalum, 2));
    public static Material TantalumPentoxide = new Material(Ref.ID, "tantalumpentoxide", 0xd6d4d4, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Tantalum, 2, Oxygen, 5));

    //Tungsten
    public static Material Ferberite = new Material(Ref.ID, "ferberite", 0x0a0909, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iron, 1, Tungsten, 1, Oxygen, 4));
    public static Material TungstenTrioxide = new Material(Ref.ID, "tungsten_trioxide", 0xf5efb3, DULL).asDust().mats(of(Tungsten, 1, Oxygen, 3));
    public static Material Hubnerite = new Material(Ref.ID, "hubnerite", 0x949384, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Manganese, 1, Tungsten, 1, Oxygen, 4));

    //Rhenium
    public static Material MolyRhen = new Material(Ref.ID, "moly_rhen", 0xf7f2eb, DULL).asDust(ORE, ORE_SMALL).mats(of(Molybdenum, 63, Rhenium, 1));

    //Osmium
    public static Material RuthOsmoxide = new Material(Ref.ID, "ruthosm_oxide", 0x524e46, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Ruthenium, 1, Osmium, 1, Oxygen, 8));
    public static Material Erlichmanite = new Material(Ref.ID, "erlichmanite", 0xa7afb8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Osmium, 1, Sulfur, 2));

    //Iridium
    public static Material IridiumOxide = new Material(Ref.ID, "iridium_oxide", 0x474442, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iridium, 3, Oxygen, 2));
    public static Material IridiumChloride = new Material(Ref.ID, "iridium_chloride", 0x080707, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iridium, 3, Chlorine, 2));
    public static Material Gaotaiite = new Material(Ref.ID, "gaotaiite", 0x4a4440, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Iridium, 3, Tellurium, 8));

    //Platinum
    public static Material Sperrylite = new Material(Ref.ID, "sperrylite", 0xccd1cb, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Platinum, 1, Arsenic, 2));
    public static Material Geversite = new Material(Ref.ID, "geversite", 0xadada5, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Platinum, 1, Antimony, 2));
    public static Material Insizwaite = new Material(Ref.ID, "insizwaite", 0x94948f, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Platinum, 1, Bismuth, 1, Lead, 1));

    //Gold
    public static Material Auricupride = new Material(Ref.ID, "auricupride", 0xebe7d3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gold, 3, Copper, 2));
    public static Material Aurostibite = new Material(Ref.ID, "aurostibite", 0xd2add7, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gold, 1, Antimony, 2));
    public static Material Calaverite = new Material(Ref.ID, "calaverite", 0x574e37, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gold, 1, Tellurium, 2));
    public static Material Sylvanite = new Material(Ref.ID, "sylvanite", 0xb3b3b3, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gold, 1, Tellurium, 4, Silver, 1));
    public static Material Petzite = new Material(Ref.ID, "petzite", 0xffffc8, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Gold, 1, Tellurium, 2, Silver, 3));

    //Mercury
    public static Material Tiemannite = new Material(Ref.ID, "tiemannite", 0x98998d, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Mercury, 1, Selenium, 1));
    public static Material Terlinguaite = new Material(Ref.ID, "terlinguaite", 0xad6c0a, DULL).asDust().mats(of(Mercury, 2, Chlorine, 1, Oxygen, 1));
    public static Material Livingstonite = new Material(Ref.ID, "livingstonite", 0xf7f2eb, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Mercury, 1, Antimony, 1, Sulfur, 8));

    //Thallium
    public static Material Lorandite = new Material(Ref.ID, "lorandite", 0xbf950a, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Thallium, 1, Arsenic, 1, Sulfur, 2));

    //Lead
    public static Material Litharge = new Material(Ref.ID, "litharge", 0xfa7069, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lead, 1, Oxygen, 1));
    public static Material Angelsite = new Material(Ref.ID, "angelsite", 0x7d7c74, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lead, 2, Sulfur, 1, Oxygen, 4));

    //Bismuth
    public static Material Bismuthinite = new Material(Ref.ID, "bismuthinite", 0xd4cbb0, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Bismuth, 2, Sulfur, 3));
    public static Material Bismite = new Material(Ref.ID, "bismite", 0xfcf3d4, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Bismuth, 2, Oxygen, 3));

    //Fission Fuels
    public static Material Thorite = new Material(Ref.ID, "thorite", 0xd1b28c, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Thorium, 1, Silicon, 1, Oxygen, 4));
    public static Material Carnotite = new Material(Ref.ID, "carnotite", 0xeded18, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Vanadium, 2).put(Uranium, 2).put(Potassium, 2).put(Oxygen, 12));
    public static Material Plutonite = new Material(Ref.ID, "plutonite", 0xdb0202, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Plutonium239, 1, Oxygen, 1));

    //Fantasy
    public static Material Nikolite = new Material(Ref.ID, "nikolite", 0x270f91, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Acanthite, 3, Azurite, 1, Galena, 5, Sapphire, 1));

    //Mixes
    public static Material Aventuretinknights = new Material(Ref.ID, "aventuretinknights", 0x960000, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(YellowAventurine, 1).put(GreyAventurine, 1).put(GreenAventurine, 2).put(BlueAventurine, 1).put(RedAventurine, 1)); //AventurineGroup
    public static Material LutiReck = new Material(Ref.ID, "lutireck", 0x57ba7f, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Sunstone, 10).put(RedSunstone, 3).put(GreenSunstone, 2).put(VioletSunstone, 1).put(Topaz, 12)); //SunstoneGroup
    public static Material Lynecera = new Material(Ref.ID, "lynecera", 0x646464, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Lanthanum, 7).put(Neodymium, 7).put(Samarium, 2).put(Cerium, 13).put(Yttrium, 6));
    public static Material Eustieum = new Material(Ref.ID, "eustieum", 0xbfbfbf, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Samarium, 3).put(Europium, 1).put(Gadlinium, 1).put(Terbium, 1).put(Dysprosium, 1));
    public static Material Earluth = new Material(Ref.ID, "earluth", 0xffff1e, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Erbium, 1).put(Thulium, 1).put(Ytterbium, 1).put(Lutetium, 1).put(Hafnium, 1));
    public static Material Buckre = new Material(Ref.ID, "buckre", 0xffffff, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Lynecera, 40, Eustieum, 8, Earluth, 6));
    public static Material Augustimic = new Material(Ref.ID, "augustimic", 0xffff1e, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Gold, 1).put(Silver, 4).put(Indium, 3).put(Mercury, 3).put(Copper, 3).put(Cadmium, 2));
    public static Material Ferousnasite = new Material(Ref.ID, "ferousnasite", 0xc8c8fa, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Iron, 10).put(Nickel, 2).put(Cobalt, 1).put(Chrome, 1).put(Vanadium, 1));
    public static Material Ziegneil = new Material(Ref.ID, "ziegneil", 0xff6400, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Zinc, 5).put(Gallium, 1).put(Copper, 4).put(Nickel, 3).put(Cobalt, 2));
    public static Material Molnihatcrium = new Material(Ref.ID, "molnihatcrium", 0xb4b4dc, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Molybdenum, 5).put(Zirconium, 4).put(Niobium, 2).put(Hafnium, 1).put(Tantalum, 2));
    public static Material Kimjinite = new Material(Ref.ID, "kimjinite", 0x32f032, METALLIC).asDust(ORE, ORE_SMALL).mats(of(Thorium, 16, Uranium, 10, Uranium235, 1, Plutonium, 1));
    public static Material Riemaswet = new Material(Ref.ID, "riemaswet", 0x8c648c, METALLIC).asDust(ORE, ORE_SMALL).mats(b -> b.put(Mercury, 2).put(Bismuth, 5).put(Lead, 10).put(Silver, 2).put(Tin, 4));
    public static Material Rubilee = new Material(Ref.ID, "rubilee", 0xff6464, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Ruby, 2).put(PinkSapphire, 4).put(OrangeSapphire, 2).put(YellowSapphire, 2));
    public static Material Bigemgep = new Material(Ref.ID, "bigemgep", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).mats(of(GreenSapphire, 2, BlueSapphire, 10, WhiteSapphire, 4, BlackSapphire, 2));
    public static Material Corunstan = new Material(Ref.ID, "corunstan", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).mats(of(Bigemgep, 5, Rubilee, 1, Alumina, 2));
    public static Material Emergosh = new Material(Ref.ID, "emergosh", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Emerald, 6).put(Goshenite, 10).put(Morganite, 4).put(Bixbite, 1).put(Heliodor, 3));
    public static Material Chrysalexageypt = new Material(Ref.ID, "chrysalexageypt", 0xfafaed, SHINY).asDust(ORE, ORE_SMALL).mats(of(Chrsoberyl, 8, Alexandrite, 6, Cymophane, 3, Bertrandite, 10));
    public static Material Berlenisti = new Material(Ref.ID, "berlenisti", 0x50ff50, SHINY).asDust(ORE, ORE_SMALL).mats(of(Emergosh, 4, Chrysalexageypt, 4));
    public static Material Retaigam = new Material(Ref.ID, "retaigam", 0x0b0f0b, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(WhiteSpinel, 5).put(BlackSpinel, 10).put(BalasAmeythest, 3).put(BalasEmerald, 3).put(BalasRuby, 5));
    public static Material Bowaceya = new Material(Ref.ID, "bowaceya", 0x0d0d0c, GEM_V).asGem(true, ORE, ORE_SMALL).mats(b -> b.put(BlackFlourite, 1).put(WhiteFlourite, 1).put(CyanFlourite, 1).put(YellowFlourite, 1).put(GreenFlourite, 1));
    public static Material Violacym = new Material(Ref.ID, "violacym", 0x9e0b03, GEM_V).asGem(true, ORE, ORE_SMALL).mats(b -> b.put(RedFlourite, 1).put(BlueFlourite, 1).put(PurpleFlourite, 1).put(MagentaFlourite, 1).put(PinkFlourite, 1));
    public static Material Flourfrenzine = new Material(Ref.ID, "flourfrenzine", 0xf2f2f0, GEM_V).asGem(true, ORE, ORE_SMALL).mats(of(Bowaceya, 6, Violacym, 6));
    public static Material Alkaline = new Material(Ref.ID, "alkaline", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Beryllium, 4).put(Magnesium, 10).put(Calcium, 10).put(Strontium, 4));
    public static Material Magmina = new Material(Ref.ID, "magmina", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).mats(of(Olivine, 6, Magnesite, 10, Magnesia, 1, Biotite, 3));
    public static Material Glaubtasalt = new Material(Ref.ID, "glaubtasalt", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Glauconite, 1).put(Bentonite, 1).put(Talc, 1).put(Soapstone, 1).put(MagnesiumChloride, 10));
    public static Material Retasnobrope = new Material(Ref.ID, "retasnobrope", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Retaigam, 5).put(Rhodonite, 2).put(SnowFlakeObsidian, 2).put(Pyrope, 4));
    public static Material Magmin = new Material(Ref.ID, "magmin", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).mats(of(Magmina, 20, Glaubtasalt, 20, Retasnobrope, 10));
    public static Material Metalloids = new Material(Ref.ID, "metalloids", 0xffffff, DULL).asDust(ORE, ORE_SMALL).mats(b -> b.put(Boron, 8).put(Germanium, 1).put(Arsenic, 2).put(Antimony, 2).put(Tellurium, 1));
    public static Material Classnicarb = new Material(Ref.ID, "classnicarb", 0xc8ffff, SHINY).asDust(ORE, ORE_SMALL).mats(of(Diamond, 10, YellowDiamond, 4, GrayDiamond, 3, BrownDiamond, 3));
    public static Material Reugenecarbite = new Material(Ref.ID, "reugenecarbite", 0xf7682f, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(GoldDiamond, 2).put(OrangeDiamond, 3).put(RedDiamond, 1).put(PinkDiamond, 1).put(MagentaDiamond, 1));
    public static Material Cypacarbite = new Material(Ref.ID, "cypacarbite", 0x21ffcf, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(LimeDiamond, 2).put(BlueDiamond, 2).put(PurpleDiamond, 1).put(PinkDiamond, 1).put(CyanDiamond, 2));
    public static Material Carcrystite = new Material(Ref.ID, "carcrystite", 0xc8ffff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Classnicarb, 20).put(Reugenecarbite, 10).put(Cypacarbite, 3).put(Diamond, 5).put(Magmin, 2));
    public static Material Lisalite = new Material(Ref.ID, "lisalite", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(LithiumChlorate, 2).put(LithiumChloride, 2).put(LithiumHydroxide, 2).put(LithiumOxide, 2));
    public static Material Litmusa = new Material(Ref.ID, "lithium_minerals", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Petalite, 4).put(Sugilite, 1).put(Tourmaline, 1).put(Tungstate, 2).put(Spodumene, 8));
    public static Material Calcamin = new Material(Ref.ID, "cacamin", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Tanzanite, 1).put(Scheelite, 1).put(Grossular, 1).put(Andradite, 1).put(Powelite, 1));
    public static Material Cacabalite = new Material(Ref.ID, "cacabalite", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Quicklime, 10).put(Bentonite, 4).put(Lazurite, 3).put(CalciumSulfite, 1).put(Phosphorus, 8));
    public static Material Cacacac = new Material(Ref.ID, "cacacac", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Flourfrenzine, 12).put(Loparite, 3).put(Eudialyte, 2).put(Lautarite, 2).put(Datolite, 2));
    public static Material Cacrimin = new Material(Ref.ID, "cacrimin", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).mats(of(Calcamin, 1, Cacabalite, 8, Cacacac, 2));
    public static Material Potamin = new Material(Ref.ID, "potamin", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Fuchsite, 5).put(Amazonite, 8).put(Turquoise, 1).put(Sugilite, 1).put(Pyrochlore, 1));
    public static Material Polsbermn = new Material(Ref.ID, "polsbermn", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(RockSalt, 10).put(Potash, 10).put(PotassiumFeldspar, 10).put(Lepidolite, 5).put(Glauconite, 5));
    public static Material Potcashi = new Material(Ref.ID, "potcashi", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Carnotite, 1).put(PotassiumBromide, 2).put(PotassiumCarbonate, 1).put(Moonstone, 3).put(Ukanite, 2));
    public static Material Peortirlmic = new Material(Ref.ID, "peortirlmic", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(PotassiumHydroxide, 1).put(PotassiumBisulfate, 1).put(PotassiumPersulfate, 1).put(PotassiumSulfide, 1).put(PotassiumSulfate, 1));
    public static Material Potmasite = new Material(Ref.ID, "potmasite", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(of(Potamin, 4, Polsbermn, 8, Potcashi, 5, Peortirlmic, 4));
    public static Material Coborite = new Material(Ref.ID, "coborite", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).mats(of(Skutterudite, 3, Cattierite, 2, Glaucodot, 2, Penroseite, 2));
    public static Material Cobinite = new Material(Ref.ID, "cobinite", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Cobaltite, 10).put(Villamaininite, 1).put(Glaucodot, 2).put(Coborite, 2).put(Trogtalite, 2));
    public static Material Chromfasmesh = new Material(Ref.ID, "chromfasmesh", 0xffe6e6, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Chromite, 10).put(Ruby, 1).put(Uvarovite, 1).put(Crocoite, 2).put(ChromeChalcedony, 2));
    public static Material Tungonite = new Material(Ref.ID, "tungonite", 0x323232, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(TungstenTrioxide, 3).put(Hubnerite, 4).put(Ferberite, 8).put(Tungsten, 1));
    public static Material Manganite = new Material(Ref.ID, "manganite", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(of(Psilomelane, 2, Columbite, 2, Rhodochrosite, 2, Rhodonite, 1));
    public static Material Otakunite = new Material(Ref.ID, "otakunite", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Tinaksite, 2).put(Kunzite, 2).put(Spessartine, 2).put(Tourmaline, 2).put(Sugilite, 2));
    public static Material Hentanite = new Material(Ref.ID, "hentanite", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(ManganeseChloride, 2).put(Tantalite, 3).put(Pyrolusite, 8).put(Hauerite, 2).put(Hubnerite, 2));
    public static Material Plislu = new Material(Ref.ID, "plislu", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Erlichmanite, 2).put(RuthOsmoxide, 2).put(IridiumOxide, 2).put(IridiumChloride, 2).put(Polarite, 4));
    public static Material Sperline = new Material(Ref.ID, "sperline", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(PlatinumGroupSludge, 4).put(Cooperite, 8).put(Sperrylite, 16).put(Geversite, 4).put(Insizwaite, 4));
    public static Material Zircosilch = new Material(Ref.ID, "zircosilch", 0x4a0505, GEM_V).asGem(true, ORE, ORE_SMALL).mats(b -> b.put(Zircon, 10).put(WhiteZircon, 3).put(YellowZircon, 1).put(ZirconiumChloride, 2));
    public static Material Bisma = new Material(Ref.ID, "bisma", 0x64a0a0, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Insizwaite, 8).put(Polarite, 6).put(Bismuthinite, 6).put(Bismite, 8));
    public static Material Reobukmaer = new Material(Ref.ID, "reobukmaer", 0x324632, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Buckre, 5).put(Monazite, 5).put(Eudialyte, 3).put(Gadolinite, 3).put(Euxenite, 3));
    public static Material Ageilik = new Material(Ref.ID, "ageilik", 0xdcdcff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Silver, 6).put(Arquerite, 6).put(SilverIodide, 2).put(Acanthite, 18).put(Argyrodite, 6));
    public static Material Aurite = new Material(Ref.ID, "aurite", 0xffff1e, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Gold, 48).put(Calaverite, 2).put(Sylvanite, 2).put(Petzite, 1).put(Aurostibite, 1));
    public static Material Tantal = new Material(Ref.ID, "tantal", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).mats(of(Tantalite, 30, Euxenite, 10, TantalumPentoxide, 8, Tantalum, 2));
    public static Material Romasweeitite = new Material(Ref.ID, "romasweeitite", 0x8c648c, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Lead, 5).put(Galena, 10).put(Litharge, 2).put(Angelsite, 8).put(Vanadinite, 2));
    public static Material Nikamaka = new Material(Ref.ID, "nikamaka", 0xc8c8fa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Nickel, 1).put(Taenite, 2).put(Nickeline, 2).put(Millerite, 10).put(Gersdorffite, 4));
    public static Material Nikru = new Material(Ref.ID, "nikru", 0x32c846, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Garnierite, 10).put(Pentlandite, 5).put(Nikamaka, 2).put(Penroseite, 3).put(Vaesite, 3));
    public static Material Atlasite = new Material(Ref.ID, "atlasite", 0xdca0f0, SHINY).asDust(ORE, ORE_SMALL).mats(of(Rutile, 10, Ilmenite, 4, Loparite, 2, Tinaksite, 2));
    public static Material Lapi = new Material(Ref.ID, "lapi", 0x4646dc, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Lapis, 6).put(Lazurite, 6).put(Sodalite, 6).put(Bigemgep, 4).put(Pyrite, 4));
    public static Material Labradorite = new Material(Ref.ID, "labradorite", 0xe6e070, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(YellowLabradorite, 3).put(GreenLabradorite, 3).put(BlueLabradorite, 3).put(OrangeLabradorite, 3).put(BlueTopaz, 3));
    public static Material Agaluminabaux = new Material(Ref.ID, "agaluminabaux", 0x6464c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(GarnetRed, 3).put(GarnetYellow, 3).put(Alumina, 4).put(Bauxite, 40).put(Spodumene, 5));
    public static Material Alubi = new Material(Ref.ID, "alubi", 0xf7fcfc, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Amazonite, 3).put(Muscovite, 3).put(Fuchsite, 3).put(Turquoise, 3).put(Sugilite, 2));
    public static Material Alumprere = new Material(Ref.ID, "alumprere", 0x8f8c33, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Epidote, 3).put(Kunzite, 3).put(Chrysocolla, 3).put(SodiumAluminate, 3).put(Cryolite, 3));
    public static Material Alumer = new Material(Ref.ID, "alumer", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Rosenbergite, 2).put(Hercynite, 2).put(Petalite, 2).put(Rublicine, 2).put(Tanzanite, 2));
    public static Material Moyor = new Material(Ref.ID, "moyor", 0xb4b4dc, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Molybendite, 20).put(Wulfenite, 6).put(Drysdallite, 4).put(Molybdite, 4));
    public static Material Pyrisulf = new Material(Ref.ID, "pyrisulf", 0x967828, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Sulfur, 20).put(Pyrite, 10).put(ArsenoPyrite, 2).put(Villamaininite, 2).put(Tetrahedrite, 10));
    public static Material Cuchalpyria = new Material(Ref.ID, "cuchalpyria", 0xa07828, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Chalcopyrite, 10).put(Germanite, 5).put(Tennanite, 5).put(Digenite, 4).put(Bornite, 2));
    public static Material Sulfanico = new Material(Ref.ID, "sulfanico", 0x5050fa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Millerite, 10).put(Pentlandite, 20).put(Cobaltite, 7).put(Gersdorffite, 4).put(Cattierite, 2));
    public static Material Sufna = new Material(Ref.ID, "sufna", 0x000096, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(SodiumBisulfate, 5).put(SodiumPyrosulfate, 5).put(SodiumSulfate, 5).put(SodiumSulfide, 5).put(SodiumSulfite, 5));
    public static Material Sufca = new Material(Ref.ID, "sufca", 0xfff5f5, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Gypsum, 10).put(CalciumSulfate, 5).put(CalciumSulfite, 5).put(Barite, 5).put(Alkaline, 3));
    public static Material Sulfpet = new Material(Ref.ID, "sulfpet", 0xffffc8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Cooperite, 6).put(Laurite, 1).put(Cinnabar, 5).put(Erlichmanite, 1).put(Lorandite, 1));
    public static Material Subipbag = new Material(Ref.ID, "subipbag", 0x643c64, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Galena, 10).put(Angelsite, 10).put(Acanthite, 10).put(Argyrodite, 10).put(Bismite, 3));
    public static Material Sutrans = new Material(Ref.ID, "sutrans", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Hauerite, 3).put(Patronite, 3).put(Stibinite, 5).put(Sphalerite, 5));
    public static Material Supotras = new Material(Ref.ID, "supotras", 0x91919, SHINY).asDust(ORE, ORE_SMALL).mats(of(Molybendite, 4, Greenocklite, 3, Gallite, 3, Roquesite, 2));
    public static Material CentrifugeThisIDareYou = new Material(Ref.ID, "centrifuge_this_i_dare_you", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Pyrisulf, 16).put(Cuchalpyria, 12).put(Sulfanico, 8).put(Subipbag, 4).put(Sulfpet, 2));
    public static Material Routikite = new Material(Ref.ID, "routikite", 0xc80000, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Redstone, 30).put(Pyrite, 10).put(Cinnabar, 5).put(Chromfasmesh, 3).put(Ruby, 2));
    public static Material Coprax = new Material(Ref.ID, "coprax", 0x1782cf, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Malachite, 5).put(CupricOxide, 10).put(Azurite, 7).put(Turquoise, 2).put(Larimar, 1));
    public static Material Copantiselem = new Material(Ref.ID, "copantiselem", 0x464646, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Stibinite, 3).put(Tetrahedrite, 5).put(Krutaite, 2).put(Penroseite, 2).put(Eskebornite, 2));
    public static Material Copaorc = new Material(Ref.ID, "copaorc", 0x2b373b, SHINY).asDust(ORE, ORE_SMALL).mats(of(Cuchalpyria, 2, Coprax, 2, Copantiselem, 1, Supotras, 1));
    public static Material Cleysti = new Material(Ref.ID, "cleysti", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Kaolinite, 12).put(Glauconite, 8).put(Garnierite, 6).put(BrownLimonite, 10).put(YellowLimonite, 10));
    public static Material Tellurides = new Material(Ref.ID, "tellurides", 0xf2ebf2, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Calaverite, 3).put(Sylvanite, 2).put(Melonite, 3).put(Petzite, 3));
    public static Material Selena = new Material(Ref.ID, "selena", 0xe8e4e3, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Dzarkenite, 2).put(Trogtalite, 3).put(Clausthalite, 2).put(Eskebornite, 2).put(Ferroselite, 1));
    public static Material Selebi = new Material(Ref.ID, "selebi", 0x94948f, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Krutaite, 3).put(Penroseite, 3).put(Trogtalite, 3).put(Drysdallite, 2).put(Tiemannite, 1));
    public static Material Selenides = new Material(Ref.ID, "selenides", 0x57ba7f, SHINY).asDust(ORE, ORE_SMALL).mats(of(Selena, 5, Selebi, 2));
    public static Material Arcoa = new Material(Ref.ID, "arcoa", 0xccd1cb, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Gersdorffite, 3).put(Nickeline, 6).put(Safflorite, 3).put(Tennanite, 4).put(Rammelsbergite, 3));
    public static Material Arseb = new Material(Ref.ID, "arseb", 0xbf1900, SHINY).asDust(ORE, ORE_SMALL).mats(of(Sperrylite, 4, Lorandite, 8, Realgar, 12, Arsenic, 3));
    public static Material Arsorbites = new Material(Ref.ID, "arsorbite", 0xffffff, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Realgar, 12).put(Arcoa, 15).put(Arseb, 15).put(ArsenoPyrite, 10).put(Glaucodot, 4));
    public static Material Phosphirite = new Material(Ref.ID, "phosphirite", 0xffff00, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Xenotime, 2).put(Phosphor, 10).put(Phosphorus, 10).put(Apatite, 6).put(Phosphate, 10));
    public static Material Iora = new Material(Ref.ID, "iora", 0x140f05, SHINY).asDust(ORE, ORE_SMALL).mats(of(Iodine, 5, IodineSalt, 5, SilverIodide, 3, Lautarite, 4));
    public static Material MagnetBan = new Material(Ref.ID, "magnet_ban", 0x1e1e1e, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Magnetite, 10).put(Vanadinite, 2).put(Ilmenite, 4).put(Chromite, 5).put(BandedIron, 10));
    public static Material Irocey = new Material(Ref.ID, "irocey", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(BrownLimonite, 12).put(YellowLimonite, 12).put(Glauconite, 8).put(Ferrosilite, 3).put(BandedIron, 4));
    public static Material Feragem = new Material(Ref.ID, "feragem", 0x96ff96, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Andradite, 4).put(Tanzanite, 3).put(Obsidian, 4).put(Olivine, 10).put(Amethyst, 5));
    public static Material Iraore = new Material(Ref.ID, "iraore", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Siderite, 4).put(Bornite, 4).put(Chalcocite, 4).put(Ferrite, 4).put(Ferberite, 4));
    public static Material Irbore = new Material(Ref.ID, "irbore", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Epidote, 4).put(FerricChloride, 6).put(FerrousChloride, 5).put(Hercynite, 4));
    public static Material Ircore = new Material(Ref.ID, "ircore", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(FerriteMixture, 1).put(Tetrahedrite, 5).put(TigerIron, 2).put(Rhodonite, 2).put(Irbore, 10));
    public static Material NativeMetal = new Material(Ref.ID, "native_metal", 0xff6400, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Copper, 5).put(Gold, 3).put(Silver, 3).put(PlatinumGroupSludge, 2).put(Electrum, 3));
    public static Material Quarcaus = new Material(Ref.ID, "quarcaus", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Amethyst, 4).put(Citrine, 2).put(CertusQuartz, 3).put(Reibeckite, 3).put(Onyx, 4));
    public static Material Quarbus = new Material(Ref.ID, "quarbus", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(RedJasper, 5).put(GreenJasper, 5).put(YellowJasper, 5).put(BlackJasper, 5).put(BrownJasper, 5));
    public static Material Quca = new Material(Ref.ID, "quca", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(TigerIron, 2).put(TigersEye, 5).put(MossAgate, 5).put(Agate, 5).put(Chrysoprase, 5));
    public static Material Quchal = new Material(Ref.ID, "quchal", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).mats(of(ChromeChalcedony, 4, Chalcedony, 2, Olivine, 4, Moissanite, 3));
    public static Material Qyrz = new Material(Ref.ID, "qyrz", 0xe6d2d2, SHINY).asDust(ORE, ORE_SMALL).mats(of(Quartz, 20, Quarcaus, 5, Quarbus, 5, Quca, 5, Quchal, 5));
    public static Material Antimonides = new Material(Ref.ID, "antimonides", 0x464646, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Aurostibite, 2).put(Geversite, 5).put(Livingstonite, 1).put(Stibinite, 5).put(Tetrahedrite, 5));
    public static Material Nercury = new Material(Ref.ID, "nercury", 0x960000, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Terlinguaite, 4).put(Cinnabar, 20).put(Arquerite, 8).put(Tiemannite, 6).put(Livingstonite, 5));
    public static Material Jaa = new Material(Ref.ID, "jaa", 0x3af284, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(WhiteJade, 3).put(NephriteJade, 5).put(BlackJade, 4).put(GreenJade, 4).put(PurpleJade, 1));
    public static Material Alumic = new Material(Ref.ID, "alumic", 0x0b0f0b, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Retaigam, 8).put(Jaa, 6).put(LutiReck, 6).put(Berlenisti, 3).put(Lapi, 3));
    public static Material Aklumina = new Material(Ref.ID, "aklumina", 0x80c8f0, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Agaluminabaux, 30).put(Alubi, 5).put(Lapi, 5).put(Alumic, 5).put(Alumprere, 3));
    public static Material Iore = new Material(Ref.ID, "iore", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(MagnetBan, 15).put(Irocey, 15).put(Feragem, 5).put(Pyrisulf, 4).put(Jaa, 5));
    public static Material Alkali = new Material(Ref.ID, "alkali", 0xe1dcff, SHINY).asDust(ORE, ORE_SMALL).addTools(9.0F, 590, 3).mats(b -> b.put(Lithium, 8).put(Sodium, 12).put(Potassium, 6).put(Caesium, 2));
    public static Material Sulfurkang = new Material(Ref.ID, "sulfurkang", 0xfafafa, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(PotasiumPersulfate, 5).put(PotassiumBisulfate, 5).put(PotassiumSulfide, 5).put(PotassiumPyrosulfate, 5).put(Alkali, 3));
    public static Material Sufisulf = new Material(Ref.ID, "sufisulf", 0xc8c800, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Sulfurkang, 5).put(Supotras, 3).put(Sufca, 3).put(Sutrans, 3).put(Sulfur, 10));
    public static Material Juaswas = new Material(Ref.ID, "juaswas", 0xffc8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Alkali, 10).put(Alkaline, 8).put(Buckre, 4).put(Metalloids, 3).put(Alumina, 20));
    public static Material Metlas = new Material(Ref.ID, "metlas", 0xc8c8c8, SHINY).asDust(ORE, ORE_SMALL).mats(b -> b.put(Augustimic, 2).put(Riemaswet, 4).put(Juaswas, 3).put(Ferousnasite, 10).put(Molnihatcrium, 3));
    //endregion

    //region Ore By-Products

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
