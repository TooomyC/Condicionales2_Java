package ejercicios;

import javax.swing.JOptionPane;

public class EJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        // INGRESAR UN NUMERO Y DETERMINAR SI ES MULTIPLO DE 10.
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero %10 == 0) //El numero es multiplo.
           JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10.");
        else
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es multiplo de 10.");
        
        //COMPARA DOS NUMEROS Y DETERMINA SI SON IGUALES O CUAL ES EL MAYOR.
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        
        if( n1 == n2)
            JOptionPane.showMessageDialog(null, "Ambos numero son iguales.");
        else{
            if(n1 < n2)
                JOptionPane.showMessageDialog(null, "El numero "+n2+" es mayor que "+n1);
            else
                JOptionPane.showMessageDialog(null, "El numero "+n1+" es mayor que "+n2);
        }
        
        **/
        
        //PROGRAMA QUE LEA UN CARACTER POR TECLADO Y COMPRUEBE SI ES UNA LETRA MAYUSCULA.
        /**
        char car;
        
        car = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        
        if(Character.isDigit(car))
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula.");
        else
            JOptionPane.showMessageDialog(null, "Es una letra minuscula.");
        **/
        /**
        //UN OBRERO NECESTA CALCULAR SU SALARIO SEMANAL, EL CUAL SE OBTIENE DE LA SIGUIENTE
        //MANERA:
        //SI TRABAJA 40 HORAS O MENOS, SE LE PAGA $16 POR HORA.
        //SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS PRIMERAS 40 HORAS
        // Y 20$ POR CADA HORA EXTRA.
        
        int horasTrabajadas;
        float salario;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas: "));
        
        if(horasTrabajadas <= 40)
            salario = horasTrabajadas * 16;
        else
            salario = (40 * 16) + (horasTrabajadas - 40) * 20;
        
        JOptionPane.showMessageDialog(null, "El salario del trabajador es: "+salario); 
        **/
        
        //PROGRAMA QUE TOME DOS NUMEROS Y DIGA SI SON PARES O IMPARES.
        /**
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero: "));
        
        if(n1 % 2 == 0)
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es par.");
        else
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es impar.");
        
        if(n2 % 2 == 0)
            JOptionPane.showMessageDialog(null, "El numero "+n2+" es par.");
        else
            JOptionPane.showMessageDialog(null, "El numero "+n2+" es impar.");
        **/
        
        //PEDIR 3 NUMEROS Y ORDENARLOS DE MAYOR A MENOR.
        /**
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tercer numero: "));
        
        if( (n1 > n2) && (n2 > n3) )
            JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n2+" - "+n3);
        else{
            if( (n1 > n3) && (n3 > n2) )
                JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n3+" - "+n2);
            else{
                if ( (n2 > n1) && (n1 > n3) )
                    JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n1+" - "+n3);
                else{
                    if( (n2 > n3) && (n3 > n1) )
                        JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n3+" - "+n1);
                    else{
                        if( (n3 > n1) && (n1 > n2) )
                            JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n1+" - "+n2);
                        else
                            JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n2+" - "+n1);
                    }
                        
                }
            }
        }
        
        **/
        //INGRESAR UN NUMERO ENTRE 0 Y 99.999 Y MOSTRAR CUANTAS CIFRAS TIENE.
        /**
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(num >= 0 & num <= 99999){
            if(num < 10)
                JOptionPane.showMessageDialog(null, "El numero contiene 1 cifra.");
            else{
                if(num < 100)
                    JOptionPane.showMessageDialog(null, "El numero contiene 2 cifras.");
                else{
                    if(num < 1000)
                        JOptionPane.showMessageDialog(null, "El numero contiene 3 cifras.");
                    else
                        if(num < 10000)
                            JOptionPane.showMessageDialog(null, "El numero contiene 4 cifras.");
                        else
                            JOptionPane.showMessageDialog(null, "El numero contiene 5 cifras.");
                }
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        } //Fin WHILE.
        ***/
        
        //DETERMINAR SI LA FECHA (DIA, MES Y AÑO) INGRESADA ES CORRECTA.
        //SUPONIENDO QUE TODOS LOS MESES CONTIENE 30 DIAS.
        /**
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if( (dia >= 1) && (dia <= 30)){
            if( (mes > 0) && (mes < 13)){
                if( anio != 0)
                    JOptionPane.showMessageDialog(null, "Fecha correcta.");
                else
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta. Año Incorrecto.");
            }
            else
                JOptionPane.showMessageDialog(null, "Fecha incorrecta. Mes incorrecto.");
        }
        else
            JOptionPane.showMessageDialog(null, "La fecha incorrecta. Dia incorrecto.");
        **/
        
        /**CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA, QUE PUEDE
         * REALIZAR LAS CUATRO OPERACIONES ARITMETICAS BASICAS (SUMA, RESTA, PRODUCTO Y 
         * DIVISION) CON VALORES NUMERICOS ENTEROS.
         * EL USUARIO DEBE ESPECIFICAR LA OPERACION CON EL PRIMER CARACTER DEL PRIMER PARAMETRO
         * DE LA LINEA DE COMANDOS: S O s PARA LA SUMA; R O r PARA RESTA; P O p/M O m PARA 
         * PRODUCTO; D O d PARA DIVISION.
         */
        /**
        int n1, n2, suma, resta, mult, div;
        char operacion;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero: "));
        
        operacion = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar: ").charAt(0);
        
        switch(operacion){
            case 's':
            case 'S': suma = n1 + n2;
                      JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                      break;
            case 'r':
            case 'R': resta = n1 - n2;
                      JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                      break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = n1 * n2;
                      JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mult);
                      break;
            case 'd':
            case 'D': if(n2 != 0){
                        div = n1 / n2;
                        JOptionPane.showMessageDialog(null, "La division es: "+div);
                        break;
                      }
                      else
                        JOptionPane.showMessageDialog(null, "El segundo numero es cero. No es posible dividir entre cero.");
            default: JOptionPane.showMessageDialog(null, "Se equivoco de operacion.");
        }
        * **/
    }
    
}
