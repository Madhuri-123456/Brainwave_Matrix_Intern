import java.util.Scanner;
class AtmOperation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int balance=0;
		System.out.println("Set pin number");
		int pinNumber1=sc.nextInt();
		System.out.println("Enter pin number");
		int pinNumber2=sc.nextInt();
		if(pinNumber1==pinNumber2)
		{
			System.out.println("Choose below any one Operation");
			System.out.println("choose 1 for deposite operation");
			System.out.println("choose 2 for withdraw operation");
			System.out.println("choose 3 for balanace enquiry");
			System.out.println("choose 4 for pin change");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("you have choosen deposite operation");
				       System.out.println("Enter the amount to be deposited");
					   int depositeAmount=sc.nextInt();
					   balance=balance+depositeAmount;
					   System.out.println("Deposite Sucesssfully");
					   
				case 2:System.out.println("you have choosen withdraw operation");
				       System.out.println("Enter the amount to be withdraw");
					   int withdrawAmount=sc.nextInt();
						if(withdrawAmount<balance)
						{
							balance=balance-withdrawAmount;
							System.out.println("withdraw Sucesssfully");

						}
						else
						{
							System.out.println("Insufficient balance");
						}
						
				case 3:System.out.println("Remaining Balance is:"+balance);
				        
				case 4:System.out.println("you have choosen pin change");
				       System.out.println("enter pin number");
					   int pinNumber=sc.nextInt();
					   System.out.println("pin changed sucessfully");
					   break;
				default:System.out.println("Enter valid choice");
				        break;
			}
		}
		else
		{
			System.out.println("enter correct pin");
		}
	}
}
