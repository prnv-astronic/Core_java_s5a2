package myPack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*======================================================================*/
public class FixedStack implements Stack{
	int stack=0;
	
	FixedStack(int limit)	// stack limit initialized to fixed value in constructor 
	{
		stack=limit;
	}
/*======================================================================*/	
	public static void main(String[] args) {
		int loop=0,check=0;
		FixedStack b1 =new FixedStack(10);	// creating object for class stack size init
		Scanner scan=new Scanner(System.in);// scanner class object

		
		check=b1.pop();	// Retrieving stack size..
		for(loop=0;loop<check;loop++)		// for loop for accepting values
		{
			System.out.println("Enter Integer Value:"+(loop+1));
			scan.nextInt();
		}
		System.out.println("Stack Overflow...");	// out of loop size overflow
		

	}
	/*======================================================================*/	
	@Override
	public void push(int I) {	
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return stack;
	}


}
