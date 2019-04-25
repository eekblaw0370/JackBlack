
/**
 * Get big win
 * Created by Aidan Li
 */
public class bigwin
{
    public static void printvs(String human, String computer){
        print("       _____             /                                         ");
        print("     _/ _ _ \\_          /       ___________                       ");
        print("    (o / | \\ o)        /       |.---------.|                      ");
        print("     || o|o ||        /        ||         ||                       ");
        print("     | \\_|_/ |       /         ||         ||                      ");
        print("     |  ___  |      /_V_S__    ||         ||                       ");
        print("     | (___) |            /    |'---------'|                       ");
        print("     |\\_____/|           /      `)__ ____('                       ");
        print("     | \\___/ |          /       [=== -- o ]--.                    ");
        print("     \\       /         /      __'---------'__ \\                  ");
        print("      \\__ __/         /      [::::::::::: :::] )                  ");
        print("                     /        `\"\"'\"\"\"\"\"'\"\"\"\"`/T\\       ");  
        print("                                             \\_/                  ");
        print("   YOU(The Goof)           COMPUTER(The Spiel)                     ");
        System.out.println("      "+human+"                    "+computer);
    }
    public static void humanwin(){
        print("   _____");
        print(" _/ _ _ \\_");
        print("(o / | \\ o)");
        print(" || o|o ||");
        print(" | \\_|_/ |");
        print(" |  ___  |");
        print(" | (___) |");
        print(" |\\_____/|");
        print(" | \\___/ |");
        print(" \\  WIN! /");
        print("  \\__ __/");
    }
    public static void compwin(){
        print("   ___________");
        print("  |.---------.|");
        print("  ||         ||");
        print("  ||   WIN!  ||");
        print("  ||         ||");
        print("  |'---------'|");
        print("   `)__ ____('");
        print("   [=== -- o ]--.");
        print(" __'---------'__ \\");
        print("[::::::::::: :::] )");
        print(" \"`\"\"'\"\"\"\"\"'\"\"\"\"`/T\\");
        print("                 \\_/");
    }
    public static void tie(){
        print("----------------   ----------------    |-----------   |   ");
        print("        |                   |          |              |   ");
        print("        |                   |          |              |   ");
        print("        |                   |          |              |   ");
        print("        |                   |          |-------       |   ");
        print("        |                   |          |              |   ");
        print("        |                   |          |              |   ");
        print("        |                   |          |              |   ");
        print("        |          ----------------    |------------  ⚫   ");
        
    }
    public static void print(String s){System.out.println(s);}
}
