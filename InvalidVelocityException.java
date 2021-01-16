/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: InvalidVelocityException.java
 * Description: Subclass of Exception to handle velocity less than zero.
 */

public class InvalidVelocityException extends Exception {
    
    private String message;
    
       //constructor
    public InvalidVelocityException() {
        this("\nInvalid, velocity must be greater than zero.");
    }
    
    public InvalidVelocityException( String m ) {
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
