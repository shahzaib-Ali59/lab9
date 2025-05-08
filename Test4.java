abstract class Employee {
     String name;
     int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}


interface TaxPayer {
    void payTax();
}


class FullTimeEmployee extends Employee implements TaxPayer {
     double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void payTax() {
        double tax = 0.2 * calculateSalary(); 
        System.out.println(name + " (Full-Time) paid tax: $" + tax);
    }
}


class PartTimeEmployee extends Employee implements TaxPayer {
     double hourlyRate;
     int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void payTax() {
        double tax = 0.1 * calculateSalary(); 
        System.out.println(name + " (Part-Time) paid tax: $" + tax);
    }
}


public class Test4 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Shahzaib", 101, 5000.0);
        PartTimeEmployee pte = new PartTimeEmployee("Waqaas", 102, 20.0, 80);

        System.out.println(fte.name + "'s salary: $" + fte.calculateSalary());
        fte.payTax();

        System.out.println(pte.name + "'s salary: $" + pte.calculateSalary());
        pte.payTax();
    }
}