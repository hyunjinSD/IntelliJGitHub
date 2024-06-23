public class SalaryManager {



    public static void main(String [] args) {
        SalaryManager manager = new SalaryManager();
        System.out.println("Real SalaryManager " + manager.getMonthlySalary(20000000));

    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12.0;
        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        double minusTotal = tax + nationalPension + healthInsurance;



        System.out.println("Tax per month: " + tax);
        System.out.println("NationalPension per month: " + nationalPension);
        System.out.println("HealthInsurance per month: " + healthInsurance);

        monthlySalary-= minusTotal;

        return monthlySalary;


    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary*(12.5/100);
        return tax;

    }

    public double calculateNationalPension(double monthSalary) {
        double tationalPension = monthSalary*(8.1/100);
        return tationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurance = monthSalary*(13.5/100);
        return healthInsurance;
    }
}