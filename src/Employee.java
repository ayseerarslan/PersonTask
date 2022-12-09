public class Employee extends Person{

    private String employeeId;
    private String jobTitle;
    private  double salary;

    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {

        if (employeeId.charAt(0)=='0'){
            System.err.println("Employee id can not start with '0' : " + employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle==null){
            System.err.println("Job title can not be empty ot null!");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Salary can not be negative or zero : " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

    @Override
    protected String additionalToString() {
        return super.additionalToString() +
                ", employeeId= " + employeeId +
                ", jobTitle= " + jobTitle +
                ", salary= " + salary + "}";
    }
}
