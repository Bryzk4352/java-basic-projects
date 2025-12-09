package projectapp;

import java.util.Scanner;

public class ProjectApp {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        int choice;
        do{
            String Choice[]= {"1) Sequence ", "2) Selection", "3) Looping", "4) Array", "Press 0 to Exit"};
            for(String opt: Choice){
                System.out.println(opt);
            }
            System.out.print("Select option to override: ");
            choice= s.nextInt();
             s.nextLine();

            switch(choice){
                case 1: 
                    System.out.println("Momentum of an object");
                    double p, m, v;
                    System.out.print("Mass(kg): ");
                    m= s.nextDouble();

                    System.out.print("Velocity(m/s): ");
                    v= s.nextDouble();

                    p= m*v;
                    System.out.println("Momentum of an object: "+ p);
                    System.out.println("");
                    break;

                case 2: 
                    System.out.println("Short Quiz");
                    String ans1, ans2, ans3, ans4;
                    int score=0;

                    System.out.print("Who is the national hero of Philippines? ");
                    ans1= s.nextLine().trim();

                    
                    if(ans1.equalsIgnoreCase("Jose Rizal")){
                        System.out.println("Answer Correct!");
                        score++;
                    }else {
                        System.out.println("Wrong Answer!");
                    }

                    System.out.print("What is the smallest unit of life? ");
                    ans2= s.nextLine(). trim();

                    if(ans2.equalsIgnoreCase("Cell")){
                        System.out.println("Answer Correct");
                        score++;
                    }else {
                        System.out.println("Wrong Answer!");
                    }

                    System.out.print("H2O commonly known as? ");
                    ans3= s.nextLine().trim();

           
                    if(ans3.equalsIgnoreCase("Water")){
                        System.out.println("Answer Correct!");
                        score++;
                    }else {
                        System.out.println("Wrong Answer!");
                    }
                    System.out.print("What is the hardest natural substance on Earth? ");
                    ans4= s.nextLine().trim();

               
                    if(ans4.equalsIgnoreCase("Diamond")){
                        System.out.println("Answer Correct!");
                        score++;
                    }else {
                        System.out.println("Wrong Answer!");
                    }

                  
                    System.out.println("Your Score: "+ score+ "/4");
                    System.out.println("");
                    break;

                case 3: 
                    System.out.println("Multiplication table of a whole number");
                    int multiplicand, prod, multiplier;

                   do{
                       System.out.print("Enter Multiplicand: ");
                       multiplicand= s.nextInt();
                       
                       if(multiplicand<=0){
                           System.out.println("Multiplicand must be positive");
                       }
                   }while(multiplicand<=0);
                 
                    do{
                        System.out.print("Enter Multiplier: ");
                        multiplier= s.nextInt();

                        if(multiplier<=0){ 
                            System.out.println("Multiplier must be positive");
                        }
                    }while(multiplier<=0);

         
                    System.out.println("Multiplication table of " + multiplicand);
                    for(int i= 1; i<=multiplier; i++){
                        prod= multiplicand*i;
                       
                        System.out.println(multiplicand+ " x "+ i+ " = "+ prod); 
                    }
                      System.out.println("");
                    break;

                case 4:
                    int n; 

                    do{
                        System.out.print("Enter the number of friends you want to include:");
                        n= s.nextInt();
                        s.nextLine();
                        if(n<0){
                            System.out.println("Invalid Input");
                        }else if(n==0){
                            System.out.println("Please input atleast 1");
                        }
                    }while(n<0 || n==0);

                    
                    String friendlist[]= new String[n];

                    
                    for(int i= 0; i<n; i++){
                        System.out.print("Enter "+ "#"+ (i+1)+ " Name: " );
                        friendlist[i]= s.nextLine();
                    }

                    System.out.println("Your FriendList: ");
                    for(String friends: friendlist){
                        System.out.println(friends);
                    }
                    System.out.println("");
                    break;

                case 0: 
                    System.out.println("Program ends.");
                    break;

                default: 
                    System.out.println("Invalid Input");
            }
        }while(choice!=0);
    }
}
