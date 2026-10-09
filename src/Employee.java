public class Employee {
     String name ;
     double salary;
      Department department;

    public Employee() {
    }

    public  Employee(String name, String department, double salary){
        this.name=name;
        this.department=Department.valueOf(department);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public  double calcSalary(){
        return salary;
    }
}
