package com.pingosystem.springbootmongodb.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8"); //decode text goog%20morning to == goog morning
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
