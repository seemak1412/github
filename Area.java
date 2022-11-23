

public class Area {
	int side;
	public void square_area(int side)
	{
		int area;
		area=side*side;
		
		System.out.println("area of square:"+area);
	}
	
	
	

	public static void main(String[] args) {
		Area a=new Area();
		a.square_area(5);
		

	}

}
