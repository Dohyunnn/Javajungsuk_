
public class Ex5_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str= "ABCDE";// 01234 
		 char ch = str.charAt(4);
		 System.out.println(ch);
		
		 String str2 = str.substring(1,4); // 1-3
		 String str3 = str.substring(1,str.length());// 1-4
		 String str4 = str.substring(1);// 1บฮลอ~
		 
		 System.out.println(str2);
		 System.out.println(str3);
		 System.out.println(str4);
	}

}
