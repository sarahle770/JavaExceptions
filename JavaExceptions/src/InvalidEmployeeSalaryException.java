/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
/**
 * being thrown while salary of employee is above limit
 */
public class InvalidEmployeeSalaryException extends RuntimeException {
    public InvalidEmployeeSalaryException(String message) {
        super (message);
    }
}

