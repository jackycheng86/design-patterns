package singleton.singlethread;

/**
 * 班长类
 *
 * @author chengjian
 * @date 2019/9/29
 */
public class SquadLeader {

    /**
     * 定义一个班长
     */
    private static SquadLeader squadLeader = null;

    /**
     * 私有构造函数就是不让随意产生班长，值允许存在一个班长
     *
     * @author chengjian
     * @date 2019/10/3
     */
    private SquadLeader() {
        System.out.println("选出一个班长！");
    }

    public static SquadLeader getInstance() {
        //如果还没有选出班长，那么就选出一个班长
        if (squadLeader == null) {
            squadLeader = new SquadLeader();
        } else {
            System.out.println("已经有一个班长，不能产生新班长！");
        }
        return squadLeader;
    }

    public void leaderInfo() {
        System.out.println("我就是xyz班的班长单线程版本！");
    }
}
