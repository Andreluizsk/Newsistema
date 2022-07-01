package br.com.newapp.cancounter;



class CustosEscritorio {
    public static void main(String[] args) {
       int forro = 650;
        System.out.println("O valor do Forro foi " + forro );
       int bancada = 400;
        System.out.println("O valor da Bancada foi " + bancada);
        int mesa = 200;
        System.out.println("O valor da mesa foi " + mesa);
        int total = forro + bancada + mesa;
        System.out.println("O custo total foi de " + total);
    }

}
