package com.cognizant.factorymethod;

public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        Document word = DocumentFactory.createDocument("WORD");
        word.open();

        Document pdf = DocumentFactory.createDocument("PDF");
        pdf.open();

        Document excel = DocumentFactory.createDocument("EXCEL");
        excel.open();
    }
}