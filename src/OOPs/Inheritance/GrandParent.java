package OOPs.Inheritance;

public class GrandParent {
    
    private String familyName;

    public GrandParent(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "GrandParent{" +
                "familyName='" + familyName + '\'' +
                '}';
    }
}
