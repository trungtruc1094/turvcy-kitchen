package com.example.trung.turvcykitchen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.support.v4.app.Fragment;


// Add NavigationView.OnNavigationItemSelectedListener to make the Activity respond to item being clicked on navigation drawer
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    FragmentTransaction ft;
    private static final String BACK_STACK_ROOT_TAG = "root_fragment";

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Intent intent = null;
        Fragment fragment = null;
        switch (id) {
            case R.id.food_list:
                fragment = new FoodList();
                break;
            case R.id.menu_list:
                fragment = new MenuList();
                break;
            default:
                intent = new Intent(this, EditProfile.class);
        }

        if (fragment != null) {
            addFragment(fragment);
        } else {
            startActivity(intent);
        }

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set Food fragment for Main Activity
        Fragment food_fragment = new FoodList();
        addFragment(food_fragment);


        // Get drawer layout
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_main);
        // Create toggle button
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.nav_open_drawer, R.string.nav_open_drawer);

        // Add toggle button to drawer layout
        drawer.addDrawerListener(toggle);

        // Synchronize the icon on the toolbar with the state of the drawer
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    public void addFragment(Fragment fragment){
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.commit();
    }

    public void replaceFragment(Fragment fragment){
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.commit();
    }
}
