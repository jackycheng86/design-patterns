package singleton.singlethread;

/**
 * xyz班级
 * @author chengjian
 * @date 2019/9/29
 */
public class XyzClass {


    public static void main(String[] args) {
        SquadLeader squadLeader1=SquadLeader.getInstance();
        squadLeader1.leaderInfo();
        SquadLeader squadLeader2=SquadLeader.getInstance();
        squadLeader2.leaderInfo();
        SquadLeader squadLeader3=SquadLeader.getInstance();
        squadLeader3.leaderInfo();
    }
}
