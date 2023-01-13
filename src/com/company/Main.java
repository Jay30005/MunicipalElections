package com.company;

//In a municipal election, there were four candidates running for mayor.
// The election took place in 3 different stations.
// Write a program that prompts the user to enter the number of votes received by each candidate in each station.
// Store the information in a two dimensional array.
// After inputting the data, the program should display the votes received by each candidate at each station and the total number of votes received by each candidate.
// Then at the end, the program should display who is the winner.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int numOfCan=4;
        int numberV=0;
        int s;
        int totalOfVotes;

        String[][] Station ={{"Station 1"}, {"Station 2"}, {"Station 3"}};
        System.out.println("Stations: " + Station);

        for (int i = 0; i <Station.length ; i++) {
            for (int j =1; j < Station[i].length; j++){

                System.out.println("Enter number of votes");
                numberV = input.nextInt();

            } while (true){

                if (numOfCan!=4 && numOfCan<4); {
                    System.out.println( numberV + numOfCan);
                }


                totalOfVotes= numberV*numOfCan;



            }
        } System.out.println("The winner is! : "+ );

    }
}
