package com.hhtc.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 */
public class PreferencesUtil {
	
	public final static String DEVICEDATA = "device_data";

	public final static String EXCHANGE_TOKEN = "exchange_token";

	public final static String PACKAGE_NAME = "packagename";

	public final static String FILENAME = "user_data";

	public final static String USER_ACCOUNT = "user_account";


	public static void saveKeyPreferences(Context context, String key, String number){
		SharedPreferences settings = context.getSharedPreferences(PreferencesUtil.DEVICEDATA,0);
		settings.edit().putString(key, number).commit();
	}

	public static String getKeyPreferences(Context context, String key){
		SharedPreferences params = context.getSharedPreferences(PreferencesUtil.DEVICEDATA, 0);
		return params.getString(key, "");
	}

	public static void saveTokenPreferences(Context context, String cookie){
		SharedPreferences settings = context.getSharedPreferences(PreferencesUtil.DEVICEDATA,0);
		settings.edit().putString(EXCHANGE_TOKEN, cookie).commit();
	}

	public static String getTokenPreferences(Context context){
		SharedPreferences params = context.getSharedPreferences(PreferencesUtil.DEVICEDATA, 0);
		return params.getString(EXCHANGE_TOKEN, "");
	}

	public static void savePackageNamePreferences(Context context, String cookie){
		SharedPreferences settings = context.getSharedPreferences(PreferencesUtil.DEVICEDATA,0);
		settings.edit().putString(PACKAGE_NAME, cookie).commit();
	}

	public static String getPackageNamePreferences(Context context){
		SharedPreferences params = context.getSharedPreferences(PreferencesUtil.DEVICEDATA, 0);
		return params.getString(PACKAGE_NAME, "");
	}


	/**
	 * 获取int类型数据
	 *
	 * @param mContext
	 * @param selected
	 */
	public static void saveIntegerData(Context mContext, String type,
                                       int selected) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);
		settings.edit().putInt(type, selected).commit();
	}

	/**
	 * 得到int类型数据
	 *
	 * @param mContext
	 * @return
	 */
	public static int getIntegerData(Context mContext, String type) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);

		int select = settings.getInt(type, 0);
		return select;
	}

	/**
	 * 得到int类型数据
	 * @param mContext
	 * @return
	 */
	public static int getIntegerDataDefault(Context mContext, String type) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",0);
		int select = settings.getInt(type, 1);
		return select;
	}

	/**
	 * 返回long类型
	 * @param mContext
	 * @param type
	 * @return
	 */
	public static long getLongData(Context mContext, String type) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata", 0);
		long value = settings.getLong(type, 0);
		return value;
	}

	/**
	 * 获取Long类型数据
	 * @param mContext
	 * @param value
	 */
	public static void saveLongData(Context mContext, String type, long value) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata", 0);
		settings.edit().putLong(type, value).commit();
	}

	/**
	 * 获取boolean类型数据
	 *
	 * @param mContext
	 * @param selected
	 */
	public static void saveBooleanData(Context mContext, String type,
                                       Boolean selected) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);
		settings.edit().putBoolean(type, selected).commit();
	}

	/**
	 * 得到boolean类型数据
	 *
	 * @param mContext
	 * @return
	 */
	public static Boolean getBooleanData(Context mContext, String type) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);
		Boolean select = settings.getBoolean(type, false);
		return select;
	}

	/**
	 * 获取boolean类型数据
	 *
	 * @param mContext
	 * @param selected
	 */
	public static void saveStringData(Context mContext, String type,
                                      String selected) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);
		settings.edit().putString(type, selected).commit();
	}

	/**
	 * 得到boolean类型数据
	 *
	 * @param mContext
	 * @return
	 */
	public static String getStringData(Context mContext, String type) {
		SharedPreferences settings = mContext.getSharedPreferences("savedata",
				0);
		String select = settings.getString(type, "");
		return select;
	}

	public static void saveUserList(String no, Context context){
		SharedPreferences p=context.getSharedPreferences(FILENAME, Activity.MODE_PRIVATE);
		Set<String> set= new HashSet<>();
		if(!TextUtils.isEmpty(no)){
			set.add(no);
			SharedPreferences.Editor editor = p.edit();
			editor.putStringSet(USER_ACCOUNT, set);
			boolean is=editor.commit();
			Logs.i(is+"");
		}
	}

	public static Set<String> getUserList(Context context){
		SharedPreferences p=context.getSharedPreferences(FILENAME, Activity.MODE_PRIVATE);
		Set<String> set=p.getStringSet(USER_ACCOUNT, new HashSet<String>());
		return set;
	}

	public static void cleanUserList(Context context){
		SharedPreferences p=context.getSharedPreferences(FILENAME, Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = p.edit();
		editor.remove(USER_ACCOUNT);
		editor.commit();
	}
}
