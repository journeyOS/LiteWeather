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

package com.journeyOS.plugins.city.ui.adapter;


import com.journeyOS.base.adapter.BaseAdapterData;
import com.journeyOS.plugins.R;
import com.journeyOS.core.api.weatherprovider.WeatherData;


public class FollowedCityData implements BaseAdapterData {
    String cityId;
    String cityName;
    String temp;
    String weatherStatus;
    int backgroundId;

    public FollowedCityData(WeatherData weatherData, int backgroundId) {
        update(weatherData);
        this.backgroundId = backgroundId;
    }

    public void update(WeatherData weatherData) {
        if (weatherData != null) {
            this.cityId = weatherData.cityId;
            this.cityName = weatherData.basic.city;
            this.temp = weatherData.now.temperature;
            this.weatherStatus = weatherData.now.weather;
        }
    }


    public String getCityId() {
        return cityId;
    }

    @Override
    public int getContentViewId() {
        return R.layout.city_item_followed_city;
    }
}
