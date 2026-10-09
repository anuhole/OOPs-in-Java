public class Developer extends Employee {
    public Developer() {
        super();
    }
    public  Developer(String name,String department,double salary){
        super(name,department,salary);
    }
//    @Override
//    public  double calcSalary(){
//        return salary ;
//    }


    @Override
    public String toString() {
        return "Developer{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
