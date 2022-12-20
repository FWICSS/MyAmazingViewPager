package com.openclassrooms.myamazingviewpager.Adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import com.openclassrooms.myamazingviewpager.Controllers.Fragments.NewsPageFragment;
import com.openclassrooms.myamazingviewpager.Controllers.Fragments.PageFragment;
import com.openclassrooms.myamazingviewpager.Controllers.Fragments.ParamPageFragment;
import com.openclassrooms.myamazingviewpager.Controllers.Fragments.ProfilePageFragment;


public class PageAdapter extends FragmentPagerAdapter {

    //Array of colors that will be passed to PageFragment
    //private int[] colors;

    //Default Constructor
    public PageAdapter(FragmentManager mgr/*, int[] colors*/) {
        super(mgr);
        //this.colors = colors;
    }

    @Override
    public int getCount() {
        return(3); //Number of page to show
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: //Page 1
                return NewsPageFragment.newInstance();
            case 1: //Page 2
                return ProfilePageFragment.newInstance();
            case 2:
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: //Page 1
                return "Fil d'actualité";
            case 1: //Page 2
                return "Profil";
            case 2:
                return "Paramètre";
            default:
                return null;
        }
    }


}
