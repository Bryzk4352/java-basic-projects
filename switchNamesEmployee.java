import java.util.Scanner;
public class switchNamesEmployee{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Name:");
        String names= s.nextLine();

        
        switch(names) {
            case "Bryan":
            System.out.println("Hello Bryan!");
            break;

            case "Bruno":
            System.out.println("Hello Bruno!");
            break;

            case "Jopay":
            System.out.println("Hello Jopay!");
           break;

          default :
          System.out.println("You're not Recognized");
          break;
        }
    }
}