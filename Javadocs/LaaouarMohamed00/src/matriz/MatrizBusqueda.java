package matriz;

public class MatrizBusqueda {

    public static void main(String[] args) {
        int[][] temperatura = new int[30][12]; 
        int temperaturaMax = 0;
        int mesMasCaluroso = 0;
        int diaMasCaluroso = 0;

        
        String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                              "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        
        for (int dia = 0; dia < 30; dia++) {
            for (int mes = 0; mes < 12; mes++) {
                temperatura[dia][mes] = (int) (Math.random() * 50);
            }
        }

        
        temperaturaMax = temperatura[0][0];
        for (int mes = 0; mes < 12; mes++) {
        	 System.out.println("---------------------------------------------------------------------------------");
            for (int dia = 0; dia < 30; dia++) {
            	System.out.print(temperatura[dia][mes]+"\t ||");
                if (temperatura[dia][mes] > temperaturaMax) 
                {
                    temperaturaMax = temperatura[dia][mes];
                    mesMasCaluroso = mes;
                    diaMasCaluroso = dia + 1;
                }
                System.out.println();
            }
            System.out.println();
        }

       
        System.out.println("La temperatura más alta del año fue de " + temperaturaMax + "°C");
        System.out.println("Ocurrió el día " + diaMasCaluroso + " de " + nombreMes[mesMasCaluroso]);
        
        String cadena= String.format("El dia mas caluroso fue el %d de %s con %d grados ",(diaMasCaluroso), nombreMes[mesMasCaluroso],temperaturaMax);
        System.out.println(cadena);
        System.out.printf("El dia mas caluroso fue el %d de %s con %d grados ",(diaMasCaluroso), nombreMes[mesMasCaluroso],temperaturaMax);
    }
}

