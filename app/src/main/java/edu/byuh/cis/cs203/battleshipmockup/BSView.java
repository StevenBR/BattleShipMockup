package edu.byuh.cis.cs203.battleshipmockup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class BSView extends View{
    Bitmap battleship;
    public BSView(Context context) {
        super(context);

        Bitmap battleship = BitmapFactory.decodeResource(getResources(), R.drawable.battleship);
    }

    public void onDraw(){

    }
}
