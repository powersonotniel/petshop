package com.example.rumahmakan;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class menu<context> extends AppCompatActivity {

    ListView lst;


    String nama_makanan[] = {"Anakan Pomeranian", "French Bulldog", " Supertiny Red Poodle", "Anakan Golden", "Anakan Corgie Betina", "Mini Shih Tzu",
            "Puppy's Bichon Frise Jantan", "Puppy Corgi Sable Color", "Pejantan Samoyed", "Pejantan English Bulldog", "Chow Chow Remaja"};

    String harga_makanan[] = {"Hubungi : 0812 9629 2917", "Hubungi : 0822 1308 5213", "Hubungi : 0812 7380 9296", "Hubungi : 0896 7739 0403", "Hubungi : 0812 8123 8624", "Hubungi : 0812 4563 7546",
            "Hubungi : 0899 6867 965", "Hubungi : 0812 8123 8623", "Hubungi : 0813 1114 321", "Hubungi : 0812 8123 8624", "Hubungi : 0899 6867 965"};

    int gambar_makanan[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j,
            R.drawable.k};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lst = (ListView) findViewById(R.id.listmakanan);

        CustomListview customListview=new CustomListview(this,nama_makanan,harga_makanan,gambar_makanan);
        lst.setAdapter(customListview);

    }
}
//        MyAdapter adapter = new MyAdapter(this, nama_makanan, harga_makanan, gambar_makanan);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                if (position == 0) {
//                    Toast.makeText(menu.this, "bakso description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, " gado-gado description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "gorengan description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, " gudeg description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "ketoprak description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "bakso description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "nasi kuning description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "opor ayam description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "otak-otak description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "pecel lele description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "pempek description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "rawon description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "rendang description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "sate description", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//    }
//
//    class MyAdapter extends ArrayAdapter<String> {
//
//        Context context;
//        String rnama_makanan[];
//        String rharga_makanan[];
//        int rgambar_makanan[];
//
//        MyAdapter(context c, String nama_makanan[], String harga_makanan[], int gambar_makanan[]) {
//            super((Context) c, R.layout.row, R.id.txtmakanan, nama_makanan);
//            this.context = (Context) c;
//            this.rnama_makanan = nama_makanan;
//            this.rharga_makanan = harga_makanan;
//            this.rgambar_makanan = gambar_makanan;
//
//        }
//
//        @SuppressLint("ViewHolder")
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            @SuppressLint("ViewHolder") View row;
//            row = LayoutInflater.inflate(R.layout.row, parent, false);
//            ImageView images = row.findViewById(R.id.image);
//            TextView mynama_makanan = row.findViewById(R.id.txtmakanan);
//            TextView myharga_makanan = row.findViewById(R.id.txtharga);
//
//
//            images.setImageResource(rgambar_makanan[position]);
//            mynama_makanan.setText(rnama_makanan[position]);
//            myharga_makanan.setText(rharga_makanan[position]);
//
//
//            return row;
//        }
//    }
//}
   // }