import implementationService.GroupServiceImpl;
import implementationService.TeacherServiceImpl;
import service.GroupService;
import service.TeacherService;

public class App {


    public static void main(String[] args) {
        GroupService group = new GroupServiceImpl();
        TeacherService teacher = new TeacherServiceImpl();
        group.selectCaptain();
        teacher.checkGroup();

    }


}
