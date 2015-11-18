package edu.byuh.cis.cs203.battleshipmockup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class BSView extends View{

    private Bitmap battleship;
    private Bitmap big_airplane;
    private Bitmap big_submarine;
    private Bitmap little_airplane;
    private Bitmap little_submarine;
    private Bitmap medium_airplane;
    private Bitmap medium_submarine;
    private Bitmap water;


    public BSView(Context context) {
        super(context);

        battleship = BitmapFactory.decodeResource(getResources(), R.drawable.battleship);
        big_airplane = BitmapFactory.decodeResource(getResources(), R.drawable.big_airplane);
        water = BitmapFactory.decodeResource(getResources(), R.drawable.water);
    }

    public void onDraw(Canvas c){
        int h = getHeight();
        int w = getWidth();

        Paint paintBit = new Paint();
        c.drawColor(Color.WHITE);
        battleship = battleship.createScaledBitmap(battleship, (int)(w*.4), (int)(h*.2), true);
        for(int i=0; i<w; i+=water.getWidth()){
            c.drawBitmap(water, i , h*.5f, paintBit);
        }
        c.drawBitmap(battleship, w * .5f, h * .3f, paintBit);
    }
}
