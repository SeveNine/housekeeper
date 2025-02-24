package com.sevenine.housekeeper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousekeeperApplicationTests {

    // 止盈计算器
    @Test
    public static void main(String[] args) {
        // 止盈百分比
        int stopPercent = 20;
        // 卖出百分比
        double sellPercent = 20;
        // 总额
        double principal = 100;
        for(int i = stopPercent; i<=100; i+=10){
            principal = principal - principal * (sellPercent*0.01);
            System.out.println("盈利："+i+"%,卖出持仓的"+sellPercent+"%,剩余"+(int)principal+"%持仓");
        }
    }// 止盈计算器2
    @Test
    public static void main2(String[] args) {
        // 止盈百分比
        int stopPercent = 20;
        // 卖出百分比
        double sellPercent = 30;
        // 总额
        double principal = 100;
        for(int i = stopPercent; i<=100; i+=10){
            principal = principal - principal * (sellPercent*0.01);
            System.out.println("盈利："+i+"%,卖出持仓的"+sellPercent+"%,剩余"+(int)principal+"%持仓");
        }
    }


    // 定投倍率计算器
//    @Test
//    public static void main(String[] args) {
//        // 止盈百分比
//        double power = 5;
//        // 定投金额
//        double money = 10;
//        for(int i = 0; i<=100; i++){
//            money = money + money * (power*0.01);
//            System.out.println("pe："+i+"%,增加倍率"+power+"%,定投金额："+(int)money+"");
//        }
//    }


}
