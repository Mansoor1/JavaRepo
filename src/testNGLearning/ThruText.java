package testNGLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruText {

	File fc;
	FileWriter fw;
	FileReader fr;
	BufferedWriter bw;
	BufferedReader br;
	String src="G:\\sel\\Sel@Weekends\\testData.txt";
		@Test
		public void writeAndreadTxtFile() throws IOException
		{
			fc=new File(src);
			fc.createNewFile();
			fw=new FileWriter(src);
			bw=new BufferedWriter(fw);
			bw.write("This is my first Line");
			bw.newLine();
			bw.write("This is my Second Line");
			bw.close();
			fr=new FileReader(src);
			br=new BufferedReader(fr);
			String content=null;
			while((content=br.readLine())!=null)
			{
				System.out.println(content);
				
			}
			br.close();
			
		}
}
