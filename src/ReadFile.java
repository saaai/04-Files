import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void main (String args[]) throws IOException
	{
		FileInputStream fis /*fis is the object*/ = new FileInputStream("/Users/saigopal/Documents/javapractice/BasicCalc.java");
		 
		/*when the string contains invalid escape or valid escape characters,
		 *		instead of giving backward slash you can use forward slash or you can also give two backwards slashes "\\".
		 * Now, we need to read the file to display the output to do that we have to use read().
		 * to close fis we use "fis.close"
		 */
		
		int size = fis.available();
		
		/* the below code for reading by iterating multiple no. of times
		 * 
		for (int i =0; i<size; i++)
		{
			int a = fis.read();//assigning a  variable to the read method.
			System.out.print((char)a);//for converting integer value to character value.
				//to print in the same line we removed ln in println 
		}
		fis.close();
		*/
		
		
		//for reading data at a single shot
		byte data[] = new byte[size];
		fis.read(data);
		String fileContent = new String(data);
		System.out.println(fileContent);
		fis.close();//closed FileInputStream resource.
		
		
		}
		
	}

/* Nov 30th video:
 * 
 *  
 *  
 * after one hour:
 * 
 * file system:
 * 
 * to read from the file and to write to the file.
 * 
 * fileinputstream and filereader  are both recommended for reading a file.
 * 
 * ex: to read ur resume or any other text file.
 * 
 * FileInputStream(String name) : method is the easy way to call a file .
 * 
 * convert and integer value to character you can directly give "(char)" .
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */

