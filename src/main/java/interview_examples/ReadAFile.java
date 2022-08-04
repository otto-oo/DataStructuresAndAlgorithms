package main.java.interview_examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadAFile {

     static class SolutionIter implements Iterable<Integer>{

          static Reader reader;
          static {
               try {
                    reader = new FileReader("src/main/java/interview_examples/input.txt");
               } catch (FileNotFoundException e) {
                    e.printStackTrace();
               }
          }

          public SolutionIter(Reader inp) {
               reader = inp;
          }

          @Override
          public Iterator<Integer> iterator() {
               try {
                    List<Integer> list = new ArrayList<>();
                    int data = reader.read();
                    String tempData = "";

                    while (data != -1) {
                         if((data >= 48 && data <=57) || data == 10){
                              if (data != 10){
                                   tempData += (char)data;
                              }else {
                                   list.add(Integer.parseInt(tempData));
                                   tempData = "";
                              }
                         }
                         data = reader.read();
                    }
                    list.add(Integer.parseInt(tempData));
                    System.out.println("list = " + list);
                    reader.close();
               } catch (FileNotFoundException e) {
                    e.printStackTrace();
               } catch (IOException e) {
                    e.printStackTrace();
               }

               return null;
          }

          public static void main(String[] args) throws IOException {
               SolutionIter solutionIter = new SolutionIter(reader);
               solutionIter.iterator();
          }
     }
}
