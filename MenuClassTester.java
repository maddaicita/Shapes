   
package ShapesInheritance;

import java.util.Scanner;

import java.io.*;



 
public class MenuClassTester
{
   private static final Scanner input = new Scanner(System.in);
  
    public static void main(String[] args) throws IOException
    {
        
        
        int countcircle=0;
        int countbox=0;
        int countboxX=0;
        int countX=0;
        int countTriangle=0;
       
        System.out.println("Please Select the Shape You want to display");

        MenuOptions menuOptions = MenuOptions.z;

        while (menuOptions != MenuOptions.q) {  
            try
            {
                menu();
                
                
                
                menuOptions = MenuOptions.valueOf(input.nextLine());
                
                
                switch (menuOptions)
                {
                    case a:
                        //createCircle();
                        
                        Circle C =new Circle();
                        C.printShapeN();
                        C.PutShapeInside(C);
                        countcircle ++;
                        
                        break;

                    case b:
                        //createTriangle();
                        
                         Triangle T =new Triangle ();
                        T.printShapeN();
                        T.PutShapeInside(T);
                        countTriangle++;
                        
                        
                        break;

                    case c:
                        
                        // createBox();
                        
                         Box B =new Box();
                        B.printShapeN();
                        B.PutShapeInside(B);
                        countbox++;
                        
                        break;

                    case d:
                        
                         BoxX Bx =new BoxX();
                        Bx.printShapeN();
                        Bx.PutShapeInside(Bx);
                        
                        
                        countboxX++;
                        break;

                    case e:
                        // createX();
                       
                         Xshape X =new Xshape();
                        X.printShapeN();
                        X.PutShapeInside(X);
                        
                        
                        
                        countX++;
                        
                        
                        break;
                    case f:
                        //Display the number of objects Created organized by lenght to proof the list
                         
                        System.out.println("You have Created :"+ countcircle + "Circles");
                        System.out.println("You have Created :"+ countbox + "Box");
                        System.out.println("You have Created :"+ countboxX + "Box with X");
                        System.out.println("You have Created :"+ countX + " X ");
                        System.out.println("You have Created :"+ countTriangle + "Triangles");
                        
                        break;
                        
                        
                        
                    case q:
                        System.out.println("Goodbye.");
                        break;

                    default:
                        System.out.println("Wrong selection. Try again");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Selection out of range. Try again:");
            }
        }
        }
        



    
    
    enum MenuOptions
{
    z("Create more shapes"), a("Display Circle"), b("Display Box"), c("Display Box with an X inside"),
    d("Display an X"), e("Display Triangle"),  f("Display Totals"), q("Quit");

    
    private final String meaning;

    
    MenuOptions(String meaning)
    {
        this.meaning = meaning;
    }

 
    public String getMeaning()
    {
        return meaning;
    }
    
   
}


    public static void menu()
    {
        System.out.println("\nPress:");
        System.out.println("\ta. To display Circle");
        System.out.println("\tb. To display Triangle.");
        System.out.println("\tc. To display Box.");
        System.out.println("\td. To display Box with x inside.");
        System.out.println("\te. To display an X.");
        System.out.println("\tf. To display the Shapes You have Created.");
        System.out.println("\tq. To Exit.");
        System.out.print("\nSelection -> ");

    }

}
    
    

    


