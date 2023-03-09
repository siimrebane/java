package ee.bcs.java.solution;

public class LessonA {
    public static int e1(int a) {
        // tagasta vastasmärgiline arv
        return -a;
    }

    public static int e2(int a, int b) {
        // tagasta kahe arvu keskmine
        return (a + b) / 2;
    }

    public static int e3(int x) {
        // lahuta sisendist 5 ja siis korruta 99
        return (x-5)*99;
    }

    public static int e4(int a1, int b1, int a2, int b2, int a3, int b3) {
        // korruta a1 b1-ga, a2 b2-ga jne. Ning siis liida saadud numbrid
        return a1*b1 + a2*b2 + a3*b3;
    }

    public static int e5() {
        // return the answer to the Life, the Universe, and Everything.
        return 42;
    }

    public static boolean e6(int x) {
        // Kas arv on liigaasta
        // Wikipeediast:
        // Iga aasta, mis jagub neljaga, on liigaasta (kui ta samal ajal ei jagu sajaga). Kui aasta jagub sajaga ja ei jagu neljasajaga siis ta ei ole liigaasta. Aasta, mis jagub neljasajaga, on alati liigaasta.
        //See tähendab näiteks, et aastad 1984 ja 2000 olid liigaastad, 1900 aga mitte.
        if(x % 400 == 0){
            return true;
        } else if(x % 100 == 0){
            return false;
        } else if(x % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean e7(boolean x) {
        // tagasta x-i vastand väärtus
        return !x;
    }

    /*
    x1      x2      vastus
    false   false   false
    false   true    true
    true    false   true
    true    true    false
    */
    public static boolean e8(boolean x1, boolean x2) {
        if(x1 && x2){
            return false;
        } else if (x1 == false && x2 == false) {
            return false;
        } else {
            return true;
        }
        // tagasta true kui ainult 1 sisend muutujatest on true
    }

    public static boolean e9(boolean x1, boolean x2, boolean x3, boolean x4) {
        // tagasta true kui paaritu arv sisend muutujatest on true
        int count = 0;
        if(x1){
            count ++;
        }
        if(x2){
            count++;
        }
        if(x3){
            count++;
        }
        if(x4){
            count++;
        }
        if(count % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public static void e10(int x[]) {
        // muuda sisend massiivi nii et kõik elemendid oleksid 2x suuremad

    }

    public static void e11(int x[]) {
        // määra sisend massiivi teine element (index 1) 0-iks

    }

    public static void e12(int x[]) {
        // vaheta massiivi esimene ja teine element omavahel

    }

    public static void e13(int x[]) {
        // määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil

    }

    public static void e14(int x[]) {
        // määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
        // määra massiivi neljanda elemendi väärtuseks sama mis kolmandal elemendil
        // määra massiivi kuuenda elemendi väärtuseks sama mis viiendal elemendil
        // määra massiivi kaheksanda elemendi väärtuseks sama mis seitsmendal elemendil

    }

    public static void e15(int x[]) {
        // määra iga teine (indeksid 1, 3, jne) element massiivis samaks, mis oli talle eelnenud elemendi väärtus

    }

}
