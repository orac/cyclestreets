package net.cyclestreets.fragments;

import net.cyclestreets.CycleStreetsApp;
import net.cyclestreets.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class About extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		View result = inflater.inflate(R.layout.about, container);
		
    final WebView htmlView = (WebView)result.findViewById(R.id.html_view);
    htmlView.loadUrl("file:///android_asset/credits.html");
    
    final TextView versionView = (TextView)result.findViewById(R.id.version_view);
    versionView.setText(versionName());
    return result;
	} // onCreate
	
	private String versionName() 
	{
	  return ((CycleStreetsApp)getActivity().getApplication()).version();
	} // versionName
}
