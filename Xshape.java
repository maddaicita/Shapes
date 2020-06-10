
package ShapesInheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Xshape extends shapes 
{
    public String name=" ";
    
     //:::::::  Constructor   ::::::::::::
    public Xshape()
    {
    name="Xshape";
    }
   
    
    
   @Override
  public void printShapeN() 
      {
       
       int lenght1=this.getLenght();// the size of the shape
       char Character1=this.getCharacter();// contains the character you want to use to draw the shape
       FilesManager check = new FilesManager ();
       check.createAndCheckFile();
   
        FileWriter X = null;
        try {
           X = new FileWriter("shape.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(Triangle.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printX=new PrintWriter(X);
        System.out.println("Here is your X shape : ");
            
            for(int i=0;i<lenght1;i++)
            {
                for(int j=0;j<lenght1;j++)
                {
                    if((i==j)||(i+j==lenght1-1))
                    {
                        System.out.print(Character1);
                        printX.print(Character1);
                    }
                    else
                    {
                        System.out.print(" ");
                        printX.print(" ");
                    }
                }
                
                System.out.println();
                printX.println();
            }} 
  
 
  public void PutShapeInside (Xshape x)
  {
  
   objList.add(x);
   System.out.println("Guardado en la lista"); 
        for (int i=0; i<objList.size(); i++) 
        {
            System.out.println(objList.get(i));
            
        }
  }


    @Override
   public String toString(){ 
  return " Has Guardado un  "+name+" with a size of  "+lenght;  
 }  
  
}
  
   
 
   
   
   
   
   
   

