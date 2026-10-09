public abstract class WageEmpl extends Emp{
    private int rate,hrs;

    public WageEmpl() {
    }

    public WageEmpl(int emoId ,String name, int hrs, int rate) {
        super(emoId,name);
        this.hrs = hrs;
        this.rate = rate;
       // super(emo,name);
    }
    public int calculateSalary(){
        return hrs*rate;
    }

    public abstract int calulateSalary();
}
