package copious.content.planets;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.type.Planet;
import mindustry.world.meta.Env;

public class CPlanets {
    public static Planet tantros;

    public static void load() {
        tantros = new Planet("tantros", Planets.sun, 1f, 2){{
            generator = new CTantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            alwaysUnlocked = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
    }
}
