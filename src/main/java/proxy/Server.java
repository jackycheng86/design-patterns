package proxy;

/**
 * 提供服务实现的服务器
 * @author chengjian
 * @date 2019/9/25
 */
public class Server implements Service {
    /**
     * 服务方法
     * @author chengjian
     * @date 2019/9/25
     * @return void
     */
    public void requestService() {
        System.out.println("服务器提供的服务！");
    }
}
