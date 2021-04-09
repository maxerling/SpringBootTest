package com.backend.uppgift2.controllers;

import com.backend.uppgift2.models.Book;
import com.backend.uppgift2.models.Kompis;
import com.backend.uppgift2.repos.KompisDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-08
 * Copyright: MIT
 * Class: Java20B
 */

@RestController
public class KompisController {

    KompisDAO dao = new KompisDAO();
    List<Kompis> kompisar  = dao.getAllKompisar();

    @RequestMapping("/kompis/{id}")
    public Kompis getKompisById(@PathVariable int id) {
        for (Kompis el : kompisar) {
            if(el.getId() == id) {
                return el;
            }
        }

        return null;
    }

    @RequestMapping("/kompis/{id}/delete")
    public String deleteBookById(@PathVariable int id) {
        int index = -1;

        for (Kompis el : kompisar) {
            if(el.getId() == id) {
               index = kompisar.indexOf(el);
            }
        }

        kompisar.remove(index);
        return "Kompisen med id:" + id + " är borttagen";
    }

    @RequestMapping("/kompisar")
    public List<Kompis> getAllKompisar() {
        return kompisar;
    }

    @RequestMapping("/html")
    public String getHTML() {
        Kompis k = getKompisById(2);
        String fullText = "Namn: " + k.getName() + "\nNummer: ";
        for (String number : k.getPhoneNumbers()) {
            fullText += number + "\n";


        };
        return fullText;
    }

    @PostMapping("/kompis/add")
    public String addKompis(@RequestBody Kompis k) {
        kompisar.add(k);
        return "kompis added";
    }


    @PostMapping("/kompis/upsert")
    public String upsertBook(@RequestBody Kompis k) {
        int indexToUpdate = -1;

        for (int i = 0; i < kompisar.size();i++) {
            if (kompisar.get(i).getId() == k.getId()) {
                indexToUpdate = i;
            }


        }

        if (indexToUpdate == -1) {
            kompisar.add(k);
        } else {
            kompisar.set(indexToUpdate,k);
        }
        return "kompis upsert";
    }

}
