public class Welocomezoho {
	public static void main(String[] args)
	{
		String s1="WELCOMETOKSRCECOLLEGE";
		int len=s1.length();
		String h=s1.substring(0, 3).toLowerCase();
		//System.out.println(h);
		String h1=s1.substring(3,len-3);
		//System.out.println(h1);
		String h2=s1.substring(len-3,len).toLowerCase();
		//System.out.println(h2);
		
		String result=h+h1+h2;
		System.out.println(" "+result+" " );
		for(int i=0;i<result.length();i++)
		{
			char c=result.charAt(i);
			System.out.print(" "+c);
		}
	}

}
