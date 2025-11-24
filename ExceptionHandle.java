/*
class ExceptionHandle{
	public static void main(String args[]){
		int a[] = new int[2];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3; //error out of bound 2
	}
}
*/

class ExceptionHandle{
	public static void main(String args[]){
	  try{
		  int a[] = new int[2];
		  a[0] = 1;
		  a[1] = 2;
		  a[2] = 3; //error out of bound 2
	  }
	  catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("Array out of index problem: " + e);
	  }
	  catch(ExceptionType exception_type_variable){
	    //Instructions for handling Exception
	  }
	}
}
