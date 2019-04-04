/**
 * Can you beat Jack???
 * Created by Aidan Li
 */
import java.util.*;
public class slapJack{
    public static void play(){
    System.out.println();
    Deck dock=new Deck(); Scanner seer=new Scanner(System.in); String turn="h";
    for(int i=0;i<7;i++){dock.shuffle();} //for very thorough shuffling. 
    ArrayList<Card> human=      new ArrayList<Card>();
    ArrayList<Card> computer=   new ArrayList<Card>();
    ArrayList<Card> stack=      new ArrayList<Card>();
    int c=0;
    while(!dock.isEmpty()){ //deal out the cards
        if(c%2==0){human.add(dock.deal());}
        else{computer.add(dock.deal());}c++;
    } 
    print("Coin flip imminent. Choose wisely! (h/t)");
    if(seer.nextLine().equals("h")){print("Nope, it's tails.");}
    else{print("Nope it was heads.");}
    turn="c";
    c=0;
    difmenu();
    while(human.size()!=0 && computer.size()!=0){
        if(turn.equals("c")){
        }
        if(turn.equals("h")){
        }
        if(turn.equals("c")){turn="h";}else{turn="c";}
    }
}
public static int openmenu(){
    print("Choose:");
    print("1 - Play game");
    print("2 - See rules");
    return 2;
}
public static boolean slapisvalid(ArrayList<Card> stack, int count){
    int top=stack.size()-1;
    if(stack.get(top).getRank()==11){return true;}
    if(stack.get(top).getRank()==stack.get(top-1).getRank()){return true;}
    if(stack.get(top).getRank()==stack.get(top-2).getRank()){return true;}
    if(stack.get(top).getRank()==count){return true;}
    if(stack.size()<3){}
    if(stack.size()<2){}
    return false;
}
public static int difmenu(){
    int num=-1, speed=0;
    while(num<0 || num>4){
    print("Choose a computer difficulty.");
    print("0 - baby. You probably don't even have to try.");
    print("1 - 6 year old. He just learned the game, so go easy on him.");
    print("2 - 16 year old. He's played the game a few times.");
    print("3 - 40 year old. A veteran of the game.");
    print("4 - Jack the Jock, the world "+slopjock()+" champion. You will lose.");
    Scanner get=new Scanner(System.in);
    num=get.nextInt(); if(num<0 || num>4){print("No! Not an option!");}
}   
switch(num){
    case 0: speed=-1;   break;
    case 1: speed=1;    break;
    case 2: speed=3;    break;
    case 3: speed=5;    break;
    case 4: speed=1000; break;
    default: speed=1;
}
return speed;
}
public static void rules(){
    print(slopjock()+"is a game of reflexes.");
    printc("The goal of the game is to bankrupt the other");
    printc("player of their cards.");
    print("Players will alternate putting down cards from their pile");
    printc("When a suitable sequence of cards is put down, slap that pile!");
    print("But if you slap incorrectly, you must give the other player 3 cards.");
    print("Here are some acceptable sequences:");
    print("Single Jack. It's called "+slopjock()+", after all.");
    print("Double number. If 2 of the same number in a row are put down, slap!");
    print("Sandwich. If 2 of a number have another card in between, it's still valid.");
    print("Count. Every turn the number will go up. If it matches what's put down, slap!");
    print("Press enter to play the game.");
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
public static void printc(String s){System.out.print(s);}
}
