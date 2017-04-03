/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author kevinjerke
 */
public class UpperCaseMandatoryException extends IllegalArgumentException{ 
    
    private static final String MSG = "Input must be uppercase";
    

    public UpperCaseMandatoryException() {
        super(MSG);
    }

    public UpperCaseMandatoryException(String s) {
        super(MSG);
    }

    public UpperCaseMandatoryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public UpperCaseMandatoryException(Throwable cause) {
        super(cause);
    }
    
     
}
