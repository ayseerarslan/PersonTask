package person.Task;

public class CydeoStudent extends Student{

    private int batchNumber;
    private String groupName, progLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, String groupName, String progLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupName(groupName);
        setProgLanguage(progLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Batch number can not be negative or zero : " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        if (groupName==null || groupName.isEmpty()){
            System.err.println("Unknown!");
            System.exit(1);
        }
        this.groupName = groupName;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        boolean isValidProgLanguage = progLanguage.equalsIgnoreCase("java") || progLanguage.equalsIgnoreCase("python")
    || progLanguage.equalsIgnoreCase("javascript");
        if (isValidProgLanguage){
        this.progLanguage = progLanguage;
        }else {
            System.err.println("Invalid programming language : " + progLanguage);
            System.exit(1);
        }
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    protected String additionalToString() {
        return super.additionalToString() +
                ", batchNumber= " + batchNumber +
                ", groupName= " + groupName +
                ", progLanguage= " + progLanguage + "}" ;
    }
}
