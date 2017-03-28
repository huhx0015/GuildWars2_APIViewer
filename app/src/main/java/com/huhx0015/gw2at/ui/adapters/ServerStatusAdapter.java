package com.huhx0015.gw2at.ui.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.databinding.AdapterServerStatusBinding;
import com.huhx0015.gw2at.models.responses.WorldsResponse;
import com.huhx0015.gw2at.viewmodels.adapters.ServerStatusAdapterViewModel;
import java.util.List;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusAdapter extends RecyclerView.Adapter<ServerStatusAdapter.ServerStatusViewHolder> {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ADAPTER VARIABLES
    private Context mContext;

    // LIST VARIABLES
    private List<WorldsResponse> mWorldList;

    // LOGGING VARIABLES
    private static final String LOG_TAG = ServerStatusAdapter.class.getSimpleName();

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public ServerStatusAdapter(List<WorldsResponse> list, Context mContext) {
        this.mWorldList = list;
        this.mContext = mContext;
    }

    /** RECYCLER VIEW METHODS __________________________________________________________________ **/

    @Override
    public ServerStatusViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterServerStatusBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.adapter_server_status, parent, false);
        return new ServerStatusViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ServerStatusViewHolder holder, int position) {
        String worldId = Integer.toString(mWorldList.get(position).getId());
        String worldName = mWorldList.get(position).getName();
        String worldPopulation = mWorldList.get(position).getPopulation();
        holder.bindView(worldName, worldId, worldPopulation);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mWorldList.size();
    }

    /** SUBCLASSES _____________________________________________________________________________ **/

    class ServerStatusViewHolder extends RecyclerView.ViewHolder {

        private AdapterServerStatusBinding mBinding;

        ServerStatusViewHolder(AdapterServerStatusBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        private void bindView(String worldName, String id, String serverStatus) {
            ServerStatusAdapterViewModel viewModel = new ServerStatusAdapterViewModel(worldName, id, serverStatus);
            mBinding.setViewModel(viewModel);
        }
    }
}
