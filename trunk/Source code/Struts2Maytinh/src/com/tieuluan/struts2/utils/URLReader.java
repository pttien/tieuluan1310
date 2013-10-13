package com.tieuluan.struts2.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	public static StringBuilder readDataFromUrl(String url) throws Exception {
		StringBuilder data = new StringBuilder();
        URL address = new URL(url);
        URLConnection yc = address.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream(),"UTF-8"));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
        	data.append(inputLine);
        in.close();
        return data;
    }
	
}
