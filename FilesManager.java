
package ShapesInheritance;

public class FilesManager {
    
    
    
    public void createAndCheckFile()      
    {
      java.io.File myFile = new java.io.File("shape.txt");
      
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists and the shape was saved");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead()) {
                            System.out.println(" You can Read");
                        } else {
                            System.out.println(" not ok to read");
                        }
			if (myFile.canWrite()) {
                            System.out.println(" You can write");
                        } else {
                            System.out.println(" not ok to write");
                        }
			System.out.println("path: " +myFile.getAbsolutePath());
			System.out.println("File Name: "+ myFile.getName());
			System.out.println("File Size: "+ myFile.length() + " bytes");
                    
		} else {
                    System.out.println("File did not exist, It Was created and the shape saved");
      }
                
                
	}
   
    
}
