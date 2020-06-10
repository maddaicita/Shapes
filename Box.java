
package ShapesInheritance;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Box extends shapes 
{
    public String name=" ";
 //:::::::  Constructor   ::::::::::::
    public Box()
    {
   
    name="Box";
    }
    

   //:::::::  Draw the shape Box  ::::::::::::
 @Override
  public void printShapeN()
   {
   
   int lenght1=this.getLenght();   // the size of the shape
   char Character1=this.getCharacter();  // contains the character you want to use to draw the shape
   FilesManager check = new FilesManager ();
   check.createAndCheckFile();
        FileWriter box = null;
        try {
            box = new FileWriter("shape.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printBox=new PrintWriter(box);
        System.out.println("Here is your Box : ");
    
     
      for(int i = 1; i <= lenght1; i++)
		{
			for(int j = 1; j <= lenght1; j++)
			{
				if(i == 1 || i == lenght1 || j == 1 || j == lenght1)
				{
					System.out.print(Character1); 
                                          printBox.print(Character1);
				}
				else
				{
					System.out.print(" ");
                                         printBox.print(" ");
				}
                        
			}
                        
			System.out.print("\n"); 
                         printBox.print("\n");
                         
		}
        try {
            box.close();
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
  public void PutShapeInside (Box box)
  {
  
   objList.add(box);
        
        System.out.println("Unsorted"); 
        for (int i=0; i<objList.size(); i++)
       {
            System.out.println(objList.get(i));
       } 
  
        
        //Collections.sort(objList, new SortByLenght()); 
  
        System.out.println("\nSorted by Lenght"); 
        for (int i=0; i<objList.size(); i++) {
            System.out.println(objList.get(i));
            
        }
        int count = 0;
     count++;
     System.out.println(count); 
  }
 
    @Override
   public String toString(){ 
  return " Has Guardado un  "+name+" with a size of  "+lenght;  
 }  
}
