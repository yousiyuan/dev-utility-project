package com.glp.backend.risk.rule.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RiskRuleApplicationTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        String sourceString = "(#{IYDFGB}+#{KRSSHL}+#{LHBKUX}+#{MNMDXI})/(#{IVSJEM}+#{ETJKTB}+#{ULBTNJ}+#{VFBZFO})";
        Map<String, String> resultMap = regMatch(sourceString, "\\{([^}]*)\\}");
        System.out.println(resultMap);
    }

    public Map<String, String> regMatch(String sourceString, String regex) {
        Map<String, String> resultMap = new HashMap<>();
        String code = null;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sourceString);
        if (matcher.find()) {
            matcher.reset();
            while (matcher.find()) {
                resultMap.put(matcher.group(1), matcher.group(0));
            }
        }
        return resultMap;
    }

    @Test
    public void test2() {
        String dateStr = "";
        if (validDateString(dateStr)) {
            System.out.println("正确的日期格式 === " + dateStr);
        } else {
            System.out.println("错误的日期格式 === " + dateStr);
        }
    }

    /**
     * 正则表达式验证日期
     */
    private Boolean validDateString(String str) {
        String rexp1 = "((\\d{2}(([02468][048])|([13579][26]))[\\-]((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-]((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|(1[0-9])|(2[0-8]))))))";
        String rexp2 = "((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s((([0-1][0-9])|(2?[0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))";
        //String rexp3 = "\\s*";
        //String rexp = MessageFormat.format("{0}|{1}|{2}", rexp1, rexp2, rexp3);
        String rexp = MessageFormat.format("{0}|{1}", rexp1, rexp2);
        Pattern pattern = Pattern.compile(rexp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
