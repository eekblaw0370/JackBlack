
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
        Deck hhand=new Deck(true);   //boolean doesn't actually do anything
        Deck thedeck=new Deck(false);
        Deck chand=new Deck(true);
        String um="";
        System.out.println("Do you know how to play Goofspiel? (y/not y)");
        um=choicer.nextLine();
        if(um.substring(0,1).toLowerCase().equals("y")){
            System.out.println("Let's just jump into it then.");
        System.out.println();}
        else{rules();System.out.println("Press enter to continue");choicer.nextLine();}
        System.out.println();
        thedeck.shuffle();
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
        bigwin.printvs(hsuit,csuit);
        for(int i=0;i<13;i++){
            System.out.println("Round "+(i+1));
            prize=thedeck.remove(randy.nextInt(thedeck.size()));  //2 levels of random
            System.out.println("Current prize: "+prize+" of "+dsuit);
            System.out.print("Here are your bid options: ");
            for(int n:hhand){System.out.print(n+" ");}
            System.out.println();
            System.out.println("Choose a number to bid.");
            while(true){
            hbid=choicer.nextInt();
            if(hhand.contains(hbid))break;
            else System.out.println("You fool! Choose again!");
           }
           hhand.remove(hhand.indexOf(hbid));
           temp=randy.nextInt(2)+prize+sparklebag-1;        //range of choices
           if(chand.contains(temp)){cbid=chand.remove(chand.indexOf(temp));}
           else if(temp<prize){  //wow this is harder than I thought it would be
               for(int z=chand.size()-1;z>=0;z--){     //umm these do something probably
                   if(chand.get(z)<temp){
                       cbid=chand.remove(z); break;
                    }
                   if(z==0){
                       cbid=chand.remove(z); break;
                    }
                }
           }
           else{
               for(int z=0;z<chand.size();z++){
                   if(chand.get(z)>temp){
                       cbid=chand.remove(z); break;
                    }
                   if(z==chand.size()-1){
                       cbid=chand.remove(z); break;
                    }
                }
            }
           System.out.println("Computer's bid: "+cbid+" of "+csuit);
           if(hbid>cbid){
               hscore+=prize+sparklebag; 
               System.out.println("You won the "+prize+" of "+dsuit+".");
               if(sparklebag!=0){System.out.println("Bonus: "+sparklebag);}
               sparklebag=0;
            }
           else if(cbid>hbid){
               cscore+=prize+sparklebag; 
               System.out.println("Computer won the "+prize+" of "+dsuit+".");
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
