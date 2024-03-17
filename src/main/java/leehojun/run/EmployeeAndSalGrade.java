package leehojun.run;

public class EmployeeAndSalGrade {

    private String empId;
    private String name;
    private String empNo;
    private String email;
    private double bonus;
    private int salary;
//private SalGrade salGrade;

    private String salLevel;
    private int minSal;
    private int maxSal;
    public EmployeeAndSalGrade()    {}

    public EmployeeAndSalGrade(String empId, String name, String empNo, String email, double bonus, int salary, String salLevel, int minSal, int maxSal) {
        this.empId = empId;
        this.name = name;
        this.empNo = empNo;
        this.email = email;
        this.bonus = bonus;
        this.salary = salary;
        this.salLevel = salLevel;
        this.minSal = minSal;
        this.maxSal = maxSal;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public int getMinSal() {
        return minSal;
    }

    public void setMinSal(int minSal) {
        this.minSal = minSal;
    }

    public int getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(int maxSal) {
        this.maxSal = maxSal;
    }

    @Override
    public String toString() {
        return "EmployeeAndSalGrade{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", bonus=" + bonus +
                ", salary=" + salary +
                ", salLevel='" + salLevel + '\'' +
                ", minSal=" + minSal +
                ", maxSal=" + maxSal +
                '}';
    }
}
