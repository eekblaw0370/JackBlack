import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BlackoutTester
{
    Blackout test = new Blackout();

    public BlackoutTester()
    {
        Scanner reader = new Scanner(System.in);
       System.out.println("Enter 1. Play");
       System.out.println("Enter 2. Rules"); 
       int x = reader.nextInt();
       
       if(x==2) Rules();
       
       
    }

    
    
}
