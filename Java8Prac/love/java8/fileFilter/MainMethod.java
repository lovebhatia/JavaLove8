package love.java8.fileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MainMethod {
	public static void main(String[] args) {
		
		/*
		 * java.io.FileFilter fileFilter=new FileFilter() {
		 * 
		 * @Override public boolean accept(File pathname) { // TODO Auto-generated
		 * method stub return pathname.getName().endsWith(".java"); } };
		 */
		java.io.FileFilter filterLambda= (File path) -> 
			path.getName().endsWith(".java");
		
		File dir=new File("D:\\New folder");
		File[] files=dir.listFiles(filterLambda);
		
		for(File f: files)
		{
			System.out.println(f.getName());
		}
	}
}
