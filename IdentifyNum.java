
package identifynum;
import java.util.Scanner;
public class IdentifyNum {
  
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        int num;
        System.out.println("Enter a whole number:");
        num=s.nextInt();
        
        if(num>0){
            System.out.println(num+ " is a positive number");
            
        }else if(num==0){
            System.out.println(num+ " is neither positive nor negative");
       
        }else{
                System.out.println(num+ "is a negative number");
                }
        
        
        
            if(num%2 ==0){
                System.out.println(num+ " is even number");
                
            }else{
                System.out.println(num+ " is odd number ");
               
            }
            boolean IsNotPrime= false;   /* 
             /* 
      Initialized to false because we assume the number might be prime at first.
           The condition (num > 1) checks if the number is greater than 1, 
           since 0, 1, and negative numbers are not prime numbers.
        
        */
            if(num>1){
                for(int i=2; i<=Math.sqrt(num); i++){
                    if(num% i ==0) { /*
                              
                              checking if the num is divisible by 2 and 
                        remainder 0. It means that it is not a prime number
                        */
                       IsNotPrime= true;
                       break;
                    }
                }
            }
            if(num<1 || IsNotPrime) // condition again
            {
                System.out.println(num+ " is  not prime number");
                
            }else{
                System.out.println(num+ "is  prime number");
            }
        }
    }
    

