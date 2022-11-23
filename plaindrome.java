public class plaindrome {
	
	int r,n,sum=0,temp;
	
	public void plain(int n)
	{
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			if (temp==sum)
				System.out.println("plaindrome number");
			else
				System.out.println("not plaindrome number");
		}
		
	}

	public static void main(String[] args) {
		
		plaindrome p=new plaindrome();
		p.plain(134);

	}

}
