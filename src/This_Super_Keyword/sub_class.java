package This_Super_Keyword;

public class sub_class extends super_class
{

	int a = 30;
	
	public void m3() {
		
		
		System.out.println("global of super_class by using super keyword : " +super.a);      //  10
	}
	
	
	/*public static void ext() {
		
		sub_class v=new sub_class();
		
		
		v.m2();
	}*/
}


// we can not use static method with super keyword

/* to access global(class) variable from another class we use super keyword (in non static method) and then 
creates object of subclass and call global variable of super class by calling method */