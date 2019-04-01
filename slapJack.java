
/**
 * Can you beat extreme level???
 * Created by Aidan Li
 */
import java.util.*;
public class slapJack
{public static void play(){
    Deck dock=new Deck();
    ArrayList<Card> human=new ArrayList<Card>();
    ArrayList<Card> computer=new ArrayList<Card>();
    difmenu();
}
public static int difmenu(){
    int num=-1;
    while(num<0 || num>4){
    print("Choose a computer difficulty.");
    print("0 - baby. You probably don't even have to try.");
    print("1 - 6 year old. He just learned the game, so go easy on him.");
    print("2 - 16 year old. He's played the game a few times.");
    print("3 - 40 year old. A veteran of the game.");
    print("4 - Jack, the world slapjack champion. You will lose.");
    Scanner get=new Scanner(System.in);
    num=get.nextInt(); if(num<0 || num>4){print("No! Not an option!");}
}
return num;
}
public static void rules(){
    print(slopjock()+"is a game of reflexes.");
    print("The goal of the game is to bankrupt the other");
    print("player of their cards.");
    print("Players will alternate putting down cards from their pile");
}
public static String vowel(){
    ArrayList<String> vowels=new ArrayList<String>();
    vowels.add("a"); vowels.add("e"); vowels.add("i"); 
    vowels.add("o"); vowels.add("u"); vowels.add("y");
    return vowels.get(new Random().nextInt(6));
}
public static String slopjock(){
    return "Sl"+vowel()+"pj"+vowel()+"ck";
}
public static void print(String s){System.out.println(s);}
}
