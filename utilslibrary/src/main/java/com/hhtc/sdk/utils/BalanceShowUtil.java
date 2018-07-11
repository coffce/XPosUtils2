package com.hhtc.sdk.utils;

import android.text.TextUtils;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 处理货币格式化工具类
 */
public class BalanceShowUtil {


    /**
     * 返回格式化法定货币,保留三位小数，向下取整
     *
     * @param balance
     * @return
     */
    public static String getFormatBalance(double balance) {
        return getBalance(balance, 3);
    }


    /**
     * 返回格式化法定货币，保留3位小数，向下取整
     *
     * @param balance
     * @return
     */
    public static String getFormatBalance(String balance) {
        if (TextUtils.isEmpty(balance)) return "0";
        return getBalance(Double.parseDouble(balance), 3);
    }

    private static String getBalance(double balance, int digits) {
        Locale locale = Locale.getDefault();
        NumberFormat df = NumberFormat.getNumberInstance(locale);
        df.setRoundingMode(RoundingMode.DOWN);
        df.setMinimumFractionDigits(3);
        df.setMaximumFractionDigits(digits);
        return df.format(balance);
    }


    /**
     * 返回格式化数字货币，保存8位小位，向小取整
     *
     * @param balance
     * @return
     */
    public static String getCryptocurrency(double balance) {
        DecimalFormat df = new DecimalFormat("0.000000000");
        df.setRoundingMode(RoundingMode.DOWN);
        df.setMinimumFractionDigits(0);
        df.setMaximumFractionDigits(8);
        return df.format(balance);
    }


}
