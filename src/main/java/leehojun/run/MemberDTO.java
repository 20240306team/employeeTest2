package leehojun.run;

public class MemberDTO {

    private String name;
    private String email;
    private String empId;

    private String logId;
    private String logPass;
    public MemberDTO()  {}

    public MemberDTO(String name, String email, String empId, String logId, String logPass) {
        this.name = name;
        this.email = email;
        this.empId = empId;
        this.logId = logId;
        this.logPass = logPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogPass() {
        return logPass;
    }

    public void setLogPass(String logPass) {
        this.logPass = logPass;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", empId='" + empId + '\'' +
                ", logId='" + logId + '\'' +
                ", logPass='" + logPass + '\'' +
                '}';
    }
}
