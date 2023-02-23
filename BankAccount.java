package atmInterface;

import java.util.Scanner;

class Atm{
	static void account(int pincode,int balance){
		System.out.println("Enter pincode");
		Scanner sc=new Scanner(System.in);
		int countWithdraw=0;
		int countDeposit=0;
		int countTransfer=0;
		int amount=0;
		int deposit=0;
		int withdraw = 0;
		int pwd=sc.nextInt();
		boolean b=true;
		if(pwd==pincode){
			while(b){
		System.out.println("\n Select options:\n 1.Withdraw \n 2.Deposit \n 3.Transfer \n 4.Tansaction History \n 5.Check Balance \n 6.Quit");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter money to withdraw");
//			int withdraw=sc.nextInt()
			 withdraw=sc.nextInt();
//			balance=balance-withdraw;
			if(balance>=withdraw){
				balance=balance-withdraw;
			System.out.println("Withdraw amount successfully"+"\n Please collect your money");
			System.out.println("Balance after withdraw "+balance);
			}else{
				System.out.println("Insufficient balance");
			}
			 countWithdraw++;
			break;
		case 2:
			System.out.println("Enter money to Deposit");
//			int deposit=sc.nextInt();
			 deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println("Money is succefully Deposited to your bank account");
			System.out.println("Balance after deposite "+balance);
			countDeposit++;
			break;
		case 3:
			
			System.out.println("Enter money to tranfer");
//			int amount=sc.nextInt();
			 amount=sc.nextInt();
			if(balance>=amount){
				balance=balance-amount;
				System.out.println("ABC a/c XX123 debited Rs."+amount+" and credited to Person2");
				System.out.println("Balance after transfer "+balance);
			}else{
				System.out.println("Tranfers fails due to Insufficient balance");
			}
			countTransfer++;
			break;
		case 4:
			System.out.println("Transaction details");
			if(countWithdraw>=1 || countDeposit>=1 || countTransfer>=1){
				System.out.println("withdraw amout: "+withdraw+"\n Depsite amount: "+deposit+"\n Transfer amount: "+amount);
			}
			else{
				System.out.println("Not have any History");
			}
			break;
		case 5:
			System.out.println("Balance is "+balance);
			break;
		case 6:
			System.out.println("Thank you for using our services");
			b=false;
		}
		}
		}else{
			System.out.println("Wrong pincode \n try again");
		}
	}
}
public class BankAccount {

	public static void main(String[] args) {
Atm.account(2410,10000);
	}

}
