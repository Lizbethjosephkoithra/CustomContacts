package sg.edu.rp.c346.customcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<ContactItem> alContacts;
    CustomAdapter caContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts=findViewById(R.id.listViewConatcts);
        alContacts=new ArrayList<>();
        ContactItem item1=new ContactItem("Mary",+65,65442334);
        ContactItem item2=new ContactItem("Ken",+65,97442437);


        alContacts.add(item1);
        alContacts.add(item2);
        caContacts=new CustomAdapter(this,R.layout.layout01,alContacts);
        lvContacts.setAdapter(caContacts);

    }
}
