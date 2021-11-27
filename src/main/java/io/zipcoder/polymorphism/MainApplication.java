package io.zipcoder.polymorphism;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication { //methods in here is what tell java


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //interactive console
        //ask for the following information:
        //how many pets the owner have?
        System.out.println("How many pets do you have? ");
        int numberOfPets = scanner.nextInt();
        Pet[] pets = new Pet[numberOfPets]; //create an array of pets

        int validPets = 0;

        while(validPets < numberOfPets){
            //What kind of pet/s?
            System.out.println("Type of pet: [1] Bird, [2] Cat, [3] Dog " );
            int petType = scanner.nextInt();
            if(petType < 1 || petType > 3){
                System.out.println("Invalid Input, Try Again.");
                continue;
            }
            //What is the pet/s name?
            System.out.println("What your pet name?");
            String petName = scanner.next();
            //create the current pet
            Pet newPet = null;
            //switch statement is similar to the if statements, without the cumbersome if/else
            switch(petType){
                case 1:
                    newPet = new Bird(petName);
                    break;
                case 2:
                    newPet = new Cat(petName);
                    break;
                case 3:
                    newPet = new Dog(petName);
                    break;
                default:
                    break;
            }
            //Pet array(at the current position we created at) will equal newPet variable
            pets[validPets] = newPet;
            validPets++;
        }

        //make them all speak
        //for(each loop), with initialization of a new variable to go thru the array
        for(Pet currentPet : pets){
            //print out the string of output we want to have display
            System.out.println("Say hello, " + currentPet.getName() + ": " + currentPet.speak());
        }

        //think about how to utilize for(loops) and arrays to for dynamic data/input


    }




}
