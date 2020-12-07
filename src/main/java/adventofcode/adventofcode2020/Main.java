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

        ReadingTextFile advent3 = new ReadingTextFile();
        advent3.ReadingTextFileStrings();
        ArrayList<String> list = advent3.getStringList();
        
        //pitää monistaa rivit niin että tulee monta toistoa dataan
        //tämän voi toteuttaa vaikka tossa kun lukee noi tiedostot, kerrotaan vaikka 50?

        int i = 0;
        int row = 0;
        int trees = 0;
        while (i < list.get(i).length() && row + 3 <= list.get(i).length()) {

            row = row + 3;
            i++;

            if (list.get(i).charAt(row) == '#') {
                System.out.println("i" + i + " row" + row);
                trees++;

            }

        }
        System.out.println("The number of trees: " + trees);

    }

    //        ReadingTextFile advent1 = new ReadingTextFile();
//        System.out.println(advent1.getAnswerOfSum2020());
//        above first problem
////        the second problem
//          ReadingTextFile advent2 = new ReadingTextFile();
//          advent2.ReadingTextFileStrings();
//          ArrayList<String> list = advent2.getStringList();
//          
//          int timesCorrect = 0;
//          
//          System.out.println(passwordChecker.isCorrectPartTwo("2-9 c: ccccccccc"));
//          
//        for (int i = 0; i < list.size(); i++) {
//            if (passwordChecker.isCorrectPartTwo(list.get(i))) {
//                System.out.println(list.get(i));
//                timesCorrect++;
//            }
//        }
//        System.out.println(timesCorrect);
    //the third problem: rational numbers); start by counting all the trees you would encounter for the slope right 3, down 1:
}
