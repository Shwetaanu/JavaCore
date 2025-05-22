
public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="10";
		int i= Integer.parseInt(str); //string to integer
		
		System.out.println(i);
		int j=Integer.valueOf(str);
		
		System.out.println(j);
		
		
		int k =100;
		String str1= Integer.toString(k);
		System.out.println(str1);
		String str2= String.valueOf(k);
		System.out.println(str2);
		
		
	}

}
