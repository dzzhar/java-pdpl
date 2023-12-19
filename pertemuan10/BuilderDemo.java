public class BuilderDemo {
    public static void main(String args[]) {
        CDBuilder cdBuilder = new CDBuilder();

        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();

        CDType cdType3 = cdBuilder.buildPolytronCD();
        cdType3.showItems();
    }
}

/**
 * Soal 1
 * output:
 * - CD name : Sony CD, Price : 20
 * - CD name : Samsung CD, Price : 15
 * - CD name : Polytron CD, Price : 26
 */

/**
 * Soal 2
 * class yang terdampak ketika akan menambahkan sebuah class baru adalah
 * - class CDBuilder.java
 * - class BuilderDemo.java
 */

/**
 * Soal 3
 * - abstract class dapat membuat properti atau field sedangkan di interface
 * hanya dapat membuat konstanta saja
 * - abstract class dapat diimplementasikan kode method seperti biasa, sedangkan
 * di interface harus menggunakan default
 * - abstract class bisa punya member private dan protected, sedangkan interface
 * semuanya member public
 * - abstract class diimplementasikan dengan pewarisan (extends), sedangkan
 * interface itu mengimplemens
 *
 * interface harus meng-overide sedangkan untuk abstract itu tidak harus di
 * override
 */