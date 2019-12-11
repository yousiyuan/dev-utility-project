package com.glp.backend.risk.api.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RiskApiApplicationTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        //String sourceString = "(#{IYDFGB}+#{KRSSHL}+#{LHBKUX}+#{MNMDXI})/(#{IVSJEM}+#{ETJKTB}+#{ULBTNJ}+#{VFBZFO})";
        String sourceString = "( OBJ10613_#{GNMENJ} > OBJ10613_#{PUVYOG}   &&  OBJ10613_#{PUVYOG} > OBJ10613_#{GDTJ69}   &&  OBJ10613_#{GDTJ69} > OBJ10613_#{M6VPHF}   &&  OBJ10613_#{YGDQEH} >= 0.1 )  || ( OBJ10613_#{TEJLDV} >= 0.05   &&  OBJ10613_#{TEJLDV} < 0.08 ) ";
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
    public void regexTest() {
        String source = "( OBJ10613_#{GNMENJ} > OBJ10613_#{PUVYOG}   &&  OBJ10613_#{PUVYOG} > OBJ10613_#{GDTJ69}   &&  OBJ10613_#{GDTJ69} > OBJ10613_#{M6VPHF}   &&  OBJ10613_#{YGDQEH} >= 0.1 )  || ( OBJ10613_#{TEJLDV} >= 0.05   &&  OBJ10613_#{TEJLDV} < 0.08 ) ";
        //TODO：使用正则表达式匹配得到以下表达式
        // OBJ10613_#{GNMENJ} > OBJ10613_#{PUVYOG}
        // OBJ10613_#{PUVYOG} > OBJ10613_#{GDTJ69}
        // OBJ10613_#{GDTJ69} > OBJ10613_#{M6VPHF}
        // OBJ10613_#{YGDQEH} >= 0.1
        // OBJ10613_#{TEJLDV} >= 0.05
        // OBJ10613_#{TEJLDV} < 0.08
        List<String> expList = splitExpression(source);
        expList.forEach(System.out::println);
    }

    public List<String> splitExpression(String expression) {
        String pattern = "&&|\\|\\||\\(|\\)";
        List<String> expList = new ArrayList<>(Arrays.asList(expression.split(pattern)));
        Iterator<String> iterator = expList.iterator();
        for (; iterator.hasNext(); ) {
            String element = iterator.next();
            if ("".equals(element.trim())) {
                iterator.remove();
            }
            if (expList.contains(element)) {
                expList.set(expList.indexOf(element), element.trim());
            }
        }
        return expList;
    }

    @Test
    public void test33() {
        List<String> array1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        List<String> array2 = new ArrayList<>(Arrays.asList("e", "f", "g", "h", "i", "j", "k"));
        List<String> array3 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));

        //求交集
        boolean b = array1.retainAll(array2);
        System.out.println(b);
        System.out.println(array1);
        System.out.println(array2);

        boolean b1 = array2.retainAll(array3);
        System.out.println(b1);
        System.out.println(array2);
        System.out.println(array3);
    }

    @Test
    public void test666() {
        String source = "( OBJ10613_#{GNMENJ} > OBJ10613_#{PUVYOG}   &&  OBJ10613_#{PUVYOG} > OBJ10613_#{GDTJ69}   &&  OBJ10613_#{GDTJ69} > OBJ10613_#{M6VPHF}   &&  OBJ10613_#{YGDQEH} >= 0.1 )  || ( OBJ10613_#{TEJLDV} >= 0.05   &&  OBJ10613_#{TEJLDV} < 0.08 ) ";

        source = source.replaceAll(escapeRegularString("OBJ10613_#{GNMENJ} > OBJ10613_#{PUVYOG}"), "55555555555555555555555");
        System.out.println(source);
    }

    /**
     * TODO 格式化正则表达式中的转义字符，如 $ ( ) * + . [ ] ? \ ^ { } , |
     */
    public static String escapeRegularString(String source) {
        String[] regularCharacterArray = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
        for (String character : regularCharacterArray) {
            if (source.contains(character)) {
                source = source.replace(character, "\\" + character);
            }
        }
        return source;
    }

    @Test
    public void test3() throws ParseException {
        String dateStr1 = "2019-01-24 13:13:13";
        String dateStr2 = "2019-1-24";

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

        //Date date1 = dateFormat1.parse(dateStr2);
        Date date2 = dateFormat2.parse(dateStr1);
        System.out.println(date2.getTime());
        Date date3 = dateFormat2.parse(dateStr2);
        System.out.println(date3.getTime());
    }

    @Test
    public void test4() {
        String value = "234";
        Pattern regex = Pattern.compile("^([-+]?\\d+)(\\.\\d+)?$");
        //正则判断是否是小数
        if (regex.matcher(value).matches()) {
            //保留4位小数&取绝对值
            value = new DecimalFormat("0.0000").format(Math.abs(new BigDecimal(value).doubleValue()));
            System.out.println(value);
        }
        System.out.println("ok");
    }

    @Test
    public void test5() {
        long value= new Double( Double.parseDouble(String.valueOf("1567958400000"))).longValue();
        System.out.println(value);
        String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(new Date(value));
        System.out.println(dateStr);
    }

}
