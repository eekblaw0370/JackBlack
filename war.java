
/**
 * Side game, not real
 * Created by Aidan Li.
 */
import java.util.Random;
public class war
{
    public static void main(String[] args)throws Exception{
        Random randi=new Random();
        System.out.print("Creating cards");dot();
        System.out.print("Shuffling deck"); dot();
        System.out.print("Dealing cards");dot();
        System.out.print("Playing game");dot();
        if(randi.nextInt(2)==1){System.out.println("Human wins!");}
        else{System.out.println("Computer wins!");}}
        
        public static void dot()throws Exception{
            for(int i=0;i<4;i++){Thread.sleep(1000);System.out.print(".");}
        System.out.println();}
    }