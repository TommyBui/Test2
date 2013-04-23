import javax.swing.JOptionPane;


public class DiceGame
{
	public static void main(String[] args)
	{
		//set up a boolean variable to break the loop so that the player can play as many times as they want
		boolean gameNotOver = true;
		
		//begin do loop
		do{	
			//PartI - Play the game with 1 die
			JOptionPane.showMessageDialog( null, "Welcome to the dice game!" );
			JOptionPane.showMessageDialog( null, "Click OK to roll the die." );
		
			//instantiate class Dice
			Dice game1 = new Dice();
		
			//roll the die
			int rollResult = game1.Roll();
		
			//debug code
			//JOptionPane.showMessageDialog( null, "The result is " + rollResult + " you wascally wabbit!" );
		
			//ask the user to enter high or low
			String guess = JOptionPane.showInputDialog( null, "The die has been rolled. Guess high (enter h) or low (enter l)." );
		
			//make two branches for correct guesses and an else trap for incorrect guesses
			if ( (guess.equals("H")) || (guess.equals("h")) && (rollResult >= 4) )
			{
				JOptionPane.showMessageDialog( null, "That's right! The answer was " + rollResult + "." );
			}
			else if ( (guess.equals("L")) || (guess.equals("l")) && (rollResult <= 3) )
			{
				JOptionPane.showMessageDialog( null, "That's right! The answer was " + rollResult + "." );			
			}
			else
			{
				JOptionPane.showMessageDialog( null, "Sorry, that's not correct.  The answer was " + rollResult + "." );
			}
		
		
			//Part II - Play the game with 2 dice
			JOptionPane.showMessageDialog( null, "Ready to play with 2 dice now?" );
			JOptionPane.showMessageDialog( null, "Click OK to roll the dice." );
		
			//instantiate a second instance of Dice
			Dice game2 = new Dice();
	
			//roll the dice
			int rollResult1 = game1.Roll();
			int rollResult2 = game2.Roll();
		
			//combine the results of each roll to get the total roll
			int totalRoll = (rollResult1 + rollResult2);
		
			//debug code
			//JOptionPane.showMessageDialog( null, "Die 1 is " + rollResult1 + " you wascally wabbit!" );
			//JOptionPane.showMessageDialog( null, "Die 2 is " + rollResult2 + " you wascally wabbit!" );
			//JOptionPane.showMessageDialog( null, "The total roll is " + totalRoll + " you wascally wabbit!" );
		
			//ask the user to enter high or low		
			guess = JOptionPane.showInputDialog( null, "The dice have been rolled. Guess high (enter h) or low (enter l)." );
		
			//make two branches for correct guesses and an else trap for incorrect guesses
			if ( (guess.equals("H")) || (guess.equals("h")) && (totalRoll >= 7) )
			{
			JOptionPane.showMessageDialog( null, "That's right! The answer was " + totalRoll + "." );
			}
			else if ( (guess.equals("L")) || (guess.equals("l")) && (totalRoll <= 6) )
			{
				JOptionPane.showMessageDialog( null, "That's right! The answer was " + totalRoll + "." );			
			}
			else
			{
				JOptionPane.showMessageDialog( null, "Sorry, that's not correct.  The answer was " + totalRoll + "." );
			}
		
			String playAgain = JOptionPane.showInputDialog( null, "Would you like to play again? (Enter 1 for yes and 2 for no)" );
			
			if (playAgain.equals("2"))
			{
			gameNotOver = false;
			}
		} while(gameNotOver);
		
		//exit messages
		JOptionPane.showMessageDialog( null, "Thanks for playing!  Bye!" );
		JOptionPane.showMessageDialog( null, "Exiting Program..." );
		
	} // end main
} // end class DiceGame