/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: InvalidMassException.java
 * Description: Subclass of Exception to handle mass less than zero.
 */

public class InvalidMassException extends Exception {
    
    private String message;
    
       //constructor
    public InvalidMassException() {
        this("\nInvalid, mass must be greater than zero.");
    }
    
    public InvalidMassException( String m ) {
        this.message = m;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    @Override
    public String toString() {
        return message;
    }
}
