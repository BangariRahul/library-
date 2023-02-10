package com.example.library.controller;

import com.example.library.model.Library;
import com.example.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api/Library")
public class LibraryController {
    @Autowired LibraryService libraryService;
@GetMapping(value = "/{name}")
    public Library user(@PathVariable String name){
        return libraryService.getLibrary(name);
    }
    @PostMapping(value = "add")
    public String addlib(@RequestBody Library lib){

    libraryService.addLib(lib);
    return "NEW LIBRARY ADDED";
    }
    @PutMapping(value = "Update/{name}")
    public String updatelib(@PathVariable String name , @RequestBody Library lib){
    libraryService.UpdateLib(name , lib);
    return "LIBRARY UPDATED";
    }
    @GetMapping(value = "delete")
    public String delete(@PathVariable String name){
    libraryService.deleteLib(name);
    return "LIBRARY DELETED";

    }
}
