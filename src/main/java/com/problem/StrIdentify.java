package com.problem;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 1.程序分析：利用while语句,条件为输入的字符不为'\n'.
 *
 */
@Slf4j
public class StrIdentify {

    public static void main(String[] args) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])){
                numCount++;
            }else if (Character.isSpaceChar(ch[i])){
                spaceCount++;
            }else if (Character.isLetter(ch[i])){
                abcCount++;
            }else{
                otherCount++;
            }
        }
        log.info("字母个数{}",abcCount);
        log.info("数字个数{}",numCount);
        log.info("空格个数{}",spaceCount);
        log.info("其他字符个数{}",otherCount);
    }


}
