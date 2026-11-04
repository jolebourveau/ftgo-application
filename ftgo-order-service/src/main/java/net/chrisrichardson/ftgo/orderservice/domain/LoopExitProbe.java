package net.chrisrichardson.ftgo.orderservice.domain;

public class LoopExitProbe {
  public int directBreak() {
    int cursor = 0;
    while (cursor < 6) {
      break;
    }
    return cursor;
  }

  public int directReturn() {
    int cursor = 0;
    while (cursor < 6) {
      return cursor;
    }
    return cursor;
  }
}
