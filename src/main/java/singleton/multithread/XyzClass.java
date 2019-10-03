package singleton.multithread;

import singleton.singlethread.SquadLeader;

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

        SquadLeader1 squadLeader11=SquadLeader1.getInstance();
        squadLeader11.leaderInfo();
        SquadLeader1 squadLeader12=SquadLeader1.getInstance();
        squadLeader12.leaderInfo();
        SquadLeader1 squadLeader13=SquadLeader1.getInstance();
        squadLeader13.leaderInfo();
    }
}
