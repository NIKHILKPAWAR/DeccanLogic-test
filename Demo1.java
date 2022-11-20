package Deccan;

public class Demo1 {

	public static void main(String[] args) {
		String a="It is a long established fact that a reader will be distracted by "
				+ "the readable content of a page when looking at its layout. "
				+ "The point of using Lorem Ipsum is that it has a more-or-less"
				+ " normal distribution of letters, as opposed to using 'Content here,"
				+ " content here', making it look like readable English. "
				+ "Many desktop publishing packages and web page editors now use "
				+ "Lorem Ipsum as their default model text, and a search for 'lorem ipsum'"
				+ " will uncover many web sites still in their infancy."
				+ " Various versions have evolved over the years. sometimes by accident, "
				+ "sometimes on purpose (injected humour and the like).";
		String b="is";
		
		System.out.println(a);
		
		String [] ch1=a.split(" ");
		
		for(int i=0;i<=ch1.length-1;i++)
		{ 
			//System.out.println(ch1[i]);
			if(ch1[i].equals(b))
			{
				//c=c+ch1[i];
				//System.out.println(c);
			}
			else
			{
				System.out.print(" "+ch1[i]);
			}
		}
			
	}


}
