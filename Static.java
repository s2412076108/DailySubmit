class Class1{
	int x = 10;
	static int y = 20;
	private int z = 30;
	
	class inner{
	
	}
}
class Static{
	public static void main(String args[]){
		//Access members of other class through object
		Class1 obj = new Class1();
		//System.out.println(x);//compile-time error; x is not accessed by object
		System.out.println("x: " + obj.x);
		//System.out.println("z " + obj.z);//compile-time error
		System.out.println("y: " + obj.y);
		
		//Access members through other class
		System.out.println("y: " + Class1.y);
	}

}
