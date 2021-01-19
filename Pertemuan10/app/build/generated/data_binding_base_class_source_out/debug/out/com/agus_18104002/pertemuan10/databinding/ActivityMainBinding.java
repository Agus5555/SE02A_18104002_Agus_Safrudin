// Generated by view binder compiler. Do not edit!
package com.agus_18104002.pertemuan10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.agus_18104002.pertemuan10.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FloatingActionButton fabAdd;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView rvQuotes;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FloatingActionButton fabAdd, @NonNull ProgressBar progressbar,
      @NonNull RecyclerView rvQuotes) {
    this.rootView = rootView;
    this.fabAdd = fabAdd;
    this.progressbar = progressbar;
    this.rvQuotes = rvQuotes;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab_add;
      FloatingActionButton fabAdd = rootView.findViewById(id);
      if (fabAdd == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = rootView.findViewById(id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.rv_quotes;
      RecyclerView rvQuotes = rootView.findViewById(id);
      if (rvQuotes == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, fabAdd, progressbar, rvQuotes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
