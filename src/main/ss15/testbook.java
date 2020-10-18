package ss15;

public class testbook {
    public static void main(String[] args) {
        author thieu = new author("trung hieu", "trunghieun42@gmail.com", 'm');
        System.out.println(thieu);

        book hieubook = new book("java for hieubook", thieu, 20.5, 100);
        System.out.println(hieubook);

        hieubook.setPrice(29.95);
        hieubook.setQty(15);
        System.out.println("Name is " + hieubook.getName());
        System.out.println("Price is " + hieubook.getprice());
        System.out.println("Qty is " + hieubook.getQty());
        System.out.println("Author is " + hieubook.getauthor());
        System.out.println("Author's name is:" + hieubook.getauthor().getName());
        System.out.println("Author is email is " + hieubook.getauthor().getEmail());

        book anotherBook = new book("more java",
                new author("Nguyen trung hieu", "trunghieun42@gmail.com",'m'), 15);
        System.out.println(anotherBook);
    }
}
