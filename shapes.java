
package ShapesInheritance;



import java.util.ArrayList;
import java.util.Scanner;



public abstract class shapes implements InterfaceList   {
   
   int lenght;
   char Character;
   
   public ArrayList<shapes> objList = new ArrayList<>();
  
  
 //::::::::   Constructor   ::::::::
   
 public shapes()
  {
    
 lenght=0;
 Character=0;

  } 
   
 //:::::::   Getter/Setters   ::::::::
 

   public int getLenght()
   {
       
   Scanner input= new Scanner(System.in);
   System.out.println("Please Select the Lenght of the Shape ");
   lenght=input.nextInt();
       return lenght;
   
   }
   
   

   public void setLenght(int lenght1)
   {
   lenght=lenght1;
   
   }
   
   

  public char getCharacter()
   {
       Scanner input= new Scanner(System.in);
       System.out.println("Please enter the Character to draw the Shape");
      Character= input.next().charAt(0); 
        return Character;
   }
  
  

   public void setWidht(char Character1)
   {
 Character=Character1;
   
   }
    
   
   
 // ::::::::  Abstract Functions to Draw the child shapes  ::::::::
   @Override
    public abstract void printShapeN();
   @Override
    public abstract String toString();

   
    

    
   
}

       
   
   

   
   
   
   