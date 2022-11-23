package practice2;

public class Reverse {

	int r=0,rem,n;
	
	public void res(int n)
	{
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
			
			System.out.println("reverse no is:"+r);
		}
	}

	public static void main(String[] args) {
		
		Reverse r=new Reverse();
		r.res(342);

	}

}


