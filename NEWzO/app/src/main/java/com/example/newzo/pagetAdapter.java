package com.example.newzo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pagetAdapter  extends FragmentPagerAdapter {

   int tabcount;

    public pagetAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new Homefragments();
            case 1:
                return new Sportsfragment();
            case 2:
                return new HealthFragments();
            case 3:
                return new Sciencefragments();

            case 4:
                return new EntertainmentFragments();

            case 5:
                return new TechnologyFragments();

            default:
                return null;



        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
