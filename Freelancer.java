public class Freelancer extends BaseWorker {
    
    private int hourlyRate;

    public Freelancer(String name, int hourlyRate) {

        super(name);
        this.hourlyRate = hourlyRate;
    }
 
    public int calcSalary() {

        return((int)(20.8 * 8 * hourlyRate));
    }
}