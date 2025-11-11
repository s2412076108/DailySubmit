class OuterClass{
	int x = 10;

  private void private_print(){
    System.out.println("Private method");
  }
	
	void outer_print(){
	  private_print();
	  //inner_print();
	  System.out.println("outer class (x): " +x);
	  //System.out.println("outer class (y): " +y); //error
	  
	  InnerClass inner_obj = new InnerClass();
	  inner_obj.inner_print();
	  System.out.println("outer class (y): " + inner_obj.y);
	}
	
	class InnerClass{
	  //x =1000; //error
	  int y = x + 10;
	  void inner_print(){
	    System.out.println("inner class (x): " +x);
	    System.out.println("inner class (y): " +y);
	  }
	}
}
class NestedClass{
	public static void main(String args[]){
	  OuterClass obj = new OuterClass();
	  obj.outer_print();
	  //obj.priavte_print(); //error
  }
}

//main class er obj sub clss er kono method or instance ke access korte parbe kina
