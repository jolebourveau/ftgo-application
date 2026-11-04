package net.chrisrichardson.ftgo.orderservice.domain;

public class LoopExitProbe {
  public int noProgress() {
    int cursor = 0;
    while (cursor < 6) {
      Thread.yield();
    }
    return cursor;
  }
}
