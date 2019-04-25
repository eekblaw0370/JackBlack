
/**
 * Side game, not real
 * Created by Aidan Li.
 */
import java.util.*;
public class war
{
    public static void main(String[] args)throws Exception{
        Scanner blarg=new Scanner(System.in);
        System.out.println("Choose game mode:");
        System.out.println("r - real game");
        System.out.println("anything else - quick game");
        if(blarg.nextLine().equals("r"))real();
        else quick();
        }
    public static void real()throws Exception{
        Card humbug; Card commull;
        int c=0;
        Deck duck=new Deck();
        Scanner bloop=new Scanner(System.in);
        ArrayList<Card> humdrum=new ArrayList<Card>();
        ArrayList<Card> compstomp=new ArrayList<Card>();
        ArrayList<Card> hold=new ArrayList<Card>();
        while(!duck.isEmpty()){
            if(c%2==0)humdrum.add(duck.deal());
            else compstomp.add(duck.deal());
            c++;
        }
        c=0;
        System.out.print("Computer is dealing cards");dot();
        while(compstomp.size()>0 && humdrum.size()>0){
            commull=compstomp.remove(humdrum.size()-1);
            System.out.println("Computer played "+commull);
            System.out.println("Press enter to play from your hand.");
            bloop.nextLine();
            humbug=humdrum.remove(humdrum.size()-1);
            System.out.println("Human played "+humbug);
            if(humbug.getRank()>commull.getRank()){
                System.out.println("You won: ");
                System.out.print(commull+" ");
                for(int l=0;l<hold.size();l++){
                    
                }
            }
            else if(commull.getRank()>humbug.getRank()){
            }
            else{
            }
        }
    }
    public static void quick()throws Exception{
        Random randi=new Random();
        System.out.print("Creating cards");dot();
        System.out.print("Shuffling deck"); dot();
        System.out.print("Dealing cards");dot();
        System.out.print("Playing game");dot();
        if(randi.nextInt(2)==1){System.out.println("Human wins!");}
        else{System.out.println("Computer wins!");}}
        
        public static void dot()throws Exception{
            for(int i=0;i<4;i++){Thread.sleep(1000);System.out.print(".");}
        System.out.println();
    }
    }