String Locale Handling is a simple utility that takes an input string and then uses the `toUpperCase` and `toLowerCase` method to display the converted string using the default locale and then again using `Locale.ENGLISH`.

## Purpose

When an implementation or application is expected to run globally, the language and locale where the application is being executed cannot always be predicted. Therefore, such applications and libraries need to implement proper locale handling and realize that many generic string functions require explicit locale handling. For example, when converting a string to upper or lower case, the locale must be specified so that case changes are made with knowledge of the locales alphabet. 

The purpose of this utility is to allow you to easily see how a string passed to the `toUpperCase` and `toLowerCase` methods get converted using the system's default locale along with the same conversion using an explicit English locale.

## Usage

The expected usage would be something like:

    LANG=tr_TR java -cp string-locale-handling.jar com.redhat.gss.diagnostics.LocaleStringTests eviction id

Which would provide the output:

    Default Locale: tr_TR
    String: eviction, id
    String.toLowerCase(): eviction, id
    String.toLowerCase(Locale.ENGLISH): eviction, id
    String.toUpperCase(): EV�CT�ON, �D
    String.toUpperCase(Locale.ENGLISH): EVICTION, ID
