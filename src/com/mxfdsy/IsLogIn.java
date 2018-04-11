package com.mxfdsy;

import java.util.HashMap;
import java.util.Set;

/**
 * 检查其实否在登录，不是返回false,
 * 如果是但手机号码不存在 输出 ERROR: Not Exist
 * 如果是登录且手机号码存在且密码正确 输出 Login: OK
 * 如果是登录且手机号码存在但密码不正确 ERROR: Wrong PW
 * Created by 平凡的世界 on 2018/4/11.
 */
public class IsLogIn {
    /**
     * @param string   检查其实否在登录
     * @param num      账号
     * @param password 密码
     * @return false 他不是在登录
     */
    public static Boolean isLogIn(String string, String num, String password, HashMap map) {
        if ("L".equals(string)) {
            if (map.containsKey(num)) {
                if (map.get(num).equals(password)) {
                    System.out.println("Login: OK");
                } else {
                    System.out.println("ERROR: Wrong PW ");
                }
            } else {
                System.out.println("ERROR: Not Exist 您输入的手机号尚未注册，请注册");
            }
            return true;
        }
        return false;
    }
}
