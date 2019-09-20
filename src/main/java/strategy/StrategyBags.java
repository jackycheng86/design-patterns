package strategy;

/**
 * 装了锦囊的袋子
 * @author chengjian
 * @date 2019/7/14
 */
public class StrategyBags {
    private Strategy strategy;
    public StrategyBags(Strategy strategy) {
        this.strategy = strategy;
    }
    //使用锦囊
    public void operate(){
        strategy.operate();;
    }
}
