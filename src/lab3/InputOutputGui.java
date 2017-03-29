package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = null;
        boolean isNotComplete = false;
       do {
            try {
                fullName = JOptionPane.showInputDialog("Enter Full Name");
                isNotComplete = false;
            } catch (IllegalArgumentException iae) {
                    JOptionPane.showMessageDialog(null, iae.getMessage());
                    isNotComplete = true;
            }
            
        } while (isNotComplete);
        
    }
     
}
