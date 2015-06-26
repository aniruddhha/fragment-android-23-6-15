package com.melayer.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {

	private View rootView;
	
	private TextView textView;
	
	private static String info;
	
	public static MyFragment getInstance(String info){
		
		MyFragment frag = new MyFragment();
		
		Bundle bundle = new Bundle();
		bundle.putString("KEY_DATA_MY", info);
		
		frag.setArguments(bundle);
		
		return frag;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		super.onCreateView(inflater, container, savedInstanceState);

		rootView = inflater.inflate(R.layout.fragment_my, container, false);
		textView = (TextView) rootView.findViewById(R.id.textView);
		
		Bundle dataFrag = getArguments();
		
		if(dataFrag != null){
		
			textView.setText(""+dataFrag.getString("KEY_DATA_MY"));
		}

		return rootView;
	}

}
