package com.example.tnb644_lab5;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class ZoneController implements View.OnClickListener{
    private String zoneType;
    private Context c;
    public ZoneController(String zoneType, Context c){
        this.zoneType = zoneType;
        this.c = c;
    }
    public void loadDinos(){

    }
    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext() , DinoActivity.class );
        i.putExtra(DinoActivity.EXTRA_MESSAGE, zoneType);
        view.getContext().startActivity(i);

    }
}
