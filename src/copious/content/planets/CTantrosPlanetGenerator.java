package copious.content.planets;
import arc.graphics.Color;
import arc.math.geom.Vec3;
import mindustry.maps.generators.PlanetGenerator;
public class CTantrosPlanetGenerator extends PlanetGenerator {
    @Override
    public float getHeight(Vec3 position) {
        return 0.1f;
    }

    @Override
    public Color getColor(Vec3 position) {
        return Color.valueOf("00008b");
    }
}
