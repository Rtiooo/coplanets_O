package copious.content.planets.tantros;
import arc.graphics.Color;
import arc.math.Mathf;
import arc.math.geom.Vec3;
import arc.util.Tmp;
import arc.util.noise.Simplex;
import mindustry.maps.generators.PlanetGenerator;

public class CTantrosPlanetGenerator extends PlanetGenerator {
    public float rawHeight(Vec3 position){
        position = Tmp.v33.set(position).scl(2f);
        return (Mathf.pow(Simplex.noise3d(seed, 7, 0.5f, 1f/3f, position.x, position.y, position.z), 2.3f)) / (1f);
    }


    @Override
    public float getHeight(Vec3 position){
        return 0f;
    }

    @Override 
    public Color getColor(Vec3 position) {
        return rand.nextFloat() > 0.5 ? Color.valueOf("00008b") : Color.valueOf("4444db");
    }
}