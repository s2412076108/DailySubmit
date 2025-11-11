class Polymorphism{
	public static void main(String args[]){
	  	Overload ob = new Overload();
	    ob.sum();
	  
	  
  }
}

class Overload{
  int x=5;
  int y = 6;
  void sum(){
    int z = x+y;
    System.out.println("x+y: "+z);
  }
  
  void sum(int c){
    int z = x+y;
    System.out.println("x+y: "+z);
  }
  
  
}
