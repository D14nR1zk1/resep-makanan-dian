package com.example.windows.resepmakanantugasdian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDeskripsiResep;
    TextView tvNamaResep;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDeskripsiResep = (TextView)findViewById(R.id.DeskripsiResep);
        tvNamaResep = (TextView)findViewById(R.id.NamaResep);
        recyclerView = (RecyclerView)findViewById(R.id.rcResep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] namaResep = {"Otak-otak Bandeng", "Pempek Palembang", "Mie Skutel", "Cream Soup"};
        String[] deskripsiResep = {"Otak-otak Bandeng adalah makanan khas Semarang yang dimana bahan utamanya adalah ikan Bandeng",
                "Pempek Palembang adalah makanan khas Palembang yang bahan utamanya adalah ikan Tengiri dan terdapat cuka sebagai saosnya",
                "Mie Sekutel seperti martabak yang bahan utamanya adalah Mie", "Cream Soup ini adalah soup yang kental dan berisi sayuran serta daging ayam"};

        int[] gambarResep = {R.drawable.otak_icon,R.drawable.pempek_icon,R.drawable.sekutel_icon,R.drawable.creamsoup_icon};
        String[] detailResep = {"Bahan: \n" +
                "- Ikan bandeng segar kualitas terbaik cukup 2 ekor @ 700 gr\n" +
                "- Kentang sebanyak 300gr,goreng dan haluskan\n" +
                "- Kelapa parut sekitar 1sdm,sangrai dan tumbuk sampai berminyak\n" +
                "- Garam sekitar 1sdt\n" +
                "- Merica halus sekitar 1/2sdt\n" +
                "- Telur sebanyak 2 butir,kocok sebentar\n" +
                "- Bawang goreng sebanyak 2sdm,haluskan sesuai selera\n\n" +
                "Cara Membuat: \n" +
                "1. Bersihkan ikan terlebih dahulu, kemudian bersihkan sisik dan bagian isi perutnya. Anda bisa membersihkan ikan bandeng tersebut dengan menggunakan bantuan pisau.\n" +
                "\n" +
                "2. gunakan pisau tadi untuk memotong bagian leher tapi usahakan jangan sampai putus. Setelah itu, tumbuk ikan sampai mengeluarkan daging pada bagian leher tersebut. Dalam menumbuk Anda bisa menggunakan kayu balok atau ulekan agar lebih cepat\n" +
                "\n" +
                "3. Jika sudah keluar, balikan kulit bandeng tadi melalui bagian leher. Keruk daging/duri yang masih menempel pada bagian dinding kulit tersebut. Kemudian bilas dan tiriskan bandeng tersebut\n" +
                "\n" +
                "4. Untuk membuang duri yang ada pada bandeng tersebut, tumislah bersama dengan minyak goreng sedikit. Pastikan menggunakan minyak goreng secukupnya saja dan juga gunakan api sedang. Setelah durinya muncul ke permukaan, buang semua duri tersebut.\n" +
                "\n" +
                "5.campurkan daging ikan bandeng yang sudah terbebas dari duri tadi bersama dengan kentang,  kelapa sangrai, garam, merica, telur, dan bawang goreng. Aduk-aduk semua bahan diatas sampai tercampur merata.\n" +
                "\n" +
                "6.Sekarang, bungkus daging ikan bandeng tadi dengan menggunakan daun pisang atau alumunium foil. Pastikan sebelum membungkus, daun pisang tadi Anda olesi terlebih dahulu dengan minyak goreng (agar tidak lengket).\n" +
                "\n" +
                "7.Siapkan kukusan, kemudian kukus daun pisang yang berisi daging ikan tadi selama lebih kurang 15 menitan. Apabila sudah matang dan berbau harum, angkat dan sisihkan sebentar.\n" +
                "\n" +
                "8.Setelah dingin, lepaskan bungkus daun pisang tersebut. Kemudian goreng dengan minyak secukupnya sampai berubah warna kecoklatan.\n" +
                "\n",
                "Bahan: \n" +
                        "- 1 buah tempe panjang , potong dadu memanjang\n" +
                        "- 3 siung bawang putih , iris tipis\n" +
                        "- 5 buah cabai ijo , potong potong\n" +
                        "- 100 ml kecap manis\n" +
                        "- 3 buah cabai rawit merah , potong potong\n" +
                        "- 3 siung bawang merah , iris tipis\n" +
                        "- minyak untuk menumis secukupnya\n" +
                        "- garam secukupnya\n" +
                        "- secukupnya air untuk campuran \n\n" +
                        "Cara Membuat: \n" +
                        "1. Langkah pertama, Ambil tempe, lalu potong dadu memanjang ,kemudian sisihkan .\n" +
                        "2. Langkah kedua, Tumis bawang putih, cabai ijo, cabai rawit merah dan bawang merah hingga harum, lalu masukan tempe, kemudian aduk aduk dan biarkan hingga warnanya berubah .\n" +
                        "3. Selanjutnya, Beri sedikit kecap manis, lalu aduk aduk hingga merata, kemudian bumbui dengan garam, lalu aduk aduk, dan beri sedikit air untuk kuah.\n" +
                        "4. Terakhir, Masak hingga tempe matang, lalu angkat dan tumis tempe pedas buatan anda pun siap untuk dihidangkan. \n",
                "Bahan Pempek: \n" +
                        "- 300 gram ikan tenggiri, haluskan\n" +
                        "- 1/4 sdt penyedap rasa\n" +
                        "- 2 sdt garam\n" +
                        "- 1 siung bawang putih, haluskan\n" +
                        "- 250 mili liter air\n" +
                        "- 125 gram tepung terigu, berprotein sedang\n" +
                        "- 2 butir telur\n" +
                        "- 1 sdt gula pasir\n" +
                        "- Telur untuk isian\n" +
                        "- 200 gram tepung tapioka/sagu\n" +
                        "- 2 sdm minyak goreng\n" +
                        "- 10 butir bawang merah telah dihaluskan\n" +
                        "- 4 siung bawang putih telah dihaluskan\n" +
                        "- 2 cm jahe\n" +
                        "- 2 cm lengkuas\n" +
                        "- 2 buah cabai merah keriting\n" +
                        "- 1 sdt garam \n\n" +
                        "Bahan Cuka: \n" +
                        "- 50 gram air asam jawa\n" +
                        "- 2 sdm ebi kering yang dihaluskan\n" +
                        "- 250 gram gula merah/aren\n" +
                        "- Cabai rawit haluskan, jumlahnya sesuaikan dengan selera tingkat pedas anda\n" +
                        "- 200 gram bawang putih iris dan cincang halus\n" +
                        "- 1 liter air\n\n" +
                        "Cara Membuat Cuka: \n" +
                        "1. Rebus air bersama asam jawa, gula merah. tunggu hingga mendidih..\n" +
                        "2. Jika sudah mendidih masukkan cabe rawit, garam, bawang putih. Aduk hingga semuanya tercampur rata.\n" +
                        "3. Terakhir angkat dan campurkan dengan ptongan buah timun.\n\n" +
                        "Cara Membuat Pempek: \n" +
                        "1. Pertama-tama didihkan air dan tambahkan garam, penyedap rasa, bawang putih, tepung terigu, gula pasir. Aduk hingga merata dan adonan jadi kental banget. Lalu dinginkan.\n" +
                        "2. Jika sudah dingin tambahkan telur dan ikan tenggiri, uleni hingga adonan terasa lembut dan halus.\n" +
                        "3. Kemudian tambahkan tepung sagu dan aduk rata, uleni secara perlahan saja dan jangan biarkan tepung sagunya tercampur rata. Jika terasa lengket dan susah dibentuk maka tambahkan sedikit tepung sagu lagi agar adonan mudah di bentuk.\n" +
                        "4. Panaskan air untuk merebus, lalu ambil adonan empek-empuk, bentuk menjadi bulat pipih dan isi telur. Kemudian bentuk seperti layaknya pempek kapal selam.\n" +
                        "5. Masukan adonan tersebut ke dalam air yang sudah mendidih, rebus hingga mengapung dan terasa matang adonan serta isi telurnya. Angkat dan tiriskan.\n" +
                        "6. Goreng adonan saat anda ingin menyajikannya, karena lebih enak saat panas-panas dan menyantapnya lebih sedap dengan cuka.\n" +
                        "7. Masak kembali sampai semua bahan matang dan bumbu meresap. Apabila telah seperti itu, anda bisa langsung menyajikannya pada tempat atau wadah saji yang telah disiapkan.",
                "Bahan: \n" +
                        "- 2 bungkus Mie Instant Rebus\n" +
                        "- 2 batang Sosis Sapi\n" +
                        "- 1 batang Wortel\n" +
                        "- 1 buah Bawang Bombay\n" +
                        "- 4 siung Bawang Putih\n" +
                        "- sendok teh Merica (Lada) Bubuk\n" +
                        "- 2 sendok makan Tepung Terigu\n" +
                        "- secukupnya Keju Cheddar\n" +
                        "- secukupnya Garam\n" +
                        "- 3 butir Telur Ayam\n" +
                        "- 250 ml Susu Cair\n" +
                        "- 1 sendok makan Mentega\n" +
                        "- secukupnya Daun Oregano\n\n" +
                        "Cara Membuat: \n" +
                        "1. Rebus mie instant sebentar lalu tiriskan.Panaskan wajan masukkan mentega,tumis bawang bombay,bawang putih lada garam.Masukkan sosis aduk.\n" +
                        "2. Aduk terigu bersama susu cair sampe tidak menggumpal,masukkan dlm tumisan.Masukkan keju,mie instant beserta bumbunya,aduk rata.Bila mulai kesat airnya matikan kompor,masukkan telur yg telah d kocok lepas,aduk rata.\n" +
                        "3. Siapkan pinggan tahan panas..aku pake teflon jadi ndak perlu di oles minyak lagi..masukkan semua tumisan padatkan terakhir taburi dgn keju parut dan oregano bubuk.Panggang 15 menit sampe kuning keemasan...sajikan dgn sambal botol dan mayonaise.\n\n" +
                        "Bahan: \n" +
                        "- 100 gram daging ayam\n" +
                        "- 1 buah wortel\n" +
                        "- 1 batang Wortel\n" +
                        "- 1 buah jagung manis\n" +
                        "- 1 helai bawang prei\n" +
                        "- 1 buah bawang bombay\n" +
                        "- 2 sendok makan Tepung Terigu\n" +
                        "- 200 ml susu full cream bubuk / cair\n" +
                        "- 3 sendok makan tepung maizena\n" +
                        "- 4 siung bawang putih\n" +
                        "- 1 sendok teh lada bubuk\n" +
                        "- 1 sendok teh kaldu ayam bubuk\n" +
                        "- 2 sendok makan garam\n" +
                        "- secukupnya mentega\n\n" +
                        "Cara Membuat: \n" +
                        "1. Cuci bersih dan kemudian iris ayam, wortel di iris kecil-kecil, dan jagung yg sudah dipipil, serta bawang prei yang diiris tipis.\n" +
                        "2. Rebus ayam beserta tulangnya dalam 1liter air. Tumis irisan bawang putih dan bawang bombay sampai harum. Masukan tumisan kedalam rebusan ayam yang telah mengeluarkan kaldunya.\n" +
                        "3. Masukan semua bahan sayuran kedalam rebusan, aduk terus hingga sayuran empuk. Masukkan perlahan susu full cream, Aduk rata. Setelah semua bahan dirasa empuk masukkan garam dan lada. Dan terakhir masukan larutaan tepung maizena. Aduk rata.\n" +
                        "4. Setelah soup dirasa sudah mengental matikan api dan siap dihidangkan."};

        String[] titleBar = {"OTAK-OTAK BANDENG", "PEMPEK PALEMBANG", "MIE SEKUTEL", "CREAM SOUP"};
        ArrayList<Resep> resepArrayList = new ArrayList<>();

        for (int i = 0; i<namaResep.length; i++){
            Resep resep = new Resep(namaResep[i],deskripsiResep[i],gambarResep[i],detailResep[i],titleBar[i]);
            resepArrayList.add(resep);
        }
        ResepAdapter resepAdapter = new ResepAdapter(this, resepArrayList);
        recyclerView.setAdapter(resepAdapter);
    }
}
