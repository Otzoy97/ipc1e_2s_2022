package edu.usac.ipc1e;

import org.openjdk.jol.vm.VM;

/**
 * Esta clase sirve para demostrar como Java maneja las cadenas
 */
public class StringPool {
    public static void main(String[] args) {
        String str0 = new String("hello world");
        String str1 = "hello";
        str1 = "hello world";
        long currentMemmoryAddressOfStr1 = VM.current().addressOf(str1);
        str1 = "hello world from";
        str1 = "hello world from java";
        String str2 = new String("hello world");
        String str3 = "hello world";

        System.out.println("Dirección de memoria de str0 " + VM.current().addressOf(str0));
        System.out.println("Dirección de memoria de str1 cuando era igual a \"hello world\" " + currentMemmoryAddressOfStr1);
        System.out.println("Dirección de memoria de str1 actual " + VM.current().addressOf(str1));
        System.out.println("Dirección de memoria de str2 " + VM.current().addressOf(str2));
        System.out.println("Dirección de memoria de str3 " + VM.current().addressOf(str3));
        
    }
}

