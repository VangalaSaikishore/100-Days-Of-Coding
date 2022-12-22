import java.io.*;  
  
public class CheckedExceptionThrow 
{   
     
    public static void FileOperation1() throws FileNotFoundException 
    {  
  
        FileReader fr = new FileReader("C:\\javaprograms\\JAVA\\Example.txt");  
        BufferedReader br = new BufferedReader(fr);  
  
      
        throw new FileNotFoundException();  
      
    }  
    //main method  
    public static void main(String args[])
    {  
        try  
        {  
            FileOperation1();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("<<<===rest of the code!!!===>>>");    
  }    
}    
