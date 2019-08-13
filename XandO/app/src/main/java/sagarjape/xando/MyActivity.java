package sagarjape.xando;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends Activity {

    Button bt,button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;int i;int a[]=new int[9];int k;int l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        game();
    }
        public void game()
        {
            for (int j = 0; j < 9; j++)
                a[j] = 0;
            k=0;i=0;l=0;
        button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button.setText("X");a[8]=1;
                    i++;
                } else {
                    button.setText("O");a[8]=2;
                    i++;
                }
                button.setClickable(false);k++;chk();
            }
        });
        button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button1.setText("X");a[6]=1;
                    i++;
                } else {
                    button1.setText("O");a[6]=2;
                    i++;
                }
                button1.setClickable(false);k++;chk();
            }
        });
        button2 = (Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button2.setText("X");a[7]=1;
                    i++;
                } else {
                    button2.setText("O");a[7]=2;
                    i++;
                }
                button2.setClickable(false);k++;chk();
            }
        });
        button3 = (Button) this.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button3.setText("X");a[4]=1;
                    i++;
                } else {
                    button3.setText("O");a[4]=2;
                    i++;
                }
                button3.setClickable(false);k++;chk();
            }
        });
        button4 = (Button) this.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button4.setText("X");a[3]=1;
                    i++;
                } else {
                    button4.setText("O");a[3]=2;
                    i++;
                }
                button4.setClickable(false);k++;chk();
            }
        });
        button5 = (Button) this.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button5.setText("X");a[2]=1;
                    i++;
                } else {
                    button5.setText("O");a[2]=2;
                    i++;
                }
                button5.setClickable(false);k++;chk();
            }
        });
        button6 = (Button) this.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button6.setText("X");a[5]=1;
                    i++;
                } else {
                    button6.setText("O");a[5]=2;
                    i++;
                }
                button6.setClickable(false);k++;chk();
            }
        });
        button7 = (Button) this.findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    button7.setText("X");a[1]=1;
                    i++;
                } else {
                    button7.setText("O");a[1]=2;
                    i++;
                }
                button7.setClickable(false);k++;chk();
            }
        });
        button9 = (Button) this.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i % 2 == 0) {
                    a[0]=1;
                    button9.setText("X");
                    i++;
                } else {
                    a[0]=2;
                    button9.setText("O");
                    i++;
                }
                button9.setClickable(false);k++;chk();
            }
        });

        button10 = (Button) this.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reset();
            }
        });




        button8 = (Button) this.findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);

            }

        });
    }

    private void chk() {
        bt = (Button) this.findViewById(R.id.bt);
        if(i>=5) {
            if ((a[0] == a[3]) && (a[0] == a[6])&&(a[0]!=0)) {
                bt.setText("Player " + a[0] + " wins");l=1;
                }
            if ((a[0] == a[1]) && (a[0] == a[2])&&(a[0]!=0)) {
                bt.setText("Player " + a[0] + " wins");l=1;
                }
            if ((a[3] == a[4]) && (a[3] == a[5])&&(a[5]!=0)) {
                bt.setText("Player " + a[3] + " wins");l=1;
                }
            if ((a[6] == a[7]) && (a[8] == a[6])&&(a[8]!=0)) {
                bt.setText("Player " + a[8] + " wins");l=1;
                }
            if ((a[1] == a[4]) && (a[4] == a[7])&&(a[1]!=0)) {
                bt.setText("Player " + a[1] + " wins");l=1;
                }
            if ((a[2] == a[4]) && (a[6] == a[4])&&(a[2]!=0)) {
                bt.setText("Player  " + a[2] + " wins");l=1;
                }
            if ((a[0] == a[4]) && (a[0] == a[8])&&(a[0]!=0)) {
                bt.setText("Player " + a[0] + " wins");l=1;
                }
            if ((a[2] == a[5]) && (a[5] == a[8])&&(a[2]!=0)) {
                bt.setText("Player " + a[2] + " wins");l=1;
            }
        }
        if(l==1)
        {
            button.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button9.setClickable(false);

        }
        if((k==9)&&(l!=1))
            bt.setText("Match Draw");


    }


    private void reset() {
        setContentView(R.layout.activity_my);

        game();
 }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
