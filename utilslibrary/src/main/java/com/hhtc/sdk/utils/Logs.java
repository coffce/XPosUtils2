package com.hhtc.sdk.utils;


import android.util.Log;

/**
 *Title: 日志打印<br>
 *Description: <br>
 *Create Date: 2014-9-12上午10:11:44<br>
 *
 *@author dingzai_lino
 */
public class Logs {
	public  static  String TAG= "manggoHttp";
	private static boolean isDebug =false;
	public static void init(String tag,boolean isdebug){
		TAG = tag;
		isDebug = isdebug;
	}
	public static void d(String msg) {
		if (!isDebug) {
			return;
		}
		Log.d(TAG,msg);
	}

	public static void i(String msg) {
		if (!isDebug) {
			return;
		}
		Log.i(TAG,msg);
	}

	public static void e(String msg) {
		if (!isDebug) {
			return;
		}
		Log.e(TAG,msg);
	}

	public static void w(String msg) {
		if (!isDebug) {
			return;
		}
		Log.w(TAG,msg);
	}

	public static void v(String msg) {
		if (!isDebug) {
			return;
		}
		Log.v(TAG,msg);
	}

}
