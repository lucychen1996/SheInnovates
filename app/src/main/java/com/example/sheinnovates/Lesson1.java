package com.example.sheinnovates;

import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public class Lesson1 extends AppCompatActivity{

    TextView txt1, txt2, txt3, txt4, dropbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1);

        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);
        txt3 = (TextView) findViewById(R.id.text3);
        txt4 = (TextView) findViewById(R.id.text4);
        dropbox = (TextView) findViewById(R.id.dropbox);

        txt1.setOnLongClickListener(longclickListener);
        txt2.setOnLongClickListener(longclickListener);
        txt3.setOnLongClickListener(longclickListener);
        txt4.setOnLongClickListener(longclickListener);
        dropbox.setOnDragListener(dragListener);;

    }

    View.OnLongClickListener longclickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBender = new View.DragShadowBuilder(v);
            v.startDrag(data, shadowBender, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener(){
        @Override
        public boolean onDrag(View v, DragEvent event){

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();
            switch (dragEvent){
                case DragEvent.ACTION_DROP:

                    if (view.getId() == R.id.text1) {
                        dropbox.setText("Wrong");
                    }
                    if (view.getId() == R.id.text2){
                        dropbox.setText("Wrong");
                    }
                    if (view.getId() == R.id.text3){
                        dropbox.setText("Right");
                    }
                    if (view.getId() == R.id.text4)
                    {
                        dropbox.setText("Wrong");
                    }
                    break;
            }
            return true;
        }

    };
}
