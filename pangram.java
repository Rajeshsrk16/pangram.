import java.util.Scanner;

public class pangram {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	String s="abcdefghijklmnopqrstuvwxyz";
	char[] c=s.toCharArray();
	String s1=ss.nextLine();
	String s2=s1.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		if(!s2.contains(c[i]+""))
		{
			System.out.println("NOT A PANGRAM");
			System.exit(0);
		}
		
	}
	System.out.println("IT IS A PANGRAM");
	ss.close();}
}
