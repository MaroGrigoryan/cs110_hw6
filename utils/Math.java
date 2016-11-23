package utils;

public class Math {

	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		return n*factorial(n-1);
	}
	public static int factorialLoop(int n){
		int a = 1;
		for (int i=n; i>0; i--){
			a = a*i;
			}
		return a;
		}
	 
}
