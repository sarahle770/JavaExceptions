

/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee ("Moshe", 35, 10_000);
            System.out.println (employee);
            Employee employee1 = new Employee ("David", 45, 35_000);
            System.out.println (employee1);
            Employee employee2 = new Employee ("Yosef", 31, 39_500);
            System.out.println (employee2);
            Employee employee3 = new Employee ("Chaim", 28, 51_000);
            System.out.println (employee3);
        } catch (InvalidEmployeeSalaryException e) {
            System.out.println ("An error occurred: " + e.getMessage ());
        }
    }
}
