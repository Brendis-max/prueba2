// public class matriz_E {
//     public static void main(String[] args) {
//         // int[][] matriz = new int[3][3];
//         // matriz [0][1] = 10;

//         int [][] matriz= {
//             {4,2,9},
//             {12, 4,1},
//             {9, 8,7}
//         };
//         // Suma simple

//         int resultado_f1 = matriz[0][0] + matriz [0][1] + matriz[0][2];
//         System.out.println(resultado_f1);

//         int resultado_c1 = matriz[0][0] + matriz [0][1] + matriz[0][2];
//         System.out.println(resultado_c1);

//         // Suma iterativa

//         for (int i =0; i < matriz.length; i++) {
//             int resultado =0;
//             for (int j = 0; j < matriz[i].length; j++){
//                 resultado += matriz[i][j];
                 

//             }
//             System.out.println("Fila ["+ i +"]:" + resultado);
            
//         }
//     }
// }



public class matriz_E {
    public static void main(String[] args) {

        int [][] matriz = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int resultado_f1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        System.out.println("Suma de la fila 1: " + resultado_f1);

        int resultado_c1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        System.out.println("Suma de la columna 1: " + resultado_c1);

        for (int i = 0; i < matriz.length; i++) {
            int resultado = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j];
            }
            System.out.println("Suma de la fila [" + i + "]: " + resultado);
        }

        // Suma de las columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int resultado = 0;
            for (int i = 0; i < matriz.length; i++) {
                resultado += matriz[i][j];
            }
            System.out.println("Suma de la columna [" + j + "]: " + resultado);
        }

        //  diagonal 1
        int diagonal_uno = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal_uno += matriz[i][i];
        }
        System.out.println("Suma de la diagonal 1: " + diagonal_uno);

        // diagonal 2
        int diagonal_dos = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal_dos += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Suma de la diagonal 2: " + diagonal_dos);
    }
}
