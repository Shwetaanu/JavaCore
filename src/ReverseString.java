
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Test java";
System.out.println(str.charAt(0));

String s="";

for(int i=str.length()-1;i>=0;i--)
{
	s = s+ str.charAt(i);
	
}
System.out.println(s);

StringBuffer st = new StringBuffer("testing java");

System.out.println(st.reverse());


	}

}
