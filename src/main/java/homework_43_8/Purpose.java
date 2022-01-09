package homework_43_8;

public class Purpose {
    private String catPurpose;

    public String getCatPurpose() {
        return catPurpose;
    }

    public void setCatPurpose(String catPurpose) {
        if (!catPurpose.isEmpty())
        this.catPurpose = catPurpose;
    }
}
