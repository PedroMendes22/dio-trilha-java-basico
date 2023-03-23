import com.azul.crs.client.sysinfo.SystemInfoProvider;

public class Operadores {
    /*O operador de condição ternária é uma forma resumida de representar
    uma condição e escolher dentre dois valores, é representado por: '?:'  */
    public static void main(String[] args) {
        int a,b;
        a = 6;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso"; //if e else resumido
        System.out.println(resultado);
    
    }
   
}
