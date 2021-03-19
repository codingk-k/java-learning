package cn.lnlwf.base;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {
        String test1 = "我吹过你吹过的晚风";
        String test2 = "\uD835\uDD17\uD835\uDD18";
        String test3 = "AbcdeFG";
        // length()方法返回字符串长度
        System.out.println("test1.length()结果："+test1.length());

        // isEmpty()方法返回字符串是否是空字符串，长度为0的字符串为空字符串
        System.out.println("\"\".isEmpty()结果："+"".isEmpty()+",test1.isEmpty()结果："+test1.isEmpty());

        // charAt(int index)方法返回字符串第index下标下的字符返回char类型
        System.out.println("test1.charAt(0)结果："+test1.charAt(0));

        // codePointAt(int index)返回指定索引处的字符（Unicode代码点）。
        // 索引引用char值（Unicode代码单位），例："abc".codePointAt(0) 是97，codePointAt(1)是98,
        System.out.println("test1.codePointAt(0)结果："+test1.codePointAt(0));

        // codePointBefore(int index)和上面的codePointAt(int index)一样，返回char值，只不过是index下标前一个char值
        System.out.println("test1.codePointBefore(1)结果："+test1.codePointBefore(1));

        // codePointCount(int beginIndex, int endIndex)返回此String指定文本范围内的Unicode代码点数
        // 可以去这个网站查看这个编码是哪个字符https://www.bejson.com/convert/unicode_chinese/
        System.out.println("test2.codePointCount(0, test2.length())方法："+test2.codePointCount(0, test2.length()));

        // offsetByCodePoints(int index, int codePointOffset)该索引从给定index偏移codePointOffset代码点
        System.out.println("test2.offsetByCodePoints(0, 2)结果："+test2.offsetByCodePoints(0, 2));

        // getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
        // 将字符串中的字符复制到目标字符数组中。
        // srcBegin 开始复制下标；srcEnd 结束复制下标（不包含）；dst[]目标数组；dstBegin目标数组开始下标
        char[] dst = new char[5];
        test1.getChars(1,6,dst,0);
        System.out.println("test1.getChars(1,6,dst,0)结果："+new String(dst));

        // getBytes()根据默认编码获取字节数组
        // getBytes(String charsetName)根据编码名称字符串获取字节数组
        // getBytes(Charset charset)根据Charset对象获取字节数组
        try {
            byte[] bytes = test1.getBytes();
            System.out.println("test1.getBytes()结果：\n"+Arrays.toString(bytes));
            byte[] bytes1 = test1.getBytes("gbk");
            System.out.println("test1.getBytes(\"gbk\")结果：\n"+Arrays.toString(bytes1));
            byte[] bytes2 = test1.getBytes(StandardCharsets.UTF_8);
            System.out.println("test1.getBytes(StandardCharsets.UTF_8)结果：\n"+Arrays.toString(bytes2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // equals(Object anObject)为比较两个字符串是否内容相等。
        System.out.println("test1.equals(test2)结果："+test1.equals(test2));
        System.out.println("test1.equals(\"我吹过你吹过的晚风\")结果："+test1.equals("我吹过你吹过的晚风"));

        // contentEquals(StringBuffer sb)用于比较字符串和StringBuffer的字符序列是否相等
        StringBuffer stringBuffer = new StringBuffer().append("我").append("吹").append("过").append("你吹过的晚风");
        System.out.println("test1.contentEquals(stringBuffer)结果："+test1.contentEquals(stringBuffer));

        // contentEquals(CharSequence cs)用于比较字符串和CharSequence的字符序列是否相等
        CharSequence charSequence = new StringBuilder().append("我").append("吹").append("过").append("你吹过的晚风");
        System.out.println("test1.contentEquals(charSequence)结果："+test1.contentEquals(charSequence));

        // equalsIgnoreCase(String anotherString)不区分大小写比较字符串
        System.out.println("test3.equalsIgnoreCase(\"abcdefg\")结果："+test3.equalsIgnoreCase("abcdefg"));

        // compareTo(String anotherString)比较两个字符串
        // 如果此String对象在字典上跟随自变量字符串，则结果为正整数。 如果字符串相等，则结果为零；否则，结果为零。 当equals(Object)方法返回true时， compareTo返回0 。
        System.out.println("test3.compareTo(\"bcdef\")结果："+test3.compareTo("bcdef"));

        // compareToIgnoreCase(String str) 不区分大小写比较字符串，和上面的compareTo一致
        System.out.println("test3.compareToIgnoreCase(\"abcdef\")结果："+test3.compareToIgnoreCase("abcdef"));

        // regionMatches(int toffset, String other, int ooffset,int len) 测试两个字符串区域是否相等
        // regionMatches(boolean ignoreCase, int toffset,String other, int ooffset, int len) ignoreCase代表是否忽略大小写测试两个字符串区域是否相等
        System.out.println("test3.regionMatches(1, \"aaaaabcdef\", 5, 3)结果："+test3.regionMatches(1, "aaaaabcdef", 5, 3));
        System.out.println("test3.regionMatches(true,1, \"aaaaaBCDEF\", 5, 3)结果："+test3.regionMatches(true,1, "aaaaaBCDEF", 5, 3));

        // startsWith(String prefix, int toffset) 字符串从跳过toffset下标开始是否以prefix前缀开始
        // startsWith(String prefix) 字符串是否以prefix前缀开始
        System.out.println("test3.startsWith(\"Abc\")结果："+test3.startsWith("Abc")+"；test3.startsWith(\"bcd\",1)"+test3.startsWith("bcd",1));

        // endsWith(String suffix) 字符串是否以suffix结束
        System.out.println("test3.endsWith(\"eFG\")结果"+test3.endsWith("eFG"));

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("f");
        strings.add("b");
        strings.add("e");
        Collections.sort(strings,String.CASE_INSENSITIVE_ORDER);
        strings.stream().forEach(System.out::print);
    }
}
