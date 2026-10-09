public class Emp {
    private int emoId;
    private String name;
    public Emp() {
    }

    public Emp(int emoId, String name) {
        this.emoId = emoId;
        this.name = name;
    }

    public void display(){
        System.out.println("Emp Id"+emoId+"Emp Name"+name);
    }
}
