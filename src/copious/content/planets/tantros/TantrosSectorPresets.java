package copious.content.planets.tantros;

import copious.content.planets.CPlanets;
import mindustry.type.SectorPreset;

public class TantrosSectorPresets {
    public static SectorPreset initiation;
    public static void load() {
        initiation = new SectorPreset("initiation", CPlanets.tantros, 10){{
            alwaysUnlocked = true;
            difficulty = 1;
            allowLaunchSchematics = false;
            allowLaunchLoadout = false;
        }};
    }
}
