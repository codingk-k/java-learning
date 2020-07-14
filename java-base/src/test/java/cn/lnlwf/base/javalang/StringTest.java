package cn.lnlwf.base.javalang;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.junit.Test;

/**
 * @author liuning
 * @date 2020/7/13.
 * @email 24333389385@qq.com
 */
public class StringTest {

    @Test
    public void stringbase(){
        char[] chars = new char[]{'a', 'b', 'c'};
        String a = new String(chars);
        String b = new String(chars,0,2);
        System.out.println(a+b);
    }

    @Test
    public void stringReplace(){
        String a = "abcaabcdef";
        // 截取ab替换成-
        String b = a.replace("ab","-");
        // 截取a字符替换成-
        String c = a.replace('a','-');
        // 截取ab替换成-
        String d = a.replaceAll("ab","-");
        // 截取第一个匹配的字符abc替换成edf
        String e = a.replaceFirst("abc","edf");
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("e:"+e);
    }

}
