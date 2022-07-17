import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        EmployeeMaster newEmployee = getEmployeeDetails();
        double pfPercentage = getPFPercentage();
        double HraPercentage = getHraPercentage();
        double DaPercentage = getDaPercentage();

        System.out.println();
        System.out.println("Confirm employee details: ");
        System.out.println("Id : " + newEmployee.getEmployeeId());
        System.out.println("Name : " + newEmployee.getEmployeeName());
        System.out.println("Email : " + newEmployee.getEmail());
        System.out.println("Salary : " + newEmployee.getSalary());

        newEmployee.calculateNetSalary(pfPercentage,HraPercentage,DaPercentage);
        System.out.println("Gross Salary : " + newEmployee.getgrossSalary());
        System.out.println("Net Salary : " + newEmployee.getNetSalary());
    }

    
    public static EmployeeMaster getEmployeeDetails() {
        EmployeeMaster employee = new EmployeeMaster();
        System.out.println("Enter Id: ");
        employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Name: ");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter email: ");
        employee.setEmail(scanner.next());
        System.out.println("Enter salary: ");
        employee.setSalary(scanner.nextDouble());
        return employee;
    }

    
    public static double getPFPercentage(){
        System.out.println("Enter PF percentage:");
        double pfPercentage = scanner.nextDouble();
        return pfPercentage;
    }

    public static double getHraPercentage(){
        System.out.println("Enter Hra percentage:");
        double hraPercentage = scanner.nextDouble();
        return hraPercentage;
    }

    public static double getDaPercentage(){
        System.out.println("Enter da percentage:");
        double daPercentage = scanner.nextDouble();
        return daPercentage;
    }

}