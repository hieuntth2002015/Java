package ss15;

public class testauthor {
    public static void main(String[] args) {
        author thieu = new author("Trung Hieu", "trunghieun42@gmail.com", 'm');

        System.out.println(thieu);

        thieu.setEmail("trunghieun42@gmail.com");
        System.out.println(thieu);

        System.out.println("Name is: " + thieu.getName());
        System.out.println("Email is " + thieu.getEmail());
        System.out.println("Gender is " + thieu.getGender());
    }
}
