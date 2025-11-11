class Class1{
    int x = 10;
    int y;
    
    Class1(int a, int b){
    x = a;
    y = b;
    System.out.println("Constructor\n");
  }
  
  void print(){
    System.out.println("Hello\n");
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    
  }
}

class constructor{
	  public static void main(String arg[] ){
	    Class1 c = new Class1(20,30);
	    Class1 b = new Class1(200,300);
	    c.print();
	    b.print();
	}
	
}
