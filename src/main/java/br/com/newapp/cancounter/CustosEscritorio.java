package br.com.newapp.cancounter;



class CustosEscritorio {
    public static void main(String[] args) {
       int forro = 650;
        System.out.println("O valor do Forro foi " + forro );
       int bancada = 600;
        System.out.println("O valor da Bancada foi " + bancada);
        int pintura = 400;
        System.out.println("O valor da Pintura foi " + pintura);
        int lampadas = 75;
        System.out.println("O valor das Lampadas foi " + lampadas);
        int total = forro + bancada + pintura + lampadas;
        System.out.println("O custo total foi de " + total);
    }

}
