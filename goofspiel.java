
/**
 * Lemme give you a goofy spiel.
 * Created by Aidan Li
 */
import java.util.*;
public class goofspiel{
    public static void main(String[] args){
        Scanner choicer=new Scanner(System.in);    //the choice is yours
        ArrayList<Deck> pile=new ArrayList<Deck>();
        pile.add(new Deck(Suit.diamond));   pile.add(new Deck(Suit.heart));
        pile.add(new Deck(Suit.club));      pile.add(new Deck(Suit.spade));
        Deck hhand=new Deck(false), thedeck=new Deck(false), chand=new Deck(true);//boolean useless
        String um="";                   //umm...
        boolean whatdoesthisdo=false;
        System.out.println("Do you know how to play Goofspiel? (y/not y)");
        um=choicer.nextLine();
        Card theprize;
        if(um.substring(0,1).toLowerCase().equals("y")){
            System.out.println("Let's just jump into it then.");
            System.out.println();
        }
        else{rules();System.out.println("Press enter to continue");choicer.nextLine();}
        System.out.println();
        boolean yessir=false;                     //I actually forgot what this does
        int choice=0, cbid=0, hbid=0;             //The bids
        int temp=0;                               //It's okay, mom, it's temporary
        Random randy=new Random();                //wow! look at all these handy variables!
        String hsuit="", csuit="", dsuit="";
        int sparklebag=0;                         //deploy the sparkebag
        int h=0,c=1, pval=0;
        int prize;      
        int hscore=0,cscore=0;
        while(!whatdoesthisdo){
            System.out.println("Choose your suit. (d/h/c/s)");
            hsuit=choicer.nextLine();
            switch(hsuit){
                case "d": hhand=pile.remove(0); whatdoesthisdo=true;    break;
                case "h": hhand=pile.remove(1); whatdoesthisdo=true;    break;
                case "c": hhand=pile.remove(2); whatdoesthisdo=true;    break;
                case "s": hhand=pile.remove(3); whatdoesthisdo=true;    break;
                default: System.out.println("Nein! Dost thou not know the meaning of words?"); break;
            }
        } 
        chand=pile.remove(randy.nextInt(2));
        thedeck=pile.remove(randy.nextInt(1)); 
        thedeck.shuffle();
        Card cbidc, hbidc;
        bigwin.printvs(hhand.getcard(0).getSuit().toString(),chand.getcard(0).getSuit().toString());
        for(int i=0;i<13;i++){
            System.out.println("Round "+(i+1));
            theprize=thedeck.deal();  //2 levels of random
            prize=theprize.getRank();
            System.out.println("Current prize: "+theprize);
            System.out.print("Here are your bid options: ");
            hhand.priinntt();
            System.out.println();
            System.out.println("Choose a number to bid.");
            while(true){
                while(true){
                    try{
                        hbid=Integer.valueOf(choicer.nextLine());
                        break;
                    }   
                    catch(Exception e){
                        System.out.println("Sorry, we can't accept that. We're not advanced enough.");
                    }
                }    
            if(hhand.contains(hbid))break;
            else System.out.println("You fool! Choose again!");
           }
           hbidc=hhand.removecard(hhand.indexOf(hbid));
           temp=randy.nextInt(2)+prize+sparklebag-1;        //range of choices
           if(chand.contains(temp)){
               cbidc=chand.removecard(chand.indexOf(temp));
               cbid=cbidc.getRank();
               System.out.println("Computer's bid: "+cbidc);}
           else if(temp<prize){  //wow this is harder than I thought it would be
               for(int z=chand.size()-1;z>=0;z--){     //umm these do something probably
                   if(chand.get(z)<temp){
                       cbidc=chand.removecard(z);
                       cbid=cbidc.getRank(); 
                       System.out.println("Computer's bid: "+cbidc);break;
                    }
                   if(z==0){
                       cbidc=chand.removecard(z);
                       cbid=cbidc.getRank(); 
                       System.out.println("Computer's bid: "+cbidc);break;
                    }
                }
           }
           else{
               for(int z=0;z<chand.size();z++){
                   if(chand.get(z)>temp){
                       cbidc=chand.removecard(z);
                       cbid=cbidc.getRank(); 
                       System.out.println("Computer's bid: "+cbidc);break;
                    }
                   if(z==chand.size()-1){
                       cbidc=chand.removecard(z);
                       cbid=cbidc.getRank(); 
                       System.out.println("Computer's bid: "+cbidc);break;
                    }
                }
            }
           if(hbid>cbid){
               hscore+=prize+sparklebag; 
               System.out.println("You won the "+theprize+".");
               if(sparklebag!=0){System.out.println("Bonus: "+sparklebag);}
               sparklebag=0;
            }
           else if(cbid>hbid){
               cscore+=prize+sparklebag; 
               System.out.println("Computer won the "+theprize+".");
               if(sparklebag!=0){System.out.println("Bonus: "+sparklebag);}
               sparklebag=0;
            }
           else{
               sparklebag+=prize;
               System.out.println("Tie bid. Bonus prize is now at "+sparklebag);
            }
           bigwin.print("Current scores:");
           System.out.println("You:      "+hscore);
           System.out.println("Computer: "+cscore);
           System.out.println();
        }
        System.out.println();
        if(hscore==cscore){bigwin.tie();}
        else if(hscore>cscore){bigwin.humanwin();}
        else{bigwin.compwin();}
    }
    public static void rules(){
        System.out.println("Goofspiel is simple. There will be a prize card in the middle. If you bid");
        System.out.println("higher than the opponent, you get the prize number of points. If you tie");
        System.out.println("bid, the prize will be added to the bonus area and whoever wins the next");
        System.out.println("battle will win the prize plus the bonus. Good luck!");
    }
}
