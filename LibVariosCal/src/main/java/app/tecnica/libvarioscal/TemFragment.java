package app.tecnica.libvarioscal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TemFragment extends Fragment {

    private Button mCalcular;
    private EditText mTemperatura;



    public TemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tem, container, false);
        mCalcular = view.findViewById(R.id.resultado);
        mTemperatura = view.findViewById(R.id.temperatua);
        mCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temperatua = Double.parseDouble(mTemperatura.getText().toString());
                mTemperatura.setText(Double.toString( (temperatua*9/5)+32));
            }
        });

        return view;
    }
}