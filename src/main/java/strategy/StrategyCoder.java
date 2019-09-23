package strategy;

/**
 * 执行锦囊
 * @author chengjian
 * @date 2019/7/14
 */
public class StrategyCoder {

    /**
     *写程序
     * @author chengjian
     * @date 2019/7/14
     */
    public static void main(String[] args) {
        StrategyContext strategyBags;
        System.out.println("先运动");
        strategyBags=new StrategyContext(new StrategySport());
        strategyBags.operate();
        System.out.println("先学习");
        strategyBags=new StrategyContext(new StrategyStudy());
        strategyBags.operate();
        System.out.println("先学习");
        strategyBags=new StrategyContext(new StrategyRead());
        strategyBags.operate();
    }
}
