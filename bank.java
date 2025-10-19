import java.util.Scanner;
public class bank {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double balance; // declared dito sa labas (para magamit sa buong main)
        do{
            //do while loop kasi iloloop nya yung sa loob hangga't negative.
        System.out.println("Enter your initial balance: ");
         balance= s.nextDouble();
        
        if(balance<=0){     //condition checking
            System.out.println("Invalid. Balance must be Positive");
        }

          } while(balance<=0);
        int choice=0;
        while(choice!=4){ //loop hangga't 4 automatically mag stop na sya sa 4
            System.out.println("--Bank Menu--");
            System.out.println("1. Deposit: ");
            System.out.println("2. Withdraw: ");
            System.out.println("3. Check Balance: ");
            System.out.println("4. Exit");
            System.out.println("Choose an Option: ");
            choice= s.nextInt(); // para hindi mag infinite 
            

            if(choice==1) {
                System.out.println("Enter amount to deposit: ");
                double deposit= s.nextDouble(); 
                if(deposit>0){
                balance+=deposit;
              System.out.println("Successfully Deposited " + deposit);
                
            }  else{System.out.println("Error: Deposit must be start with positive number");
        }

            } else if(choice==2) {System.out.println("Enter Amount to Withdraw: ");
            double withdraw= s.nextDouble();
            
            if(withdraw<=0){
                System.out.println("Error: Withdraw must be positive");
            }
            else if(withdraw<=balance)
             {balance-=withdraw; //Nasa loob siya ng nested if dahil gusto mong bawasan lang ang balance kapag pasado na sa condition (withdraw <= balance).
                System.out.println("Successfully withdraw");
            }else{System.out.println("Insufficient Balance!");
          
            }
            }else if(choice==3) {
                System.out.println("Current Balance: " + balance);

            }else if(choice==4) {
                System.out.println("Thankyou for  using this bank system!");

            }else{System.out.println("Invalid Input");
        
        }


       
        }
        s.close();

    }
}
