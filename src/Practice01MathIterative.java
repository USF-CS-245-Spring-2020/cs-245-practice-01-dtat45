
public class Practice01MathIterative implements Practice01Math {
	
	public int fact(int n) throws Exception{
		int f=1;
		if(n<0)
			throw new Exception("Answer is undefined...");
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}
	
	public int fib(int n) throws Exception{
		int fib=1;
		int prevFib=1;
		if(n<0)
			throw new Exception("Answer is undefined...");
		else if(n<=1)
			return n;
		for(int i=2;i<n;i++) {
			int temp=fib;
			fib+=prevFib;
			prevFib=temp;
		}
		return fib;
	}

}
//