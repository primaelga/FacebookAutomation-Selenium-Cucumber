package com.facebook.automation.FacebookAutomation.utilities;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.text.RandomStringGenerator;

import com.github.javafaker.Faker;

public class Helper {

	public String generatePhoneNumberRandom() {

		long number = 0;
		Boolean isValid = false;

		number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		String tempPhoneNumber = "8" + String.valueOf(number);
		return "08" + String.valueOf(number);
	}

	public String generateEmailRandom() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString() + "@gmail.com";
		return saltStr;
	}

	public HashMap generateString() {
		HashMap result = new HashMap();
		Faker faker = new Faker();

		String firstName = faker.name().firstName().replaceAll("[^a-zA-Z0-9\\s+]", "");
		String lastName = faker.name().lastName().replaceAll("[^a-zA-Z0-9\\s+]", "");

		result.put("firstName", firstName);
		result.put("lastName", lastName);

		return result;
	}

	public static int generateRandomNumber(int max) {
		int random = (int) (Math.random() * max + 1);
		return random;
	}

	public static boolean listContainString(List<String> arrStr, String keyword) {
		boolean isContain = arrStr.contains(keyword);
		return isContain;
	}

	public static String generatePwd() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
		String randomLetters = generator.generate(20);
		return randomLetters;
	}
}
