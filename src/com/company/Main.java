package com.company;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//public class Outt {
//    void outtpls(List<String> x){
//       foreach ( String i in inn) {
//            System.out.println(inn[0]);
//        }
//    }
//}
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner lines = new Scanner(new File("input.txt"));
        String line= lines.nextLine();
        String result;

        if(!Checking.Check(line)) {
            Leaf l;
            l = Leaf_initialization.Split(line, 1);
            result = Leaf_initialization.printTree(l);
        }
        else result="Ошибка в записи";
        System.out.println(result);
    }
}
