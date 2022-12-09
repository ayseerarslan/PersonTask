public class Tester extends Employee{

    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void smokeTesting(){
        System.out.println(getName() + " is doing smoke testing.");
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
