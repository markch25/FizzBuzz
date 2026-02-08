// FizzBuzz Program. Prints "Fizz" for multiples of 3, "Buzz" for multiples of 5, and "FizzBuzz" for multiples of both.

import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		int x = 1;
		
		while(x <= 50)
		{
			if (x % 3 == 0 && x % 5 == 0)
				System.out.println("FizzBuzz");
			else if (x % 3 == 0)
				System.out.println("Fizz");
			else if (x % 5 == 0)
				System.out.println("Buzz");	
			else
				System.out.println(x);
			x++;	
		}

	}

}
