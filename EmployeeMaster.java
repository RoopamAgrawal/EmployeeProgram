public class EmployeeMaster{

    private int employeeId;
    private String employeeName;
    private String email;
    private double salary;
    private double netSalary;
    private double grossSalary;

    // Setters
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    private void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }
    private void setgrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    // Getters
    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmail(){
        return email;
    }

    public double getSalary(){
        return salary;
    }

    public double getNetSalary(){
        return netSalary;
    }
    public double getgrossSalary(){
        return grossSalary;
    }

    public void calculateNetSalary (double pfPercentage, double hrapercentage, double dapercentage){
        double pfAmount = salary * (pfPercentage / 100);
        double hraAmount = salary * (hrapercentage / 100);
        double daAmount = salary * (dapercentage / 100);
        double grossSalary = salary + hraAmount + daAmount;
        double netSalary = grossSalary - pfAmount;
        this.setNetSalary(netSalary);
        this.setgrossSalary(grossSalary);
    }
}