package five;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        System.out.println("Real monthlySalary:" + manager.getMonthlySalary(20000000));

    }
    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12.0;
        System.out.println("Month salary original:" + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthinsurance = calculateHealthInsurance(monthlySalary);
        double minusTotal = tax + nationalPension + healthinsurance;

        System.out.println("Tax per month: " + tax);
        System.out.println("NationalPension per month: " + nationalPension);
        System.out.println("Healthinsurance per month: " + healthinsurance);


        monthlySalary-=minusTotal;

        return monthlySalary;


    }

    public double calculateTax(double monthlySalary) {
        double tax = monthlySalary*(12.5/100);
        return tax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double nationalPension = monthlySalary*(8.1/100);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance = monthlySalary*(13.5/100);
        return  healthInsurance;

    }

}
