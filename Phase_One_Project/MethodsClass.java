import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MethodsClass {
	Scanner sc=new Scanner(System.in);
	public String getFileName() {
		System.out.println("Please enter the name of the file ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		return name;
		
	}

	public void mergeSort(String[] list) {
		if (list.length >= 2) {
            String[] left = new String[list.length / 2];
            String[] right = new String[list.length-list.length / 2];

            for (int i = 0; i < left.length; i++)
            {
                left[i] = list[i];
            }
            for (int i = 0; i < right.length; i++)
            {
                right[i] = list[i + list.length / 2];
            }

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }
	}
	public static void merge(String[] result, String[] left, String[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                                 left[i1].compareToIgnoreCase(right[i2])<0)) {
                      result[i] = left[i1];
                      i1++;
                 } else {
                      result[i] = right[i2];
                      i2++;
                 }
            }
    }
	public void addFiles() throws IOException {
		String fname=getFileName();
		try {
			File myFile=new File(fname);
			FileOutputStream is=new FileOutputStream("C:\\Users\\raqsh\\Desktop\\"+fname);
			boolean flag=myFile.createNewFile();
			//System.out.println(flag);
			if(flag) {
				OutputStreamWriter osw=new OutputStreamWriter(is);
				Writer w=new BufferedWriter(osw);
				System.out.println("Enter some data to enter into this file");
				String pass=sc.next();
				sc.next();
				System.out.println("Enter the file number");
				String number=sc.next();
				
				w.write("Purpose:\n"+pass);
				w.write("File Number:"+number);
				System.out.println("File created Successfully!");
				w.close();
				}
			
			else {
				System.out.println("File already present.\n");
		}
			}
		catch(Exception e) {
			System.out.println("Problem in creating file");
		}
	}
public void deleteFiles() throws IOException {
	
	String fname=getFileName();
	File file = new File("C:\\Users\\raqsh\\Desktop\\"+fname);  
    if(file.exists()&&!file.isDirectory()&&file.getCanonicalFile().getName().equals(file.getName())) 
        {
        	file.delete();
        	System.out.println("Deletion successful.");
        	} else
		
			if(!file.getCanonicalFile().getName().equals(file.getName()))
				System.out.println("Check case of your file!!");
			else if(!file.exists())
				System.out.println("File does not exist");
			else
				System.out.println("Deletion unsuccessful");     
} 
public void getDetails() throws IOException {
	String fileName=getFileName();

	 File file = new File("C:\\Users\\raqsh\\Desktop\\"+fileName); 
	  
	  BufferedReader br;
	  try {
		br = new BufferedReader(new FileReader(file));
		String st; 
	  	while ((st = br.readLine()) != null) 
		    System.out.println(st+"\n");
	  }
	  catch(FileNotFoundException e) {
	
		System.out.println("File not present!");
	  }
	  } 
public void available() {
	String fileName=getFileName();
	 File file = new File("C:\\Users\\raqsh\\Desktop\\"+fileName); 
	 
	 try {
		if (file.exists()&& file.getCanonicalFile().getName().equals(file.getName())) 
		     System.out.println("Exists in "+file.getPath()); 
		 
		 else if(!file.getCanonicalFile().getName().equals(file.getName()))
			 System.out.println("Check the case of your file!!");
		 else
		     System.out.println("Does not Exists");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void listOfFiles() {
	File fileDir = new File("C:\\Users\\raqsh\\Desktop\\");
	if(fileDir.isDirectory()){
		List<String> listFile = Arrays.asList(fileDir.list());
		Collections.sort(listFile);
		//String name = "";
		System.out.println("---------------------------------------");
		System.out.println("The files are");
		try {
		for(String s:listFile){
			//name = s.replaceFirst("[.][^.]+$", "");
			System.out.println(s);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	else{
		System.out.println("There are no files to display");
	}

}

}



