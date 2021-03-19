package cn.lnlwf.base;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 小5
 */
public class TestInetAddress {

    public static void main(String[] args) {
        try {
            // 查询本机地址
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            System.out.println(inetAddress.getCanonicalHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());
            // 查询网站ip地址
            InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
            // www.baidu.com/110.242.68.3
            System.out.println(inetAddress1);
            // www.baidu.com
            System.out.println(inetAddress1.getHostName());
            // 110.242.68.3
            System.out.println(inetAddress1.getHostAddress());
            // 110.242.68.3
            System.out.println(inetAddress1.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
