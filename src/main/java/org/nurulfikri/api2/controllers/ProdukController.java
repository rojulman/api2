package org.nurulfikri.api2.controllers;

import org.nurulfikri.api2.models.Produk;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdukController {

    @RequestMapping("/hello")
    public String hello(){
        return new String("Selamat Belajar");
    }

    @RequestMapping("/produk")
    public List<Produk> loadProduk(){
        List<Produk> ls = new ArrayList<>();
        Produk p1 = new Produk();
        p1.setId(new Long(1));
        p1.setKode("K001");
        p1.setNama("TV");
        p1.setHarga(3500000);

        Produk p2 = new Produk();
        p2.setId(new Long(2));
        p2.setKode("K002");
        p2.setNama("Kulkas");
        p2.setHarga(8500000);

        ls.add(p1);
        ls.add(p2);
        return ls;
    }


}
