
package ShapesInheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Triangle extends shapes
{
   
      public String name=" ";
    //:::::::  Constructor   ::::::::::::
    
    public Triangle()
    {
    
    name="Triengle";
    }
    
    
 @Override
  public void printShapeN()
   {
    
   
    int size=this.getLenght();// the size of the shape
       char Character1=this.getCharacter();// contains the character you want to use to draw the shape
   FilesManager check = new FilesManager ();
   check.createAndCheckFile();
   
            FileWriter tri = null;
        try {
            tri = new FileWriter("shape.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(Triangle.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printTri=new PrintWriter(tri);
        System.out.println("Here is your Triangle : ");
       
     for (int i=0; i<size; i++) 
        { 
        for (int j=size-i; j>1; j--) 
            { 
                System.out.print(" ");
                printTri.print(" ");
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print(Character1+ " ");
                printTri.print(Character1+ " ");
            } 
  
            System.out.println();
            printTri.println();
        } 
        try {
            tri.close();
        } catch (IOException ex) {
            Logger.getLogger(Triangle.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   } 

  public void PutShapeInside (Triangle tri)
  {
  
   
         objList.add(tri);
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



