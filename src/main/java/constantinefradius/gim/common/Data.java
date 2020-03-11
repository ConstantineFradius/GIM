package constantinefradius.gim.common;

import constantinefradius.gim.Ref;
import muramasa.antimatter.ore.StoneType;
import muramasa.antimatter.texture.Texture;
import net.minecraft.block.SoundType;
import static constantinefradius.gim.data.Materials.*;

public class Data {
    public static StoneType TESTROCK = new StoneType(Ref.ID, "testrock", Testrock, new Texture(Ref.ID, "block/stone/testrock"), SoundType.STONE, true);

    public static void init() {

    }
}
