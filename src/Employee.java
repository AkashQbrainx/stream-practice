public class Employee {

    int id;
    String name;
    int roll;
    String profile;
    int salary;

    public Employee(int id,String name,int roll,String profile,int salary){
        this.id=id;
        this.name=name;
        this.profile=profile;
        this.salary=salary;
        this.roll=roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee("+id+","+name+","+roll+","+profile+","+salary+")";
    }
}
