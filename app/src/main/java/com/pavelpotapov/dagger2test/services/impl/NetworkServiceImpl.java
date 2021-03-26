package com.pavelpotapov.dagger2test.services.impl;

import android.content.Context;

import com.pavelpotapov.dagger2test.services.NetworkService;

public class NetworkServiceImpl implements NetworkService {

    private Context context;

    public NetworkServiceImpl(Context context) {
        this.context = context;
    }

    @Override
    public String getHello() {
        return context.getClass().getSimpleName();
    }
}
