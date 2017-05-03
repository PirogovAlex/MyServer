package com.firstpackage.controller;

///
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/reminder"})
@ResponseBody
public class ReminderController {
    public ReminderController() {
    }

    @RequestMapping(
            value = {"/get"},
            method = {RequestMethod.GET}
    )
    public String getReminder(ModelMap model) {
        return "MyReminder first good deployment  ";
    }
}
