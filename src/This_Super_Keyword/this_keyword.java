package This_Super_Keyword;

public class this_keyword {
	
	int a = 10;
	int b = 20;
	
	public void m1() {
		
		int a = 30;
		int b = 40;
		System.out.println("local a: " +a);
		System.out.println("global a: " +this.a); 		//to access global variable/class variable into method(with local variable).
		System.out.println("local b: " +b);
		System.out.println("global b: " +this.b);		//this keyword can not used with static methods
	}

	public static void main(String[] args) {
		
		this_keyword t=new this_keyword();
		
		t.m1();
		
		//System.out.println("global: " +this.a);		//this keyword can not used with static methods
	}

}
