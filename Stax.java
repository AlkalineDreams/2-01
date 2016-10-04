/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;

public class Stax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("gimme a string");
		
		String numbahString = br.readLine();
		
		//uncomment this stuff to change it back to an int array
		//int numbah = Integer.parseInt(numbahString);
		
		MrCoxallStack stackOne = new MrCoxallStack();
		stackOne.push(numbahString);
		
		
		for (int counter = 0; counter > -1; counter++) {
			
			System.out.println("gimme a string, or type pop (remove from stack), peek(look at first item), or clear(clear stack)");
			
			numbahString = br.readLine();
			
			if (numbahString.equals("pop")) {
				// when the user inputs pop 
				try {
					System.out.println(stackOne.pop());
				}
				catch (EmptyStackException e)
				{
					System.out.println("There's nothing left on the stack to pop!");
				}
				
			} else if (numbahString.equals("clear")){
				
				stackOne.clear();
				System.out.println("Stack cleared.");
				
			} else if (numbahString.equals("peek")){
				
				try {
					System.out.println(stackOne.peek());
				}
				catch (EmptyStackException e)
				{
					System.out.println("Nothing left on the stack to peek at!");
				}
				
			} else {
				
				//uncomment this stuff to change it back to an int array
				//numbah = Integer.parseInt(numbahString);
				
				//stackOne = new MrCoxallStack();
				stackOne.push(numbahString);
				
			}
			
		}
		

		
		
	}

}
