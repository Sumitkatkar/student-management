import java.util.*;

class studentInfo
{
	Scanner sc1 = new Scanner (System.in);
	ArrayList<Integer> a1 = new ArrayList<>();
	
	public int Add()
	{
		System.out.println("Enter your name");
   	    int name = sc1.nextInt();
		a1.add(name);
		System.out.println(a1);
		return(0);
	}
	public void Remove()
	{
		//a1.remove();
	}
	public void Show()
	{
		System.out.println("Your name is = "+a1);
		
	}
		
	public static void main(String args[])
	{
		Boolean temp = true;
		while(temp==true)
		{
			studentInfo s1 = new studentInfo();
			System.out.println(" 1.Add \n 2.Remove \n 3.Show \n 4.Exit");
			System.out.println("Enter your choice=");
			
			Scanner sc = new Scanner(System.in);
			int ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
						s1.Add();
						System.out.println("Adding...");
						break;
				case 2:
						s1.Remove();
						System.out.println("Removing...");
						break;
				case 3:
						s1.Show();
						System.out.println("Showing...");
						break;
				case 4:
						System.exit(0);
						break;
			}
		}
	}
	
}