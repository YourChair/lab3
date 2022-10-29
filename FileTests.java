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


  @Test
  public void test2() {
    List<File> files = new ArrayList<>();
    //File abc = new File("./even-more-files/a.txt");
    //File abc = new File("C:/Users/A S/Documents/GitHub/lab3/more-files");
    File a = new File("./even-more-files/a.txt");
    File b = new File("./more-files/b.txt");
    File c = new File("./c.txt");
    File d = new File("./more-files/d.txt");
    File e = new File("./more-files/way-more-files/e.txt");
    File more = new File("./more-files/");
    File evenmore = new File("./even-more-files/");
    File waymore = new File("./way-more-files/");
    File abc = new File("./c.txt");

    List<File> result = new ArrayList<>();

    
    try {
      //files = FileExample.getFilesFixedException(more, result);
      files = FileExample.getFiles(more);
    }
    catch (IOException abc123) {
      abc123.printStackTrace();
    }

    
    List<File> files2 = new ArrayList<>();
    files2.add(b);
    files2.add(d);
    files2.add(e);
    
    for (int i = 0; i < files.size(); i++) {
      assertEquals(files2.get(i), files.get(i));
    }

    
    for (int i = 0; i < files.size(); i++) {
      assertEquals(0, files2.get(i).compareTo(files.get(i)));
    }
    for (int i = 0; i < files2.size(); i++) {
      assertEquals(0, files2.get(i).compareTo(files.get(i)));
    }
    
	}


}
