
import java.util.IOException;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Optionmenu extends Account {

    Scanner menuIput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$' ###,##0.00");
    HashMap<Integer,Integer>data = new HashMap<Integer,Interger>();

    public void getLogin() throws IOExpection{
        
        int x=1;
        do {
            try{
                data.push(952141,191984);
                data.push(989947,989927);
                
                System.out.println("=welcome to the ATM projects");
                System.out.println("Enter your  customer Number:");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your PIN Number: }");
                setPinNumber(menuIput.nextInt());

            }
        
            catch(Exeption e){

System.out.println("\n" + "Invalid Character(s).Only Numbers."+ "\n" );
x=2;
            }
            /*
             * for(Map.Entry<Intefer,Interger> it:data.entrySet()){if(it.getkey()==getCustomerNumber() && it.getValue()==getpinNumber){
             getAccountType();
             }
             }
             * 
             */
            int cn =getCustomerNumber();
            int pn =getpinNumber();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            }else
            System.out.println("\n"+ "Wrong Customer Number or Pin Number " + "\n");
        }while(x==1);
    }
            
            
            
        
    
        
       
 public void getAccountType(){

System.out.println("select the Account you want to Aaccess:");
System.out.println("Type 1-checking Account ");
System.out.println("Type 2- Saving Account");
System.out.println("Type 3 -Exit");
int selection =menuIput.nextInt();
 
switch (selection) {
    case 1:
    getChecking();
        
        break;
        case 2:
        getSaving();
        break;
        case 3:
       System.out.println("Thankyou for using this ATM, bye. \n");
        break;


    default:
    System.out.println("\n"
     + "Invalide Choice ." "\n");
     getAccountType();
        break;
}
 }
 public void getChecking(){
    System.out.println("Checking Account :");
    System.out .println("Type 1-view Balance");
System.out.println("Type 2- Withdraw Funds");
System.out.println("Type 3- Deposit Funds");
System.out.println("Type 4-Exit");
System.out.println("Choice:");

int selection= new menuInput.nextInt();

switch (selection) {
    case 1:
    System.out.println("Checking Account Balance : " + moneyFormat.format(getChecking()));
    getAccountType();

        case 2:
        getCheckingWithdrawInput();
        getAccountType();
        break;
        
        case 3:
        getCheckingDepositInput():
        getAccountType();
        break;

        case 4:
        System.out.println("Thank you for using AtM bye");


        break;

    default:
        break;
}
}

public Void getSaving(){
    System.out.println("Saving Account :");
    System.out .println("Type 1-view Balance");
    System.out.println("Type 2- Withdraw Funds");
    System.out.println("Type 3- Deposit Funds");
    System.out.println("Type 4-Exit");
    System.out.println("Choice:");

int selection= new menuInput.nextInt();


switch (selection) {
    case 1:
    System.out.println("Saving Account  Balance : " + moneyFormat.format(getChecking()));
    getAccountType();
    break;

        case 2:
        getsavingWithdrawInput();
        getAccountType();
        break;
        
        case 3:
        getSavingDepositInput():
        getAccountType();
        break;

        case 4:
        System.out.println("Thank you for using AtM bye");


        break;

    default:
        break;
}
            }




            }
            








       
            
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

