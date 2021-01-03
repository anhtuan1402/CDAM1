package com.CDAM;

import android.app.Application;

import com.CDAM.dagger.components.ApplicationComponent;


import com.CDAM.dagger.components.DaggerApplicationComponent;
import com.CDAM.dagger.modules.ApplicationModule;
import com.CDAM.dagger.modules.HttpClientModule;
import com.halil.ozel.movieparadise.BuildConfig;

import timber.log.Timber;

public class App extends Application {

    private static App instance;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        // Creates Dagger Graph
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpClientModule(new HttpClientModule())
                .build();

        applicationComponent.inject(this);
    }

    public static App instance() {
        return instance;
    }

    public ApplicationComponent appComponent() {
        return applicationComponent;
    }

}
