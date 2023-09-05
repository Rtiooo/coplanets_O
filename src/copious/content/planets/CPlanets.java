package copious.content.planets;
import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.type.Planet;
import mindustry.world.meta.Env;

public class CPlanets {
    public static Planet tantros;
    public static void load() {
        tantros = new Planet("tantros", Planets.sun, 1f, 2){{
            generator = new CTantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            alwaysUnlocked = true;
            atmosphereColor = Color.valueOf("5b5b80");
            iconColor = Color.valueOf("597be3");
            cloudMeshLoader = () -> new MultiMesh(
                new HexSkyMesh(this, 1, 0.15f, 0.14f, 5, Color.valueOf("9fa8d1").a(0.75f), 2, 0.42f, 1f, 0.43f),
                new HexSkyMesh(this, 5, 0.6f, 0.15f, 5, Color.valueOf("a2a2a8").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
            startSector = 10;
            atmosphereRadIn = 0.2f;
            atmosphereRadOut = 0.5f;
            defaultEnv = Env.underwater | Env.terrestrial;
            hiddenItems.addAll(Items.serpuloItems).addAll(Items.erekirItems);
            ruleSetter = r -> {

            };
        }};
    }
}
