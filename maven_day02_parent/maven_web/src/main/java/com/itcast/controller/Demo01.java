package com.itcast.controller;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Demo01 {
    @Autowired
    private ItemsService service;

    @RequestMapping("/find")
    public String find(Model model){
        Items items = service.find ( 1 );
        model.addAttribute ( "item",items );
        System.out.println ( "items = " + items );
        return "itemDetail";
    }
}
