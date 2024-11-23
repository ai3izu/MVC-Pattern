public class StudentController {
    // Controller class in MVC pattern that connects the model and view and provides methods to set and get student information
    // Controller classes represent the application logic
    private final StudentModel model;
    private final StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentInfo(String name, String surname, int album_number) {
        model.setName(name);
        model.setSurname(surname);
        model.setAlbum_number(album_number);
    }

    public void getStudentInfo() {
        view.printStudentInfo(model.getName(), model.getSurname(), model.getAlbum_number());
    }
}
