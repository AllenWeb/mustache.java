package com.github.mustachejava;

import java.util.HashMap;
import java.util.List;

public class Node extends HashMap<String, List<Node>> {
  public final String value;

  public Node() {
    value = null;
  }

  public Node(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + value;
  }
}