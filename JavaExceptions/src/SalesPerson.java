

/**
 * This file is a part of JavaExceptions project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class SalesPerson extends Employee implements Comparable<SalesPerson> {
    private final String certNum;

    public SalesPerson(String name, int age, double salary, String certNum)
            throws InvalidEmployeeCertException {
        super (name, age, salary);
        this.certNum = requireValidCertificationNumber (certNum);
    }
    private static String requireValidCertificationNumber(String certNum) throws InvalidEmployeeCertException {
        if (!certNum.matches ("[0-9]{3}-[a-zA-Z]{3}")) {
            throw new InvalidEmployeeCertException ("Wrong approvalDeal: " + certNum);
        }
        return certNum;
    }
    @Override
    public int compareTo(SalesPerson other) {
        //if get salary wil be bigger than other.getSalary i will get a value bigger than 1
        //if get salary wil be smaller than other.getSalary i will get a value smaller than 1 (a negative value)
        //if get salary wil be equal to other.getSalary i will get 0
        return (int) (this.getSalary () - other.getSalary ());
    }
    @Override
    public String toString() {
        return "SalesPerson:" +
                "certNum: " + certNum;
    }


}
