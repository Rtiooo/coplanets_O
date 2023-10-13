package copious.content;
import mindustry.type.Category;
import mindustry.content.UnitTypes;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.storage.*;
import static mindustry.type.ItemStack.*;
public class CBlocks {
    public static Block
    //env
    testFloor, waterOverlay,

    //cores
    corePhotic, pelagic, hadal;

    public static void load() {
        testFloor = new Floor("testFloor"){{
            variants = 1;
        }};

        waterOverlay = new OverlayFloor("waterOverlay"){{
            variants = 1;
        }};

        corePhotic = new CoreBlock("core-photic"){{
            requirements(Category.effect, with(CItems.iron, 1500, CItems.silicon, 500, CItems.nickel, 1000));

            isFirstTier = true;
            unitType = UnitTypes.alpha;
            health = 3000;
            armor = 5f;
            itemCapacity = 2000;
            incinerateNonBuildable = true;
            size = 3;
            alwaysUnlocked = true;
            buildCostMultiplier = 0.5f;
            unitCapModifier = 8;
        }};
    }
}