import java.io.*;
class ReadString {
	public static void main(String[] args) {
		File file = new File("input.txt");
		int n = 10000;
		int [] moji = new int[n];
		int i=0;
		int ch;
		try{
			FileInputStream fin = new FileInputStream(file); 
			for(i=0;i<n;i++){ 
				if((ch = fin.read())==-1)break; 
				moji[i]=ch;
			}
			fin.close(); 
		}
		catch(FileNotFoundException e) {
			System.out.println("File " + file.getAbsolutePath() + " could not be found on filesystem");
		}
		catch(IOException ioe) {
			System.out.println("Exception while reading the file" + ioe);
		}
		try {
			FileOutputStream fout = new FileOutputStream("output_q1.txt");
			for( i -= 1; i >= 0; i-- ) {
				fout.write((char) moji[i]);
			}
			fout.close();
			System.out.println("File is created.");
		} catch (Exception e) { System.out.println(e);
        }
	}
} 