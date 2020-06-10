
package ShapesInheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BoxX extends shapes 

{
    public String name=" ";
    
    //:::::::  Constructor   ::::::::::::
    public BoxX()
    {
    
    name="BoxX";
    }
    
    //:::::::  Draw the shape Box with X inside  ::::::::::::
   
 @Override
  public void printShapeN()
   {
        int lenght1=this.getLenght();// the size of the shape
       char Character1=this.getCharacter();// contains the character you want to use to draw the shape
      FilesManager check = new FilesManager ();
      check.createAndCheckFile();
     
        FileWriter boxX = null;
        try {
            boxX = new FileWriter("shape.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(BoxX.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printBoxX =new PrintWriter(boxX);
           System.out.println("Here is your Box with an X inside : ");

      for (int i = 0; i < lenght1; i++) { 
        for (int j = 0; j < lenght1; j++) { 
            if (i == 0 || i == lenght1 - 1 ||  
                j == 0 || j == lenght1 - 1 ||  
                i == j || i == lenght1- 1 - j) 
              
          {
              System.out.print(Character1);
              printBoxX.print("Character1");
          }
          else 
            {
           System.out.print(" ");
           printBoxX.print(" ");
            }
 
      }
       System.out.println(" ");
       printBoxX.println(" ");
      }
      System.out.println(" ");
      printBoxX.println(" ");
        try {
            boxX.close();
        } catch (IOException ex) {
            Logger.getLogger(BoxX.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
  }
  
 public void PutShapeInside (BoxX boxX)
  {
  
   objList.add(boxX);
        
          System.out.println("Guardado en la lista"); 
        for (int i=0; i<objList.size(); i++) {
            System.out.println(objList.get(i));
            
        }
  
  }
 @Override
   public String toString(){ 
  return " Has Guardado un  "+name+" with a size of  "+lenght;  
 }  
  
}
