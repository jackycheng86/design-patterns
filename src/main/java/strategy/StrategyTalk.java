package strategy;

public class StrategyTalk implements Strategy {
    /**
     * 策略执行的操作
     *
     * @author chengjian
     * @date 2019/7/14
     */
    public void operate() {
        System.out.println("让赵云一行先去访问乔国老。乔国老是周瑜和孙策的丈人，在东吴有一定的威望，而且和吴国太关系不错。访乔国老一来可以把孙刘联姻之事告诉吴国太（吴国太此前并不知道），让孙权周瑜陷于被动。二来可以让他在吴国太面前美言，增加孙刘联姻的可能性。");
    }
}
