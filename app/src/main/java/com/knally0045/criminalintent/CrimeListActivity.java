package com.knally0045.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by kyleg on 9/24/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
