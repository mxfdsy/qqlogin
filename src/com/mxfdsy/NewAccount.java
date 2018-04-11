package com.mxfdsy;

import java.util.HashMap;

/**
 * 这里在新建账号
 * 如果 号码已经存在 输出 ERROR: Exist
 * 如果 号码不存在 输出 New: OK
 * Created by 平凡的世界 on 2018/4/11.
 */
public class NewAccount {
    public static Boolean newAccount(String num, String password, HashMap map) {
        if (map.containsKey(num)) {
            System.out.println("ERROR: Exist 手机号已经注册请登录");
            return false;
        } else {
            map.put(num, password);
            System.out.println("New: OK");
            return true;
        }
    }
}
