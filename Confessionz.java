import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Confessionz {
    public static void main(String[] args){
        int choicez;
         //Load the custom image icon to display in the message dialog
        ImageIcon rizz = new ImageIcon(Confessionz.class.getResource("/Rizz.png"));

        //it repeat the confirmDialog if the user still choose the JPaneOption.NO_OPTION
        do {
        choicez= JOptionPane.showConfirmDialog
        (
            null,
            "Shall we go for a coffee date?",
            "uhmm",
            JOptionPane.YES_NO_OPTION
        );
             
            //response to no
            if(choicez== JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "hmm think again 😥","bruh", JOptionPane.INFORMATION_MESSAGE);

            };
        
       
        }while(choicez==JOptionPane.NO_OPTION&& true);

        //output of the JOptionPane.YES_OPTION
        if(choicez== JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog 
            (
                null,
                "Yay! You said YES! 🤩",
                "HEHE",
                JOptionPane.INFORMATION_MESSAGE,
                rizz


            );
        }
    }
}