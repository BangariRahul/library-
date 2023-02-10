package com.example.library.service;

import com.example.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService {
    public static final ArrayList<Library> library = new ArrayList<>();

    static{
        Library l1 = new Library("Apj" , "haryana", 12345, "science " );
         library.add(l1);
        Library l2 = new Library("gandhi" , "Delhi", 54321, "history" );
        library.add(l2);
        Library l3 = new Library("gurudev" , "punjab", 13333, "economics" );
        library.add(l3);
    }
public Library getLibrary(String name){
        for(Library l :library){
            if(l.getName().equals(name)){
                return l;
            }
        }
        System.out.print("NO LIBRARY FOUND");
        return null;
}
public void addLib(Library lib){
        library.add(lib);
}
public void UpdateLib(String name, Library lib){
        for(Library li : library){
            if(li.getName().equals(name)){
                li.setName(lib.getName());
                li.setAddress(lib.getAddress());
                li.setNumber(lib.getNumber());
                li.setFacilities(lib.getFacilities());
            }
        }
}
public void deleteLib(String name){
        for(Library li : library){
            if(li.getName().equals(name)){
                library.remove(li);
            }
        }
}
}
