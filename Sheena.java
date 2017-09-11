/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheena;

import java.util.Scanner;

/**
 *
 * @author PETER created on 10/9/2017
 */
public class Sheena 
{
void Replies()
{
    String S1;
    System.out.println("Hii my name is Sheena");
    System.out.println("How may i help you");
    Scanner Sc=new Scanner(System.in);
    S1=Sc.nextLine();
    if(S1.equals("what is your name"))
    {
        System.out.println("My name is Sheena v 1.0");
    }
    else
            {
                System.out.println("Iam unable to get you");
                
            }
}
void Help()
{
    System.out.println("You may ask me Anything if I knw surely i will Help you with that ");
}
    
   
    public static void main(String[] args) 
    {
     Sheena obj=new Sheena();
     obj.Replies();
    }
    
}
