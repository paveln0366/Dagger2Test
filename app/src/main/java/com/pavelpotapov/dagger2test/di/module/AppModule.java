package com.pavelpotapov.dagger2test.di.module;

import android.content.Context;

import com.pavelpotapov.dagger2test.services.NetworkService;
import com.pavelpotapov.dagger2test.services.impl.NetworkServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context ProvideContext() {
        return this.context;
    }
}
