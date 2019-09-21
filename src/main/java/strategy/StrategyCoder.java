package strategy;

/**
 * 执行锦囊
 * @author chengjian
 * @date 2019/7/14
 */
public class StrategyCoder {

    /**
     * 赵云出场使用锦囊
     * @author chengjian
     * @date 2019/7/14
     */
    public static void main(String[] args) {
        StrategyContext strategyBags;
        System.out.println("做第一件事情");
        strategyBags=new StrategyContext(new StrategySport());
        strategyBags.operate();
        System.out.println("第一件事情做完了");
        System.out.println("做第二件事情");
        strategyBags=new StrategyContext(new StrategyStudy());
        strategyBags.operate();
        System.out.println("第二件事情做完了");
        System.out.println("做第三件事情");
        strategyBags=new StrategyContext(new StrategyRead());
        strategyBags.operate();
        System.out.println("第三件事情做完了");
        System.out.println("做第四件事情");
        strategyBags=new StrategyContext(new StrategyCode());
        strategyBags.operate();
        System.out.println("第四件事情做完了");
    }
}
