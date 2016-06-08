package androidthreelayout.tqp.com.coordinatorlayout;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2015/8/4.
 */
public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder> {
    private List<String> listData;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(View v){
            super(v);
            mTextView = (TextView) v.findViewById(R.id.item);
//            mTextView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(,TestActivity.class);
//                }
//            });
        }
    }
    public recyclerViewAdapter(List<String> listData){
        this.listData = listData;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(viewGroup.getContext() ,TestActivity.class);
                viewGroup.getContext().startActivity(intent);
            }
        });
        ViewHolder hoder = new ViewHolder(view);
        return hoder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mTextView.setText(listData.get(i));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
