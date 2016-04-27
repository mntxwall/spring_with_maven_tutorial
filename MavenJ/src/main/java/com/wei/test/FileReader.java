package com.wei.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cw on 16-4-26.
 */
public class FileReader implements Reader {
    private StringBuilder builder = null;
    private Scanner scanner = null;
    public FileReader(String fileName) throws FileNotFoundException {
        scanner = new Scanner(new File(fileName));
        builder = new StringBuilder();
    }
    public String read(){
     while(scanner.hasNext()){
         builder.append(scanner.next());
     }
     return builder.toString();
    }
}
