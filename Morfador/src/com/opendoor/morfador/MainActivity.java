package com.opendoor.morfador;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        
   
    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    		final Button bt1 = (Button) findViewById(R.id.btp1);
	        bt1.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt1.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt2 = (Button) findViewById(R.id.btp2);
	        bt2.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt2.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt3 = (Button) findViewById(R.id.btp3);
	        bt3.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt3.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt4 = (Button) findViewById(R.id.btp4);
	        bt4.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt4.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt5 = (Button) findViewById(R.id.btp5);
	        bt5.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt5.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt6 = (Button) findViewById(R.id.btp6);
	        bt6.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt6.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        final Button bt7 = (Button) findViewById(R.id.btp7);
	        bt7.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt7.getText().toString();
					Intent g = new Intent(MainActivity.this, ChamaPlayer.class);
					
					g.putExtra("modalidade", texto);
					startActivity(g);
				} 

		});	
	        final Button bt8 = (Button) findViewById(R.id.btp8);
	        bt8.setOnClickListener(new Button.OnClickListener() {
				@Override	
				public void onClick(View v) {
					String texto = bt8.getText().toString();
					Intent i = new Intent(MainActivity.this, ChamaPlayer.class);
					
					i.putExtra("modalidade", texto);
					startActivity(i);
				} 

		});	
	        
	        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
