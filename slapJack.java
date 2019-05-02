/**
 * Can you beat Jack???
 * Created by Aidan Li
 */
import java.util.*;
import java.io.*;
public class slapJack{
    public static boolean timeslap(int delay){
    long startTime=System.currentTimeMillis();
    Scanner slapreceiver=new Scanner(System.in);
    slapreceiver.nextLine();
    long endTime=System.currentTimeMillis();
    double elapsed=endTime-startTime;
    if(elapsed/1000<delay)return true;
    else return false;
}
    public static void play()throws Exception{
        int stomp=1000;
        System.out.println();
        Card tempcard=new Card();
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
        print("1 - play!");
        print("2 - rules");
        if(seer.nextInt()==1){}else{rules(); print("enter to start.");seer.nextLine();}
        print("Coin flip imminent. Choose wisely! (h/t)");
        seer.nextLine();
        if(seer.nextLine().equals("h")){print("Nope, it's tails.");}
        else{print("Nope it was heads.");}
        turn="c";
        c=1;
        int delay=difmenu();
        while(human.size()!=0 && computer.size()!=0){
            if(turn.equals("c")){
                Thread.sleep(stomp);
                tempcard=computer.remove(computer.size()-1);
                stack.add(tempcard);
                System.out.println("Computer played "+tempcard);
            }
            if(turn.equals("h")){
                print("Press enter to play your top card.");
                seer.nextLine();
                tempcard=human.remove(human.size()-1);
                stack.add(tempcard);
                System.out.println("You played "+tempcard);
                
            }
            if(slapisvalid(stack,c)){
                if(timeslap(delay)){
                    print("You SLAPPED before the computer!");
                }
                else{
                    print("No one slapped.");
                }
            }
            else{
                if(timeslap(delay)){
                    print("You SLAPPED! Incorrectly, it seems.");
                }
            }
            if(timeslap(delay)){
                print("You SLAPPED!");
                if(slapisvalid(stack, c)){
                    print("Hooray! You get the stack!");
                    for(Card r:stack)human.add(0,r);
                }
                else{
                    print("Boo! Give up a card to the computer!");
                    computer.add(0,human.remove(human.size()-1));
                }
            }
            else{
                print("You didn't slap.");
            }
            if(turn.equals("c")){turn="h";}else{turn="c";}
            c++; if(c>13)c=1;
        }
        if(human.size()<=0)print("Computer won.");
        else print("You won.");
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
    if(stack.size()>1){
        if(stack.get(top).getRank()==stack.get(top-1).getRank()){return true;}
    }
    if(stack.get(top).getRank()==count){return true;}
    return false;
}
public static int difmenu(){
    int num=-1, speed=0;
    while(num<0 || num>4){
    print("Choose a computer difficulty.");
    print("Note: Most of these choices are trash.");
    print("0 - baby. You probably don't even have to try.");
    print("1 - 6 year old. He just learned the game, so go easy on him.");
    print("2 - 16 year old. He's played the game a few times.");
    print("3 - 40 year old. A veteran of the game.");
    print("4 - Jack the Jock, the world "+slopjock()+" champion. You will lose.");
    Scanner get=new Scanner(System.in);
    num=get.nextInt(); if(num<0 || num>4){print("No! Not an option!");}
}   
switch(num){
    case 0: print("Do you enjoy beating babies at card games?"); speed=1000; break;
    case 1: print("You might even have to try."); speed=7;    break;
    case 2: print("Your rival. This is gonna be a close one."); speed=2;    break;
    case 3: print("Can you beat my dad?"); speed=1;    break;
    case 4: System.out.println("If you win, you will be the ultimate "+slopjock()+" champion!"); speed=0; break;
    default: print("Defaulted to 16-year old");speed=2;
}
return speed;
}
public static void rules(){
    print(slopjock()+"is a game of reflexes.");
    printc("The goal of the game is to bankrupt the other");
    printc("player of their cards.");
    print("Players will alternate putting down cards from their pile");
    printc("When a suitable sequence of cards is put down, slap (enter) that pile!");
    print("But if you slap incorrectly, you must give the other player 3 cards.");
    print("Here are some acceptable sequences:");
    print("Single Jack. It's called "+slopjock()+", after all.");
    print("Double number. If 2 of the same number in a row are put down, slap!");
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
