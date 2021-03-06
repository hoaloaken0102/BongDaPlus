package com.dtui.rank;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.dtui.FragmentPagerAdapter.RankPagerAdapter;
import com.dtui.bongdaplus.R;

public class RankFragment extends Fragment {

	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private RankPagerAdapter adapter;

	private int currentColor = 0xFF5161BC;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_rank, container, false);

		tabs = (PagerSlidingTabStrip) rootView.findViewById(R.id.tabs);
		pager = (ViewPager) rootView.findViewById(R.id.pager);
		adapter = new RankPagerAdapter(getActivity().getSupportFragmentManager());

		pager.setAdapter(adapter);

		tabs.setViewPager(pager);
		
		tabs.setIndicatorColor(currentColor);
		tabs.setTextColor(currentColor);
		tabs.setBackgroundColor(getResources().getColor(R.color.tabs));
		tabs.setDividerColor(currentColor);
		
		return rootView;
	}

}