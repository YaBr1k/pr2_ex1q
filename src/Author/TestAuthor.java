package Author;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Nikita", "125qqq1@gmail.ru",'M');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println("Пол автора "+a1.getGender());
        System.out.println(a1.toString());
    }
}