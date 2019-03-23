package com.catnip.bikecident.view.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.catnip.bikecident.R;
import com.catnip.bikecident.view.bookmark.BookmarkFrag;
import com.catnip.bikecident.view.mapsaccident.AccidentMapsFragment;

public class MainActivity extends AppCompatActivity {

    final Fragment listFragment = new ListFragment();
    final Fragment mapsFragment = new AccidentMapsFragment();
    final Fragment bookmarkFragment = new BookmarkFrag();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = listFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction().hide(active).show(listFragment).commit();
                    active = listFragment;
                    return true;

                case R.id.navigation_dashboard:
                    fm.beginTransaction().hide(active).show(mapsFragment).commit();
                    active = mapsFragment;
                    return true;

                case R.id.navigation_notifications:
                    fm.beginTransaction().hide(active).show(bookmarkFragment).commit();
                    active = bookmarkFragment;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm.beginTransaction().add(R.id.fragContainer,listFragment, "1").commit();
        fm.beginTransaction().add(R.id.fragContainer, mapsFragment, "2").hide(mapsFragment).commit();
        fm.beginTransaction().add(R.id.fragContainer, bookmarkFragment, "3").hide(bookmarkFragment).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
