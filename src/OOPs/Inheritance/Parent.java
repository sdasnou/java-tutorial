package OOPs.Inheritance;

public class Parent extends GrandParent {

    private String parentName;

    public Parent(String familyName, String parentName) {
        super(familyName);
        this.parentName = parentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "familyName='" + getFamilyName() + '\'' +
                ", parentName='" + parentName + '\'' +
                '}';
    }
    
}
