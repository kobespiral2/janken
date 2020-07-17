package jp.kobespiral.agiledev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.kobespiral.agiledev.service.JyankenService;

@Controller
public class JyankenController {

  @Autowired
  private JyankenService js;

  @GetMapping("/game")
  public String postHand(@RequestParam(name = "hand", required = false) Integer hand, Model model) {
    if (hand != null)
      model.addAttribute("userHand", js.saveHand(hand));
    else
      model.addAttribute("userHand", "sashimi");
    return "game";
  }

  // @GetMapping("/game")
  // public String postHand(Model model) {
  // model.addAttribute("userHand", "sashimi");
  // return "game";
  // }
}
