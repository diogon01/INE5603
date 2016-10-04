package ufsc.company;

/**
 * Created by Diogon on 03/10/2016.
 */
public class Calculadora {
    public int calculaRomano(String romano) {
        int total =0;
        for(int i = 0; i < romano.length(); i++){
          int primeiro = converterRomano(romano.charAt(i));
            if(i+1 <romano.length()){
                int segundo = converterRomano(romano.charAt(i + 1));
                if(segundo > primeiro){
                    total += segundo - primeiro;
                }
                else {
                    total += primeiro;
                }

            }else {
                total+= primeiro;
            }
        }
        System.out.println(total);
        return 0;
    }

    public int converterRomano(char letra) {

        switch (letra) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
