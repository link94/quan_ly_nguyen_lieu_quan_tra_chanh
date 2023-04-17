// Generated by view binder compiler. Do not edit!
package com.example.second.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.second.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button HaibatrungBtn;

  @NonNull
  public final Button hadongBtn;

  @NonNull
  public final LinearLayout header;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button HaibatrungBtn,
      @NonNull Button hadongBtn, @NonNull LinearLayout header) {
    this.rootView = rootView;
    this.HaibatrungBtn = HaibatrungBtn;
    this.hadongBtn = hadongBtn;
    this.header = header;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
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
      id = R.id.Haibatrung_btn;
      Button HaibatrungBtn = ViewBindings.findChildViewById(rootView, id);
      if (HaibatrungBtn == null) {
        break missingId;
      }

      id = R.id.hadong_btn;
      Button hadongBtn = ViewBindings.findChildViewById(rootView, id);
      if (hadongBtn == null) {
        break missingId;
      }

      id = R.id.header;
      LinearLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, HaibatrungBtn, hadongBtn, header);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
