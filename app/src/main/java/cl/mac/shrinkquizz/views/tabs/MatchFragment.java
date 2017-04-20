package cl.mac.shrinkquizz.views.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import cl.mac.shrinkquizz.R;
import cl.mac.shrinkquizz.data.MatchResult;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance(){
        return new MatchFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final TextView userTv = (TextView) view.findViewById(R.id.userTv);
        final SeekBar userSb = (SeekBar) view.findViewById(R.id.userSb);

        userSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                userTv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "empezo", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "termino", Toast.LENGTH_SHORT).show();
            }
        });

        final TextView loverTv = (TextView) view.findViewById(R.id.loverTv);
        final SeekBar loverSb = (SeekBar) view.findViewById(R.id.loverSb);

        loverSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                loverTv.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        Button button = (Button) view.findViewById(R.id.matchBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int user = userSb.getProgress();
                int lover = loverSb.getProgress();

                showResult(user, lover);
            }
        });



    }

    private void showResult(int user, int lover){
        new AlertDialog.Builder(getActivity())
                .setTitle("Son una pareja:")
                .setMessage(new MatchResult(user, lover).result())
                .show();
    }




}
