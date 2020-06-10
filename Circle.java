
package ShapesInheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Circle extends shapes 
{
   
   
     public String name=" ";
     
     
     
    //:::::::  Constructor   ::::::::::::
    public Circle()
    {
    
    name="Circle";
    }

   
    
    
  //:::::::  Draw the shape Circle  ::::::::::::
 @Override
  public void printShapeN()
   {
    
  
      int lenght1=this.getLenght();// the size of the shape
       char Character1=this.getCharacter();// contains the character you want to use to draw the shape
      
       FilesManager check = new FilesManager ();
      check.createAndCheckFile();
   
   
         FileWriter cir = null;
        try {
            cir = new FileWriter("shape.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printCir=new PrintWriter(cir);
        
        System.out.println("Here is your circle");
   
     for (int i = - lenght1; i <= lenght1; i++) {
            for (int j = - lenght1; j <= lenght1; j++) {
                if (i*i + j*j <= lenght1*lenght1)
                {
                    System.out.print(Character1+ " ");
                    Shapeframe c= new Shapeframe();
                    printCir.print(Character1 + " ");
                }
                else   
                {
                    System.out.print("  ");
                printCir.print("  ");
                }
            }            System.out.println();
            printCir.println();
        }
        try {    
            cir.close();
        } catch (IOException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
 }
  
public void PutShapeInside (Circle cir)
  {
  
   objList.add(cir);
        
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
