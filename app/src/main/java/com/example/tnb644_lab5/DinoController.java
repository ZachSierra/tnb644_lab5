package com.example.tnb644_lab5;

import android.content.Intent;
import android.view.View;

public class DinoController implements View.OnClickListener{
    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext() , MainActivity.class );
        view.getContext().startActivity(i);
    }
}
