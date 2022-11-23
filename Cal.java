

public class Cal {
     int n;

	public void div(int n) {
			if (n % 5 == 0)
				System.out.println("Number is divisible by 5");
			else
				System.out.println("Number is not divisible by 5");
		}

		public static void main(String[] args) {
			Cal c = new Cal();
			c.div(15);

		}

	}

