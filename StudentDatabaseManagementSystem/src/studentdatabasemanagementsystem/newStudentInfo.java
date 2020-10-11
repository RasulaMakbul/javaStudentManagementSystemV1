
package studentdatabasemanagementsystem;

public class newStudentInfo {
    private String name;
    private String id;
    private String email;
    private String depertment;
    private String address;

    @Override
    public String toString() {
        return "newStudentInfo{" + "name=" + name + ", id=" + id + ", email=" + email + ", depertment=" + depertment + ", address=" + address + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public newStudentInfo(String name, String id, String email, String depertment, String address) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.depertment = depertment;
        this.address = address;
    }
}
