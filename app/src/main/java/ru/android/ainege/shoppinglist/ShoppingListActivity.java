package ru.android.ainege.shoppinglist;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Belkin on 06.06.2015.
 */
public class ShoppingListActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
    }
}
