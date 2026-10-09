public class SalesEmp extends WageEmpl{
    private int cummision,sales;

    public SalesEmp( ) {

    }

    public SalesEmp(int emoId, String name, int hrs, int rate, int cummision){
        super(emoId,name,hrs,rate);
        this.cummision=cummision;
       // this.sales=sales;
    }
    @Override
    public int calulateSalary(){
        return super.calculateSalary()+cummision;
    }

    public static void main(String[] args) {
        SalesEmp sel1=new SalesEmp(1001,"Anushka",10,20,2000);
        System.out.println(sel1.calculateSalary());
        sel1.display();
    }
}
