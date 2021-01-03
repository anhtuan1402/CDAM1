package com.CDAM.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.v17.leanback.app.SearchFragment;

import com.CDAM.ui.base.BaseTVActivity;
import com.halil.ozel.movieparadise.R;

public class SearchActivity extends BaseTVActivity {

    SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(com.CDAM.ui.search.SearchFragment.newInstance());

        searchFragment = (SearchFragment) getFragmentManager().findFragmentById(R.id.search_fragment);

    }


    @Override
    public boolean onSearchRequested() {
        startActivity(new Intent(this, SearchActivity.class));
        return true;
    }
}
