package androidthreelayout.tqp.com.coordinatorlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2015/8/4.
 */
public class viewPagerAdapeter extends FragmentPagerAdapter {
    private List<Fragment> list;

    public viewPagerAdapeter(android.support.v4.app.FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.list = fragments;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "tab" + position;
    }

}
