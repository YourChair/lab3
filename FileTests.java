import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.util.*;

public class FileTests {
	@Test 
	public void test() {
    /*List<File> files = new ArrayList<>();
    File abc = new File("C:/Users/A S/Documents/GitHub/lab3/even-more-files/a.txt");
    //File abc = new File("c.txt");
    files = FileExample.getFiles(abc);
    List<File> files2 = new ArrayList<>();
    files.add(abc);
    assertEquals(true, files2.equals(files));*/
	}

  public void test2() {
    List<File> files = new ArrayList<>();
    File abc = new File("C:/Users/A S/Documents/GitHub/lab3/even-more-files/a.txt");
    //File abc = new File("c.txt");
    files = FileExample.getFilesFixed(abc);
    List<File> files2 = new ArrayList<>();
    files.add(abc);
    assertEquals(true, files2.equals(files));
	}


}
