package com.demo.dp.strategy;

/**
 * @ Author     ：qupengcheng
 * @ Date       ：7:32 2019/10/29
 * @ Description：
 * @ Modified By：
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyContext() {
        strategy.cal();
    }

    public static void main(String[] args) {

        StrategyContext strategyContext = new StrategyContext(new StrategyA());
        strategyContext.strategyContext();
    }
}
