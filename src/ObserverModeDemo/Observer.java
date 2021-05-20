package ObserverModeDemo;

/**
 * 观察者接口
 * @author liuyck
 *
 */
public interface Observer {

    /**
     * 当主题状态改变时,观察者更新数据
     * @param msg
     */
    void update(Object msg);
}