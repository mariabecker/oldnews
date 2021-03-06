package oldnews.de.oldnews;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;

import java.net.URL;


/**
 * Created by maike on 12.11.17.
 */

public class FeedFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private FeedAdapter mFeedAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recylerview);
        mFeedAdapter = new FeedAdapter("all");
        mRecyclerView.setAdapter(mFeedAdapter);



        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        return view;
    }

}
