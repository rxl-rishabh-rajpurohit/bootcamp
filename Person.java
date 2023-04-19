public class Person{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private Integer age;
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    private String gender;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Person(){};
    public Person(String name, Integer age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    } 
    static public void main(String[] args){
        System.out.println("Class Person created successfully.");
    }
}