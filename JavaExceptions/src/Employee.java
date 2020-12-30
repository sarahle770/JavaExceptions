/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Employee {
    private static final long MAXIMUM_SALARY = 40_000;
    private final String name;
    private final int age;
    private final double salary;
    //לא חובה לעדכן שהבנאי עומד לזרוק חריגה במידת הצורך
    public Employee(String name, int age, double salary) throws InvalidEmployeeSalaryException {
        this.name = name;
        this.age = age;
        //because i want that if i get an exception to not do any השמה this is why i have to put the exception here.
        if (salary >= MAXIMUM_SALARY)
            throw new InvalidEmployeeSalaryException (name + ",We are sorry. wrong value of your salary ");
        this.salary = salary;
        //    ניתן לכתוב ולקרוא לפונקציה הזו דרוש או זרוק .
        //this.salary=requireValidSalaryOrThrow(salary,name);
        //    private static double requireValidSalaryOrThrow(double salary,String name){
        //       if (salary >= MAXIMUM_SALARY){
        //             throw new InvalidEmployeeSalaryException (name + ",We are sorry. wrong value of your salary ");
        //}
        //    return salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format ("<Employee:>\n Name:%s. Age:%d years old. Salary:%.2f NIS", name, age, salary);
    }
}

