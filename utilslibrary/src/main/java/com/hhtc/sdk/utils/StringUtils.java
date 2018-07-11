package com.hhtc.sdk.utils;

import android.text.TextUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 字符串格式化工具类
 * Created by yangtao on 2018/5/17.
 */

public class StringUtils {

    /**
     * 比较大小
     *
     * @param v1 被比较数
     * @param v2 比较数
     * @return 如果v1 大于v2 则 返回true 否则false
     */
    public static boolean compare(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        int bj = b1.compareTo(b2);
        boolean res;
        if (bj > 0)
            res = true;
        else
            res = false;
        return res;
    }



    /**
     * 提供精确的减法运算
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static String sub(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2).toString();
    }

    /**
     * @param d1
     * @param
     * @return 格式化百分比
     */
    public static String formatPercentage(double d1) {
        DecimalFormat df = new DecimalFormat("0.0%");
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        df.setMinimumFractionDigits(0);
        df.setMaximumFractionDigits(3);
        return df.format(d1);
    }

    /** 卡号隐藏中间部分 */
    public static String hideCardNum(String cardId) {
        if(TextUtils.isEmpty(cardId)){
            return "****************";
        }
        String hideId = "";
        try {
            hideId = cardId.substring(0, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        hideId = hideId + " **** **** ";
        try {
            hideId += cardId.substring(12, cardId.length());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return hideId;
    }
}
