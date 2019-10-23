package Teori;

class DataShinobi {
    private String noRegistrasi, namaShinobi, peringkatShinobi;

    DataShinobi(){}

    /**
     * @param noRegistrasi the noRegistrasi to set
     */
    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    /**
     * @param namaShinobi the namaShinobi to set
     */
    public void setNamaShinobi(String namaShinobi) {
        this.namaShinobi = namaShinobi;
    }

    /**
     * @param peringkatShinobi the peringkatShinobi to set
     */
    public void setPeringkatShinobi(String peringkatShinobi) {
        this.peringkatShinobi = peringkatShinobi;
    }

    /**
     * @return the noRegistrasi
     */
    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    /**
     * @return the namaShinobi
     */
    public String getNamaShinobi() {
        return namaShinobi;
    }

    /**
     * @return the peringkatShinobi
     */
    public String getPeringkatShinobi() {
        return peringkatShinobi;
    }
}

class Shinobi{
    public static void main(String[] args) {
        DataShinobi[] shinobis = new DataShinobi[3];

        shinobis[0] = new DataShinobi();
        shinobis[1] = new DataShinobi();
        shinobis[2] = new DataShinobi();

        //  set for 1st shinobi
        shinobis[0].setNoRegistrasi("012606");
        shinobis[0].setNamaShinobi("Uchiha Sasuke");
        shinobis[0].setPeringkatShinobi("Genin");

        //  set for 2nd shinobi
        shinobis[1].setNoRegistrasi("012607");
        shinobis[1].setNamaShinobi("Uzumaki Naruto");
        shinobis[1].setPeringkatShinobi("Genin");

        //  set for 3rd shinobi
        shinobis[2].setNoRegistrasi("012601");
        shinobis[2].setNamaShinobi("Haruno Sakura");
        shinobis[2].setPeringkatShinobi("Chunin");

        for (DataShinobi dataShinobi : shinobis) {
            System.out.println("No Registrasi : " + dataShinobi.getNoRegistrasi());
            System.out.println("Nama : " + dataShinobi.getNamaShinobi());
            System.out.println("Peringkat : " + dataShinobi.getPeringkatShinobi());

            System.out.println();
        }

    }
}