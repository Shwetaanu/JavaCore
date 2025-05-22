package JavaPractice;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "100";
		int a= Integer.parseInt(test);
		System.out.println("Interger: "+a);
		
		String test2 = "200.01";
		Double b= Double.parseDouble(test2);
		System.out.println("Double: "+b);
		
		String str= String.valueOf(test2);
		
		System.out.println("String is: "+str);
				

	}

}
