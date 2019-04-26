
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
        Deck duck=new Deck(), humdrum=new Deck(true), compstomp=new Deck(false), hold=new Deck(true);
        Scanner bloop=new Scanner(System.in);
        while(!duck.isEmpty()){
            if(c%2==0)humdrum.addcard(duck.deal());
            else compstomp.addcard(duck.deal());
            c++;
        }
        humdrum.bettershuffle();
        compstomp.bettershuffle();
        c=0;
        System.out.print("Computer is dealing cards");dot();
        while(compstomp.size()>0 && humdrum.size()>0){
            if(hold.size()>0)System.out.println("Hold contains: "+hold);
            commull=compstomp.deal();
            System.out.println("Computer played "+commull);
            System.out.println("Press enter to play from your hand.");
            bloop.nextLine();
            humbug=humdrum.deal();
            System.out.println("You played "+humbug);
            if(humbug.getRank()>commull.getRank()){
                System.out.println("You won the battle.");
                humdrum.addcard(humbug);
                humdrum.addcard(commull);
                hold.clear();
            }
            else if(commull.getRank()>humbug.getRank()){
                System.out.println("Computer won the battle.");
                compstomp.addcard(humbug);
                compstomp.addcard(commull);
                hold.clear();
            }
            else{
                System.out.println("The battle came to a stalemate. Both cards have gone into the hold.");
                hold.addcard(humbug); hold.addcard(commull);
            }
        }
        if(humdrum.size()>0)System.out.println("Human won.");
        if(compstomp.size()>0)System.out.println("Computer won.");
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