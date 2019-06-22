package sk.lorman.chuck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.lorman.chuck.service.ChuckService;

@Controller
public class ChuckController {

    private ChuckService chuckService;

    public ChuckController(ChuckService chuckService) {
        this.chuckService = chuckService;
    }

    @RequestMapping({"","/"})
    public String getJoke(Model model) {

        model.addAttribute("joke", chuckService.getJoke());

        return "joke";
    }
}
