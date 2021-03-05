package com.latihantugas.tugasioc;

public class tugas {
    public static void main (String [] args)
    {
        Mobil mobil = new Mobil();
        mobil.add("Fortuner");
    }
}

class Mobil {
    Database database;
public Mobil () {
    database = new Database();
}
public void add (String data){
    database.tampilkan(data);
    }
}

class Database{
public void tampilkan(String data){
System.out.println(data);
}
}

