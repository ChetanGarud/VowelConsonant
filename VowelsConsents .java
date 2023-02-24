import java.util.Scanner;
class VowelsConsents 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character is :");
		char character=sc.next().charAt(0);

		if(char>=65 && char<=90 || char>=97 && char<=122)
	   {
		 if(char=='a' || char=='A')
			{
				System.out.println("Enter Alphabates"+ character+"It is Vowel");
			}
		 else if(char=='e' && char=='E')
			{
			 	System.out.println("Enter Alphabates"+ character+"It is Vowel");
			}	
		 else if(char=='i' && char=='I')
			{
				System.out.println("Enter Alphabates"+character+"It is Vowel"); 
			}
		 else if(char=='o' && char=='O')
			{
			 	System.out.println("Enter Alphabates"+character+"It is Vowel");
			}
		 else if(char=='u' && char=='U')
			{
				System.out.println("Enter Alphabtes"+character+"It is Vowel"); 
			}
	   }
	      else
			{
			  System.out.println("Enter Alphabates are Not Vowel this are Consonents");
			}
	}
}
