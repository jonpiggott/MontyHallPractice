/*by: jonthan piggott
* Testing the theory that in the Monty Hall problem, that when a user is presented with three
* doors and selects one, and another door is removed that doesn't contain the prize, that the
* probability of winning goes up if the user switches their guess from their initially selected door
* to the remaining door they originally did not select.
*/

import java.util.Random;
public class Monty {

 public static void main(String[] args){
  int count = 0;
  int wins = 0;
  int losers = 0;
  int changeWins = 0;
  int changeLosers = 0;
  Random rand = new Random();

  while (count < 100000){ //number of times you wish to test guess
   int doorPick = rand.nextInt(3); //set the "contestant" guess to a door either 0,1,2 
   int prizeDoor = rand.nextInt(3); //set the "prize" door to either 0,1,2

   if (doorPick == prizeDoor){
    //tracking the amount of first choice correct guesses without ever changing doors
    wins++;
   } else {
    losers++;
   }

   if (doorPick != 0 && prizeDoor != 0){
   // multiple if structure to 'remove' a door that isn't the prize door or contestant door and switch the contestant pick to the other remaining door option
    if (doorPick == 1){
     doorPick = 2;
    } else {
     doorPick = 1;
    }
   } else if (doorPick != 1 && prizeDoor != 1) {
    if (doorPick == 0){
     doorPick = 2;
    } else {
     doorPick = 0;
    }
   } else {
    if (doorPick == 1){
     doorPick = 0;
    } else {
     doorPick = 1;
    }
   }

   if (doorPick == prizeDoor){
     //count the number of wins by the 'contestant' when their door pick always changes
     changeWins++;
   } else {
     changeLosers++;
   }

   count++;
  }

   System.out.println("First Guess Wins: " + wins);
   System.out.println("First Guess Losers: " + losers);
   System.out.println("Change Wins: " + changeWins);
   System.out.println("Change Losers: " + changeLosers);

 }
}