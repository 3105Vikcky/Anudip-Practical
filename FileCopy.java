import java.io.*;
public class FileCopy 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\user\\Desktop\\Java file operation\\vikas.txt");
			int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i); 
            }
            fin.close();  
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException i) 
		{
			i.printStackTrace();
		}
	}

}
