package com.mxfdsy;

import java.util.HashMap;

/**
 * @author 平凡的世界
 *         实现QQ新帐户申请和老帐户登陆的简化版功能。最大挑战是：据说现在的QQ号码已经有10位数了。
 *         Created by 平凡的世界 on 2018/4/11.
 *         输入首先给出一个正整数N（≤10000），随后给出N行指令。
 *         每行指令的格式为：“命令符（空格）QQ号码（空格）密码”。
 *         其中命令符为“N”（代表New）时表示要新申请一个QQ号，后面是新帐户的号码和密码；
 *         命令符为“L”（代表Login）时表示是老帐户登陆，后面是登陆信息。
 *         QQ号码为一个不超过10位、但大于1000（据说QQ老总的号码是1001）的整数。
 *         密码为不小于6位、不超过16位、且不包含空格的字符串。
 */
public class QqLogIn {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        login("N 12345 cww123456",map);
        System.out.println(map);
        login("L 12345 cww1245",map);
    }

    private static void login(String s,HashMap map) {

        //检查输入的是否符合qq号格式
        if (IsLegal.isLegal(s)) {
            //拆分数据
            String[] split = s.split(" ");
            String T1 = split[0];
            String qqNum = split[1];
            String pW = split[2];
            //检查是登录还是注册
            if (IsLogIn.isLogIn(T1, qqNum, pW, map)) {
                return;
            } else {
                NewAccount.newAccount(qqNum, pW, map);
            }
        }
    }
}
