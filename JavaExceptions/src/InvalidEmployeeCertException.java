/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */

/**
 * being thrown while employee's certificate is incorrect
 * אפשרי לכתוב ורצוי לכתוב מה האופו התקין של הכתיבה של תעודת מכירה
 */
public class InvalidEmployeeCertException extends Exception {
    public InvalidEmployeeCertException (String message){
        super(message);
    }
}
