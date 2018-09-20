package com.zhzh;

import sun.tools.java.ClassPath;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ${Author}: jason.zhao
 * 2018/9/8 20:16
 **/
public class Java8Test {
    public static String processFile(BufferedReaderProcessor b) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\tan\\zhzh-common-parent\\zhzh-common-start\\src\\main\\resources\\application.yml"));
        return b.process(br);
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
         BufferedReaderProcessor bufferedReaderProcessor = (BufferedReader b) -> {
             try {
                 return b.readLine() +b.readLine()+b.readLine();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             return null;
         };
        System.out.println(Java8Test.processFile(bufferedReaderProcessor));
    }
}

@FunctionalInterface
interface BufferedReaderProcessor {
    String process(BufferedReader b);
}


