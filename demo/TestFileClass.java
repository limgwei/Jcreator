/**
 * @(#)TestFileClass.java
 *
 *
 * @author 
 * @version 1.00 2018/11/16
 */

import java.io.*;
public class TestFileClass {
  public static void main(String[] args) {
    File file = new File("C:/Users/lim/Documents");
    System.out.println("Does it exist? " + file.exists());
    System.out.println("Can it be read? " + file.canRead());
    System.out.println("Can it be written? " + file.canWrite());
    System.out.println("Is it a directory? " + file.isDirectory());
    System.out.println("Is it a file? " + file.isFile());
    System.out.println("Is it absolute? " + file.isAbsolute());
    System.out.println("Is it hidden? " + file.isHidden());
    System.out.println("Absolute path is " +
      file.getAbsolutePath());
    System.out.println("Last modified on " +
      new java.util.Date(file.lastModified()));
  }
}
