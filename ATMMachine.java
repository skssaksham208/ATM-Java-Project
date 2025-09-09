import java.util.Scanner;
class ATM
{
    float BAL = 100000;
    int PIN = 2345;

    public void checkpin()
    {
        Scanner sc = new Scanner(System.in);
        for(int attempts = 1; attempts<=3; attempts++)
        {
            System.out.println("Enter your pin : ");
            int enteredpin = sc.nextInt();
            if(enteredpin == PIN)
            {
                menu();
            } 
            else
            {
            System.out.println("Invalid PIN! You have " + (3 - attempts) + " attempts left. ");
            }
        }
    }   

    public void menu()
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance:");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if (opt == 1)
        {
            checkBalance();
        }
        else if (opt == 2)
        {
            WithdrawMoney();
        }
        else if(opt == 3)
        {
            DepositMoney();
        }
        else if(opt == 4)
        {
            System.out.println("Exiting...");
        }
        else 
        {
            return;
        }
    }
    public void checkBalance()
    {
        System.out.println("Balance: " + BAL);
        menu();
    }

    public void WithdrawMoney()
    {
        System.out.println("Enter Amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>BAL)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            BAL = BAL - amount;
            System.out.println("Money Withdrawl Successful!!!");
        }
        menu();
    }
    public void DepositMoney()
    {
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        BAL = BAL + amount;
        System.out.println("Money Deposited Successful!!!");
        menu();
    }
}

public class ATMMachine 
{
    public static void main(String[] args) 
    {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
