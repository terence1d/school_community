package com.school.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/work/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.school.com d:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
