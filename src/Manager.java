public class Manager extends Employee{
    int allowns;
    public Manager(){
        super();
    }
    public Manager(String name,String department,double salary,int allowns){
        super(name,department,salary);
        this.allowns=allowns;
    }
    public void assignTasks(){
        System.out.println("Manager Givving some tasks");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public  double calcSalary(){
        return salary +allowns;
    }
}
