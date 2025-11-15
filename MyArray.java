package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	private int count;
	
	//Define array
	public MyArray() {
		arr = new int[5];
	}
	
	//add elements in array
	public boolean add(int x) {
		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		return false;
	}

	// Find addition of digits of all every individual number in the array
	public void addAll() {
		System.out.println("1. The Addition of elements of Array Are  ");
		int num = arr.length;
		for (int i = 0; i < num; i++) {
			int temp = arr[i];
			int sum = 0;
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			System.out.println("Sum of digits for is: " + sum);
		}
	}

	
	//find factorial					
	private int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	
	//find prime number
	 private boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false; 
	            }
	        }
	        return true;
	    }
	 //Factorial of prime number in array
    public void primeFact() {
    	System.out.println("-------------------------------------------");
		System.out.println("2. The factorial of Prime Are ");
        for (int num : arr) {
            if (isPrime(num)) {
                long fact = Factorial(num);
                System.out.println("The fact of "+num+" is :"+ fact);
            }
        }
    }
    
    public void maxPrime() {
    	System.out.println("-------------------------------------------");
		System.out.println("3. The max from Prime is : ");
		int max = 0;
		for(int num : arr) {
			if(isPrime(num)) {
				 max = num;
				}	
			}	
		
		if(max!=0) {
    	System.out.print("The Maximum is : "+max);
    }
    else {
    	System.out.print("Prime number not found");
    }
		}
 
//	
//        public void copyArray() {
//            int[] temp = new int[arr.length];
//
//            for (int i = 0; i < arr.length; i++) {
//                int num = arr[i];
//                
//                if (isPrime(num) && num < 5) {
//                    temp[i] = reverseNumber(num);
//                } else {
//                    temp[i] = num;
//                }
//            }
//        }
        
//        public int reverseNumber(int num) {
//            int reversed = 0;
//            int originalNum = num;
//
//  	          while (num != 0) {
//                int digit = num % 10;
//                reversed = reversed * 10 + digit;
//                num /= 10;
//            }
//            return reversed;
//        }

        public void copyArray() {
            for (int i = 0; i < arr.length; i++) {
               
                if (isPrime(i)) {
                    
                    arr[i] = reverseNumber(i);
                } else {
                   
                    arr[i] = 0; 
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        
        
        public boolean isPrime1(int num) {
            if (num <= 1) {
                return false;
            }
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    return false;
                }
            }
            return true;
        }
        
        public int reverseNumber(int num) {
            int reversed = 0;
            // int originalNum = num; // Not strictly needed here
            
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return reversed;
        }
    }
     public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}

	

}
