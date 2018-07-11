package com.hhtc.sdk.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast显示
 * @author xiaozumi_lin
 * 清掉上个toast
 *
 */
public class Toasts {

	public  static Toast toast;
	/**
	 * Toast 消息
	 * @param text
	 * @param
	 * @param context
	 */
	public static void toastMessage(String text, Context context) {
		if(toast!=null){
			toast.cancel();
		}
		toast= Toast.makeText(context,text, Toast.LENGTH_SHORT);
		toast.show();

	}
	
	/**
	 * Toast 消息
	 * @param textId
	 * @param context
	 */
	public static void toastMessage(int textId, Context context) {
		if(toast!=null){
			toast.cancel();
		}
		toast= Toast.makeText(context,textId, Toast.LENGTH_SHORT);
		toast.show();

	}

}
