package com.redhat.gss.diagnostics;
import java.util.Locale;

/*
 * Simple utility that takes an input string and then uses the
 * toLowerCase and toUpperCase methods to convert the case of the
 * provided string. The default locale is used followed by
 * Locale.ENGLISH. 
 *
 * The expected usage would be something like:
 *
 *     LANG=tr_TR java -cp string-locale-handling.jar com.redhat.gss.diagnostics.LocaleStringTests eviction id
 *
 * Which would provide the output:
 *
 *     Default Locale: tr_TR
 *     String: eviction, id
 *     String.toLowerCase(): eviction, id
 *     String.toLowerCase(Locale.ENGLISH): eviction, id
 *     String.toUpperCase(): EV�CT�ON, �D
 *     String.toUpperCase(Locale.ENGLISH): EVICTION, ID
 *     
 */
public class LocaleStringTests {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("No input string provided.");
			System.exit(1);
		}
		String inputString = String.join(", ", args);
		System.out.printf("Default Locale: %s%s", Locale.getDefault().toString(), System.lineSeparator());
		System.out.printf("String: %s%s", inputString.toString(), System.lineSeparator());
		System.out.printf("String.toLowerCase(): %s%s", inputString.toLowerCase(), System.lineSeparator());
		System.out.printf("String.toLowerCase(Locale.ENGLISH): %s%s", inputString.toLowerCase(Locale.ENGLISH), System.lineSeparator());
		System.out.printf("String.toUpperCase(): %s%s", inputString.toUpperCase(), System.lineSeparator());
		System.out.printf("String.toUpperCase(Locale.ENGLISH): %s%s", inputString.toUpperCase(Locale.ENGLISH), System.lineSeparator());
	}

}
