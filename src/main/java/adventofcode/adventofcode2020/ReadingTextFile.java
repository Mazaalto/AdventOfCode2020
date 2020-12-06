/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.adventofcode2020;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author mazaalto
 */
public class ReadingTextFile {

    Scanner reader;
    private int answer;
    ArrayList list;

    public ReadingTextFile() throws FileNotFoundException {
        this.reader = new Scanner(new File("numbers.txt"));
        this.list = new ArrayList();
        while (this.reader.hasNextInt()) {

            int line = this.reader.nextInt();
            list.add(line);

        }

    }

    public int getAnswerOfSum2020() {

        int i = 0;
        while (i < list.size()) {
            //second

            int i2 = 0;
            while (i2 < list.size()) {
                //third
                int i3 = 0;
                while (i3 < list.size()) {
                    int first = (int) list.get(i);
                    int second = (int) list.get(i2);
                    int third = (int) list.get(i3);
                    if (first+second+third == 2020) {
                        System.out.println(first + " "+second+" "+third);
                        return first*second*third;
                    }

                    i3++;
                }
                i2++;

            }
            i++;
        }

        return 0;
    }

}
