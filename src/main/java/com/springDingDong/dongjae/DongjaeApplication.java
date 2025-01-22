package com.springDingDong.dongjae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springDingDong.dongjae.week1.*;

@SpringBootApplication
public class DongjaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DongjaeApplication.class, args);

//		User user = new User(1, "김동재", "서버");
//		user.introduce();
//
//		user.setName("장한영");
//		user.setPart("기획");
//
//		String name = user.getName();
//		System.out.println("name = " + name);
//		user.introduce();
//
//		UserServiceImpl userService = new UserServiceImpl();
//
//		String club = userService.CLUB;
//		System.out.println(club);
//
//		userService.introduce("김동재", 26, "ENTJ");
//		userService.getInfo(5, "server");
//
//		// 정적 메소드는 인터페이스에서만 호출 가능
//		userService.getPDA();
//
//		Server server = new Server("김동재", "스프링딩동");
//		String serverName = server.getName();
//		String serverStudy = server.getStudy();
//		System.out.println("name = " + serverName + " study = " + serverStudy);
//
//		PrintObject<Integer> object1 = new PrintObject<>(5);
//		PrintObject<String> object2 = new PrintObject<>("server");
//		object1.printData();
//		object2.printData();


	}

}
