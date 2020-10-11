package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   Scanner sc = null;

//        try {
//            sc = new Scanner(new File("/home/nidhi/MyProjects/test.txt"));
//
//            while (sc.hasNext()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//
//            if (sc != null) {
//                sc.close();
//            }
//        }


        try(Scanner sc = new Scanner(new File("/home/nidhi/MyProjects/test.txt"))){

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        }catch(FileNotFoundException e){
          e.printStackTrace();
        }

    }
}
