
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
        int c=0;
        Deck duck=new Deck();
        ArrayList<Card> humdrum=new ArrayList<Card>();
        ArrayList<Card> compstomp=new ArrayList<Card>();
        while(!duck.isEmpty()){
            if(c%2==0){
                humdrum.add(duck.deal());
            }
            else{
                compstomp.add(duck.deal());
            }
            c++;
        }
        System.out.print("Computer is dealing cards");dot();
        
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