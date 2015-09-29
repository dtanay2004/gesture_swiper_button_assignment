package com.example.tanaydey.tutorial21_gesture_swiper_button_assignment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.graphics.Color;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView tanaysMessage;
    private Button tanaysButton;
    private GestureDetectorCompat gestureDetector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // findViewById(R.layout.activity_main).setBackgroundColor(Color.GREEN);
        setContentView(R.layout.activity_main);

        this.findViewById(android.R.id.content).setBackgroundColor(Color.BLUE);


       // getWindow().setBackgroundDrawableResource(R.color.blue);

        //getWindow().setBackgroundDrawableResource(R.color.blue);

        tanaysMessage=(TextView) findViewById(R.id.tanaysMessage);
        tanaysButton=(Button) findViewById(R.id.tanaysButton);

        gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);



        // Button click method implementation


        tanaysButton.setOnClickListener(

                new Button.OnClickListener() {

                    public void onClick(View v) {
                        tanaysMessage.setText("click");

                    }
                }
        );
       // button long click
        tanaysButton.setOnLongClickListener(
                new Button.OnLongClickListener(){

                    public boolean onLongClick(View v){

                        tanaysMessage.setText("onLongClick");

                        return true;
                    }
                }


        );


    }

     //Gesture methods implementation


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {

        tanaysMessage.setText("onSingleTapConfirmed");

        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        tanaysMessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        tanaysMessage.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        tanaysMessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        tanaysMessage.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        tanaysMessage.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        tanaysMessage.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

        tanaysMessage.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        tanaysMessage.setText("onFling");
        return true;
    }

    /// Gesture methods implementation End




    @Override
    public boolean onTouchEvent(MotionEvent event) {

        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
