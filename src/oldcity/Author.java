package oldcity;
public class Author {
    private String surname;
    private int age;
  
    public String getSurname() {
        return surname;
    }
 
    public int getAge() {
        return age;
    }
 
    public Author(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }
}