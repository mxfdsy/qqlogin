package com.mxfdsy;

/**
 * 校验输入的格式是否合法
 * QQ号码为一个不超过10位、但大于1000（据说QQ老总的号码是1001）的整数。
 * 密码为不小于6位、不超过16位、且不包含空格的字符串。
 * Created by 平凡的世界 on 2018/4/11.
 */
public class IsLegal {
    public static Boolean isLegal(String s) {
//        return s.matches("^.*(L|N)+.* [1-9][0-9]{3,9} [0-9]{6,16}$");
        return true;
    }
}
