package za.co.fnb.nav.is.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.co.fnb.nav.is.joke.services.JokeService;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public ModelAndView showJoke(ModelAndView model){
        model.setViewName("chucknorris");
        model.addObject("joke",jokeService.getJokes());
        return model;
    }
}
