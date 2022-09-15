package com.sevenine.housekeeper.init;

import com.sevenine.housekeeper.config.Person;
import com.sevenine.housekeeper.dto.FundDataDTO;
import com.sevenine.housekeeper.dto.ResponseDTO;
import com.sevenine.housekeeper.service.IMailService;
import com.sevenine.housekeeper.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 注入发送邮件的接口
     */
    @Autowired
    private IMailService mailService;
     /**
      * 人员配置
      **/
    @Autowired
    private Person person;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("通过实现ApplicationRunner接口，在spring boot项目启动后执行操作");
        String url = "https://danjuanapp.com/djapi/index_eva/dj";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Host", "danjuanapp.com");
        headers.add("Connection","keep-alive");
        headers.add("Accept","application/json,text/plain, */*");
        headers.add("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
        headers.add("Referer","https://danjuanapp.com/djmodule/value-center");
        headers.add("Accept-Encoding"," deflate, br");
        headers.add("Accept-Language","zh-CN,zh;q=0.9");
        headers.add("Cookie","device_id=web_SJGrxrAB8I; channel=undefined; timestamp=1595934527632");
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> resEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String body = resEntity.getBody();
        ResponseDTO responseDTO = JsonUtil.string2Obj(body, ResponseDTO.class);
        List<FundDataDTO> items = responseDTO.getData().getItems();
        items = filter(items);
        sendPlan(items);
        System.exit(0);
    }

    /**
     * 发邮件
     * created by xu-jp on 2021/1/26
     **/
    public void sendPlan(List<FundDataDTO> dto){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("======================================================");
        System.out.println("指数基金增量定投计划");
        stringBuilder.append("指数基金增量定投计划\n\n");
        // 基金定投起始范围
        double RANGBEGIN = 15;
        // 基金定投终止范围
        double RANGEND = 30;
        double b = RANGEND;
        double k = (RANGBEGIN - b)/1;
        double x;
        double y;
        double total = 0;
        boolean isCalc = true;
//        System.out.println("k="+ k + ",b=" +b);
        for (FundDataDTO fund: dto) {
            x = Double.parseDouble(fund.getPe_percentile());
            y = k*x + b;
            double money = Double.parseDouble(new BigDecimal(y).setScale(2,BigDecimal.ROUND_HALF_UP).toString());

            if("上证50".equals(fund.getName())){
                stringBuilder.append("====下述基金本人暂停买入====\n");
                isCalc = false;
            }
            if(isCalc){
                total += money;
            }
            stringBuilder.append(String.format("%-20s ——\t%s \n", fund.getName(), money));
        }
        stringBuilder.append(String.format("\n总计：%.2f\n\n" ,total));
        stringBuilder.append("作业有风险，抄袭需谨慎！\n");
        stringBuilder.append("ps:定投金额范围调整为15-30");
        List<String> list = person.getList();
        for(String mail: list){
            mailService.sendSimpleMail(mail,"指数基金增量定投计划",stringBuilder.toString());
        }
        }



    /**
     * 过滤自选基金
     * created by xu-jp on 2020/7/29
     **/
    public List<FundDataDTO> filter(List<FundDataDTO> dto) {
        List<FundDataDTO> filterList = new LinkedList<>();
        HashMap<String, String> map = new LinkedHashMap<>();
        map.put("SZ399997","消费(161725)");
        map.put("SH000991","医疗(003095)");
        map.put("CSI930652","科技(001410)");
        map.put("SZ399417","新能源(002190)");
        map.put("CSIH11136","中国互联(164906)");
        map.put("NDX","纳斯达克(040046)");
        map.put("SH000905","中证500");
        map.put("SZ399006","创业板");
        map.put("SH000016","上证50");
        map.put("SH000300","沪深300");
        map.put("SZ399701","基本面60");
        map.put("SZ399975","证券公司");
        map.put("HKHSI","恒生指数");
        for (String key : map.keySet()) {
            for (FundDataDTO fund: dto) {
                if(key.equals(fund.getIndex_code())){
                    filterList.add(fund);
                }
            }
        }
        return filterList;

    }





    /**
     * 展示计划
     * created by xu-jp on 2020/7/29
     **/
    public void showPlan(List<FundDataDTO> dto){
        System.out.println("======================================================");
        System.out.println("指数基金增量定投计划");
        // 基金定投起始范围
        double RANGBEGIN = 10;
        // 基金定投终止范围
        double RANGEND = 20;
        double b = RANGEND;
        double k = (RANGBEGIN - b)/1;
        double x;
        double y;
        double total = 0;
//        System.out.println("k="+ k + ",b=" +b);
        for (FundDataDTO fund: dto) {
            x = Double.parseDouble(fund.getPe_percentile());
            y = k*x + b;
            double money = Double.parseDouble(new BigDecimal(y).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
            total += money;
            System.out.printf("%-10s \t%s \n", fund.getName(), money);
        }

        System.out.printf("\n总计：%.2f\n\n" ,total);
        System.out.println("作业有风险，抄袭需谨慎！");
        System.out.println("======================================================");
    }

}
