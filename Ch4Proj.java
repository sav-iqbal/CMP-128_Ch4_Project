
/* author: Savaas Iqbal
   date: 11/20/2022
   purpose: 1) take the sum of numbers
            2) random number guessing game
            3) slot machine simulation
            


*/
import java.util.Scanner; 
import java.util.Random; //random numbers
import java.util.ArrayList;
public class Ch4Proj {

   public static void main (String[] args){
      //1. the sum of numbers
      
      /*a	program	segment	that	asks	the	user	for	a	positive	non-zero	integer	value.		
      The	program	should	use	a	loop	to	get	the	sum	of	all	the	integers	from	1	up	to	the	
      number	entered.		For	example,	if	the	user	enters	5,	the	loop	will	find	the	sum	of	1,	2,	
      3,	4,	5. */
      
      Scanner keyboard = new Scanner (System.in); //scanner object
      
      System.out.println("Enter a positive non-zero integer value"); //prompt the user to enter integer
      int num = keyboard.nextInt(); 
      int value = 0; //output
      int i = 0; //counter
      
      while (i<=num){ //loop terminates once counter is greater than num
         value = i + value; //increment value
         i++; //increase counter 
      }   
      System.out.println(value); 
      
      //2. Random Number Guessing Game
      
      /*generates	a	random	number	and	asks	the	user	to	
      guess	what	the	number	is.		If	the	user’s	guess	is	higher	than	the	random	number,	the	
      program	should	display	“Too	high,	try	again.”		If	the	user’s	guess	is	lower	than	the	
      random	number,	the	program	should	display	“Too	low,	try	again.”		The	program	
      segment	should	use	a	loop	that	repeats	until	the	user	correctly	guesses	the	random	
      number.		Keep	a	count	of	how	many	times	it	takes	to	guess	the	number.		The	
      program	segment	should	display	the	number	of	guesses	the	user	needed	to	guess	
      the	number.
      */
      
      Random rand = new Random(); // random object
      num = rand.nextInt(20 + 1); // random number generator, max 20
      boolean guessCorrectness = false; 
      
      System.out.println("A random number has been generated. Guess what the number is."); // prompt the user to guess
      
      int guess = keyboard.nextInt(); 
      i = 0; 
      while (guess != num){
         if (guess > num){
            System.out.println("Too high, try again.");
         } 
         else{
            System.out.println("Too low, try again.");
         } 
         guess = keyboard.nextInt(); 
         i++; 
      }
      i = i+1; 
      System.out.println("Your guess is correct. The number generated is " + num + "." + " You took " + i + " guess(es)!");
   //3. Slot Machine Simulation 
      /* A	slot	machine	is	a	gambling	device	that	the	user	inserts	money	into	and	then	pulls	a	
      lever	(or	presses	a	button).		The	slot	machine	then	displays	a	set	of	random	images.		
      If	two	or	more	of	the	images	match,	the	user	wins	an	amount	of	money	that	the	slot	
      machine	dispenses	back	to	the	user.
      Create	a	program	that	simulates	a	slot	machine. */
            
  String slotWord = ""; // declare string variable
  String slotWord1 = ""; // to compare slots
  String slotWord2 = ""; 
  String slotWord3 = "";
    
  int money = 0;  
  int totalMoney = 0; 
  int enteredMoney = 0;
  int totalEnteredMoney = 0;  
  String keepPlay = "Y"; 
  char letter = 'x'; 
do{
 System.out.println("Enter how much money you want to put into the slot machine."); // enter money
  enteredMoney = keyboard.nextInt(); 
  
   for (i=0; i<3; i++){
      num = rand.nextInt(5 + 1); // generate random integer, 0-5
         switch (num){ // determine which word from generated number
         case 0: 
            slotWord = "Cherries"; 
            break;
         case 1: 
            slotWord = "Oranges";
            break;
         case 2: 
            slotWord = "Plums";
            break;
         case 3: 
            slotWord = "Bells";
            break;
         case 4: 
            slotWord = "Melons";
            break; 
         case 5: 
            slotWord = "Bars"; 
            break;
              }
        if (i == 0){
         slotWord1 = slotWord; //set each word equal to each variable to compare
        }
        else if (i == 1){
         slotWord2 = slotWord; 
        }
        else {
         slotWord3 = slotWord; 
        }
      }
      
      System.out.println("Slots rolled: " + slotWord1 + " " + slotWord2 + " " + slotWord3);
      // see which are equal
      if (slotWord1 == slotWord2){ // 1 = 2
         if (slotWord1 == slotWord3){ // 1 = 2 = 3
            money = enteredMoney*3;
         }
         else{ // 1 = 2 but not equal 3
            money = enteredMoney*2;
         //2x 
         }
      }
      else if (slotWord1 == slotWord3){ //1 = 3
         if (slotWord2 == slotWord1){// 1 = 3 = 2
           money = enteredMoney*3; // win 3x 
         }
         else{ //1 = 3 but not equal 2 
          money = enteredMoney*2; 
         }
      
      }
      else if (slotWord2 == slotWord3){ // 2 = 3 
         if (slotWord2 == slotWord1) { // 2 = 3= 1
            money = enteredMoney * 3; 
         }
         else{ // 2 = 3, but not equal 1
            money = enteredMoney * 2; 
         }
      }
     
      else { // none equal
         money = 0; 
      }
      
      totalMoney = totalMoney + money; 
      totalEnteredMoney = enteredMoney + totalEnteredMoney; 
      System.out.println("You won $" + money);
      
      keyboard.nextLine();
      System.out.println("Do you want to keep playing (Y/N)?");
      keepPlay = keyboard.nextLine();  
      letter = keepPlay.charAt(0);
      
      }while (letter != 'N' && letter != 'n');
         System.out.println("In total you won $" + totalMoney + " from the slot machine. You have entered $" + totalEnteredMoney + " into the slot machine.");
   }

}
/* output
Enter a positive non-zero integer value
 5
 15
 A random number has been generated. Guess what the number is.
 10
 Too low, try again.
 20
 Too high, try again.
 15
 Too low, try again.
 26
 Too high, try again.
 16
 Too low, try again.
 17
 Too low, try again.
 18
 Your guess is correct. The number generated is 18. You took 7 guess(es)!
 Enter how much money you want to put into the slot machine.
 5
 Slots rolled: Plums Melons Bars
 You won $0
 Do you want to keep playing (Y/N)?
 Y
 Enter how much money you want to put into the slot machine.
 10
 Slots rolled: Plums Melons Oranges
 You won $0
 Do you want to keep playing (Y/N)?
 Y
 Enter how much money you want to put into the slot machine.
 3
 Slots rolled: Cherries Cherries Bars
 You won $6
 Do you want to keep playing (Y/N)?
 Y
 Enter how much money you want to put into the slot machine.
 10
 Slots rolled: Bars Bars Bells
 You won $20
 Do you want to keep playing (Y/N)?
 N
 In total you won $26 from the slot machine. You have entered $28 into the slot machine.

*/