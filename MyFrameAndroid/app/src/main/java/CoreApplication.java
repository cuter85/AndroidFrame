/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */


import android.app.Application;

import androidframe.com.framecore.AppAction;
import androidframe.com.framecore.AppActionImpl;

/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public class CoreApplication extends Application
{
    private AppAction appAction;

    @Override
    public void onCreate()
    {
        super.onCreate();
        appAction = new AppActionImpl(this);
    }

    public AppAction getAppAction()
    {
        return appAction;
    }
}
