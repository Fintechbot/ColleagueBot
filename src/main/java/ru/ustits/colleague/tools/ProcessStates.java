package ru.ustits.colleague.tools;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author ustits
 */
@Getter
@RequiredArgsConstructor
public enum ProcessStates {

  ALL(new AllTriggers(), "all"),
  RANDOM(new RandomTrigger(), "random");

  private final ProcessingStrategy strategy;
  private final String name;

}
