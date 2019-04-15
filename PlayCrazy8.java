
/**
 * Write a description of class crazy8Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class PlayCrazy8
{
   public static void main (String[] args){
   
       crazy8 craz = new crazy8();
       ArrayList<String> Decks = new ArrayList<String>();
       Decks = craz.getDeck();
       List Deck1 = Decks.subList(0,5);
       System.out.println("Here is your deck: \n" + Deck1);
       
       
       
       
       
   }
}