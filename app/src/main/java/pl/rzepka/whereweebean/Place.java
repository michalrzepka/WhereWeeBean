package pl.rzepka.whereweebean;

public class Place {

    private String mCategory;
    private String mName;
    private String mAddress;
    private String mContact;
    private int mPhoto;

    public Place(String mCategory, String mName, String mAddress, String mContact, int mPhoto) {
        this.mCategory = mCategory;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mContact = mContact;
        this.mPhoto = mPhoto;
        Places.addToPlacesLibrary(this);
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmContact() {
        return mContact;
    }

    public int getmPhoto() {
        return mPhoto;
    }
}
