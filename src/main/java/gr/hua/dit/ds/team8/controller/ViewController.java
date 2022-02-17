package gr.hua.dit.ds.team8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.OnError;

@Controller
public class ViewController {

    @RequestMapping ("/letter_request*")
    public String LetterRequest() {
        return "letter_request";
    }

    @RequestMapping ("/letter_check*")
    public String LetterCheck() {
        return "letter_check";
    }
}