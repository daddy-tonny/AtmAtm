import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

private int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance = 0;

Scanner input= new Scanner(System.in);
DecimalFormat moneyFormat= new DecimalFormat(" '$'###,##0.00");
public int setCustomerNumber(int customerNumber){this.customerNumber = customerNumber;
return customerNumber;}
public int getCustomerNumber(){
    return customerNumber;
}
public int setPinNumber(int pinNumber){this.pinNumber = pinNumber;
    return pinNumber;}
    public int getPinNumber(){
        return pinNumber;
    }
    /*public double setCheckBalance (double checkBalance){this.checkBalance = checkBalance;
        return checkBalance;}*/
        public double getCheckingBalance(){
            return checkingBalance;
        }
       /*  public double setSavingBalance(double savingBalance){this.savingBalance= savingBalance;
    return savingBalance ;}*/
    public double getSavingBalance(){
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
 }
     public double calcSavingWithdraw(double amount){
    savingBalance =(savingBalance - amount);
    return savingBalance;
 }
   public double calcCheckingDeposit(double amount){
checkingBalance =(checkingBalance + amount);
return checkingBalance;

   }
   public double calcSavingDeposit(double amount){
    savingBalance= (savingBalance + amount);
    return savingBalance;
   }
   //buisness fuction which applies the above methods to check for their functionalities
   public void getCheckingWithdrawInput(){
    System.out.println("checking Amount Balance:" + moneyFormat.format(checkingBalance));
    System.out.println("Amount you want to withdraw from checking Account:");
    double amount = input.nextDouble();
     
   
if((checkingBalance -amount)>=0){
    calcCheckingWithdraw(amount);
    System.out.println("New checking amount Balance:" + moneyFormat.format(checkingBalance)); 
}
else{
    System.out.println("balance cannot be nagative," + " \n");
}

    
    }
    public void getsavingwithDrawInput(){
      System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
      System.out.print("Amount you want to withdraw from saving accounts:");
      double amount = input.nextDouble();
      if ((savingBalance - amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("New saving Account Balance:" + moneyFormat.format(savingBalance));
      }
else{
    System.out.println("Balance Cannot be nagative:"+"\n");
}

    }

  public void getCheckingDepositInput(){
    System.out.println("checking Amount Balance:"+ moneyFormat.format(checkingBalance)
    );
    System.out.print("Amount you want to deposit from checking Account:");
    double amount=input.nextDouble();

    if((checkingBalance+amount)>=0){

     calcCheckingDeposit(amount);
System.out.println("New checking Amount Balance:" + moneyFormat.format(checkingBalance));


    }else{
        System.out.println("Balance Cannot be nagative." + "\n");
    }
  } 
  public void getSavingDepositIput(){
    System.out.println("saving Account Balance:" + moneyFormat.format(savingBalance));
    System.out.print("Amount you want to deposit to saving Account");
    double amount = input.nextDouble();
  
  if((savingBalance + amount)>=0){
    calcSavingDeposit(amount);
    System.out.println("New saving Account Balance:" + moneyFormat.format(savingBalance));
  }
  else{
    System.out.println("Balance cannot be nagative,"+ "\n");
  }
}
}
