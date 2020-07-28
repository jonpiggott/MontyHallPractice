import java.util.Random;
public class Monty {

 public static void main(String[] args){
  int count = 0;
  int wins = 0;
  int losers = 0;
  int changeWins = 0;
  int changeLosers = 0;
  Random rand = new Random();

  while (count < 10000){
   int doorPick = rand.nextInt(3);
   int prizeDoor = rand.nextInt(3);

    // System.out.println("Door set to " + doorPick);
    // System.out.println("Prize set to " + prizeDoor);

   if (doorPick == prizeDoor){
    wins++;
   } else {
    losers++;
   }

   if (doorPick != 0 && prizeDoor != 0){
   // System.out.println("Door zero Removed");
    if (doorPick == 1){
     doorPick = 2;
    // System.out.println("Door set to 2");
    } else {
     doorPick = 1;
    // System.out.println("Door set to 1");
    }
   } else if (doorPick != 1 && prizeDoor != 1) {
   // System.out.println("Door one Removed");
    if (doorPick == 0){
     doorPick = 2;
    // System.out.println("Door set to 2");
    } else {
     doorPick = 0;
    // System.out.println("Door set to 0");
    }
   } else {
   // System.out.println("Door two Removed");
    if (doorPick == 1){
     doorPick = 0;
   //  System.out.println("Door set to 0");
    } else {
     doorPick = 1;
   //  System.out.println("Door set to 1");
    }
   }

   if (doorPick == prizeDoor){
     changeWins++;
   } else {
     changeLosers++;
   }

   count++;
   // System.out.println("");
  }

   System.out.println("Wins: " + wins);
   System.out.println("Losers: " + losers);
   System.out.println("Change Wins: " + changeWins);
   System.out.println("Change Losers: " + changeLosers);

 }
}