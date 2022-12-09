public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()){
            System.err.println("Unknown!");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Age can not be negative or zero : " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender=='F' || gender=='M'){
            this.gender = gender;
        }else{
            System.err.println("Invalid! gender can be only M/F : " + gender);
            System.exit(1);
        }
    }

    protected String additionalToString(){
        return "";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                additionalToString() ;
    }
}
