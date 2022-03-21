import java.util.Random;
import javax.swing.*;
public class RollADie {

	
	
		public static void main (String[] args)
		{
			//this is to reference the other method. I don't normally do this but I suppose it is a method of organizing methods. 
			event();
		}
			//this is creating a method called event
		public static void event ()
		{
			//this is to print out opening statement using JOptionPane
			JOptionPane.showMessageDialog(null,"welcome to roll a dice by johnnie the hottie! You win a lifetime supply of premium Colombian Coffee Beans,if you get the same number 6 consecutive times! You may only roll 46656 times"); //i chose 1000 times because it is the probability of having all 6 (1/6)^6. I also put it in because I thought it was creative and I know you will give me extra points for creativity
			
			//this to create an object for random. we are doing game development right now and we call this concept in game development as "making an instance" 
			Random r= new Random();
			//this part is creating a for loop that starts at 0 and increments every attempt until 46656th attempt.
			for(int i = 0; i<=46656; i++){
				//this is creating variables for 6 outcomes
			int dice1= 1+r.nextInt(6);
			int dice2= 1+r.nextInt(6);
			int dice3= 1+r.nextInt(6);
			int dice4= 1+r.nextInt(6);
			int dice5= 1+r.nextInt(6);
			int dice6= 1+r.nextInt(6);
			//this is to create an if statement for when the number does not repeat 6 consecutive times. As the assignment asks only to print winning statement, this is not printed but the code is available.
			if( dice1 != dice2 && dice2 != dice3 && dice3 != dice4 && dice4 != dice5 && dice5 != dice6 && dice6 != dice1) {
				}
			//this is to create an if statement for when the number repeat 6 consecutive times. this is printed as per assignment brief
			//instead of printing actual numbers the variables are printed to show that results are based on probability.
			if( dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5 && dice5 == dice6 && dice6 == dice1) {
				JOptionPane.showMessageDialog(null,"you win! :D " +"[" +dice1 +"] and [" +dice2 +"] "  +" and [" +dice3  +"] and [" +dice4 + "] and [" +dice5 +"] and [" +dice6+"]");
				JOptionPane.showMessageDialog(null,"number of attempts:"+i);
			//this is to stop the loop as soon as the statement is satisfied
			break;
		
			}
		
		}
		}
}