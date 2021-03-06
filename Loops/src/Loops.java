
public class Loops {

	public static void main(String[] args) {
		int[] numbersArray = new int[] { -1, 21, 33, 55, 34, 45, 64, 72, -63 };
		FindLargestNumberUsingWhileLoop(numbersArray);
		LargestNumberUsingForLoops(numbersArray);
	}

	public static void FindLargestNumberUsingWhileLoop(int[] numbers) {
		if (numbers != null) {
			if (numbers.length > 0) {
				int i = 1;
				int largestNumber = numbers[0];
				while (i < numbers.length) {
					if (largestNumber < numbers[i]) {
						largestNumber = numbers[i];
					}
					i++;
				}
			}
		}
	}

	public static void FindLargestNumberUsingLoops(int[] numbers) {
		if (numbers != null) {
			if (numbers.length > 0) {
				int i;
				int largestnumber = numbers[0];
				for (i = 1; i < numbers.length; i++) {
					if (largestnumber < numbers[i]) {
						largestnumber = numbers[1];
					}
				}
				System.out.println("Largest number using while loop is");
			}
		}
	}

	public static void LargestNumberUsingForLoops(int[] numbers)  {
		if (numbers != null)
		{
			if(numbers.length > 0)
			{
				int largestnumber = numbers[0];
				
				for (int i = 1; i < numbers.length; i++)
				{
					if(largestnumber < numbers[i])
					{
						largestnumber = numbers[i];
					
					}
				}
				
				System.out.println("Largest number using for loop is " + largestnumber);
					}
				}
			}
		}