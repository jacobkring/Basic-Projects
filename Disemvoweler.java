/*
Author: Jacob Kring
Date: 05/01/2014



Description:

(EASY): Disemvowler

Disemvoweling means removing the vowels from text. (For this challenge, the letters a, e, i, o, and
u are considered vowels, and the letter y is not.) The idea is to make text difficult but not 
impossible to read, for when somebody posts something so idiotic you want people who are reading 
it to get extra frustrated.

To make things even harder to read, we'll remove spaces too. For example, this string:
   
   two drums and a cymbal fall off a cliff

can be disemvoweled to get:

   twdrmsndcymblfllffclff

We also want to keep the vowels we removed around (in their original order), which in this case is:
   
   ouaaaaoai
   
Formal Inputs & Outputs

   Input Description:
      A sgrint consisting of a series of words to disemvowel. It will be all lowercase (letters a-z)
      and without punctuation. The only special character you need to handle is spaces.
      
   Output Description:
      Two strings, one of the disemvoweled text (spaces removed), and one of all the removed vowels.

  Sample Input 1
      all those who believe in psychokinesis raise my hand
  Sample Output 1
      llthswhblvnpsychknssrsmyhnd
      aoeoeieeioieiaiea
      
   Sample Input 2
      did you hear about the excellent farmer who was outstanding in his field
   Sample Output 2
      ddyhrbtthxcllntfrmrwhwststndngnhsfld
      ioueaaoueeeeaeoaouaiiiie
      
reddit.com/r/dailyprogrammer

*/

import java.util.Scanner;

public class Disemvoweler {

   public static void main (String[] args) {
   
     String input; // string to be disemvoweled
     String disemvoweled="";
     String vowels="";
     char current;
     Scanner in = new Scanner(System.in); // scanner for user input
     int index;
     System.out.print("Input String to be disemvoweled: ");
     input = in.nextLine();     
     
     
     for(int i = 0; i < input.length(); i++){
         current = input.charAt(i);
         // if a vowel add to vowels
         if((current == 'a') || (current == 'e') || (current == 'i') || (current == 'o') || (current == 'u')) 
            vowels = vowels + String.valueOf(current);
         // else if not space add to disemvoweled string
         else if(!(current == ' '))
            disemvoweled = disemvoweled + String.valueOf(current);
     }
     
     System.out.println(disemvoweled);
     System.out.println(vowels);
      
   }

}