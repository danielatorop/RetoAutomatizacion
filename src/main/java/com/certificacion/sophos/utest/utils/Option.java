package com.certificacion.sophos.utest.utils;

public enum Option {
  PAGE("https://www.utest.com/");
  private final String URL;

    Option(String url) {
        URL = url;
    }

    public String URL() {
        return URL;
    }
}
