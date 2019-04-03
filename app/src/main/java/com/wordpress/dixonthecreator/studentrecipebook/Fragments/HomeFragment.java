package com.wordpress.dixonthecreator.studentrecipebook.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wordpress.dixonthecreator.studentrecipebook.Adapters.AllItemsAdapter;
import com.wordpress.dixonthecreator.studentrecipebook.Adapters.RecentFeedRecyclerViewAdapter;
import com.wordpress.dixonthecreator.studentrecipebook.Items.AllRecipesItem;
import com.wordpress.dixonthecreator.studentrecipebook.R;
import com.wordpress.dixonthecreator.studentrecipebook.Items.RecentFeedRecyclerViewItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setRecentFeedRecyclerViewItems();
        setAllRecipesRecyclerViewItems();
    }

    //TODO: Recently added recipes(almost done) and RecyclerView of all the recipes(almost done)
    //Method for recent feed adding items
    private void setRecentFeedRecyclerViewItems () {
            ArrayList<RecentFeedRecyclerViewItem> recentFeedRecyclerViewItems = new ArrayList<>();
        //Define all the RV needs
             RecyclerView recentFeedRecyclerView = getView().findViewById(R.id.RecentFeedRecyclerView);
             recentFeedRecyclerView.setHasFixedSize(true);
             RecyclerView.Adapter recentFeedAdapter = new RecentFeedRecyclerViewAdapter(recentFeedRecyclerViewItems);
             RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
             recentFeedRecyclerView.setAdapter(recentFeedAdapter);
             recentFeedRecyclerView.setLayoutManager(layoutManager);
        //Adding RecentFeed items
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));
             recentFeedRecyclerViewItems.add(new RecentFeedRecyclerViewItem(R.drawable.test_recent_feed_image_view, "Test", "Price:", "150"));

        }
  //Same method for all recipes
    private void setAllRecipesRecyclerViewItems () {
            ArrayList<AllRecipesItem> allRecipesItems = new ArrayList<>();
            RecyclerView allRecipesRecyclerView = getView().findViewById(R.id.all_recipes_recycler_view);
            allRecipesRecyclerView.setHasFixedSize(true);
            RecyclerView.Adapter allRecipesAdapter = new AllItemsAdapter(allRecipesItems);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL, false);
        //Adding Items
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));
            allRecipesItems.add(new AllRecipesItem(R.drawable.test_recent_feed_image_view, "Шаверма с шавермой", "Самая лучшая шаверма за 130 рублей!"));

        }
}
