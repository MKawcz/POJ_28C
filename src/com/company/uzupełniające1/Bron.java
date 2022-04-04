package com.company.uzupełniające1;

public enum Bron {

        MIECZ ("mieczem",3),
        LUK ("łukiem",1),
        KUSZA("kuszą",2);

        private int obrazenia;
        private String nazwa;
        Bron(String nazwa, int obrazenia){
                this.nazwa = nazwa;
                this.obrazenia = obrazenia;
        }

        public int getObrazenia() {
                return obrazenia;
        }

        public String getNazwa() {
                return nazwa;
        }
}

