package com.fasttrack.regex;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Ana are 23 de mere me.";

        // oricare dintre caractere
        System.out.println(text.replaceAll("[am]", "*"));

        // orice caracter ce nu e intre paranteze
        System.out.println(text.replaceAll("[^am]", "*"));

        // orice caracter din range-ul ASCII
        System.out.println(text.replaceAll("[0-9]", "*"));
        System.out.println(text.replaceAll("[a-e]", "*"));
        System.out.println(text.replaceAll("[a-eA-E]", "*"));

        // orice caracter dintre cele enumerate
        System.out.println(text.replaceAll("(0|1|2|3|4|5|6|7|8|9)", "*"));

        // orice caracter
        System.out.println(text.replaceAll(".", "*"));

        // orice cifra
        System.out.println(text.replaceAll("\\d", "*"));

        // orice punct
        System.out.println(text.replaceAll("\\.", ","));

        // de zero sau de mai multe ori orice caracter
        // un cuvant care incepe cu m si se termina cu e???
        System.out.println(text.replaceAll("\bm.*e\b", "*"));
        // o data sau de mai multe ori orice caracter
        System.out.println(text.replaceAll("m.+e", "*"));

        // incepe cu A
        System.out.println(Pattern.matches("^A.*", text));

        // se termina cu punct
        System.out.println(Pattern.matches(".*\\.$", text));
    }
}
