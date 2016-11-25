package com.allstate.xp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    private final RequestRepository requestRepository;

    @Autowired
    MainController(final RequestRepository requestRepository) {

        requestRepository.deleteAll();

        this.requestRepository = requestRepository;
    }




    @RequestMapping("/")
    String index(@RequestParam Map<String, String> params, Model model) {
        String allParams = params.toString();
        model.addAttribute("params", allParams);
        System.out.println("Request String was:" + allParams);
        requestRepository.save(new OurReqParams(allParams));


        List<OurReqParams> everything = requestRepository.findAll();
        model.addAttribute("everything", everything);



        return "home/index";
    }
}
