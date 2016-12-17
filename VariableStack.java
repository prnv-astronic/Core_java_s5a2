package myPack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*====================================================================*/
public class VariableStack implements Stack{

	int stack;
	/*====================================================================*/	
	public VariableStack(int limit) // constructor 
	{
		stack=limit;		// initializing stack limit
	}
	
	/*====================================================================*/	
	public static void main(String[] args) 
	{
		int loop=0,check=0;	
		VariableStack c1=new VariableStack(10);// object for varstack classs
		Scanner scan=new Scanner(System.in);// scanner class object
		check=c1.pop();		// Retrieving stack size
		for(loop=0;loop<=check;loop++)
		{
			System.out.println("Enter Integer Value:"+(loop+1));
			scan.nextInt();
			if(loop==check)		// if stack size reached
			{
				c1.push(check+1);	// update stack size
				System.out.println("New Stack size: "+(c1.pop()));	// printing updated stack size
				check=c1.pop();	// loop limit increased
			}
		}

	}
	/*====================================================================*/
	@Override
	public void push(int I) 
	{
		// TODO Auto-generated method stub
		System.out.println(I);		// update stack size
		stack=I;
	}

	@Override
	public int pop() {	
		// TODO Auto-generated method stub
		return stack;
	}


}
