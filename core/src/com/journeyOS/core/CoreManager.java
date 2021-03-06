/*
 * Copyright (c) 2018 anqi.huang@outlook.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.journeyOS.core;


import android.app.Application;

import com.journeyOS.core.api.ICoreApi;
import com.journeyOS.core.appconfig.AppConfig;
import com.journeyOS.literouter.ARouter;


public class CoreManager {
    private static Application sContext;

    public static void init(Application context) {
        sContext = context;
        AppConfig.initialize(context);
    }

    public static Application getContext() {
        return sContext;
    }

    public static <T extends ICoreApi> T getImpl(Class<T> api) {
        return ARouter.getImpl(api);
    }

}
