package com.huhx0015.mgw2s.utils;

import com.huhx0015.mgw2s.R;
import com.huhx0015.mgw2s.constants.GW2Constants;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class DrawableReferenceUtils {

    public static int getPopulationStatusDrawable(String status) {
        switch (status) {
            case GW2Constants.POPULATION_LOW:
                return R.drawable.selector_server_status_pop_low;
            case GW2Constants.POPULATION_MEDIUM:
                return R.drawable.selector_server_status_pop_medium;
            case GW2Constants.POPULATION_HIGH:
                return R.drawable.selector_server_status_pop_high;
            case GW2Constants.POPULATION_VERYHIGH:
                return R.drawable.selector_server_status_pop_veryhigh;
            case GW2Constants.POPULATION_FULL:
                return R.drawable.selector_server_status_pop_full;
            default:
                return R.drawable.selector_server_status_pop_offline;
        }
    }
}
