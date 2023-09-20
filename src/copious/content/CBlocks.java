package copious.content;
import mindustry.world.Block;
import mindustry.world.blocks.environment.*;
public class CBlocks {
    public static Block
    //env
    testFloor, waterOverlay;

    public static void load() {
        testFloor = new Floor("testFloor"){{
            variants = 1;
        }};

        waterOverlay = new OverlayFloor("waterOverlay"){{
            variants = 1;
        }};
    }
}