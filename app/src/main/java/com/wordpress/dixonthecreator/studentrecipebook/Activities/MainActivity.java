package com.wordpress.dixonthecreator.studentrecipebook.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wordpress.dixonthecreator.studentrecipebook.Fragments.FavsFragment;
import com.wordpress.dixonthecreator.studentrecipebook.Fragments.HomeFragment;
import com.wordpress.dixonthecreator.studentrecipebook.Fragments.SearchFragment;
import com.wordpress.dixonthecreator.studentrecipebook.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OnCreate Fragment transaction to Home fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        BottomNavigationTransaction();
    }

    //Bottom Navigation transactions logic
    private void BottomNavigationTransaction() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.bn_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.bn_favs:
                        selectedFragment = new FavsFragment();
                        break;
                    case R.id.bn_search:
                        selectedFragment = new SearchFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }
        });
    }
}


