package ObserverModeDemo;

/**
 * 老师学生观察者模式测试类
 * @author liuyck
 *
 */
public class DemoTest {

    public static void main(String[] args) {
        TeacherSubject teacher = new TeacherSubject();

        new StudentObserver("jack", teacher);
        new StudentObserver("john", teacher);
        new StudentObserver("熊江伟", teacher);

        teacher.notifyObserver("jack", "你考了99分");
        teacher.notifyObserver("john", "你考了59分");
        teacher.notifyObserver("熊江伟", "你考了60分");

    }
}