//Author: Padraic Darby

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueenSimulation{
   public static void main(String[] args){
  
   //declarization of variables
   Scanner in = new Scanner(System.in);
   LinkedStack<Queen> qstack = new LinkedStack();
   int n, solutions;
   Queen comp;
   
   LinkedStack<Queen> tstack = new LinkedStack();
   
   n = 0;
   solutions = 0;
   Queen q = new Queen(1,1);
   
   while(n<3){
      
      try{
         System.out.print("Please input the length of the board: ");
         n = in.nextInt();
         System.out.println();
      }
   
      catch(InputMismatchException e){
         System.out.println("Incorrect data has been passed in");
         in.nextLine();
      }
   }
 
   //main loop
   for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
         
       qstack.push(new Queen(i,j));
      
      //checks for conflicts     
      
      if(qstack.size() > 1){
         
         for(int k = qstack.size(); k >= 2; k--){
            
            comp = qstack.itemAt(k);
            
            if(comp.conflict(qstack.peek()))
               qstack.pop();
               
         }
         
      }
      
      if(qstack.size() == 5){
            solutions++;
            System.out.println("solution " + solutions + ": ");
      
            for(int k = 1; k <= qstack.size(); k++){
            System.out.println(qstack.itemAt(k).toString());
            }

         }
         
       if(qstack.size() == 5){
            
         qstack.pop();
            
         i = qstack.peek().getX();
         j = qstack.peek().getY();
         
         System.out.println(i + " : " + j);
            
         qstack.pop();
       }
       
       if((j == 5) && (qstack.size() != i) && (qstack.size() >= 2)){
         
         qstack.pop();
         
         i = qstack.peek().getX();
         j = qstack.peek().getY();
         
         qstack.pop();
         

                  
       }
      
      }
      
   }// end of loop
   
   /*
   System.out.println("solution 1: ");
   
   for(int i = 1; i <= qstack.size(); i++){
      System.out.println(qstack.itemAt(i).toString());
   }
   */
   
   System.out.println();
   System.out.println("Thank you for using this program");
   }
}