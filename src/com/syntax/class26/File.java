package com.syntax.class26;
/*Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
 implementation of open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc*/
public abstract class File {
    public abstract void open();
    public void edit() {
        System.out.println("editing file");
    }
    public void close() {
        System.out.println("closing file");
    }
}
class JavaFile extends File {
    public void open() {
        System.out.println("Opening Java file");
    }
}
class WordFile extends File {
    public void open() {
        System.out.println("Opening Word file");
    }
}
class PdfFile extends File{
    public void open() {
        System.out.println("Opening Pdf file");
    }
}