package love.java8.fileFilter;

import java.io.File;

public interface FileFilter {
	boolean accept(File file);

}
