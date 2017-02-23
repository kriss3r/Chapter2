package com.example.user.chapter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int MDLF = 0;
    private final static int MDLS = 1;
    private final static int MDLT = 2;


    //Menu opcji mozna dolaczyc do kazdej aktywnosci, wystarczy przeslonic metode onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,R.string.menu_dropdown_list_first);
        menu.add(1,1,1,R.string.menu_dropdown_list_second);
        menu.add(0,0,2,R.string.menu_dropdown_list_third);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i("MenuItem",item.getItemId()+"");
        switch(item.getItemId()){
            case MDLF:
            {
                Log.i("MDLF",item.getItemId()+"");
                Toast.makeText(getApplicationContext(),"Otwieram menu Plik",Toast.LENGTH_SHORT).show();
            }
            break;
            case MDLS:
            {
                Toast.makeText(this,"Otwieram menu Edycja",Toast.LENGTH_SHORT).show();
            }
            break;
            case MDLT:
            {
                Toast.makeText(this,"Otwieram menu Ustawienia",Toast.LENGTH_SHORT).show();
            }
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
