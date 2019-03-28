package com.wordpress.dixonthecreator.studentrecipebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    }

    //TODO: Recently added recipes and RecyclerView of all the recipes
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
}
