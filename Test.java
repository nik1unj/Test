package com.nsr.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.gtranslate.Language;
import com.gtranslate.Translator;

public class Test {


		public static void test(){
			System.out.printn("Nikunj Ramani");
		}



    public static void main(String[] args) throws IOException {
       // String text = "Hello world!";
       new Test().test();
        Translator translate = Translator.getInstance();
        String text = translate.translate("Hello!", Language.ENGLISH, Language.ROMANIAN);
        System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
    }


}
