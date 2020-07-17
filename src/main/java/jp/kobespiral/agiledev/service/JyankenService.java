package jp.kobespiral.agiledev.service;

import org.springframework.stereotype.Service;

@Service
public class JyankenService {

  private int userHand;

  public String saveHand(int hand) {
    userHand = hand;
    switch (userHand) {
      case 0:
        return "グー";
      case 1:
        return "チョキ";
      case 2:
        return "パー";
      default:
        return "エラー";
    }

  }

}
