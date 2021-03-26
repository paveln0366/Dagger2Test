package com.pavelpotapov.dagger2test.di.module;

import android.content.Context;

import com.pavelpotapov.dagger2test.services.NetworkService;
import com.pavelpotapov.dagger2test.services.impl.NetworkServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public class NetworkModule {

    @Provides
    @Singleton
    NetworkService ProvideNetworkService(Context context) {
        return new NetworkServiceImpl(context);
    }
}
