package This_Super_Keyword;

public class super_class {

	int a = 10;
	
	public void m2() {
		
		int a = 20;
		System.out.println("local of m2: " +a);							//20
		System.out.println("global of super_class: " +this.a); 			//10
	}
	
}
