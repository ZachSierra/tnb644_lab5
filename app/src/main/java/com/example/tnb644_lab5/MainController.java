package com.example.tnb644_lab5;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MainController implements View.OnClickListener{
    private String zoneType;
    private Context c;
    public MainController(String zoneType, Context c){
        /** DONE **/
        this.zoneType = zoneType;
        this.c = c;

    }
    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        /** DONE **/
        Intent i = new Intent(view.getContext() , ZoneActivity.class );
        i.putExtra(ZoneActivity.EXTRA_MESSAGE, zoneType);
        view.getContext().startActivity(i);

    }
}
