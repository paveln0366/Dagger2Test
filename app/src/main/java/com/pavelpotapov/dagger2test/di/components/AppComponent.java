package com.pavelpotapov.dagger2test.di.components;

import com.pavelpotapov.dagger2test.MainActivity;
import com.pavelpotapov.dagger2test.di.module.AppModule;
import com.pavelpotapov.dagger2test.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
