// Generated by view binder compiler. Do not edit!
package com.example.g_fit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.g_fit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMeditationExerciseBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ConstraintLayout Day2;

  @NonNull
  public final ConstraintLayout meditateCard;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView31;

  @NonNull
  public final TextView textView32;

  @NonNull
  public final TextView textView33;

  @NonNull
  public final TextView textView35;

  private ActivityMeditationExerciseBinding(@NonNull ScrollView rootView,
      @NonNull ConstraintLayout Day2, @NonNull ConstraintLayout meditateCard,
      @NonNull TextView textView14, @NonNull TextView textView31, @NonNull TextView textView32,
      @NonNull TextView textView33, @NonNull TextView textView35) {
    this.rootView = rootView;
    this.Day2 = Day2;
    this.meditateCard = meditateCard;
    this.textView14 = textView14;
    this.textView31 = textView31;
    this.textView32 = textView32;
    this.textView33 = textView33;
    this.textView35 = textView35;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMeditationExerciseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMeditationExerciseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_meditation_exercise, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMeditationExerciseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Day_2;
      ConstraintLayout Day2 = ViewBindings.findChildViewById(rootView, id);
      if (Day2 == null) {
        break missingId;
      }

      id = R.id.meditateCard;
      ConstraintLayout meditateCard = ViewBindings.findChildViewById(rootView, id);
      if (meditateCard == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView31;
      TextView textView31 = ViewBindings.findChildViewById(rootView, id);
      if (textView31 == null) {
        break missingId;
      }

      id = R.id.textView32;
      TextView textView32 = ViewBindings.findChildViewById(rootView, id);
      if (textView32 == null) {
        break missingId;
      }

      id = R.id.textView33;
      TextView textView33 = ViewBindings.findChildViewById(rootView, id);
      if (textView33 == null) {
        break missingId;
      }

      id = R.id.textView35;
      TextView textView35 = ViewBindings.findChildViewById(rootView, id);
      if (textView35 == null) {
        break missingId;
      }

      return new ActivityMeditationExerciseBinding((ScrollView) rootView, Day2, meditateCard,
          textView14, textView31, textView32, textView33, textView35);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
