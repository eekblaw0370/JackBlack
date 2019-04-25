
/**
 * Lemme give you a goofy spiel.
 * Created by Aidan Li
 */
import java.util.*;
public class goofspiel{
    public static void main(String[] args){
        Scanner choicer=new Scanner(System.in);
        ArrayList<String> suits=new ArrayList<String>();
        suits.add("diamonds");suits.add("hearts"); 
        suits.add("clubs"); suits.add("spades");
        boolean yessir=false;
        int choice=0, cbid=0, hbid=0;
        Random randy=new Random();                //wow! look at all these handy variables!
        String hsuit="", csuit="";
        int h=0,c=1, pval=0;
        Card prize;
        int hscore=0,cscore=0;
        int[][] hands=new int[2][13];
        while(hsuit!="diamonds" && hsuit!="hearts" && hsuit!="clubs" && hsuit!="spades"){
            System.out.println("Choose your suit. (d/h/c/s)");
            hsuit=choicer.nextLine();
            switch(hsuit){
                case "d": hsuit=suits.remove(0); break;
                case "h": hsuit=suits.remove(1); break;
                case "c": hsuit=suits.remove(2); break;
                case "s": hsuit=suits.remove(3); break;
                default: System.out.println("Nein! Dost thou not know the meaning of words?"); break;
            }
        } 
        csuit=suits.get(randy.nextInt(2));
        printvs(hsuit,csuit);
        for(int n=0;n<2;n++){
            for(int i=0;i<13;i++){
                hands[n][i]=i+1;
            }
        }
        Deck pile=new Deck();
        pile.shuffle();
        for(int i=0;i<13;i++){
            prize=pile.deal();
            pval=prize.getRank();
            System.out.println("Current prize: "+prize);
            System.out.println("Here are your bid options: ");
            for(int n:hands[h]){
                if(n!=0){System.out.print(n+" ");}
                else{System.out.print("  ");}
            }
            System.out.println("Choose a number to bid.");
            while(!yessir){
            choice=choicer.nextInt();
            hbid=hands[h][choice-1];
            if(hbid!=0){yessir=true;}
            else{System.out.println("No! Not available!");}
        }
        //dostuff
        yessir=false;
        }
        System.out.println();
        if(hscore==cscore){System.out.println("Tie!");}
        else if(hscore>cscore){System.out.println("Human wins!");}
        else{System.out.println("Computer wins!");}
    }
    public static void printvs(String human, String computer){
        print("       _____             /                                               ");
        print("     _/ _ _ \\_          /       ___________                              ");
        print("    (o / | \\ o)        /       |.---------.|                             ");
        print("     || o|o ||        /        ||         ||                              ");
        print("     | \\_|_/ |       /         ||         ||                             ");
        print("     |  ___  |      /_V_S__    ||         ||                              ");
        print("     | (___) |            /    |'---------'|                              ");
        print("     |\\_____/|           /      `)__ ____('                              ");
        print("     | \\___/ |          /       [=== -- o ]--.                           ");
        print("     \\       /         /      __'---------'__ \\                         ");
        print("      \\__ __/         /      [::::::::::: :::] )                         ");
        print("                     /        `\"\"'\"\"\"\"\"'\"\"\"\"`/T\\             ");  
        print("                                             \\_/                        ");
        print("   YOU(The Goof)           COMPUTER(The Spiel)                     ");
        System.out.println("      "+human+"                    "+computer);
    }
    public static void print(String s){System.out.println(s);}
}
