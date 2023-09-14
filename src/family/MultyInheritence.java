package family;



public class MultyInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		musicpalyer a=new musicpalyer();
		a.songs();
		a.tyers();
		a.engin();
		

	}

}
class car{  
	void engin(){System.out.println("designing the car...");}  
	}  
	class shift  extends car{  
	void tyers(){System.out.println("model of the car...");}  
	}  
	class musicpalyer  extends shift{  
	void songs(){System.out.println("android and ios ...");}  
	}  
	class TestInheritance2{ 
		
		
	}