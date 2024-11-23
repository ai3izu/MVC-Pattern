public class Main {
    public static void main(String[] args) {

        // Create the model, view
        StudentView view = new StudentView();
        StudentModel model = new StudentModel();
        // Create the controller
        // Connect the model and view to the controller
        StudentController controller = new StudentController(model, view);

        // Set the student information using the controller
        controller.setStudentInfo("John", "Doe", 12345);

        // Get the student information using the controller
        controller.getStudentInfo();
    }
}
