package p12;

class Serigala {

    String warnaBulu = "Abu-abu";
    String Serigala = "Timur";

    void lari() {

        System.out.println("Serigala " + Serigala + " berbulu " + warnaBulu +" sedang berlari");

    }

    void jalan() {

        System.out.println("Serigala " + Serigala + " berbulu  " + warnaBulu +" sedang berjalan");
    } 

    void makan() {

        System.out.println("Serigala " + Serigala + " berbulu " + warnaBulu +" sedang makan");
    } 


    public static void main(String[] args) {

     new Lamp();

        Serigala serigalaTimur = new Serigala();

        serigalaTimur.lari();
        serigalaTimur.jalan();
        serigalaTimur.makan();

    }

}
