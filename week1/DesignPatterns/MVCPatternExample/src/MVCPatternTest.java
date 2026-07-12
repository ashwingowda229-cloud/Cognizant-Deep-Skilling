public class MVCPatternTest {

    public static void main(String[] args) {

        Student model = new Student("Ashwin Gowda", "23IS001", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println();

        controller.setStudentGrade("A+");

        controller.updateView();
    }
}