package androidframe.com.framecore;

import java.util.List;


import android.content.Context;

import androidframe.com.frameapi.ApiImpl;
import androidframe.com.frameapi.ApiInterface;
import androidframe.com.mymodel.UserBO;

/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public class AppActionImpl implements AppAction
{
    private final static int LOGIN_OS  = 1;  // 表示Android
    private final static int PAGE_SIZE = 20; // 默认每页20条

    private Context context;
    private ApiInterface api;

    public AppActionImpl(Context context)
    {
        this.context = context;
        this.api = new ApiImpl();
    }

    @Override
    public void sendSmsCode(String phoneNum, ActionCallbackListener<Void> listener)
    {

    }

    @Override
    public void register(String phoneNum, String code, String password,
                         ActionCallbackListener<Void> listener)
    {

    }

    @Override
    public void login(String loginName, String password, ActionCallbackListener<Void> listener)
    {

    }

    @Override
    public void listUser(int currentPage, ActionCallbackListener<List<UserBO>> listener) {

    }

}
