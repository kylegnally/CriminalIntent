package com.knally0045.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kyleg on 9/24/2017.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        // instantiate a FragmentManager named fm from the SupportFragmentManager library
        FragmentManager fm = getSupportFragmentManager();
        // ask the FragmentManager for the fragment with the container view fragment_container.
        // If that fragment already exists, the FragmentManager will return it...
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // ... but if it returns null, it will create a new fragment and add it to the list of fragments
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

}
