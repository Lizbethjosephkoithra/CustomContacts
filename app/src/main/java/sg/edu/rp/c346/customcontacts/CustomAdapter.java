package sg.edu.rp.c346.customcontacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17041061 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactItem> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);

        ContactItem currentItem = contactList.get(position);
        String name = currentItem.getName();
        int code = currentItem.getCode();
        int num = currentItem.getNumber();
        tvName.setText(name);
        tvCode.setText("+"+code+"");
        tvNum.setText(num+"");

        return rowView;

    }

}
