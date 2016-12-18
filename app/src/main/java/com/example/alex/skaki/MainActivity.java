package com.example.alex.skaki;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    protected boolean catched=true;
    protected boolean released,canceled;
    protected int k=0,l=1;
    protected View BeforeID;
    protected View NowID;
    protected Drawable backz;
    protected Drawable nowbackzz;
    protected String color;
    protected String colorB;
    protected String BackG;
    protected String BeforeBackG;
    protected String Beforecolor;
    protected String BeforecolorB;
    protected String Beforepaname;
    protected String Nowpaname;
    protected String nextColor="white";
    protected int panx,pany,Beforepanx,Beforepany;
    protected boolean wsoldtop=false;
    protected boolean bsoldtop=false;
    TextView floataki;
    ImageButton zero_zero;
    ImageButton zero_one;
    ImageButton zero_two;
    ImageButton zero_three;
    ImageButton zero_four;
    ImageButton zero_five;
    ImageButton zero_six;
    ImageButton zero_seven;
    ImageButton one_zero;
    ImageButton one_one;
    ImageButton one_two;
    ImageButton one_three;
    ImageButton one_four;
    ImageButton one_five;
    ImageButton one_six;
    ImageButton one_seven;

    ImageButton two_zero;
    ImageButton two_one;
    ImageButton two_two;
    ImageButton two_three;
    ImageButton two_four;
    ImageButton two_five;
    ImageButton two_six;
    ImageButton two_seven;
    ImageButton three_zero;
    ImageButton three_one;
    ImageButton three_two;
    ImageButton three_three;
    ImageButton three_four;
    ImageButton three_five;
    ImageButton three_six;
    ImageButton three_seven;
    ImageButton four_zero;
    ImageButton four_one;
    ImageButton four_two;
    ImageButton four_three;
    ImageButton four_four;
    ImageButton four_five;
    ImageButton four_six;
    ImageButton four_seven;
    ImageButton five_zero;
    ImageButton five_one;
    ImageButton five_two;
    ImageButton five_three;
    ImageButton five_four;
    ImageButton five_five;
    ImageButton five_six;
    ImageButton five_seven;

    ImageButton six_zero;
    ImageButton six_one;
    ImageButton six_two;
    ImageButton six_three;
    ImageButton six_four;
    ImageButton six_five;
    ImageButton six_six;
    ImageButton six_seven;
    ImageButton seven_zero;
    ImageButton seven_one;
    ImageButton seven_two;
    ImageButton seven_three;
    ImageButton seven_four;
    ImageButton seven_five;
    ImageButton seven_six;
    ImageButton seven_seven;
    Vibrator vib;

    protected boolean[][] pan=new boolean[8][8];
    protected String[][] paname=new String[8][8];
    /////////////////////////////////////
    protected String[] undoname=new String[500];
    protected String[] undocolor=new String[500];
    protected int[] undopanx=new int[500];
    protected int[] undopany=new int[500];
    protected View[] undoid=new View[500];
    protected Drawable[] undodraw=new Drawable[500];
    protected int undocalc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        floataki=(TextView) findViewById(R.id.textView);
        zero_zero=(ImageButton) findViewById(R.id.zero_zero);
        zero_one=(ImageButton) findViewById(R.id.zero_one);
        zero_two=(ImageButton) findViewById(R.id.zero_two);
        zero_three=(ImageButton) findViewById(R.id.zero_three);
        zero_four=(ImageButton) findViewById(R.id.zero_four);
        zero_five=(ImageButton) findViewById(R.id.zero_five);
        zero_six=(ImageButton) findViewById(R.id.zero_six);
        zero_seven=(ImageButton) findViewById(R.id.zero_seven);
        one_zero=(ImageButton) findViewById(R.id.one_zero);
        one_one=(ImageButton) findViewById(R.id.one_one);
        one_two=(ImageButton) findViewById(R.id.one_two);
        one_three=(ImageButton) findViewById(R.id.one_three);
        one_four=(ImageButton) findViewById(R.id.one_four);
        one_five=(ImageButton) findViewById(R.id.one_five);
        one_six=(ImageButton) findViewById(R.id.one_six);
        one_seven=(ImageButton) findViewById(R.id.one_seven);

        two_zero=(ImageButton) findViewById(R.id.two_zero);
        two_one=(ImageButton) findViewById(R.id.two_one);
        two_two=(ImageButton) findViewById(R.id.two_two);
        two_three=(ImageButton) findViewById(R.id.two_three);
        two_four=(ImageButton) findViewById(R.id.two_four);
        two_five=(ImageButton) findViewById(R.id.two_five);
        two_six=(ImageButton) findViewById(R.id.two_six);
        two_seven=(ImageButton) findViewById(R.id.two_seven);
        three_zero=(ImageButton) findViewById(R.id.three_zero);
        three_one=(ImageButton) findViewById(R.id.three_one);
        three_two=(ImageButton) findViewById(R.id.three_two);
        three_three=(ImageButton) findViewById(R.id.three_three);
        three_four=(ImageButton) findViewById(R.id.three_four);
        three_five=(ImageButton) findViewById(R.id.three_five);
        three_six=(ImageButton) findViewById(R.id.three_six);
        three_seven=(ImageButton) findViewById(R.id.three_seven);
        four_zero=(ImageButton) findViewById(R.id.four_zero);
        four_one=(ImageButton) findViewById(R.id.four_one);
        four_two=(ImageButton) findViewById(R.id.four_two);
        four_three=(ImageButton) findViewById(R.id.four_three);
        four_four=(ImageButton) findViewById(R.id.four_four);
        four_five=(ImageButton) findViewById(R.id.four_five);
        four_six=(ImageButton) findViewById(R.id.four_six);
        four_seven=(ImageButton) findViewById(R.id.four_seven);
        five_zero=(ImageButton) findViewById(R.id.five_zero);
        five_one=(ImageButton) findViewById(R.id.five_one);
        five_two=(ImageButton) findViewById(R.id.five_two);
        five_three=(ImageButton) findViewById(R.id.five_three);
        five_four=(ImageButton) findViewById(R.id.five_four);
        five_five=(ImageButton) findViewById(R.id.five_five);
        five_six=(ImageButton) findViewById(R.id.five_six);
        five_seven=(ImageButton) findViewById(R.id.five_seven);

        six_zero=(ImageButton) findViewById(R.id.six_zero);
        six_one=(ImageButton) findViewById(R.id.six_one);
        six_two=(ImageButton) findViewById(R.id.six_two);
        six_three=(ImageButton) findViewById(R.id.six_three);
        six_four=(ImageButton) findViewById(R.id.six_four);
        six_five=(ImageButton) findViewById(R.id.six_five);
        six_six=(ImageButton) findViewById(R.id.six_six);
        six_seven=(ImageButton) findViewById(R.id.six_seven);
        seven_zero=(ImageButton) findViewById(R.id.seven_zero);
        seven_one=(ImageButton) findViewById(R.id.seven_one);
        seven_two=(ImageButton) findViewById(R.id.seven_two);
        seven_three=(ImageButton) findViewById(R.id.seven_three);
        seven_four=(ImageButton) findViewById(R.id.seven_four);
        seven_five=(ImageButton) findViewById(R.id.seven_five);
        seven_six=(ImageButton) findViewById(R.id.seven_six);
        seven_seven=(ImageButton) findViewById(R.id.seven_seven);

        chessReset();
    }

    public void chessReset(){
        resetpan();
        preparepaname();
        prepareBackground();
    }

    public void onClickList(View v) {
        NowID=v;
        takeOrdinares(v.getId());
        BackG=onBackroundCheck(v);

        if(k==0){
            backz=v.getBackground();
            Beforepanx=panx;
            Beforepany=pany;
            BeforeID=v;
            Beforecolor=getColor();
            BeforecolorB=colorB;
            BeforeBackG=BackG;
        }

        if(BeforeID==v){
            canceled=true;
            released=false;
        }



        if(catched){
            vib.vibrate(25);
            if(getColor()=="black"&&nextColor=="black"){

                if(BackG=="sold"){
                    soldpan();
                }
                else if(BackG=="tower"){
                    towerpan();
                }
                else if(BackG=="horse"){
                    horsepan();
                }
                else if(BackG=="ax"){
                    axpan();
                }
                else if(BackG=="queen"){
                    queenpan();
                }
                else if(BackG=="king"){
                    kingpan();
                }
                released=true;
                catched=false;
                k=1;
                l=1;
                undostorage();
                undocalc=undocalc+1;
               nextColor="white";
            }
            else if (getColor()=="white"&&nextColor=="white")
            {
                if(BackG=="sold"){
                    soldpan();
                }
                else if(BackG=="tower"){
                    towerpan();
                }
                else if(BackG=="horse"){
                    horsepan();
                }
                else if(BackG=="ax"){
                    axpan();
                }
                else if(BackG=="queen"){
                    queenpan();
                }
                else if(BackG=="king"){
                    kingpan();
                }

                nextColor="black";
                released=true;
                catched=false;
                k=1;
                l=1;
                undostorage();
                undocalc=undocalc+1;
            }
            else if (getColor()==null)

            {
                vib.vibrate(500);
                floataki.setText("WRONG MOVE");
                released=false;
                catched=true;
                k=0;
                getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.white));
                        floataki.setText("");
                    }
                }, 500);

            }

            else
            {
                vib.vibrate(250);
                floataki.setText("NOT YOUR TURN TO PLAY");
                released=false;
                catched=true;
                k=0;
                l=1;
                getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.black));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.white));
                        floataki.setText("");
                    }
                }, 1200);
            }


        }
        else if(released){
            vib.vibrate(15);
            nowbackzz=v.getBackground();
            undostorage();

            if (pan[panx][pany]) {
                /*if(rouab()){
                    rouakingb=true;
                    Toast.makeText(this, "Roua Black King", Toast.LENGTH_SHORT).show();
                }
                if(rouaw()){
                    rouakingw=true;
                    Toast.makeText(this, "Roua White King", Toast.LENGTH_SHORT).show();
                }*/
                if (Beforecolor == "white") {
                    if (BeforecolorB == "black") {
                        BeforeID.setBackgroundResource(R.drawable.black);

                    } else if (BeforecolorB == "white") {
                        BeforeID.setBackgroundResource(R.drawable.white);
                    }

                    if (BeforeBackG == "sold") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whitesold_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whitesold_black);
                        }

                    } else if (BeforeBackG == "tower") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whitetower_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whitetower_black);
                        }
                    } else if (BeforeBackG == "horse") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whitehorse_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whitehorse_black);
                        }
                    } else if (BeforeBackG == "ax") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whiteax_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whiteax_black);
                        }
                    } else if (BeforeBackG == "queen") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whitequeen_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whitequeen_black);
                        }
                    } else if (BeforeBackG == "king") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.whiteking_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.whiteking_black);
                        }
                    }

                } else if (Beforecolor=="black") {


                    if (BeforecolorB == "black") {
                        BeforeID.setBackgroundResource(R.drawable.black);
                    } else if (BeforecolorB == "white") {
                        BeforeID.setBackgroundResource(R.drawable.white);
                    }

                    if (BeforeBackG == "sold") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blacksold_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blacksold_black);
                        }

                    } else if (BeforeBackG == "tower") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blacktower_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blacktower_black);
                        }
                    } else if (BeforeBackG == "horse") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blackhorse_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blackhorse_black);
                        }
                    } else if (BeforeBackG == "ax") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blackax_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blackax_black);
                        }
                    } else if (BeforeBackG == "queen") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blackqueen_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blackqueen_black);
                        }
                    } else if (BeforeBackG == "king") {
                        if (colorB == "white") {
                            v.setBackgroundResource(R.drawable.blackking_white);
                        } else if (colorB == "black") {
                            v.setBackgroundResource(R.drawable.blackking_black);
                        }
                    }



                }

                Beforepaname=paname[Beforepanx][Beforepany];
                Nowpaname=paname[panx][pany];
                paname[panx][pany]=paname[Beforepanx][Beforepany];
                paname[Beforepanx][Beforepany]="keno";

                if(rouab()){

                    floataki.setText("Check Black King");
                    floataki.setTextColor(getResources().getColor(android.R.color.black));
                    getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            floataki.setText("");
                            floataki.setTextColor(getResources().getColor(android.R.color.white));
                            getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.white));
                        }
                    }, 1500);

                    if (paname[panx][pany].startsWith("w")){
                        //
                        undocalc=undocalc+1;
                        vib.vibrate(1000);
                    }
                    else{
                        undocalc=undocalc-1;
                        vib.vibrate(400);
                    paname[Beforepanx][Beforepany]=Beforepaname;
                    paname[panx][pany]=Nowpaname;
                    nextColor=Beforecolor;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        NowID.setBackground(nowbackzz);
                        BeforeID.setBackground(backz);
                    }
                    }
                //rouakingb=false;

                }

                else if(rouaw()) {

                    floataki.setText("Check White King");
                    getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            floataki.setText("");
                            getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.white));
                        }
                    }, 1500);
                    if (paname[panx][pany].startsWith("b")) {
                        vib.vibrate(1000);
                        undocalc=undocalc+1;

                        //
                    } else {
                        undocalc=undocalc-1;
                        vib.vibrate(400);
                        paname[Beforepanx][Beforepany] = Beforepaname;
                        paname[panx][pany] = Nowpaname;
                        nextColor = Beforecolor;
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            NowID.setBackground(nowbackzz);
                            BeforeID.setBackground(backz);
                        }
                        //rouakingw = false;
                    }
                }

                else{

                    undocalc=undocalc+1;
                }

                catched=true;
                released=false;
                k=0;
                l=2;

            } else {
                vib.vibrate(400);
                floataki.setText("WRONG MOVE");
                released=false;
                catched=true;
                k=0;
                l=1;
                nextColor=Beforecolor;

                undocalc=undocalc-1;

                getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.white));
                        floataki.setText("");
                    }
                }, 500);



            }


            resetpan();

        }
        else if(canceled){
            vib.vibrate(250);
            resetpan();
            floataki.setText("Move Canceled");
            floataki.setTextColor(getResources().getColor(android.R.color.black));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    floataki.setText("");
                    floataki.setTextColor(getResources().getColor(android.R.color.white));
                }
            }, 1200);

            nextColor=getColor();
            undocalc=undocalc-1;
            k=0;
            l=1;
            catched=true;
            released=false;
            canceled=false;
        }


    }


    public String onBackroundCheck(View x){
        if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.white).getConstantState())){
            color=null;
            colorB="white";
            return "white";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.black).getConstantState())){
            color=null;
            colorB="black";
            return "black";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blacksold_black).getConstantState())) {
            color="black";
            colorB="black";
            return "sold";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blacksold_white).getConstantState())) {
            color="black";
            colorB="white";
            return "sold";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitesold_black).getConstantState())) {
            color="white";
            colorB="black";
            return "sold";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitesold_white).getConstantState())) {
            color="white";
            colorB="white";
            return "sold";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blacktower_black).getConstantState())) {
            color="black";
            colorB="black";
            return "tower";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blacktower_white).getConstantState())) {
            color="black";
            colorB="white";
            return "tower";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitetower_black).getConstantState())) {
            color="white";
            colorB="black";
            return "tower";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitetower_white).getConstantState())) {
            color="white";
            colorB="white";
            return "tower";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackhorse_black).getConstantState())) {
            color="black";
            colorB="black";
            return "horse";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackhorse_white).getConstantState())) {
            color="black";
            colorB="white";
            return "horse";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitehorse_black).getConstantState())) {
            color="white";
            colorB="black";
            return "horse";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitehorse_white).getConstantState())) {
            color="white";
            colorB="white";
            return "horse";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackax_black).getConstantState())) {
            color="black";
            colorB="black";
            return "ax";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackax_white).getConstantState())) {
            color="black";
            colorB="white";
            return "ax";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whiteax_black).getConstantState())) {
            color="white";
            colorB="black";
            return "ax";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whiteax_white).getConstantState())) {
            color="white";
            colorB="white";
            return "ax";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackqueen_black).getConstantState())) {
            color="black";
            colorB="black";
            return "queen";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackqueen_white).getConstantState())) {
            color="black";
            colorB="white";
            return "queen";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitequeen_black).getConstantState())) {
            color="white";
            colorB="black";
            return "queen";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whitequeen_white).getConstantState())) {
            color="white";
            colorB="white";
            return "queen";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackking_black).getConstantState())) {
            color="black";
            colorB="black";
            return "king";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.blackking_white).getConstantState())) {
            color="black";
            colorB="white";
            return "king";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whiteking_black).getConstantState())) {
            color="white";
            colorB="black";
            return "king";
        }
        else if(x.getBackground().getConstantState().equals
                (getResources().getDrawable(R.drawable.whiteking_white).getConstantState())) {
            color="white";
            colorB="white";
            return "king";
        }
        return null;
    }

    public void takeOrdinares(int x){
        switch (x) {
            case R.id.zero_zero:
                panx=0; pany=0;
                break;
            case R.id.zero_one:
                panx=0; pany=1;
                break;
            case R.id.zero_two:
                panx=0; pany=2;
                break;
            case R.id.zero_three:
                panx=0; pany=3;
                break;
            case R.id.zero_four:
                panx=0; pany=4;
                break;
            case R.id.zero_five:
                panx=0; pany=5;
                break;
            case R.id.zero_six:
                panx=0; pany=6;
                break;
            case R.id.zero_seven:
                panx=0; pany=7;
                break;
            case R.id.one_zero:
                panx=1; pany=0;
                break;
            case R.id.one_one:
                panx=1; pany=1;
                break;
            case R.id.one_two:
                panx=1; pany=2;
                break;
            case R.id.one_three:
                panx=1; pany=3;
                break;
            case R.id.one_four:
                panx=1; pany=4;
                break;
            case R.id.one_five:
                panx=1; pany=5;
                break;
            case R.id.one_six:
                panx=1; pany=6;
                break;
            case R.id.one_seven:
                panx=1; pany=7;
                break;
            case R.id.two_zero:
                panx=2; pany=0;
                break;
            case R.id.two_one:
                panx=2; pany=1;
                break;
            case R.id.two_two:
                panx=2; pany=2;
                break;
            case R.id.two_three:
                panx=2; pany=3;
                break;
            case R.id.two_four:
                panx=2; pany=4;
                break;
            case R.id.two_five:
                panx=2; pany=5;
                break;
            case R.id.two_six:
                panx=2; pany=6;
                break;
            case R.id.two_seven:
                panx=2; pany=7;
                break;
            case R.id.three_zero:
                panx=3; pany=0;
                break;
            case R.id.three_one:
                panx=3; pany=1;
                break;
            case R.id.three_two:
                panx=3; pany=2;
                break;
            case R.id.three_three:
                panx=3; pany=3;
                break;
            case R.id.three_four:
                panx=3; pany=4;
                break;
            case R.id.three_five:
                panx=3; pany=5;
                break;
            case R.id.three_six:
                panx=3; pany=6;
                break;
            case R.id.three_seven:
                panx=3; pany=7;
                break;
            case R.id.four_zero:
                panx=4; pany=0;
                break;
            case R.id.four_one:
                panx=4; pany=1;
                break;
            case R.id.four_two:
                panx=4; pany=2;
                break;
            case R.id.four_three:
                panx=4; pany=3;
                break;
            case R.id.four_four:
                panx=4; pany=4;
                break;
            case R.id.four_five:
                panx=4; pany=5;
                break;
            case R.id.four_six:
                panx=4; pany=6;
                break;
            case R.id.four_seven:
                panx=4; pany=7;
                break;
            case R.id.five_zero:
                panx=5; pany=0;
                break;
            case R.id.five_one:
                panx=5; pany=1;
                break;
            case R.id.five_two:
                panx=5; pany=2;
                break;
            case R.id.five_three:
                panx=5; pany=3;
                break;
            case R.id.five_four:
                panx=5; pany=4;
                break;
            case R.id.five_five:
                panx=5; pany=5;
                break;
            case R.id.five_six:
                panx=5; pany=6;
                break;
            case R.id.five_seven:
                panx=5; pany=7;
                break;
            case R.id.six_zero:
                panx=6; pany=0;
                break;
            case R.id.six_one:
                panx=6; pany=1;
                break;
            case R.id.six_two:
                panx=6; pany=2;
                break;
            case R.id.six_three:
                panx=6; pany=3;
                break;
            case R.id.six_four:
                panx=6; pany=4;
                break;
            case R.id.six_five:
                panx=6; pany=5;
                break;
            case R.id.six_six:
                panx=6; pany=6;
                break;
            case R.id.six_seven:
                panx=6; pany=7;
                break;
            case R.id.seven_zero:
                panx=7; pany=0;
                break;
            case R.id.seven_one:
                panx=7; pany=1;
                break;
            case R.id.seven_two:
                panx=7; pany=2;
                break;
            case R.id.seven_three:
                panx=7; pany=3;
                break;
            case R.id.seven_four:
                panx=7; pany=4;
                break;
            case R.id.seven_five:
                panx=7; pany=5;
                break;
            case R.id.seven_six:
                panx=7; pany=6;
                break;
            case R.id.seven_seven:
                panx=7; pany=7;
                break;
        }
    }

    public void prepareBackground()
    {
         zero_zero.setBackgroundResource(R.drawable.blacktower_white);
         zero_one.setBackgroundResource(R.drawable.blackhorse_black);
         zero_two.setBackgroundResource(R.drawable.blackax_white);
         zero_three.setBackgroundResource(R.drawable.blackqueen_black);
         zero_four.setBackgroundResource(R.drawable.blackking_white);
         zero_five.setBackgroundResource(R.drawable.blackax_black);
         zero_six.setBackgroundResource(R.drawable.blackhorse_white);
         zero_seven.setBackgroundResource(R.drawable.blacktower_black);
         one_zero.setBackgroundResource(R.drawable.blacksold_black);
         one_one.setBackgroundResource(R.drawable.blacksold_white);
         one_two.setBackgroundResource(R.drawable.blacksold_black);
         one_three.setBackgroundResource(R.drawable.blacksold_white);
         one_four.setBackgroundResource(R.drawable.blacksold_black);
         one_five.setBackgroundResource(R.drawable.blacksold_white);
         one_six.setBackgroundResource(R.drawable.blacksold_black);
         one_seven.setBackgroundResource(R.drawable.blacksold_white);

         two_zero.setBackgroundResource(R.drawable.white);
         two_one.setBackgroundResource(R.drawable.black);
         two_two.setBackgroundResource(R.drawable.white);
         two_three.setBackgroundResource(R.drawable.black);
         two_four.setBackgroundResource(R.drawable.white);
         two_five.setBackgroundResource(R.drawable.black);
         two_six.setBackgroundResource(R.drawable.white);
         two_seven.setBackgroundResource(R.drawable.black);
         three_zero.setBackgroundResource(R.drawable.black);
         three_one.setBackgroundResource(R.drawable.white);
         three_two.setBackgroundResource(R.drawable.black);
         three_three.setBackgroundResource(R.drawable.white);
         three_four.setBackgroundResource(R.drawable.black);
         three_five.setBackgroundResource(R.drawable.white);
         three_six.setBackgroundResource(R.drawable.black);
         three_seven.setBackgroundResource(R.drawable.white);
         four_zero.setBackgroundResource(R.drawable.white);
         four_one.setBackgroundResource(R.drawable.black);
         four_two.setBackgroundResource(R.drawable.white);
         four_three.setBackgroundResource(R.drawable.black);
         four_four.setBackgroundResource(R.drawable.white);
         four_five.setBackgroundResource(R.drawable.black);
         four_six.setBackgroundResource(R.drawable.white);
         four_seven.setBackgroundResource(R.drawable.black);
         five_zero.setBackgroundResource(R.drawable.black);
         five_one.setBackgroundResource(R.drawable.white);
         five_two.setBackgroundResource(R.drawable.black);
         five_three.setBackgroundResource(R.drawable.white);
         five_four.setBackgroundResource(R.drawable.black);
         five_five.setBackgroundResource(R.drawable.white);
         five_six.setBackgroundResource(R.drawable.black);
         five_seven.setBackgroundResource(R.drawable.white);

         six_zero.setBackgroundResource(R.drawable.whitesold_white);
         six_one.setBackgroundResource(R.drawable.whitesold_black);
         six_two.setBackgroundResource(R.drawable.whitesold_white);
         six_three.setBackgroundResource(R.drawable.whitesold_black);
         six_four.setBackgroundResource(R.drawable.whitesold_white);
         six_five.setBackgroundResource(R.drawable.whitesold_black);
         six_six.setBackgroundResource(R.drawable.whitesold_white);
         six_seven.setBackgroundResource(R.drawable.whitesold_black);
         seven_zero.setBackgroundResource(R.drawable.whitetower_black);
         seven_one.setBackgroundResource(R.drawable.whitehorse_white);
         seven_two.setBackgroundResource(R.drawable.whiteax_black);
         seven_three.setBackgroundResource(R.drawable.whitequeen_white);
         seven_four.setBackgroundResource(R.drawable.whiteking_black);
         seven_five.setBackgroundResource(R.drawable.whiteax_white);
         seven_six.setBackgroundResource(R.drawable.whitehorse_black);
         seven_seven.setBackgroundResource(R.drawable.whitetower_white);
    }

    public void preparepaname() {
        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++){
                paname[x][y]="keno";
            }
        }
        for(int y=0;y<=7;y++){
            paname[1][y]="bsold";
            paname[6][y]="wsold";
        }
        paname[0][0]="btower";
        paname[0][7]="btower";
        paname[0][1]="bhorse";
        paname[0][6]="bhorse";
        paname[0][2]="bax";
        paname[0][5]="bax";
        paname[0][3]="bqueen";
        paname[0][4]="bking";

        paname[7][0]="wtower";
        paname[7][7]="wtower";
        paname[7][1]="whorse";
        paname[7][6]="whorse";
        paname[7][2]="wax";
        paname[7][5]="wax";
        paname[7][3]="wqueen";
        paname[7][4]="wking";
    }

    public String getColor() {
        return color;
    }

    public void soldpan() {
        pan[panx][pany]=true;
        if(color=="black"){
            if(panx==1){

                if(paname[panx+1][pany]=="keno"){
                pan[panx+1][pany]=true;}

                if(paname[panx+2][pany]=="keno"){
                pan[panx+2][pany]=true;}

                if((pany+1>=0)&&(pany+1<=7)&&(paname[panx+1][pany+1]!="keno")&&(paname[panx+1][pany+1].startsWith("w"))){
                pan[panx+1][pany+1]=true;}

                if((pany-1>=0)&&(pany-1<=7)&&(paname[panx+1][pany-1]!="keno")&&(paname[panx+1][pany-1].startsWith("w"))){
                pan[panx+1][pany-1]=true;}

            } else if(panx==7){
                bsoldtop=true;
                // Fragment up

            } else {

                if(paname[panx+1][pany]=="keno"){
                pan[panx+1][pany]=true;}

                if((pany+1>=0)&&(pany+1<=7)&&(paname[panx+1][pany+1]!="keno")&&(paname[panx+1][pany+1].startsWith("w"))){
                pan[panx+1][pany+1]=true;}

                if((pany-1>=0)&&(pany-1<=7)&&(paname[panx+1][pany-1]!="keno")&&(paname[panx+1][pany-1].startsWith("w"))){
                pan[panx+1][pany-1]=true;}
            }
        } else if(color=="white"){
            if(panx==6){

                if(paname[panx-1][pany]=="keno"){
                pan[panx-1][pany]=true;}

                if(paname[panx-2][pany]=="keno"){
                pan[panx-2][pany]=true;}

                if((pany+1>=0)&&(pany+1<=7)&&(paname[panx-1][pany+1]!="keno")&&(paname[panx-1][pany+1].startsWith("b"))){
                    pan[panx-1][pany+1]=true;}

                if((pany-1>=0)&&(pany-1<=7)&&(paname[panx-1][pany-1]!="keno")&&(paname[panx-1][pany-1].startsWith("b"))){
                    pan[panx-1][pany-1]=true;}

            } else if(panx==0){
                wsoldtop=true;

            }
            else {

                if(paname[panx-1][pany]=="keno"){
                pan[panx-1][pany]=true;}

                if((pany+1>=0)&&(pany+1<=7)&&(paname[panx-1][pany+1]!="keno")&&(paname[panx-1][pany+1].startsWith("b"))){
                    pan[panx-1][pany+1]=true;}

                if((pany-1>=0)&&(pany-1<=7)&&(paname[panx-1][pany-1]!="keno")&&(paname[panx-1][pany-1].startsWith("b"))){
                    pan[panx-1][pany-1]=true;}
            }
        }

    }

    public void towerpan() {
        pan[panx][pany]=true;
        int kxa=1;
        int kxb=1;
        int kya=1;
        int kyb=1;

        if(color=="black") {
            if ((panx - 1 >= 0 && panx - 1 <= 7) && (paname[panx - 1][pany] == "keno") && (kxa == 1)) {
                pan[panx - 1][pany] = true;
            } else if ((panx - 1 >= 0 && panx - 1 <= 7)&&(paname[panx-1][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 1][pany] = true; kxa=0;}
            else{kxa=0;}

            if ((panx + 1 >= 0 && panx + 1 <= 7) && (paname[panx + 1][pany] == "keno") && (kxb == 1)) {
                pan[panx + 1][pany] = true;
            } else if ((panx + 1 >= 0 && panx + 1 <= 7) && (paname[panx+1][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 1][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 2 >= 0 && panx - 2 <= 7) && (paname[panx - 2][pany] == "keno") && (kxa == 1)) {
                pan[panx - 2][pany] = true;
            } else if ((panx - 2 >= 0 && panx - 2 <= 7)&&(paname[panx-2][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 2][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 2 >= 0 && panx + 2 <= 7) && (paname[panx + 2][pany] == "keno") && (kxb == 1)) {
                pan[panx + 2][pany] = true;
            } else if ((panx + 2 >= 0 && panx + 2 <= 7) && (paname[panx+2][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 2][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 3 >= 0 && panx - 3 <= 7) && (paname[panx - 3][pany] == "keno") && (kxa == 1)) {
                pan[panx - 3][pany] = true;
            } else if ((panx - 3 >= 0 && panx - 3 <= 7)&&(paname[panx-3][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 3][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 3 >= 0 && panx + 3 <= 7) && (paname[panx + 3][pany] == "keno") && (kxb == 1)) {
                pan[panx + 3][pany] = true;
            } else if ((panx + 3 >= 0 && panx + 3 <= 7) && (paname[panx+3][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 3][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 4 >= 0 && panx - 4 <= 7) && (paname[panx - 4][pany] == "keno") && (kxa == 1)) {
                pan[panx - 4][pany] = true;
            } else if ((panx - 4 >= 0 && panx - 4 <= 7)&&(paname[panx-4][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 4][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 4 >= 0 && panx + 4 <= 7) && (paname[panx + 4][pany] == "keno") && (kxb == 1)) {
                pan[panx + 4][pany] = true;
            } else if ((panx + 4 >= 0 && panx + 4 <= 7) && (paname[panx+4][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 4][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 5 >= 0 && panx - 5 <= 7) && (paname[panx - 5][pany] == "keno") && (kxa == 1)) {
                pan[panx - 5][pany] = true;
            } else if ((panx - 5 >= 0 && panx - 5 <= 7)&&(paname[panx-5][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 5][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 5 >= 0 && panx + 5 <= 7) && (paname[panx + 5][pany] == "keno") && (kxb == 1)) {
                pan[panx + 5][pany] = true;
            } else if ((panx + 5 >= 0 && panx + 5 <= 7) && (paname[panx+5][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 5][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 6 >= 0 && panx - 6 <= 7) && (paname[panx - 6][pany] == "keno") && (kxa == 1)) {
                pan[panx - 6][pany] = true;
            } else if ((panx - 6 >= 0 && panx - 6 <= 7)&&(paname[panx-6][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 6][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 6 >= 0 && panx + 6 <= 7) && (paname[panx + 6][pany] == "keno") && (kxb == 1)) {
                pan[panx + 6][pany] = true;
            } else if ((panx + 6 >= 0 && panx + 6 <= 7) && (paname[panx+6][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 6][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 7 >= 0 && panx - 7 <= 7) && (paname[panx - 7][pany] == "keno") && (kxa == 1)) {
                pan[panx - 7][pany] = true;
            } else if ((panx - 7 >= 0 && panx - 7 <= 7)&&(paname[panx-7][pany].startsWith("w"))&& (kxa == 1)) {
                pan[panx - 7][pany] = true;}
            else{kxa=0;}


            if ((panx + 7 >= 0 && panx + 7 <= 7) && (paname[panx + 7][pany] == "keno") && (kxb == 1)) {
                pan[panx + 7][pany] = true;
            } else if ((panx + 7 >= 0 && panx + 7 <= 7) && (paname[panx+7][pany].startsWith("w"))&& (kxb == 1)) {
                pan[panx + 7][pany] = true;}
            else{kxb=0;}




            /////////////////////////NEXT Cordinate///////////////////////////////

            if ((pany - 1 >= 0 && pany - 1 <= 7) && (paname[panx][pany-1] == "keno") && (kya == 1)) {
                pan[panx][pany-1] = true;
            } else if ((pany - 1 >= 0 && pany - 1 <= 7)&&(paname[panx][pany-1].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-1] = true; kya=0;}
            else{kya=0;}

            if ((pany + 1 >= 0 && pany + 1 <= 7) && (paname[panx][pany+1] == "keno") && (kyb == 1)) {
                pan[panx][pany+1] = true;
            } else if ((pany + 1 >= 0 && pany + 1 <= 7) && (paname[panx][pany+1].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+1] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 2 >= 0 && pany - 2 <= 7) && (paname[panx][pany-2] == "keno") && (kya == 1)) {
                pan[panx][pany-2] = true;
            } else if ((pany - 2 >= 0 && pany - 2 <= 7)&&(paname[panx][pany-2].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-2] = true; kya=0;}
            else{kya=0;}

            if ((pany + 2 >= 0 && pany + 2 <= 7) && (paname[panx][pany+2] == "keno") && (kyb == 1)) {
                pan[panx][pany+2] = true;
            } else if ((pany + 2 >= 0 && pany + 2 <= 7) && (paname[panx][pany+2].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+2] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 3 >= 0 && pany - 3 <= 7) && (paname[panx][pany-3] == "keno") && (kya == 1)) {
                pan[panx][pany-3] = true;
            } else if ((pany - 3 >= 0 && pany - 3 <= 7)&&(paname[panx][pany-3].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-3] = true; kya=0;}
            else{kya=0;}

            if ((pany + 3 >= 0 && pany + 3 <= 7) && (paname[panx][pany+3] == "keno") && (kyb == 1)) {
                pan[panx][pany+3] = true;
            } else if ((pany + 3 >= 0 && pany + 3 <= 7) && (paname[panx][pany+3].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+3] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 4 >= 0 && pany - 4 <= 7) && (paname[panx][pany-4] == "keno") && (kya == 1)) {
                pan[panx][pany-4] = true;
            } else if ((pany - 4 >= 0 && pany - 4 <= 7)&&(paname[panx][pany-4].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-4] = true; kya=0;}
            else{kya=0;}

            if ((pany + 4 >= 0 && pany + 4 <= 7) && (paname[panx][pany+4] == "keno") && (kyb == 1)) {
                pan[panx][pany+4] = true;
            } else if ((pany + 4 >= 0 && pany + 4 <= 7) && (paname[panx][pany+4].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+4] = true; kyb = 0;}else{kyb=0;}




            if ((pany - 5 >= 0 && pany - 5 <= 7) && (paname[panx][pany-5] == "keno") && (kya == 1)) {
                pan[panx][pany-5] = true;
            } else if ((pany - 5 >= 0 && pany - 5 <= 7)&&(paname[panx][pany-5].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-5] = true; kya=0;}
            else{kya=0;}

            if ((pany + 5 >= 0 && pany + 5 <= 7) && (paname[panx][pany+5] == "keno") && (kyb == 1)) {
                pan[panx][pany+5] = true;
            } else if ((pany + 5 >= 0 && pany + 5 <= 7) && (paname[panx][pany+5].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+5] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 6 >= 0 && pany - 6 <= 7) && (paname[panx][pany-6] == "keno") && (kya == 1)) {
                pan[panx][pany-6] = true;
            } else if ((pany - 6 >= 0 && pany - 6 <= 7)&&(paname[panx][pany-6].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-6] = true; kya=0;}else{kya=0;}


            if ((pany + 6 >= 0 && pany + 6 <= 7) && (paname[panx][pany+6] == "keno") && (kyb == 1)) {
                pan[panx][pany+6] = true;
            } else if ((pany + 6 >= 0 && pany + 6 <= 7) && (paname[panx][pany+6].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+6] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 7 >= 0 && pany - 7 <= 7) && (paname[panx][pany-7] == "keno") && (kya == 1)) {
                pan[panx][pany-7] = true;
            } else if ((pany - 7 >= 0 && pany - 7 <= 7)&&(paname[panx][pany-7].startsWith("w"))&& (kya == 1)) {
                pan[panx][pany-7] = true; kya=0;}
            else{kya=0;}

            if ((pany + 7 >= 0 && pany + 7 <= 7) && (paname[panx][pany+7] == "keno") && (kyb == 1)) {
                pan[panx][pany+7] = true;
            } else if ((pany + 7 >= 0 && pany + 7 <= 7) && (paname[panx][pany+7].startsWith("w"))&& (kyb == 1)) {
                pan[panx][pany+7] = true; kyb = 0;}
            else{kyb=0;}


        }
        else if(color=="white"){

            if ((panx - 1 >= 0 && panx - 1 <= 7) && (paname[panx - 1][pany] == "keno") && (kxa == 1)) {
                pan[panx - 1][pany] = true;
            } else if ((panx - 1 >= 0 && panx - 1 <= 7)&&(paname[panx-1][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 1][pany] = true; kxa=0;}
            else{kxa=0;}

            if ((panx + 1 >= 0 && panx + 1 <= 7) && (paname[panx + 1][pany] == "keno") && (kxb == 1)) {
                pan[panx + 1][pany] = true;
            } else if ((panx + 1 >= 0 && panx + 1 <= 7) && (paname[panx+1][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 1][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 2 >= 0 && panx - 2 <= 7) && (paname[panx - 2][pany] == "keno") && (kxa == 1)) {
                pan[panx - 2][pany] = true;
            } else if ((panx - 2 >= 0 && panx - 2 <= 7)&&(paname[panx-2][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 2][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 2 >= 0 && panx + 2 <= 7) && (paname[panx + 2][pany] == "keno") && (kxb == 1)) {
                pan[panx + 2][pany] = true;
            } else if ((panx + 2 >= 0 && panx + 2 <= 7) && (paname[panx+2][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 2][pany] = true; kxb = 0;}else{kxb=0;}




            if ((panx - 3 >= 0 && panx - 3 <= 7) && (paname[panx - 3][pany] == "keno") && (kxa == 1)) {
                pan[panx - 3][pany] = true;
            } else if ((panx - 3 >= 0 && panx - 3 <= 7)&&(paname[panx-3][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 3][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 3 >= 0 && panx + 3 <= 7) && (paname[panx + 3][pany] == "keno") && (kxb == 1)) {
                pan[panx + 3][pany] = true;
            } else if ((panx + 3 >= 0 && panx + 3 <= 7) && (paname[panx+3][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 3][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 4 >= 0 && panx - 4 <= 7) && (paname[panx - 4][pany] == "keno") && (kxa == 1)) {
                pan[panx - 4][pany] = true;
            } else if ((panx - 4 >= 0 && panx - 4 <= 7)&&(paname[panx-4][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 4][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 4 >= 0 && panx + 4 <= 7) && (paname[panx + 4][pany] == "keno") && (kxb == 1)) {
                pan[panx + 4][pany] = true;
            } else if ((panx + 4 >= 0 && panx + 4 <= 7) && (paname[panx+4][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 4][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 5 >= 0 && panx - 5 <= 7) && (paname[panx - 5][pany] == "keno") && (kxa == 1)) {
                pan[panx - 5][pany] = true;
            } else if ((panx - 5 >= 0 && panx - 5 <= 7)&&(paname[panx-5][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 5][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 5 >= 0 && panx + 5 <= 7) && (paname[panx + 5][pany] == "keno") && (kxb == 1)) {
                pan[panx + 5][pany] = true;
            } else if ((panx + 5 >= 0 && panx + 5 <= 7) && (paname[panx+5][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 5][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 6 >= 0 && panx - 6 <= 7) && (paname[panx - 6][pany] == "keno") && (kxa == 1)) {
                pan[panx - 6][pany] = true;
            } else if ((panx - 6 >= 0 && panx - 6 <= 7)&&(paname[panx-6][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 6][pany] = true; kxa = 0;}
            else{kxa=0;}

            if ((panx + 6 >= 0 && panx + 6 <= 7) && (paname[panx + 6][pany] == "keno") && (kxb == 1)) {
                pan[panx + 6][pany] = true;
            } else if ((panx + 6 >= 0 && panx + 6 <= 7) && (paname[panx+6][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 6][pany] = true; kxb = 0;}
            else{kxb=0;}



            if ((panx - 7 >= 0 && panx - 7 <= 7) && (paname[panx - 7][pany] == "keno") && (kxa == 1)) {
                pan[panx - 7][pany] = true;
            } else if ((panx - 7 >= 0 && panx - 7 <= 7)&&(paname[panx-7][pany].startsWith("b"))&& (kxa == 1)) {
                pan[panx - 7][pany] = true;}
            else{kxa=0;}


            if ((panx + 7 >= 0 && panx + 7 <= 7) && (paname[panx + 7][pany] == "keno") && (kxb == 1)) {
                pan[panx + 7][pany] = true;
            } else if ((panx + 7 >= 0 && panx + 7 <= 7) && (paname[panx+7][pany].startsWith("b"))&& (kxb == 1)) {
                pan[panx + 7][pany] = true;}
            else{kxb=0;}




            /////////////////////////NEXT Cordinate///////////////////////////////

            if ((pany - 1 >= 0 && pany - 1 <= 7) && (paname[panx][pany-1] == "keno") && (kya == 1)) {
                pan[panx][pany-1] = true;
            } else if ((pany - 1 >= 0 && pany - 1 <= 7)&&(paname[panx][pany-1].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-1] = true; kya=0;}
            else{kya=0;}

            if ((pany + 1 >= 0 && pany + 1 <= 7) && (paname[panx][pany+1] == "keno") && (kyb == 1)) {
                pan[panx][pany+1] = true;
            } else if ((pany + 1 >= 0 && pany + 1 <= 7) && (paname[panx][pany+1].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+1] = true; kyb = 0;}



            if ((pany - 2 >= 0 && pany - 2 <= 7) && (paname[panx][pany-2] == "keno") && (kya == 1)) {
                pan[panx][pany-2] = true;
            } else if ((pany - 2 >= 0 && pany - 2 <= 7)&&(paname[panx][pany-2].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-2] = true; kya=0;}
            else{kya=0;}

            if ((pany + 2 >= 0 && pany + 2 <= 7) && (paname[panx][pany+2] == "keno") && (kyb == 1)) {
                pan[panx][pany+2] = true;
            } else if ((pany + 2 >= 0 && pany + 2 <= 7) && (paname[panx][pany+2].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+2] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 3 >= 0 && pany - 3 <= 7) && (paname[panx][pany-3] == "keno") && (kya == 1)) {
                pan[panx][pany-3] = true;
            } else if ((pany - 3 >= 0 && pany - 3 <= 7)&&(paname[panx][pany-3].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-3] = true; kya=0;}
            else{kya=0;}

            if ((pany + 3 >= 0 && pany + 3 <= 7) && (paname[panx][pany+3] == "keno") && (kyb == 1)) {
                pan[panx][pany+3] = true;
            } else if ((pany + 3 >= 0 && pany + 3 <= 7) && (paname[panx][pany+3].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+3] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 4 >= 0 && pany - 4 <= 7) && (paname[panx][pany-4] == "keno") && (kya == 1)) {
                pan[panx][pany-4] = true;
            } else if ((pany - 4 >= 0 && pany - 4 <= 7)&&(paname[panx][pany-4].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-4] = true; kya=0;}
            else{kya=0;}

            if ((pany + 4 >= 0 && pany + 4 <= 7) && (paname[panx][pany+4] == "keno") && (kyb == 1)) {
                pan[panx][pany+4] = true;
            } else if ((pany + 4 >= 0 && pany + 4 <= 7) && (paname[panx][pany+4].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+4] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 5 >= 0 && pany - 5 <= 7) && (paname[panx][pany-5] == "keno") && (kya == 1)) {
                pan[panx][pany-5] = true;
            } else if ((pany - 5 >= 0 && pany - 5 <= 7)&&(paname[panx][pany-5].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-5] = true; kya=0;}
            else{kya=0;}

            if ((pany + 5 >= 0 && pany + 5 <= 7) && (paname[panx][pany+5] == "keno") && (kyb == 1)) {
                pan[panx][pany+5] = true;
            } else if ((pany + 5 >= 0 && pany + 5 <= 7) && (paname[panx][pany+5].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+5] = true; kyb = 0;}
            else{kyb=0;}


            if ((pany - 6 >= 0 && pany - 6 <= 7) && (paname[panx][pany-6] == "keno") && (kya == 1)) {
                pan[panx][pany-6] = true;
            } else if ((pany - 6 >= 0 && pany - 6 <= 7)&&(paname[panx][pany-6].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-6] = true; kya=0;}
            else{kya=0;}

            if ((pany + 6 >= 0 && pany + 6 <= 7) && (paname[panx][pany+6] == "keno") && (kyb == 1)) {
                pan[panx][pany+6] = true;
            } else if ((pany + 6 >= 0 && pany + 6 <= 7) && (paname[panx][pany+6].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+6] = true; kyb = 0;}
            else{kyb=0;}



            if ((pany - 7 >= 0 && pany - 7 <= 7) && (paname[panx][pany-7] == "keno") && (kya == 1)) {
                pan[panx][pany-7] = true;
            } else if ((pany - 7 >= 0 && pany - 7 <= 7)&&(paname[panx][pany-7].startsWith("b"))&& (kya == 1)) {
                pan[panx][pany-7] = true; kya=0;}
            else{kya=0;}

            if ((pany + 7 >= 0 && pany + 7 <= 7) && (paname[panx][pany+7] == "keno") && (kyb == 1)) {
                pan[panx][pany+7] = true;
            } else if ((pany + 7 >= 0 && pany + 7 <= 7) && (paname[panx][pany+7].startsWith("b"))&& (kyb == 1)) {
                pan[panx][pany+7] = true; kyb = 0;}
            else{kyb=0;}


        }
    }


    public void horsepan() {
        pan[panx][pany]=true;
        if (color=="black")
        {
            if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
                if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
                    if (paname[panx - 1][pany - 2] == "keno") {
                        pan[panx - 1][pany - 2] = true;
                    } else if (paname[panx - 1][pany - 2].startsWith("w")) {
                        pan[panx - 1][pany - 2] = true;
                    }
                }
            }
            if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
                if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
                    if (paname[panx - 1][pany + 2] == "keno") {
                        pan[panx - 1][pany + 2] = true;
                    } else if (paname[panx - 1][pany + 2].startsWith("w")) {
                        pan[panx - 1][pany + 2] = true;
                    }
                }
            }
            if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
                if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
                    if (paname[panx + 1][pany + 2] == "keno") {
                        pan[panx + 1][pany + 2] = true;
                    } else if (paname[panx + 1][pany + 2].startsWith("w")) {
                        pan[panx + 1][pany + 2] = true;
                    }
                }
            }
            if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
                if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
                    if (paname[panx + 1][pany - 2] == "keno") {
                        pan[panx + 1][pany - 2] = true;
                    } else if (paname[panx + 1][pany - 2].startsWith("w")) {
                        pan[panx + 1][pany - 2] = true;
                    }
                }
            }

            if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
                if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
                    if (paname[panx - 2][pany +1] == "keno") {
                        pan[panx - 2][pany +1] = true;
                    } else if (paname[panx - 2][pany +1].startsWith("w")) {
                        pan[panx - 2][pany +1] = true;
                    }
                }
            }
            if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
                if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
                    if (paname[panx - 2][pany - 1] == "keno") {
                        pan[panx - 2][pany - 1] = true;
                    } else if (paname[panx - 2][pany - 1].startsWith("w")) {
                        pan[panx - 2][pany - 1] = true;
                    }
                }
            }
            if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
                if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
                    if (paname[panx +2][pany - 1] == "keno") {
                        pan[panx +2][pany - 1] = true;
                    } else if (paname[panx +2][pany - 1].startsWith("w")) {
                        pan[panx +2][pany - 1] = true;
                    }
                }
            }
            if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
                if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
                    if (paname[panx +2][pany +1] == "keno") {
                        pan[panx +2][pany +1] = true;
                    } else if (paname[panx +2][pany +1].startsWith("w")) {
                        pan[panx +2][pany +1] = true;
                    }
                }
            }

        }
        else if(color=="white"){

            if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
                if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
                    if (paname[panx - 1][pany - 2] == "keno") {
                        pan[panx - 1][pany - 2] = true;
                    } else if (paname[panx - 1][pany - 2].startsWith("b")) {
                        pan[panx - 1][pany - 2] = true;
                    }
                }
            }
            if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
                if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
                    if (paname[panx - 1][pany + 2] == "keno") {
                        pan[panx - 1][pany + 2] = true;
                    } else if (paname[panx - 1][pany + 2].startsWith("b")) {
                        pan[panx - 1][pany + 2] = true;
                    }
                }
            }
            if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
                if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
                    if (paname[panx + 1][pany + 2] == "keno") {
                        pan[panx + 1][pany + 2] = true;
                    } else if (paname[panx + 1][pany + 2].startsWith("b")) {
                        pan[panx + 1][pany + 2] = true;
                    }
                }
            }
            if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
                if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
                    if (paname[panx + 1][pany - 2] == "keno") {
                        pan[panx + 1][pany - 2] = true;
                    } else if (paname[panx + 1][pany - 2].startsWith("b")) {
                        pan[panx + 1][pany - 2] = true;
                    }
                }
            }

            if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
                if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
                    if (paname[panx - 2][pany +1] == "keno") {
                        pan[panx - 2][pany +1] = true;
                    } else if (paname[panx - 2][pany +1].startsWith("b")) {
                        pan[panx - 2][pany +1] = true;
                    }
                }
            }
            if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
                if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
                    if (paname[panx - 2][pany - 1] == "keno") {
                        pan[panx - 2][pany - 1] = true;
                    } else if (paname[panx - 2][pany - 1].startsWith("b")) {
                        pan[panx - 2][pany - 1] = true;
                    }
                }
            }
            if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
                if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
                    if (paname[panx +2][pany - 1] == "keno") {
                        pan[panx +2][pany - 1] = true;
                    } else if (paname[panx +2][pany - 1].startsWith("b")) {
                        pan[panx +2][pany - 1] = true;
                    }
                }
            }
            if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
                if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
                    if (paname[panx +2][pany +1] == "keno") {
                        pan[panx +2][pany +1] = true;
                    } else if (paname[panx +2][pany +1].startsWith("b")) {
                        pan[panx +2][pany +1] = true;
                    }
                }
            }
        }
    }

    public void axpan() {
        pan[panx][pany]=true;
        int kdp=1;
        int kak=1;
        int kap=1;
        int kdk=1;

if(color=="black") {
    //TODO Dexia panw
    if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
        if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
            if ((paname[panx - 1][pany + 1] == "keno") && (kdp == 1)) {
                pan[panx - 1][pany + 1] = true;
            } else if ((paname[panx - 1][pany + 1].startsWith("w")) && (kdp == 1)) {
                pan[panx - 1][pany + 1] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
        if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
            if ((paname[panx - 2][pany + 2] == "keno") && (kdp == 1)) {
                pan[panx - 2][pany + 2] = true;
            } else if ((paname[panx - 2][pany + 2].startsWith("w")) && (kdp == 1)) {
                pan[panx - 2][pany + 2] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 3 >= 0) && (panx - 3 <= 7)) {
        if ((pany + 3 >= 0) && (pany + 3 <= 7)) {
            if ((paname[panx - 3][pany + 3] == "keno") && (kdp == 1)) {
                pan[panx - 3][pany + 3] = true;
            } else if ((paname[panx - 3][pany + 3].startsWith("w")) && (kdp == 1)) {
                pan[panx - 3][pany + 3] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 4 >= 0) && (panx - 4 <= 7)) {
        if ((pany + 4 >= 0) && (pany + 4 <= 7)) {
            if ((paname[panx - 4][pany + 4] == "keno") && (kdp == 1)) {
                pan[panx - 4][pany + 4] = true;
            } else if ((paname[panx - 4][pany + 4].startsWith("w")) && (kdp == 1)) {
                pan[panx - 4][pany + 4] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 5 >= 0) && (panx - 5 <= 7)) {
        if ((pany + 5 >= 0) && (pany + 5 <= 7)) {
            if ((paname[panx - 5][pany + 5] == "keno") && (kdp == 1)) {
                pan[panx - 5][pany + 5] = true;
            } else if ((paname[panx - 5][pany + 5].startsWith("w")) && (kdp == 1)) {
                pan[panx - 5][pany + 5] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 6 >= 0) && (panx - 6 <= 7)) {
        if ((pany + 6 >= 0) && (pany + 6 <= 7)) {
            if ((paname[panx - 6][pany + 6] == "keno") && (kdp == 1)) {
                pan[panx - 6][pany + 6] = true;
            } else if ((paname[panx - 6][pany + 6].startsWith("w")) && (kdp == 1)) {
                pan[panx - 6][pany + 6] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }
    if ((panx - 7 >= 0) && (panx - 7 <= 7)) {
        if ((pany + 7 >= 0) && (pany + 7 <= 7)) {
            if ((paname[panx - 7][pany + 7] == "keno") && (kdp == 1)) {
                pan[panx - 7][pany + 7] = true;
            } else if ((paname[panx - 7][pany + 7].startsWith("w")) && (kdp == 1)) {
                pan[panx - 7][pany + 7] = true;
                kdp = 0;
            } else {
                kdp = 0;
            }
        }
    }

    //TODO Aristera katw
    if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
        if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
            if ((paname[panx + 1][pany - 1] == "keno") && (kak == 1)) {
                pan[panx + 1][pany - 1] = true;
            } else if ((paname[panx + 1][pany - 1].startsWith("w")) && (kak == 1)) {
                pan[panx + 1][pany - 1] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
        if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
            if ((paname[panx + 2][pany - 2] == "keno") && (kak == 1)) {
                pan[panx + 2][pany - 2] = true;
            } else if ((paname[panx + 2][pany - 2].startsWith("w")) && (kak == 1)) {
                pan[panx + 2][pany - 2] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 3 >= 0) && (panx + 3 <= 7)) {
        if ((pany - 3 >= 0) && (pany - 3 <= 7)) {
            if ((paname[panx + 3][pany - 3] == "keno") && (kak == 1)) {
                pan[panx + 3][pany - 3] = true;
            } else if ((paname[panx + 3][pany - 3].startsWith("w")) && (kak == 1)) {
                pan[panx + 3][pany - 3] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 4 >= 0) && (panx + 4 <= 7)) {
        if ((pany - 4 >= 0) && (pany - 4 <= 7)) {
            if ((paname[panx + 4][pany - 4] == "keno") && (kak == 1)) {
                pan[panx + 4][pany - 4] = true;
            } else if ((paname[panx + 4][pany - 4].startsWith("w")) && (kak == 1)) {
                pan[panx + 4][pany - 4] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 5 >= 0) && (panx + 5 <= 7)) {
        if ((pany - 5 >= 0) && (pany - 5 <= 7)) {
            if ((paname[panx + 5][pany - 5] == "keno") && (kak == 1)) {
                pan[panx + 5][pany - 5] = true;
            } else if ((paname[panx + 5][pany - 5].startsWith("w")) && (kak == 1)) {
                pan[panx + 5][pany - 5] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 6 >= 0) && (panx + 6 <= 7)) {
        if ((pany - 6 >= 0) && (pany - 6 <= 7)) {
            if ((paname[panx + 6][pany - 6] == "keno") && (kak == 1)) {
                pan[panx + 6][pany - 6] = true;
            } else if ((paname[panx + 6][pany - 6].startsWith("w")) && (kak == 1)) {
                pan[panx + 6][pany - 6] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }
    if ((panx + 7 >= 0) && (panx + 7 <= 7)) {
        if ((pany - 7 >= 0) && (pany - 7 <= 7)) {
            if ((paname[panx + 7][pany - 7] == "keno") && (kak == 1)) {
                pan[panx + 7][pany - 7] = true;
            } else if ((paname[panx + 7][pany - 7].startsWith("w")) && (kak == 1)) {
                pan[panx + 7][pany - 7] = true;
                kak = 0;
            } else {
                kak = 0;
            }
        }
    }

    //TODO Aristera panw
    if ((panx - 1 >= 0) && (panx - 1 <= 7)) {
        if ((pany - 1 >= 0) && (pany - 1 <= 7)) {
            if ((paname[panx - 1][pany - 1] == "keno") && (kap == 1)) {
                pan[panx - 1][pany - 1] = true;
            } else if ((paname[panx - 1][pany - 1].startsWith("w")) && (kap == 1)) {
                pan[panx - 1][pany - 1] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 2 >= 0) && (panx - 2 <= 7)) {
        if ((pany - 2 >= 0) && (pany - 2 <= 7)) {
            if ((paname[panx - 2][pany - 2] == "keno") && (kap == 1)) {
                pan[panx - 2][pany - 2] = true;
            } else if ((paname[panx - 2][pany - 2].startsWith("w")) && (kap == 1)) {
                pan[panx - 2][pany - 2] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 3 >= 0) && (panx - 3 <= 7)) {
        if ((pany - 3 >= 0) && (pany - 3 <= 7)) {
            if ((paname[panx - 3][pany - 3] == "keno") && (kap == 1)) {
                pan[panx - 3][pany - 3] = true;
            } else if ((paname[panx - 3][pany - 3].startsWith("w")) && (kap == 1)) {
                pan[panx - 3][pany - 3] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 4 >= 0) && (panx - 4 <= 7)) {
        if ((pany - 4 >= 0) && (pany - 4 <= 7)) {
            if ((paname[panx - 4][pany - 4] == "keno") && (kap == 1)) {
                pan[panx - 4][pany - 4] = true;
            } else if ((paname[panx - 4][pany - 4].startsWith("w")) && (kap == 1)) {
                pan[panx - 4][pany - 4] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 5 >= 0) && (panx - 5 <= 7)) {
        if ((pany - 5 >= 0) && (pany - 5 <= 7)) {
            if ((paname[panx - 5][pany - 5] == "keno") && (kap == 1)) {
                pan[panx - 5][pany - 5] = true;
            } else if ((paname[panx - 5][pany - 5].startsWith("w")) && (kap == 1)) {
                pan[panx - 5][pany - 5] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 6 >= 0) && (panx - 6 <= 7)) {
        if ((pany - 6 >= 0) && (pany - 6 <= 7)) {
            if ((paname[panx - 6][pany - 6] == "keno") && (kap == 1)) {
                pan[panx - 6][pany - 6] = true;
            } else if ((paname[panx - 6][pany - 6].startsWith("w")) && (kap == 1)) {
                pan[panx - 6][pany - 6] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }
    if ((panx - 7 >= 0) && (panx - 7 <= 7)) {
        if ((pany - 7 >= 0) && (pany - 7 <= 7)) {
            if ((paname[panx - 7][pany - 7] == "keno") && (kap == 1)) {
                pan[panx - 7][pany - 7] = true;
            } else if ((paname[panx - 7][pany - 7].startsWith("w")) && (kap == 1)) {
                pan[panx - 7][pany - 7] = true;
                kap = 0;
            } else {
                kap = 0;
            }
        }
    }

    //TODO Dexia katw
    if ((panx + 1 >= 0) && (panx + 1 <= 7)) {
        if ((pany + 1 >= 0) && (pany + 1 <= 7)) {
            if ((paname[panx + 1][pany + 1] == "keno") && (kdk == 1)) {
                pan[panx + 1][pany + 1] = true;
            } else if ((paname[panx + 1][pany + 1].startsWith("w")) && (kdk == 1)) {
                pan[panx + 1][pany + 1] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 2 >= 0) && (panx + 2 <= 7)) {
        if ((pany + 2 >= 0) && (pany + 2 <= 7)) {
            if ((paname[panx + 2][pany + 2] == "keno") && (kdk == 1)) {
                pan[panx + 2][pany + 2] = true;
            } else if ((paname[panx + 2][pany + 2].startsWith("w")) && (kdk == 1)) {
                pan[panx + 2][pany + 2] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 3 >= 0) && (panx + 3 <= 7)) {
        if ((pany + 3 >= 0) && (pany + 3 <= 7)) {
            if ((paname[panx + 3][pany + 3] == "keno") && (kdk == 1)) {
                pan[panx + 3][pany + 3] = true;
            } else if ((paname[panx + 3][pany + 3].startsWith("w")) && (kdk == 1)) {
                pan[panx + 3][pany + 3] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 4 >= 0) && (panx + 4 <= 7)) {
        if ((pany + 4 >= 0) && (pany + 4 <= 7)) {
            if ((paname[panx + 4][pany + 4] == "keno") && (kdk == 1)) {
                pan[panx + 4][pany + 4] = true;
            } else if ((paname[panx + 4][pany + 4].startsWith("w")) && (kdk == 1)) {
                pan[panx + 4][pany + 4] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 5 >= 0) && (panx + 5 <= 7)) {
        if ((pany + 5 >= 0) && (pany + 5 <= 7)) {
            if ((paname[panx + 5][pany + 5] == "keno") && (kdk == 1)) {
                pan[panx + 5][pany + 5] = true;
            } else if ((paname[panx + 5][pany + 5].startsWith("w")) && (kdk == 1)) {
                pan[panx + 5][pany + 5] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 6 >= 0) && (panx + 6 <= 7)) {
        if ((pany + 6 >= 0) && (pany + 6 <= 7)) {
            if ((paname[panx + 6][pany + 6] == "keno") && (kdk == 1)) {
                pan[panx + 6][pany + 6] = true;
            } else if ((paname[panx + 6][pany + 6].startsWith("w")) && (kdk == 1)) {
                pan[panx + 6][pany + 6] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
    if ((panx + 7 >= 0) && (panx + 7 <= 7)) {
        if ((pany + 7 >= 0) && (pany + 7 <= 7)) {
            if ((paname[panx + 7][pany + 7] == "keno") && (kdk == 1)) {
                pan[panx + 7][pany + 7] = true;
            } else if ((paname[panx + 7][pany + 7].startsWith("w")) && (kdk == 1)) {
                pan[panx + 7][pany + 7] = true;
                kdk = 0;
            } else {
                kdk = 0;
            }
        }
    }
} else if (color=="white"){
    //TODO Dexia panw
    if((panx-1>=0)&&(panx-1<=7)){
        if((pany+1>=0)&&(pany+1<=7)){
            if((paname[panx-1][pany+1]=="keno")&&(kdp==1)){
                pan[panx-1][pany+1]=true;}
            else if((paname[panx-1][pany+1].startsWith("b"))&&(kdp==1)){
                pan[panx-1][pany+1]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-2>=0)&&(panx-2<=7)){
        if((pany+2>=0)&&(pany+2<=7)){
            if((paname[panx-2][pany+2]=="keno")&&(kdp==1)){
                pan[panx-2][pany+2]=true;}
            else if((paname[panx-2][pany+2].startsWith("b"))&&(kdp==1)){
                pan[panx-2][pany+2]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-3>=0)&&(panx-3<=7)){
        if((pany+3>=0)&&(pany+3<=7)){
            if((paname[panx-3][pany+3]=="keno")&&(kdp==1)){
                pan[panx-3][pany+3]=true;}
            else if((paname[panx-3][pany+3].startsWith("b"))&&(kdp==1)){
                pan[panx-3][pany+3]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-4>=0)&&(panx-4<=7)){
        if((pany+4>=0)&&(pany+4<=7)){
            if((paname[panx-4][pany+4]=="keno")&&(kdp==1)){
                pan[panx-4][pany+4]=true;}
            else if((paname[panx-4][pany+4].startsWith("b"))&&(kdp==1)){
                pan[panx-4][pany+4]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-5>=0)&&(panx-5<=7)){
        if((pany+5>=0)&&(pany+5<=7)){
            if((paname[panx-5][pany+5]=="keno")&&(kdp==1)){
                pan[panx-5][pany+5]=true;}
            else if((paname[panx-5][pany+5].startsWith("b"))&&(kdp==1)){
                pan[panx-5][pany+5]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-6>=0)&&(panx-6<=7)){
        if((pany+6>=0)&&(pany+6<=7)){
            if((paname[panx-6][pany+6]=="keno")&&(kdp==1)){
                pan[panx-6][pany+6]=true;}
            else if((paname[panx-6][pany+6].startsWith("b"))&&(kdp==1)){
                pan[panx-6][pany+6]=true; kdp=0;} else {kdp=0;}
        }}
    if((panx-7>=0)&&(panx-7<=7)){
        if((pany+7>=0)&&(pany+7<=7)){
            if((paname[panx-7][pany+7]=="keno")&&(kdp==1)){
                pan[panx-7][pany+7]=true;}
            else if((paname[panx-7][pany+7].startsWith("b"))&&(kdp==1)){
                pan[panx-7][pany+7]=true; kdp=0;} else {kdp=0;}
        }}

    //TODO Aristera katw
    if((panx+1>=0)&&(panx+1<=7)){
        if((pany-1>=0)&&(pany-1<=7)){
            if((paname[panx+1][pany-1]=="keno")&&(kak==1)){
                pan[panx+1][pany-1]=true;}
            else if((paname[panx+1][pany-1].startsWith("b"))&&(kak==1)){
                pan[panx+1][pany-1]=true; kak=0;} else {kak=0;}
        }}
    if((panx+2>=0)&&(panx+2<=7)){
        if((pany-2>=0)&&(pany-2<=7)){
            if((paname[panx+2][pany-2]=="keno")&&(kak==1)){
                pan[panx+2][pany-2]=true;}
            else if((paname[panx+2][pany-2].startsWith("b"))&&(kak==1)){
                pan[panx+2][pany-2]=true; kak=0;} else {kak=0;}
        }}
    if((panx+3>=0)&&(panx+3<=7)){
        if((pany-3>=0)&&(pany-3<=7)){
            if((paname[panx+3][pany-3]=="keno")&&(kak==1)){
                pan[panx+3][pany-3]=true;}
            else if((paname[panx+3][pany-3].startsWith("b"))&&(kak==1)){
                pan[panx+3][pany-3]=true; kak=0;} else {kak=0;}
        }}
    if((panx+4>=0)&&(panx+4<=7)){
        if((pany-4>=0)&&(pany-4<=7)){
            if((paname[panx+4][pany-4]=="keno")&&(kak==1)){
                pan[panx+4][pany-4]=true;}
            else if((paname[panx+4][pany-4].startsWith("b"))&&(kak==1)){
                pan[panx+4][pany-4]=true; kak=0;} else {kak=0;}
        }}
    if((panx+5>=0)&&(panx+5<=7)){
        if((pany-5>=0)&&(pany-5<=7)){
            if((paname[panx+5][pany-5]=="keno")&&(kak==1)){
                pan[panx+5][pany-5]=true;}
            else if((paname[panx+5][pany-5].startsWith("b"))&&(kak==1)){
                pan[panx+5][pany-5]=true; kak=0;} else {kak=0;}
        }}
    if((panx+6>=0)&&(panx+6<=7)){
        if((pany-6>=0)&&(pany-6<=7)){
            if((paname[panx+6][pany-6]=="keno")&&(kak==1)){
                pan[panx+6][pany-6]=true;}
            else if((paname[panx+6][pany-6].startsWith("b"))&&(kak==1)){
                pan[panx+6][pany-6]=true; kak=0;} else {kak=0;}
        }}
    if((panx+7>=0)&&(panx+7<=7)){
        if((pany-7>=0)&&(pany-7<=7)){
            if((paname[panx+7][pany-7]=="keno")&&(kak==1)){
                pan[panx+7][pany-7]=true;}
            else if((paname[panx+7][pany-7].startsWith("b"))&&(kak==1)){
                pan[panx+7][pany-7]=true; kak=0;} else {kak=0;}
        }}

    //TODO Aristera panw
    if((panx-1>=0)&&(panx-1<=7)){
        if((pany-1>=0)&&(pany-1<=7)){
            if((paname[panx-1][pany-1]=="keno")&&(kap==1)){
                pan[panx-1][pany-1]=true;}
            else if((paname[panx-1][pany-1].startsWith("b"))&&(kap==1)){
                pan[panx-1][pany-1]=true; kap=0;} else {kap=0;}
        }}
    if((panx-2>=0)&&(panx-2<=7)){
        if((pany-2>=0)&&(pany-2<=7)){
            if((paname[panx-2][pany-2]=="keno")&&(kap==1)){
                pan[panx-2][pany-2]=true;}
            else if((paname[panx-2][pany-2].startsWith("b"))&&(kap==1)){
                pan[panx-2][pany-2]=true; kap=0;} else {kap=0;}
        }}
    if((panx-3>=0)&&(panx-3<=7)){
        if((pany-3>=0)&&(pany-3<=7)){
            if((paname[panx-3][pany-3]=="keno")&&(kap==1)){
                pan[panx-3][pany-3]=true;}
            else if((paname[panx-3][pany-3].startsWith("b"))&&(kap==1)){
                pan[panx-3][pany-3]=true; kap=0;} else {kap=0;}
        }}
    if((panx-4>=0)&&(panx-4<=7)){
        if((pany-4>=0)&&(pany-4<=7)){
            if((paname[panx-4][pany-4]=="keno")&&(kap==1)){
                pan[panx-4][pany-4]=true;}
            else if((paname[panx-4][pany-4].startsWith("b"))&&(kap==1)){
                pan[panx-4][pany-4]=true; kap=0;} else {kap=0;}
        }}
    if((panx-5>=0)&&(panx-5<=7)){
        if((pany-5>=0)&&(pany-5<=7)){
            if((paname[panx-5][pany-5]=="keno")&&(kap==1)){
                pan[panx-5][pany-5]=true;}
            else if((paname[panx-5][pany-5].startsWith("b"))&&(kap==1)){
                pan[panx-5][pany-5]=true; kap=0;} else {kap=0;}
        }}
    if((panx-6>=0)&&(panx-6<=7)){
        if((pany-6>=0)&&(pany-6<=7)){
            if((paname[panx-6][pany-6]=="keno")&&(kap==1)){
                pan[panx-6][pany-6]=true;}
            else if((paname[panx-6][pany-6].startsWith("b"))&&(kap==1)){
                pan[panx-6][pany-6]=true; kap=0;} else {kap=0;}
        }}
    if((panx-7>=0)&&(panx-7<=7)){
        if((pany-7>=0)&&(pany-7<=7)){
            if((paname[panx-7][pany-7]=="keno")&&(kap==1)){
                pan[panx-7][pany-7]=true;}
            else if((paname[panx-7][pany-7].startsWith("b"))&&(kap==1)){
                pan[panx-7][pany-7]=true; kap=0;} else {kap=0;}
        }}

    //TODO Dexia katw
    if((panx+1>=0)&&(panx+1<=7)){
        if((pany+1>=0)&&(pany+1<=7)){
            if((paname[panx+1][pany+1]=="keno")&&(kdk==1)){
                pan[panx+1][pany+1]=true;}
            else if((paname[panx+1][pany+1].startsWith("b"))&&(kdk==1)){
                pan[panx+1][pany+1]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+2>=0)&&(panx+2<=7)){
        if((pany+2>=0)&&(pany+2<=7)){
            if((paname[panx+2][pany+2]=="keno")&&(kdk==1)){
                pan[panx+2][pany+2]=true;}
            else if((paname[panx+2][pany+2].startsWith("b"))&&(kdk==1)){
                pan[panx+2][pany+2]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+3>=0)&&(panx+3<=7)){
        if((pany+3>=0)&&(pany+3<=7)){
            if((paname[panx+3][pany+3]=="keno")&&(kdk==1)){
                pan[panx+3][pany+3]=true;}
            else if((paname[panx+3][pany+3].startsWith("b"))&&(kdk==1)){
                pan[panx+3][pany+3]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+4>=0)&&(panx+4<=7)){
        if((pany+4>=0)&&(pany+4<=7)){
            if((paname[panx+4][pany+4]=="keno")&&(kdk==1)){
                pan[panx+4][pany+4]=true;}
            else if((paname[panx+4][pany+4].startsWith("b"))&&(kdk==1)){
                pan[panx+4][pany+4]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+5>=0)&&(panx+5<=7)){
        if((pany+5>=0)&&(pany+5<=7)){
            if((paname[panx+5][pany+5]=="keno")&&(kdk==1)){
                pan[panx+5][pany+5]=true;}
            else if((paname[panx+5][pany+5].startsWith("b"))&&(kdk==1)){
                pan[panx+5][pany+5]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+6>=0)&&(panx+6<=7)){
        if((pany+6>=0)&&(pany+6<=7)){
            if((paname[panx+6][pany+6]=="keno")&&(kdk==1)){
                pan[panx+6][pany+6]=true;}
            else if((paname[panx+6][pany+6].startsWith("b"))&&(kdk==1)){
                pan[panx+6][pany+6]=true; kdk=0;} else {kdk=0;}
        }}
    if((panx+7>=0)&&(panx+7<=7)){
        if((pany+7>=0)&&(pany+7<=7)){
            if((paname[panx+7][pany+7]=="keno")&&(kdk==1)){
                pan[panx+7][pany+7]=true;}
            else if((paname[panx+7][pany+7].startsWith("b"))&&(kdk==1)){
                pan[panx+7][pany+7]=true; kdk=0;} else {kdk=0;}
        }}
}
    }

    public void queenpan() {
        towerpan();
        axpan();
        kingpan();
    }

    public void kingpan() {
        pan[panx][pany]=true;
        if(color=="black")
        {

        if((panx-1>=0)&&(panx-1<=7)){
            if((pany-1>=0)&&(pany-1<=7)){
                if(paname[panx-1][pany-1]=="keno"){
                pan[panx-1][pany-1]=true;}
            else if (paname[panx-1][pany-1].startsWith("w")){
                    pan[panx-1][pany-1]=true;
                }
            }}

        if((panx-1>=0)&&(panx-1<=7))
        {
            if(paname[panx-1][pany]=="keno"){
            pan[panx-1][pany]=true;}
        else if (paname[panx-1][pany].startsWith("w")){
            pan[panx-1][pany]=true;
        }}

        if((panx-1>=0)&&(panx-1<=7)){
            if((pany+1>=0)&&(pany+1<=7)){

                if(paname[panx-1][pany+1]=="keno"){
                    pan[panx-1][pany+1]=true;}
                else if (paname[panx-1][pany+1].startsWith("w")){
                    pan[panx-1][pany+1]=true;
                }
            }}

        if((pany-1>=0)&&(pany-1<=7)){

            if(paname[panx][pany-1]=="keno"){
                pan[panx][pany-1]=true;}
            else if (paname[panx][pany-1].startsWith("w")){
                pan[panx][pany-1]=true;
            }
        }

        if((pany+1>=0)&&(pany+1<=7)){

            if(paname[panx][pany+1]=="keno"){
                pan[panx][pany+1]=true;}
            else if (paname[panx][pany+1].startsWith("w")){
                pan[panx][pany+1]=true;
            }
        }

        if((panx+1>=0)&&(panx+1<=7)){
            if((pany-1>=0)&&(pany-1<=7)){
                if(paname[panx+1][pany-1]=="keno"){
                    pan[panx+1][pany-1]=true;}
                else if (paname[panx+1][pany-1].startsWith("w")){
                    pan[panx+1][pany-1]=true;
                }
            }}

        if((panx+1>=0)&&(panx+1<=7)){

            if(paname[panx+1][pany]=="keno"){
                pan[panx+1][pany]=true;}
            else if (paname[panx+1][pany].startsWith("w")){
                pan[panx+1][pany]=true;
            }
        }

        if((panx+1>=0)&&(panx+1<=7)){
            if((pany+1>=0)&&(pany+1<=7)){
                if(paname[panx+1][pany+1]=="keno"){
                    pan[panx+1][pany+1]=true;}
                else if (paname[panx+1][pany+1].startsWith("w")){
                    pan[panx+1][pany+1]=true;
                }
            }}

    } else if (color=="white"){

            if((panx-1>=0)&&(panx-1<=7)){
                if((pany-1>=0)&&(pany-1<=7)){
                    if(paname[panx-1][pany-1]=="keno"){
                        pan[panx-1][pany-1]=true;}
                    else if (paname[panx-1][pany-1].startsWith("b")){
                        pan[panx-1][pany-1]=true;
                    }
                }}

            if((panx-1>=0)&&(panx-1<=7))
            {
                if(paname[panx-1][pany]=="keno"){
                    pan[panx-1][pany]=true;}
                else if (paname[panx-1][pany].startsWith("b")){
                    pan[panx-1][pany]=true;
                }}

            if((panx-1>=0)&&(panx-1<=7)){
                if((pany+1>=0)&&(pany+1<=7)){

                    if(paname[panx-1][pany+1]=="keno"){
                        pan[panx-1][pany+1]=true;}
                    else if (paname[panx-1][pany+1].startsWith("b")){
                        pan[panx-1][pany+1]=true;
                    }
                }}

            if((pany-1>=0)&&(pany-1<=7)){

                if(paname[panx][pany-1]=="keno"){
                    pan[panx][pany-1]=true;}
                else if (paname[panx][pany-1].startsWith("b")){
                    pan[panx][pany-1]=true;
                }
            }

            if((pany+1>=0)&&(pany+1<=7)){

                if(paname[panx][pany+1]=="keno"){
                    pan[panx][pany+1]=true;}
                else if (paname[panx][pany+1].startsWith("b")){
                    pan[panx][pany+1]=true;
                }
            }

            if((panx+1>=0)&&(panx+1<=7)){
                if((pany-1>=0)&&(pany-1<=7)){
                    if(paname[panx+1][pany-1]=="keno"){
                        pan[panx+1][pany-1]=true;}
                    else if (paname[panx+1][pany-1].startsWith("b")){
                        pan[panx+1][pany-1]=true;
                    }
                }}

            if((panx+1>=0)&&(panx+1<=7)){

                if(paname[panx+1][pany]=="keno"){
                    pan[panx+1][pany]=true;}
                else if (paname[panx+1][pany].startsWith("b")){
                    pan[panx+1][pany]=true;
                }
            }

            if((panx+1>=0)&&(panx+1<=7)){
                if((pany+1>=0)&&(pany+1<=7)){
                    if(paname[panx+1][pany+1]=="keno"){
                        pan[panx+1][pany+1]=true;}
                    else if (paname[panx+1][pany+1].startsWith("b")){
                        pan[panx+1][pany+1]=true;
                    }
                }}

        }
    }

    public boolean rouab() {
        boolean[][] roua=new boolean[8][8];
        boolean[][] savepan=new boolean[8][8];
        int savepanx,savepany;
        String savecolor;

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                savepan[x][y]=pan[x][y];
            }
        }
        savecolor=color;
        savepanx=panx;
        savepany=pany;
        resetpan();

        color="white";

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++){
                panx=x;
                pany=y;

                if(paname[x][y]=="wsold"){
                    if (wsoldtop==false){
                    soldpan();}
                    else{
                        callwDiaolog();
                        wsoldtop=false;
                    }
                }
                if(paname[x][y]=="wtower"){
                    towerpan();
                }
                if(paname[x][y]=="whorse"){
                    horsepan();
                }
                if(paname[x][y]=="wax"){
                    axpan();
                }
                if(paname[x][y]=="wqueen"){
                    queenpan();
                }
                if(paname[x][y]=="wking"){
                    kingpan();
                }
            }
        }
        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                roua[x][y]=pan[x][y];
            }
        }
        color=savecolor;
        panx=savepanx;
        pany=savepany;
        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                pan[x][y]=savepan[x][y];
            }
        }

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                if(paname[x][y]=="bking"){
                    if (roua[x][y]==true){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean rouaw() {
        boolean[][] roua=new boolean[8][8];
        boolean[][] savepan=new boolean[8][8];
        int savepanx,savepany;
        String savecolor;

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                savepan[x][y]=pan[x][y];
            }
        }
        savecolor=color;
        savepanx=panx;
        savepany=pany;
        resetpan();

        color="black";

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++){
                panx=x;
                pany=y;

                if(paname[x][y]=="bsold"){

                    if (bsoldtop==false){
                        soldpan();}
                    else{
                        callbDiaolog();
                        bsoldtop=false;
                    }
                }
                if(paname[x][y]=="btower"){
                    towerpan();
                }
                if(paname[x][y]=="bhorse"){
                    horsepan();
                }
                if(paname[x][y]=="bax"){
                    axpan();
                }
                if(paname[x][y]=="bqueen"){
                    queenpan();
                }
                if(paname[x][y]=="bking"){
                    kingpan();
                }
            }
        }
        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                roua[x][y]=pan[x][y];
            }
        }
        color=savecolor;
        panx=savepanx;
        pany=savepany;
        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                pan[x][y]=savepan[x][y];
            }
        }

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++) {
                if(paname[x][y]=="wking"){
                    if (roua[x][y]==true){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void resetpan() {

        for(int x=0;x<=7;x++){
            for(int y=0;y<=7;y++){
                pan[x][y]=false;
            }
        }

    }

    public void newgame(View view) {
         catched=true;
         released=false;
         canceled=false;
         k=0;
         l=1;
         nextColor="white";
        undocalc=0;
         wsoldtop=false;
         bsoldtop=false;
        chessReset();
    }

    public void exit(View view) {
        finish();
    }

    public void undomove(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {

        if((undocalc==1)||(undocalc==0)||(undocalc%2!=0)){
            vib.vibrate(500);
            floataki.setText("Undo Move Unavailable");
            floataki.setTextColor(getResources().getColor(android.R.color.black));
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    floataki.setText("");
                    floataki.setTextColor(getResources().getColor(android.R.color.white));
                }
            }, 2000);


        }
        else if (undocalc>=2){

            paname[undopanx[undocalc-2]][undopany[undocalc-2]]=undoname[undocalc-2];
            paname[undopanx[undocalc-1]][undopany[undocalc-1]]=undoname[undocalc-1];
            nextColor=undocolor[undocalc-2];
                undoid[undocalc-1].setBackground(undodraw[undocalc-1]);
                undoid[undocalc-2].setBackground(undodraw[undocalc-2]);



            undocalc=undocalc-2;
        }


    }
        else{
            Toast.makeText(this, "NOT SUPPORTED ANDROID VERSION", Toast.LENGTH_SHORT).show();
        }
    }

    public void undostorage(){
        undoid[undocalc]=NowID;
        undopanx[undocalc]=panx;
        undopany[undocalc]=pany;
        undoname[undocalc]=paname[panx][pany];
        undodraw[undocalc]=NowID.getBackground();
        undocolor[undocalc]=color;
    }

    @Override
    public void onBackPressed() {
    }




    private void callwDiaolog() {
        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.w_fragment);
        dialog.show();



        ImageButton wq =(ImageButton) dialog.findViewById(R.id.wqueen);
        ImageButton wa =(ImageButton) dialog.findViewById(R.id.wax);
        ImageButton wh =(ImageButton) dialog.findViewById(R.id.whorse);
        ImageButton wt =(ImageButton) dialog.findViewById(R.id.wtower);



        wq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.whitequeen_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.whitequeen_white);
                }
                paname[panx][pany] = "wqueen";
                wsoldtop = false;
                dialog.hide();
            }
        });

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.whiteax_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.whiteax_white);
                }
                paname[panx][pany] = "wax";
                wsoldtop = false;
                dialog.hide();
            }
        });

        wt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.whitetower_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.whitetower_white);
                }
                paname[panx][pany] = "wtower";
                wsoldtop = false;
                dialog.hide();
            }
        });

        wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.whitehorse_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.whitehorse_white);
                }
                paname[panx][pany] = "whorse";
                wsoldtop = false;
                dialog.hide();
            }
        });

    }

    private void callbDiaolog() {
        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.b_fragment);
        dialog.show();



        ImageButton bq =(ImageButton) dialog.findViewById(R.id.bqueen);
        ImageButton ba =(ImageButton) dialog.findViewById(R.id.bax);
        ImageButton bh =(ImageButton) dialog.findViewById(R.id.bhorse);
        ImageButton bt =(ImageButton) dialog.findViewById(R.id.btower);



        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.blackqueen_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.blackqueen_white);
                }
                paname[panx][pany] = "bqueen";
                bsoldtop = false;
                dialog.hide();
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.blackax_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.blackax_white);
                }
                paname[panx][pany] = "bax";
                bsoldtop = false;
                dialog.hide();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.blacktower_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.blacktower_white);
                }
                paname[panx][pany] = "btower";
                bsoldtop = false;
                dialog.hide();
            }
        });

        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorB == "black") {
                    NowID.setBackgroundResource(R.drawable.blackhorse_black);
                } else {
                    NowID.setBackgroundResource(R.drawable.blackhorse_white);
                }
                paname[panx][pany] = "bhorse";
                bsoldtop = false;
                dialog.hide();
            }
        });

    }



}



