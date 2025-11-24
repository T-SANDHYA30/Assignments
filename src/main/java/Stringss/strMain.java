package Stringss;

public class strMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(s.hashCode());
		String s1="hello code";
		System.out.println(s1.hashCode());
		String s2="hello";
		System.out.println(s2.hashCode());    //hashcode means refering pointer of address
		System.out.println(s.length());
		System.out.println(s.indexOf('w'));
		System.out.println(s1.concat(s2));
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1==s2);       //comparing addresses
		System.out.println(s1.equals(s2));   //comparing values
		System.out.println(s.substring(0,4));   //0 is starting index and 4 is the last index
		String s6=new String("hello");
		String s7=new String("hello");
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6==s7); 
		System.out.println( s==s2); 
		System.out.println(s6.equals(s7));
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sbb = new StringBuffer("Hello");
		System.out.println(sb==sbb);
		System.out.println(sb.compareTo(sbb));

	}

}
