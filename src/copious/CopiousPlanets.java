package copious;
import arc.util.*;
import mindustry.mod.*;
import copious.content.*;
import copious.content.planets.*;
import copious.content.planets.tantros.TantrosSectorPresets;
public class CopiousPlanets extends Mod {

    public CopiousPlanets(){
    }

    @Override
    public void loadContent(){
        Log.info("Coplanets loading starting");
        CPlanets.load();
        CBlocks.load();
        TantrosSectorPresets.load();
        Log.info("Coplanets loading finished");
    }

}