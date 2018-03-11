package com.utils.bobko;

import static org.apache.commons.text.StringEscapeUtils.*;

public class StringEscapeUtilsTest {
    public static void main(String[] args) {

        System.out.println(escapeJava("He didn't \t say, \n \"Stop!\""));
        System.out.println(unescapeJava("He didn't \tsay, \n \"Stop!\""));
        System.out.println(unescapeJson("{\"data\": \"\nhello\"}"));
        System.out.println(escapeXml10("<xml>"));
        System.out.println(unescapeXml("&lt;xml&gt;"));
        System.out.println(escapeHtml4("\"<b>simple text</b>\""));

    }
}
