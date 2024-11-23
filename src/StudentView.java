public class StudentView {
    // View class in the MVC pattern to display student information
    // View classes represents the user interface
    public void printStudentInfo(String name, String surname, int album_number) {
        System.out.println("Student " + name + " " + surname + " with album number " + album_number);
    }
}
