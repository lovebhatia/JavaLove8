package love.java8.fileFilter;

import java.io.File;

public class JavaFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().endsWith("java");
	}
}
	
	
	


