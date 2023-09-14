package family;



public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human a=new human();
		a.raiding();
		a.race();
		



}

}
class cycle{  
void race(){System.out.println("speed ...");}  
}  
class human extends cycle{  
void raiding(){System.out.println("velocity...");}  
}  
class TestInheritance{  
public static void main(String args[]){ 
}
}
