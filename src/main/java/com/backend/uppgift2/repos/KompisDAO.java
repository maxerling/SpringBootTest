package com.backend.uppgift2.repos;

import com.backend.uppgift2.models.Kompis;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-08
 * Copyright: MIT
 * Class: Java20B
 */
public class KompisDAO {
    private List<Kompis> kompisar = new ArrayList<>();
    private List<String> streetAddress = new ArrayList<>();
    private List<String> streetAddress2 = new ArrayList<>();
    private List<String> streetAddress3 = new ArrayList<>();
    private List<String> streetAddress4 = new ArrayList<>();

    private List<String> phoneNumbers = new ArrayList<>();
    private List<String> phoneNumbers2 = new ArrayList<>();
    private List<String> phoneNumbers3 = new ArrayList<>();
    private List<String> phoneNumbers4 = new ArrayList<>();
    public List<Kompis> getAllKompisar() {
        streetAddress.add("Läktargatan 29");
        streetAddress.add("Fälloheden 91");
        phoneNumbers.add("606-661-8603");
        phoneNumbers.add("518-955-4613");
        System.out.println(streetAddress);
        kompisar.add(new Kompis(1,"Adam","Adde","1998-01-02",streetAddress,phoneNumbers));
        streetAddress.clear();
        System.out.println(streetAddress);
        streetAddress2.add("Trädgårdsgatan 48");
        streetAddress2.add("Morvall Färilavägen 20");
        phoneNumbers2.add("0156-2925317");
        phoneNumbers2.add("016-8228074");
        System.out.println(streetAddress);
        kompisar.add(new Kompis(2,"Erik","Erre","2000-10-30",streetAddress2,phoneNumbers2));

        streetAddress3.add("Främsteby Vena 81");
        streetAddress3.add("Kläppinge 6");
        phoneNumbers3.add("0303-5853842");
        kompisar.add(new Kompis(3,"Henrik","Henkan","1990-01-03",streetAddress3,phoneNumbers3));

        streetAddress4.add("Föreningsgatan 53");
        streetAddress4.add("Idvägen 13");
        phoneNumbers4.add("0454-9136311");
        kompisar.add(new Kompis(4,"Fabio","Febbe","1994-03-23",streetAddress4,phoneNumbers4));

        streetAddress.add("Edeby 98");
        phoneNumbers.add(null);
        kompisar.add(new Kompis(5,"Stig","Stickan","1993-08-12",null,null));

        return kompisar;

    }

    public Date dataFormatter(String yyyyMMDD) {
        DateFormat Dateformatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fd = Dateformatter.parse(yyyyMMDD);

            return fd;
        } catch (ParseException parseExc) {
            parseExc.printStackTrace();

        }

        return null;
    }
}


