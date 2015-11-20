package edu.byuh.cis.cs203.battleshipmockup;

//importing necessary resources used in class below.
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class BSView extends View{
//  instantiating our bitmaps for the game objects we want to use
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
//      pulling the bitmap objects from resources and decoding them for use in our other methods
        water = BitmapFactory.decodeResource(getResources(), R.drawable.water);
        battleship = BitmapFactory.decodeResource(getResources(), R.drawable.battleship);
        big_airplane = BitmapFactory.decodeResource(getResources(), R.drawable.big_airplane);
        big_submarine= BitmapFactory.decodeResource(getResources(), R.drawable.big_submarine);
        little_airplane= BitmapFactory.decodeResource(getResources(), R.drawable.little_airplane);
        little_submarine= BitmapFactory.decodeResource(getResources(), R.drawable.little_submarine);
        medium_airplane= BitmapFactory.decodeResource(getResources(), R.drawable.medium_airplane);
        medium_submarine= BitmapFactory.decodeResource(getResources(), R.drawable.medium_submarine);
    }

    @Override
    public void onDraw(Canvas c){
//      getting the height and width of the device, so we can position the game objects relative to
//      the height and width of the screen rather than hard coding pixel location
//      this keeps the game objects in the same relative location from device to device
        int h = getHeight();
        int w = getWidth();

//      creating scaled versions of game objects which we pulled from resources up above.
        Paint paintBit = new Paint();
        c.drawColor(Color.WHITE);
        battleship = battleship.createScaledBitmap(battleship, (int)(w*.3), (int)(h*.12), true);
        big_airplane = big_airplane.createScaledBitmap(big_airplane, (int)(w*.12), (int)(h*.08), true);
        big_submarine = big_submarine.createScaledBitmap(big_submarine, (int)(w*.11), (int)(h*.08), true);
        medium_airplane = medium_airplane.createScaledBitmap(medium_airplane, (int)(w*.1), (int)(h*.08), true);
        medium_submarine = medium_submarine.createScaledBitmap(medium_submarine, (int)(w*.08), (int)(h*.6), true);
        little_airplane = little_airplane.createScaledBitmap(little_airplane, (int)(w*.06), (int)(h*.05), true);
        little_submarine = little_submarine.createScaledBitmap(little_submarine, (int)(w*.06), (int)(h*.4), true);

//      drawing game objects, passing them the scaled version from above and setting the locations.
//      for loop to draw water because it is a straight line, prevents us from having to write out each time
//      like other game objects below.
        for(int i=0; i<w; i+=water.getWidth()){
            c.drawBitmap(water, i , h*.5f, paintBit);
        }
        c.drawBitmap(battleship, w*.35f, h*.42f, paintBit);
        c.drawBitmap(big_airplane, w*.3f, h*.1f, paintBit);
        c.drawBitmap(big_submarine, w*.1f, h*.6f, paintBit);
        c.drawBitmap(medium_airplane, w*.6f, h*.2f, paintBit);
        c.drawBitmap(medium_submarine, w*.6f, h*.32f, paintBit);
        c.drawBitmap(little_submarine, w*.8f, h*.42f, paintBit);
        c.drawBitmap(little_airplane, w*.8f, h*.15f, paintBit);
    }
}
