package com.springDingDong.dongjae.week1;

public interface UserInterface {
    String CLUB = "PDA";

    void introduce(String name, int age, String mbti);

    default void getInfo(int generation, String part) {
        System.out.println("PDA " + generation + "기 " + part + " 파트입니다.");
    }

    static void introducePDA() {
        System.out.println("레쓰고 프디아");
    }
}
