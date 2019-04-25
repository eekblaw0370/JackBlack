
/**
 * Lemme give you a goofy spiel.
 * Created by Aidan Li
 */
import java.util.*;
public class goofspiel{
    public static void main(String[] args){
        Scanner choicer=new Scanner(System.in);    //the choice is yours
        ArrayList<String> suits=new ArrayList<String>();
        suits.add("diamonds");suits.add("hearts"); //what fancy suits you have!
        suits.add("clubs"); suits.add("spades");   //The better to scam you with, my dear!
        ArrayList<Integer> thedeck=new ArrayList<Integer>();
        ArrayList<Integer> hhand=new ArrayList<Integer>();
        ArrayList<Integer> chand=new ArrayList<Integer>();
        for(int i=1;i<=13;i++){thedeck.add(i); hhand.add(i); chand.add(i);}   //this be the stuff
        Collections.shuffle(thedeck);             //Guess what this does
        boolean yessir=false;                     //I actually forgot what this does
        int choice=0, cbid=0, hbid=0;             //The bids
        int temp=0;                               //It's okay, mom, it's temporary
        Random randy=new Random();                //wow! look at all these handy variables!
        String hsuit="", csuit="", dsuit="";
        int sparklebag=0;                         //deploy the sparkebag
        int h=0,c=1, pval=0;
        int prize;
        int hscore=0,cscore=0;
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
        csuit=suits.remove(randy.nextInt(2));
        dsuit=suits.get(randy.nextInt(1));
        printvs(hsuit,csuit);
        for(int i=0;i<13;i++){
            prize=thedeck.remove(randy.nextInt(thedeck.size()));  //2 levels of random
            System.out.println("Current prize: "+prize+" of "+dsuit);
            System.out.println("Here are your bid options: ");
            for(int n:hhand){System.out.println(n+" ");}
            System.out.println("Choose a number to bid.");
            while(true){
            hbid=choicer.nextInt();
            if(hhand.contains(hbid))break;
            else print("You fool! Choose again!");
           }
           temp=randy.nextInt(2)+prize-1;
           if(chand.contains(temp)){cbid=chand.remove(chand.indexOf(temp));}
           else if(temp<prize){
               while(true){
                   
                }
           }
           else{
               
            }
           System.out.println("Computer's bid: "+cbid+" of "+csuit);
           if(hbid>cbid){
               hscore+=prize+sparklebag; sparklebag=0;
            }
           else if(cbid>hbid){
               cscore+=prize+sparklebag; sparklebag=0;
            }
           else{
               sparklebag+=prize;
               System.out.println("Tie bid. Bonus prize is now at "+sparklebag);
            }
           
        }
        System.out.println();
        if(hscore==cscore){System.out.println("Tie!");}
        else if(hscore>cscore){System.out.println("Human wins!");}
        else{System.out.println("Computer wins!");}
    }
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
    public static void print(String s){System.out.println(s);}
}
