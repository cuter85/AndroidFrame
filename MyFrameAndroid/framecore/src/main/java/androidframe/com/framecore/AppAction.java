package androidframe.com.framecore;

import java.util.List;

import androidframe.com.mymodel.UserBO;

/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public interface AppAction
{
    // 发送手机验证码
    public void sendSmsCode(String phoneNum, ActionCallbackListener<Void> listener);

    // 注册
    public void register(String phoneNum, String code, String password,
                         ActionCallbackListener<Void> listener);

    // 登录
    public void login(String loginName, String password, ActionCallbackListener<Void> listener);

    // 按分页获取用户列表
    public void listUser(int currentPage, ActionCallbackListener<List<UserBO>> listener);

}
