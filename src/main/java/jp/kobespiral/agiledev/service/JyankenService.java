package jp.kobespiral.agiledev.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class JyankenService {

  private int userHand;
  private int cpuHand;

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

  public String decideCpuHand() {
    cpuHand = new Random().nextInt(3);
    switch (cpuHand) {
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

  /**
   * return 0=引き分け, 1=負け, 2=勝ち
   */
  public String judge() {
    int result = ((userHand - cpuHand + 3) % 3);
    switch (result) {
      case 0:
        return "引き分け";
      case 1:
        return "あなたの負けです";
      case 2:
        return "あなたの勝ちです";
      default:
        return "エラー";
    }

  }

}
