package androidframe.com.frameapi;

import java.util.List;

import androidframe.com.mymodel.UserBO;

/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public class ApiImpl implements ApiInterface
{
    private final static String APP_KEY            = "ANDROID_FRAME";
    private final static String TIME_OUT_EVENT     = "CONNECT_TIME_OUT";
    private final static String TIME_OUT_EVENT_MSG = "连接服务器失败";
    // http引擎
    private HttpEngine          httpEngine;

    public ApiImpl()
    {
        httpEngine = HttpEngine.getInstance();
    }

    @Override
    public ApiResponse<Void> sendSmsCode4Register(String phoneNum)
    {
        return null;
    }

    @Override
    public ApiResponse<Void> registerByPhone(String phoneNum, String code, String password)
    {
        return null;
    }

    @Override
    public ApiResponse<Void> loginByApp(String loginName, String password, String imei, int loginOS)
    {
        return null;
    }

    @Override
    public ApiResponse<List<UserBO>> listUser(int currentPage, int pageSize)
    {
        return null;
    }
}
