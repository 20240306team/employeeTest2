package leehojun.run;

public class GetPhoneNumber {

    private String name ;
    private String Phone;

    public GetPhoneNumber(  ){}

    public GetPhoneNumber(String name, String phone) {
        this.name = name;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "GetPhoneNumber{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
