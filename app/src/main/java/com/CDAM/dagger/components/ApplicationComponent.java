package com.CDAM.dagger.components;


import com.CDAM.App;
import com.CDAM.dagger.AppScope;
import com.CDAM.dagger.modules.ApplicationModule;
import com.CDAM.dagger.modules.HttpClientModule;
import com.CDAM.ui.detail.DetailFragment;
import com.CDAM.ui.main.MainFragment;
import com.CDAM.ui.search.SearchFragment;

import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Singleton
@Component(modules = {
        ApplicationModule.class,
        HttpClientModule.class,
})
public interface ApplicationComponent {

    void inject(App app);
    void inject(MainFragment mainFragment);
    void inject(DetailFragment movieDetailsFragment);
    void inject(SearchFragment searchFragment);
}
