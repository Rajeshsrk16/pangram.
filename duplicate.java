
public class duplicate {
	public static void main(String[] args)
	{
		String s1="my name is rrajjeshh";
		String s2="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch!=' ' )
			{
				s2=s2+ch;
				s1=s1.replace(ch,' ');				
			}
		}
		System.out.println(s2);
}
	
}
