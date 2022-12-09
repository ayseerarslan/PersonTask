public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy==null || fieldOfStudy.isEmpty()){
            System.out.println("Unknown!");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
            return grade;
    }

    public void setGrade(char grade) {
        boolean isValidGrade = grade=='A' || grade =='B' || grade =='C' || grade =='D' || grade =='F';
        if (isValidGrade){
        this.grade = grade;
        }else {
            System.out.println("Invalid grade! : " + grade);
        }
    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }
    @Override
    protected String additionalToString() {
        return super.additionalToString() +
                ", studentId= " + studentId +
                ", fieldOfStudy= " + fieldOfStudy +
                ", schoolName= " + schoolName + "}" ;
    }
}
