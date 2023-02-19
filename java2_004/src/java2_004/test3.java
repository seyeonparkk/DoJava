package java2_004;

import java.io.*;

public class test3 {

	public static void main(String[] args) throws IOException {
		byte data[]= {8,9,0,6,2,9,9};
		// TODO Auto-generated method stub
		try (FileOutputStream out=new FileOutputStream("test.bin")){
			out.write(data);
			System.out.println(" Write success");
		}catch(IOException e) {
			System.out.println("File output Error");
			
		}
	}

}
