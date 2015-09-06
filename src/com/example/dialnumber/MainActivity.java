package com.example.dialnumber;

import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText number ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //得到activity Button对象的引用
        Button button =(Button)this.findViewById(R.id.Dial);
		 number =(EditText)MainActivity.this.findViewById(R.id.number);
        button.setOnClickListener(new MyButtonClickListener());
    }

    private class MyButtonClickListener implements OnClickListener{
    	public void onClick(View v){
    		//System.out.println("clicked!");//打印 必须用println 不能用print 否则无法打印
    		//Log.i("MainActivity","pressed");
    		String num=number.getText().toString();
    		Log.i("MainActivity",num);
    		Intent intentA=new Intent();// 意图
    		intentA.setAction(Intent.ACTION_CALL);
    		intentA.setData(Uri.parse("tel:"+num));
    		startActivity(intentA);
    	}
    }
}
