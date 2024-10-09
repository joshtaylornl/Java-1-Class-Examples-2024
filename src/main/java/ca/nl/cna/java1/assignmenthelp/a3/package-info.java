/**
 * Invoice System
 * Build three objects (Product, InvoiceItem and Invoice) to represent a simple invoice. Create an Invoice
 * Tester application which can be used to play with invoices. In the test class create products and print out
 * their values – test for edge cases with negative numbers. Create invoice items and an invoice and print
 * out the details of each.
 * Product Class
 * Create a class called Product which has three attributes: id (int), description (String) and price (double).
 * Create a constructor that takes in all three attributes and create a getting and setter for each. Don’t let
 * the id attribute or the price be negative. (Note: I completed this class during course lectures – feel free
 * to check the recordings on D2L)
 * InvoiceItem Class
 * Create a class called InvoiceItem that has two attributes: product (Product class above) and quantity
 * (int). Great getter and setters and a constructor. Create a method called getItemTotal() which calculates
 * the total based on product price and quantity. Don’t let quantity be negative.
 * Invoice Class
 * Create a class call Invoice that has a single instance variables of type InvoiceItem. Add methods to set
 * and get the invoice item. Add a method to get the invoice total (note: it should be the same as the
 * InvoiceItem total). Add these tests to the InvoiceTester class.
 * College of the North Atlantic
 * CP2280 – Object Oriented Programming in Java
 * Assignment 3
 */
package ca.nl.cna.java1.assignmenthelp.a3;