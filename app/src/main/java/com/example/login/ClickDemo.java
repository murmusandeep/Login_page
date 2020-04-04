package com.example.login;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickDemo implements View.OnClickListener {

  Context context;
  public ClickDemo(Context context) {
    this.context = context;
  }

  @Override
  public void onClick(View v) {
    Toast.makeText(context, "Inside ClickDemo Class", Toast.LENGTH_SHORT).show();
  }
}
