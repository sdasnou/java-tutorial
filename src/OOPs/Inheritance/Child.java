package OOPs.Inheritance;

public class Child extends Parent {

    private String childName;

    public Child(String familyName, String parentName, String childName) {
        super(familyName, parentName);
        this.childName = childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "familyName='" + getFamilyName() + '\'' +
                ", parentName='" + getParentName() + '\'' +
                ", childName='" + childName + '\'' +
                '}';
    }
    
}
