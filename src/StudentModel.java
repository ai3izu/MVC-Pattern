public class StudentModel {
    // Model class for the MVC pattern
    // Model class stands for the data in the MVC pattern
    private String name;
    private String surname;
    private int album_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAlbum_number() {
        return album_number;
    }

    public void setAlbum_number(int album_number) {
        this.album_number = album_number;
    }
}
