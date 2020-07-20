package epam.task2_oop;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		NYG[] gifts = new NYG[5];
        gifts[0] = new candy("Dairy Milk",30);
        gifts[1] = new sweet("Barfi",10);
        gifts[2] = new candy("Barbone",20);
        gifts[3] = new sweet("RasMalai",5);
        gifts[4] = new candy("5Star",15);
        
        Scanner ob = new Scanner(System.in);
        int a = 1;
        System.out.println("Enter your choice As Per Given Instruction");
        System.out.println("Enter 1 to View candies in specific range of their quantities");
        System.out.println("Enter 2 to Pack specific Gift");
        System.out.println("Anyother to exit");
        while(a!=0)
        {
            System.out.println("=============================================================");
            System.out.println("Please Choose your option");
            a = ob.nextInt();
            switch(a){
                case 1:
                    System.out.println("Enter Range");
                    int l = ob.nextInt();
                    int r = ob.nextInt();
                    int c = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if(gifts[i].getQuantity()>=l && gifts[i].getQuantity()<=r )
                            c++;
                    }
                    if(c==0)
                    {
                        System.out.println("No Gifts Found Sorry");
                    }
                    else
                    	{
                    	  for (int i=0;i<=4;i++)
                    	   {
                    		  System.out.println("Gifts available in the given quantities are: ");
                    		  System.out.println(gifts[i].getName());
                    	   }
                    	}
                    System.out.println("Thanks for Visiting................");
                    break;

                case 2:
                    System.out.println("Enter the name of gift for you want to pack");
                    String s = ob.next();
                    int f = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if(s.toLowerCase().equals(gifts[i].getName().toLowerCase()))
                        {
                            gifts[i].pack();
                            f = 1;
                            break;
                        }
                    }
                    if(f==0){
                        System.out.println("Your Gift is not found, Please enter the gift name that are available in store");
                        for (int i = 0; i < 5 ; i++)
                        {
                            System.out.println(gifts[i].getName());
                        }
                    }
                    System.out.println("Thanks for visiting........");
                    break;

                default:
                	System.out.println("Thank you");
                    System.exit(0);
            }
        }

    }
}
