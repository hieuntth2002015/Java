package Lab8.javaCore.Superclass;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student : "
        + "name=" + s1.getName()
        + "address =" + s1.getAddress()
        + "program =" + s1.getProgram()
        + "year= " + s1.getYear()
        + "fee=" + s1.getFee() );

    }
}
