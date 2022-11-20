package Deccan;

public class Demo2 {

	public static void main(String[] args) {
		String str[]= {"Cercilo Johnes","Cordeil Acott","Curtice Bleue","Dalis Menary",};
             str[0].split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			//System.out.println(str[i]);
			/*for(int j=0;j<=1;j++)
			{*/
			
				char a=str[i].charAt(0);
				//System.out.println(a);
				if(str[i].charAt(0)=='C' ||str[i].charAt(0)=='c' && str[i].charAt(1)=='e')
				{
					System.out.println(str[i]);
				}
				
				
			//}
		}
	}

}
