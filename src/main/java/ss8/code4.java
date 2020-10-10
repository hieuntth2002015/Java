package ss8;

public class code4 {
    private boolean[][] marks;

    public void displayMarks() {
        System.out.println("Marks are: ");

        for(int row = 0; row < marks.length; row++) {
            System.out.println("Roll no." + (row+1));
            for(int col=0; col < marks[row].length; col++) {
                System.out.println(marks[row] [col]);
            }
        }
    }
}
