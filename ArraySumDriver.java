public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		int i = 0;
		int[] myArray2 = new int[20];
		myArray2[i++] = 1;
		myArray2[i++] = 1;
		System.out.println("\n\n" + "Fibonacci Numbers");	
		System.out.println(fibonacciNumbers(5, myArray2));	
		System.out.println(fibonacciNumbers(10, myArray2));
		System.out.println(fibonacciNumbers(19, myArray2));	
		
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {
		int sum = arr[num];
		if(num > 0)
			sum += sumOfArray(arr, --num);
		return sum;
	}
	
	public static int fibonacciNumbers(int fib, int[] array) {
		if(fib == 0 || fib == 1)
			return array[fib];
		else { 
			array[fib] = fibonacciNumbers(fib-1, array) + fibonacciNumbers(fib-2, array);
			return array[fib];
		}
	}

}