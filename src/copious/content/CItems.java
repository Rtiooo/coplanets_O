package copious.content;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.type.Item;
import mindustry.type.Planet;

public class CItems {
    // titanium, sand, thorium and silicon are already in the game
    public static Item iron, nickel, quartz, salt, aluminium, glass, titanium, sand, thorium, silicon;
    public static Planet[] bannedOnPlanets = {Planets.erekir, Planets.serpulo};
    
    public static void load() {
        iron = new Item("iron", Color.white){{
            buildable = true;
            cost = 0.5f;
            hardness = 1;
            alwaysUnlocked = true;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        nickel = new Item("nickel", Color.white){{
            buildable = true;
            cost = 1;
            hardness = 1;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        quartz = new Item("quartz", Color.white){{
            buildable = true;
            cost = 1.3f;
            hardness = 2;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        salt = new Item("salt", Color.white){{
            //COPI CAN WE BUILD WITH SALT
            buildable = false;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        aluminium = new Item("aluminium", Color.white){{
            buildable = true;
            cost = 2;
            hardness = 2;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        glass = new Item("glass", Color.white){{
            buildable = true;
            cost = 1.5f;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        titanium = new Item("titanium", Color.white){{
            buildable = true;
            cost = 1.5f;
            hardness = 3;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        sand = new Item("sand", Color.white){{
            buildable = false;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        thorium = new Item("thorium", Color.white){{
            buildable = true;
            hardness = 4;
            explosiveness = 1.5f;
            cost = 2;
            hiddenOnPlanets = bannedOnPlanets;
        }};

        silicon = new Item("silicon", Color.white){{
            buildable = true;
            cost = 1.5f;
            hiddenOnPlanets = bannedOnPlanets;
        }};
    } 
}
