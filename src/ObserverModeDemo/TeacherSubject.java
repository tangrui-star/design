package ObserverModeDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 老师类
 *
 */
public class TeacherSubject implements Subject{

    /**
     * 学生Map
     */
    private Map<String, Observer> observerMap = new HashMap<String, Observer>();

    @Override
    public void addObserver(String id, Observer obj) {
        observerMap.put(id, obj);
    }

    @Override
    public void deleteObserver(String id) {
        observerMap.remove(id);
    }

    @Override
    public void notifyObservers(Object msg) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyObserver(String id, Object msg) {
        observerMap.get(id).update(msg);
    }
}
