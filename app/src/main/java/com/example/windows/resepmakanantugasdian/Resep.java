package com.example.windows.resepmakanantugasdian;

/**
 * Created by Windows on 07/10/2017.
 */

public class Resep {
    private String namaResep;
    private String deskripsiResep;
    private int gambarResep;
    private String detailResep;
    private String titleResep;

    public Resep(String namaResep,String deskripsiResep, int gambarResep, String detailResep, String titleResep){
        this.namaResep = namaResep;
        this.deskripsiResep = deskripsiResep;
        this.gambarResep = gambarResep;
        this.detailResep = detailResep;
        this.titleResep = titleResep;
    }

    public String getNamaResep(){return namaResep;}
    public String getDeskripsiResep(){return deskripsiResep;}
    public int getGambarResep(){return gambarResep;}
    public String getDetailResep(){return detailResep;}
    public String getTitleResep(){return titleResep;}
}
