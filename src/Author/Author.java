package Author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email,char gender){
        if (gender == 'M'||gender == 'F'){
            this.gender=gender;
        }
        else {
            this.name="N";
        }
        this.email=email;
        this.name=name;
    }

    public String getName() {
        return "Имя автора: " + name;
    }

    public String getEmail() {
        return "Адрес почты: " + email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return  gender;
    }

    @Override
    public String toString() {
        return name +" "+gender+" "+ email;
    }
}