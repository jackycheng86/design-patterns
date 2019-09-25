package proxy;

public class Proxy implements Service {

    private Server server;

    /**
     * 服务方法
     *
     * @return void
     * @author chengjian
     * @date 2019/9/25
     */
    public void requestService() {
        if(server==null){
            server=new Server();
        }
        preService();
        server.requestService();
        postService();
    }

    private void preService(){
        System.out.println("调用真实请求之前执行");
    }

    private void postService(){
        System.out.println("调用真实请求之后执行");
    }
}
