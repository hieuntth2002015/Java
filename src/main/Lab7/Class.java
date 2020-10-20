package Lab7;

public class Class {
    private String ClassID;
    private String Name;
    private String Status;

    public Class(String ClassID, String Name, String Status) {
        this.ClassID = ClassID;
        this.Name= Name;
        this.Status = Status;
    }

    public String getClassID() {
        return ClassID;
    }

    public String getName() {
        return Name;
    }
    public String setName() {
        this.Name = Name;
    }


}
