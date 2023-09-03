

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class CopiousPlanets extends Mod {

    public CopiousPlanets(){
    }

    @Override
    public void loadContent(){
        Planets.tantros.accessible = true;
        Planets.tantros.visible = true;
        Planets.tantros.alwaysUnlocked = true;
        Log.info("Loading some example content.");
    }

}
