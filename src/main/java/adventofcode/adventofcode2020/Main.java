/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.adventofcode2020;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author mazaalto
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        ReadingTextFile advent1 = new ReadingTextFile();
//        System.out.println(advent1.getAnswerOfSum2020());
//        above first problem

//        the second problem
          ReadingTextFile advent2 = new ReadingTextFile();
          advent2.ReadingTextFileStrings();
          ArrayList<String> list = advent2.getStringList();
          
          int timesCorrect = 0;
          
          for (int i = 0; i < list.size(); i++) {
              if (passwordChecker.isCorrect(list.get(i))) {
                  timesCorrect++;
              }
          }
        System.out.println(timesCorrect);

    }

}
