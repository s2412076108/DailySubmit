class Baba{
	Baba(){
		System.out.println("B cons");
	}
	
	void print(){
		System.out.println("Baba");
	}
}

class Chele extends Baba{
	Chele(){
		System.out.println("C cons");
	}
	
	void print(){
		System.out.println("Chele");
	}
}
class Nati extends Chele{
	Nati(){
		System.out.println("N cons");
	}
	//@Override
	void print(){
		System.out.println("Nati");
	}
}

public class herit{
	public static void main(String[] args){
	  Baba b = new Nati();
		b.print();
	
		Chele c = new Chele();
		c.print();
		
		Nati n = new Nati();
		n.print();
	}
}
