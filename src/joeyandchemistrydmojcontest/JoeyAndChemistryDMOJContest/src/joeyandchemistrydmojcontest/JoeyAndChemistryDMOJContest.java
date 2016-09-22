/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package joeyandchemistrydmojcontest;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class JoeyAndChemistryDMOJContest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b, c, d, numOfC, numOfH, numOfO; //Declare coefficient variables
        String numbers[] = {"0","1","2","3","4","5","6","7","8","9"};
        String carbon = "C";
        String hydrogen = "H";
        String oxygen = "O";
        
        //test
        
        Scanner sc = new Scanner(System.in); //Scan results
        
        String userInput = sc.nextLine(); //Get user input
        
        a = Integer.parseInt(userInput.substring(0,1)); //Set a coefficent to first value in input
        
        if(userInput.contains(carbon)){
            int indexCarbon = userInput.indexOf(carbon);
            int carbonSubscript = Integer.parseInt(userInput.substring(indexCarbon+1, indexCarbon+2));
            for(int i=0; i<numbers.length;i++){
                if(Integer.toString(carbonSubscript).contains(numbers[i])){
                    numOfC = a*carbonSubscript;
                    System.out.println(numOfC);
                }
            }

        }
        
        if(userInput.contains(oxygen)){
            int indexOxygen = userInput.indexOf(oxygen);
            int oxygenSubscript = Integer.parseInt(userInput.substring(indexOxygen+1, indexOxygen+2));
            for(int i=0; i<numbers.length;i++){
                if(Integer.toString(oxygenSubscript).contains(numbers[i])){
                    numOfO = a*oxygenSubscript;
                    System.out.println(numOfO);
                }
            }

            
            
        }
        if(userInput.contains(hydrogen)){
            int indexHydrogen = userInput.indexOf(hydrogen);
            int hydrogenSubscript = Integer.parseInt(userInput.substring(indexHydrogen+1, indexHydrogen+2));
            for(int i=0; i<numbers.length;i++){
                if(Integer.toString(hydrogenSubscript).contains(numbers[i])){
                    numOfH = a*hydrogenSubscript;
                    System.out.println(numOfH);
                }
            }

        }
        
    }
    
}