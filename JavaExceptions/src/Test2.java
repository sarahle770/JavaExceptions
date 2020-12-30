/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {

        try {
            SalesPerson salesPerson1 = new SalesPerson ("Nira", 25, 32_000, "123-abc");
            System.out.println (salesPerson1);
            SalesPerson salesPerson2 = new SalesPerson ("Shira", 40, 25_000, "231-222");
            System.out.println (salesPerson2);
        } catch ( InvalidEmployeeCertException e) {
            System.out.println ("An error occurred: " + e.getMessage ());
        }
    }
}
