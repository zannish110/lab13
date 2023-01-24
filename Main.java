
package pkg3darray;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        
        //          a=[0]
        ///a=[0][1][2] a=[0][1][2]
        //a=[0][1] a=[0][1][2][3][] a=[][][][]
        //
        //
        ///
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ");  
        
//        int[][][]a=new int[2][3][2];
//        a[0][0][0]=10;
//        a[0][0][1]=20;
//        a[0][0][2]=30;
//        a[1][0][0]=
//
//
//
  
int[][][] a={{{10,20},{30,40,50,60},{70,80,90}}};        
        System.out.println(a.length);  

        //a=[0]
for(int i=0;i<a.length;i++){//i=0
    for(int j=0;j<a[i].length;j++){//j=0<3 ,j=0,j=1
        for(int k=0;k<a[i][j].length;k++){//k=0; k<a[0][0],k=0
        
            
            System.out.print(a[i][j][k]+" ");
        
        
        }
        System.out.println();
    
    }



}



        
    }
    
}
