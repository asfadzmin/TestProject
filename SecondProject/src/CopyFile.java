import java.io.*;
public class CopyFile {

	public static void main(String args[]) throws IOException {  
		//FileInputStream in = null;
		//FileOutputStream out = null;
		FileReader in = null;
		FileWriter out = null;

		try {
			//in = new FileInputStream(".\\input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter input path: ");
	        String input=br.readLine();
	        System.out.println("Enter output path: ");
	        String output=br.readLine();
			//in = new FileInputStream("C:\\TRAINING\\SAMPLES3\\input.txt");
			//out = new FileOutputStream("C:\\TRAINING\\SAMPLES3\\output.txt");
			in = new FileReader(input);
			out = new FileWriter(output);
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}System.out.println("File copied");
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}