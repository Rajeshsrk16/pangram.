
public class doublechar {


	public static void main(String args[]) {

		String s1 = "abbaabba";
		for(int i=0;i<s1.length();i++)
		{
		String s2 = s1.substring(0, i+1);
	System.out.println(s2);
		String s3= s1.substring(i+1);
		//System.out.println(s3);
		String result=s2+s3;
		//System.out.println(result);
		int len=result.length()/2;
		//System.out.println(len);
		String original=result.substring(0,len);
		//System.out.println(original);
		String a=result.substring(len);
	   //	System.out.println(a);
		//System.out.println(d);
		//System.out.println(w);
		if(original.equals(a))
		{
			System.out.println("double");
			break;
		}
		else
		{
			System.out.println("no double");
			break;
		}
	
	}
}


}
