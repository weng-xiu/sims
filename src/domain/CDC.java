package domain;

public class CDC {

    private String college;//大学
    private String department;
    private String cclass;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCclass() {
        return cclass;
    }

    public void setCclass(String cclass) {
        this.cclass = cclass;
    }

    @Override
    public String toString() {
        return "CDC{" +
                "college='" + college + '\'' +
                ", department='" + department + '\'' +
                ", cclass='" + cclass + '\'' +
                '}';
    }
}
