package singleton.multithread;

/**
 * 班长类
 *
 * @author chengjian
 * @date 2019/10/3
 */
public class SquadLeader1 {
    /**
     * 定义一个班长
     */
    private static final SquadLeader1 squadLeader = new SquadLeader1();

    /**
     * 私有构造函数就是不让随意产生班长，值允许存在一个班长
     *
     * @author chengjian
     * @date 2019/10/3
     */
    private SquadLeader1() {
        System.out.println("SquadLeader1,选出一个班长！");
    }

    /**
     * @return singleton.multithread.SquadLeader
     * @author chengjian
     * @date 2019/10/3
     */
    public static synchronized SquadLeader1 getInstance() {
        return squadLeader;
    }

    public void leaderInfo() {
        System.out.println("我就是xyz班的班长多线程SquadLeader1版本！");
    }
}
