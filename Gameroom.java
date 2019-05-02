
/**
 * Created by Aidan Li, Evan Ekblaw , Joe Adcock, and Toby Franklin.
 * 5/2/2019
 */
import java.util.*;
public class Gameroom{
    public static void main(String [] args)throws Exception{
        System.out.println("Welcome to the gameroom!");
        Scanner scannyboy=new Scanner(System.in);
        String[] yo=new String[] {"go"};
        int selection;
        boolean yes=false;
        while(!yes){
            System.out.println("Select a game.");
            menu();
            selection=scannyboy.nextInt();
            switch(selection){
                case 1: war.main(yo);       break;
                case 2: goofspiel.main(yo); break;
                case 3: PlayChess.main(yo); break;
                case 4: slapJack.play();    break;
                case 5: Eights.main(yo); break;
                case 6: Blackout.Blackout();break;
                default: yes=true; break;
            }
        }
    }

    public static void menu(){
        print("1 - Start off simple with war.");
        print("2 - Goofspiel: Like war, but also its complete opposite.");
        print("3 - Chess: Tired of simplicity? Too bad! This is chess!");
        System.out.println("4 - "+slapJack.slopjock()+": Tired of strategy? Too bad! This is "+
            slapJack.slopjock()+"!");
        print("5 - Ramp it up with cRaZy eIgHtS!");
        print("6 - Relive the nostalgia of WWII with Blackout.");
        print("Other numbers - Bah! I hate games!");
    }

    public static void print(String s){System.out.println(s);}
}
