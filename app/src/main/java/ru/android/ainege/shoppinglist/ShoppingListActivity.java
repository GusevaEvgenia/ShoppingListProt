package ru.android.ainege.shoppinglist;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Belkin on 06.06.2015.
 */
public class ShoppingListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ShoppingListFragment();
    }
}
