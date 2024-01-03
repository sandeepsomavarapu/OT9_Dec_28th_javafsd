class Variables_Ex  //PascalCase
{	
	//global variables -->instance,static
	boolean result=true;// 1 bit
	char gender='m';   //2 bytes global variables -->instance
	static int countryCode=91;//global variable -->static
	public static void main(String args[])
	{
		//local variables
		
		byte age=31;
		long contact=9494949494l;
		float salary=23.4538234682349f;
		double scientific=23.4538234682349;
		
		System.out.println(Variables_Ex.countryCode);//using static  variable by using classname	
		System.out.println(age+" "+contact+" "+salary+" "+scientific);
		
		Variables_Ex obj=new Variables_Ex();//object creation
		
		System.out.println(obj.result);//using instance variable by using objref

		
						
	}
	
}  