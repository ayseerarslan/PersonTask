public class Developer extends  Employee{

    public Developer(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

   public void unitTesting(){
       System.out.println(getName() + " is doing unit testing.");
   }

    @Override
    public void work() {
        super.work();
    }

    @Override
    protected String additionalToString() {
        return super.additionalToString();
    }
}
