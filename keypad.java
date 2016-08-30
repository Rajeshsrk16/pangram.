import java.util.Scanner;

public class keypad {
	public static void main(String[] args)
	{
	Scanner scr=new Scanner(System.in);
	String d=scr.nextLine();

	switch(d)
	{
	  default :
	    	System.out.println("INVALID/NULL");
	    	break;
	case "1":
		System.out.println("INVALID");
		break;
	case "2":
		System.out.println("abc");
		break;
	case "3":
		System.out.println("def");
		break;
	
	case "4":
	
		System.out.println("ghi");
		break;
	case "5":
		System.out.println("jkl");
		break;
	case "6":
		System.out.println("mno");
		break;
	case "7":
		System.out.println("pqrs");
		break;
	case "8":
		System.out.println("tuv");
		break;
	case "9":
	System.out.println("wxyz");
	break;
  
	}
	scr.close();
	}
}
