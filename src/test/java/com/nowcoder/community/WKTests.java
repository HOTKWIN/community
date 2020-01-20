package com.nowcoder.community;

import java.io.IOException;

/**
 * @author kwin
 * @create 2020-01-20 16:10
 */
public class WKTests {
    public static void main(String[] args) {
        String cmd =  "D:/developer_tools/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com D:/developer_tools/Java/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
