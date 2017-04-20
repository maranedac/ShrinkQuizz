package cl.mac.shrinkquizz.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.mac.shrinkquizz.views.tabs.LuckyFragment;
import cl.mac.shrinkquizz.views.tabs.MatchFragment;
import cl.mac.shrinkquizz.views.tabs.PartyFragment;

/**
 * Created by Michael on 06-04-2017.
 */ //este es el que esta colocando el fragment
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return PartyFragment.newInstance();
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

    //este metodo es el que devuelve la cantidad de fragmentos.
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Party";
            case 1:
                return "Lucky";
            case 2:
                return "Match";
        }
        return null;
    }
}
