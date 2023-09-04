package copious.content.planets;
import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.type.Planet;
import mindustry.world.meta.Env;

public class CPlanets {
    public static Planet tantros;

    public static void load() {
        tantros = new Planet("tantros", Planets.sun, 1.5f, 2){{
            generator = new CTantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            alwaysUnlocked = true;
            atmosphereColor = Color.blue;
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.5f;
            atmosphereRadOut = 0.5f;
            defaultEnv = Env.underwater | Env.terrestrial;
            hiddenItems.addAll(Items.serpuloItems).addAll(Items.erekirItems);
            ruleSetter = r -> {

            };
        }};
    }
}
