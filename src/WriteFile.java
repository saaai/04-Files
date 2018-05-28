import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author saigopal
 *
 */
public class WriteFile {

	/**
	 * @param args
	 */
	public static void main (String args[]) throws IOException
	{
		
		int value = 10;
		FileInputStream fis /*fis is the object*/ = new FileInputStream("/Users/saigopal/Documents/workspace/cake.jpg");
		 
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
		//fileContent = fileContent.replace("StringtoReplace", ""+10);//for replacing a particular old value into a give new value for the output file.
		
		FileOutputStream fos = new FileOutputStream("/Users/saigopal/Documents/javapractice/OutPut.jpg");
		//for writing the contents of the file to a new file
		//we are trying to copy byte to byte from one file to the another one.
		//fos.write(fileContent.getBytes()); //this works only for text and doesn't work for pictures
	
		fos.write(data);//this works for copying or reading and writing the pictures also
		fos.close();
		
		System.out.println(fileContent);
		fis.close();
		
		
		}
		

}


/* so, it doesn't matter if your'e using FileInputStream(reads byte arrays) or FileReader(reads character arrays),
 * 		 FileOutputStream(reads byte arrays) or FileWriter(reads character arrays).
 * we have total two sets of files one will be reading byte arrays and the other one will be reading character arrays.
 * 
 * internally if we have any huge contextual data to read then we have to go for filereaders and filewriters.
 * 
 * 
 *  */
