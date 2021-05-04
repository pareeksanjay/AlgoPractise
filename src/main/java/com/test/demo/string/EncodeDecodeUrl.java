package com.test.demo.string;

import java.util.HashMap;

public class EncodeDecodeUrl {
    public static void main(String[] args) {
        EncodeDecodeUrl encodeDecodeUrl = new EncodeDecodeUrl();
        String url = "https://leetcode.com/problems/design-tinyurl";
        HashMap<String, String> map = new HashMap<>();
        encodeDecodeUrl.encode(url, map);
        System.out.println(encodeDecodeUrl.decode(encodeDecodeUrl.encode(url, map), map));

    }

    public String encode(String longUrl, HashMap<String, String> map) {
        String hasCode = longUrl.hashCode() + "";

        map.put(hasCode, longUrl);

        return hasCode;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl, HashMap<String, String> map) {
        return map.get(shortUrl);
    }
}
