public class Worker extends BaseWorker {

    private int fixSalary;

    public Worker(String name, int fixSalary) {

        super(name);
        this.fixSalary = fixSalary;
    } 

    public int calcSalary() {

        return fixSalary;
    }
}