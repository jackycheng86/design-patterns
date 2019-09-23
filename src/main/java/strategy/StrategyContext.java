package strategy;

/**
 * 策略执行环境
 * @author chengjian
 * @date 2019/7/14
 */
public class StrategyContext {
    private Strategy strategy;
    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }
    //执行
    public void operate(){
        strategy.operate();;
    }
}
