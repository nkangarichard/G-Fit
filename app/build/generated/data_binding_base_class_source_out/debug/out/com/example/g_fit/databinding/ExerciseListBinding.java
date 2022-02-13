// Generated by view binder compiler. Do not edit!
package com.example.g_fit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.g_fit.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExerciseListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView exerciseDifficulty;

  @NonNull
  public final CircleImageView exerciseImage;

  @NonNull
  public final TextView exerciseName;

  @NonNull
  public final TextView musclesInvolved;

  private ExerciseListBinding(@NonNull LinearLayout rootView, @NonNull TextView exerciseDifficulty,
      @NonNull CircleImageView exerciseImage, @NonNull TextView exerciseName,
      @NonNull TextView musclesInvolved) {
    this.rootView = rootView;
    this.exerciseDifficulty = exerciseDifficulty;
    this.exerciseImage = exerciseImage;
    this.exerciseName = exerciseName;
    this.musclesInvolved = musclesInvolved;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExerciseListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExerciseListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.exercise_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExerciseListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.exercise_difficulty;
      TextView exerciseDifficulty = ViewBindings.findChildViewById(rootView, id);
      if (exerciseDifficulty == null) {
        break missingId;
      }

      id = R.id.exercise_image;
      CircleImageView exerciseImage = ViewBindings.findChildViewById(rootView, id);
      if (exerciseImage == null) {
        break missingId;
      }

      id = R.id.exercise_name;
      TextView exerciseName = ViewBindings.findChildViewById(rootView, id);
      if (exerciseName == null) {
        break missingId;
      }

      id = R.id.muscles_involved;
      TextView musclesInvolved = ViewBindings.findChildViewById(rootView, id);
      if (musclesInvolved == null) {
        break missingId;
      }

      return new ExerciseListBinding((LinearLayout) rootView, exerciseDifficulty, exerciseImage,
          exerciseName, musclesInvolved);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
