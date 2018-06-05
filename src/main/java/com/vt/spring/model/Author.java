package   com.vt.spring.model;

public class Author{
    private  String firstName;
    private String lastName;
    private Set<Book> bookSet = new HashSet<>();

    public Autor(){

    }

    public Author(String firstName, String lastName, Set<Book> bookSet){
        this.firstName=firstName;
        this.lastName=lastName;
        this.bookSet=bookSet;
    }

    public Author(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}