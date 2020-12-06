/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.adventofcode2020;

/**
 *
 * @author mazaalto
 */
public class passwordChecker {

    //advent of code problem 2, how to check if password is valid given the correct clause
    public static boolean isCorrect(String line) {
        //1-3 a: abcde 1-3 = times, abdce is the password suggestion
        String[] pieces = line.split(" ");
        String[] rules = pieces[0].split("-");

        int min = Integer.parseInt(rules[0]);
        int max = Integer.parseInt(rules[1]);

        char toFind = pieces[1].charAt(0);
        String password = pieces[2];
        int found = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == toFind) {
                found++;
            }
        }
        if (found >= min && found <= max) {
            return true;
        }
        return false;
    }

}
