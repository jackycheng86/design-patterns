package strategy;

/**
 * 执行锦囊
 * @author chengjian
 * @date 2019/7/14
 */
public class StrategyZhaoYun {

    /**
     * 赵云出场使用锦囊
     * @author chengjian
     * @date 2019/7/14
     */
    public static void main(String[] args) {
        StrategyBags strategyBags;
        System.out.println("打开第一个锦囊执行");
        strategyBags=new StrategyBags(new StrategyTalk());
        strategyBags.operate();
        System.out.println("第一个锦囊顺利执行");
        System.out.println("打开第二个锦囊执行");
        strategyBags=new StrategyBags(new StrategyCheat());
        strategyBags.operate();
        System.out.println("第二个锦囊顺利执行");
        System.out.println("打开第三个锦囊执行");
        strategyBags=new StrategyBags(new StrategyBlock());
        strategyBags.operate();
        System.out.println("第三个锦囊顺利执行");
    }
}
