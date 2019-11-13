package csd;

public class App {
	
	public static void main(String[] args) 
	{
		for(int i=100;i<1000;i++)
		if(Number.kosul1(i) && Number.kosul2(i) && Number.kosul3(i) && Number.kosul4(i) &&
		Number.kosul5(i) && Number.kosul6(i) && Number.kosul7(i) )
			System.out.println(i); 
		}
	}
class Number {
	public static boolean isPrime(int val)
	{
		if(val<=1)
			return false;
		if(val%2==0)
			return val==2; 
		if(val%3==0)
			return val==3;
		if(val%5==0)
			return val==5;
		if(val%7==0)
		return val==7;
		
		for(int i=11;i*i<=val;i+=2)
			if(val%i==0)
				return false;
		return true;
			
	}  

	public static int getReverse(int val) {
		int reverse=0;
		while(val!=0) {
		reverse=reverse*10+val%10;
		val/=10;
		}
		return reverse;
	}

	public static boolean kosul1(int val)
	{
		if(getReverse(val)>val)
			return true;
		return false;
	
	}
	public static boolean kosul2(int val) {
		if(isPrime(val))
			return true;
		return false;
	}
	public static boolean kosul3(int val) {
		if (isPrime(getReverse(val)))
			return true;
		return false;
	}
	public static boolean kosul4(int val) {
		if(isPrime(val/10))
			return true;
		return false;
		
	}
	public static boolean kosul5(int val) {
		if (isPrime(val-(val/100)*100))
			return true;
		return false;
	}
	public static boolean kosul6(int val) {
		if (isPrime(getReverse(val-(val/100)*100)))
			return true;
		return false;
	}
	public static boolean kosul7(int val) {
		if (isPrime(getReverse(val/10)))
			return true;
		return false;
	}
}












