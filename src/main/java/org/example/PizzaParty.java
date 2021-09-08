package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class PizzaParty
{
    public static void main( String[] args )
    {
        System.out.print( "How many people? " ); //asks user for amt of people
        Scanner input = new Scanner(System.in); //imports scanner
        String people = input.nextLine(); //gets user input
        int ipeople = Integer.parseInt(people); //converts string to int;

        System.out.print( "How many pizzas do you have? " ); //asks user for amt of pizzas
        String pizza = input.nextLine(); //gets user input
        int ipizza = Integer.parseInt(pizza); //converts string to int;

        System.out.print( "How many slices per pizza? " ); //asks user for amt of slices pizza
        String pslice = input.nextLine(); //gets user input
        int ipslice = Integer.parseInt(pslice); //converts string to int;



        int amt = ipslice*ipizza; //amount of slices total
        System.out.println(+ipeople+" people with "+ipizza+" pieces of pizza. ("+amt+" slices)" );
        int gets = amt/ipeople; //total amt of slices/amt people
        System.out.println("Each person gets "+gets+" pieces of pizza.");
        int left = amt%ipeople; //calculates how many slices are leftover
        System.out.println("There are "+left+" leftover pieces.");






    }
}
