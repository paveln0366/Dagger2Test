package com.pavelpotapov.dagger2test;

import android.app.Application;

import com.pavelpotapov.dagger2test.di.components.AppComponent;
import com.pavelpotapov.dagger2test.di.components.DaggerAppComponent;
import com.pavelpotapov.dagger2test.di.module.AppModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
