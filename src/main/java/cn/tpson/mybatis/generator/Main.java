package cn.tpson.mybatis.generator;

import cn.tpson.mybatis.generator.commons.CamelCaseUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by zk in 2018/11/08
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        TestDO testDO = new TestDO();
        System.out.println(testDO.toString());
        log.info(testDO.toString());

        String property = "dicDesc";
        String column = CamelCaseUtils.toUnderScoreCase(property);
        String capitalizePropertyType = CamelCaseUtils.toCapitalizeCamelCase(column);
        System.out.println(column);
        System.out.println(capitalizePropertyType);
    }
}
