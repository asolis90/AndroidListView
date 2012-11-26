package com.ansol.androidlistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Home extends Activity {

	//Content list for Months to be displayed in ListView
	String[] Months = { "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ListView lv = (ListView) findViewById(R.id.listView1);

		//Set adapter to hold Months
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Months);

		// Set ArrayAdapter to ListView
		lv.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
