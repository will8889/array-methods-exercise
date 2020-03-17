package arraysmethodexercise;
import java.util.Arrays;
import java.util.Scanner;

public class myutilities {

	public void inputValues(int[] a, int n) {
		Scanner myObj = new Scanner(System.in);
		for(int i=0; i<n;++i) {
			System.out.println("input array number " +(i+1)+ ": ");
			a[i] = myObj.nextInt();}
	}
	
	
	public void splitHighestValue (int[] p, int n) {
		int highest = 0;
		int temp;
		int temp2;
		int secondhighest = 0;
		for(int i=0;i<n;i++) {
			//loop to find the highest number in array
			if(highest < p[i]) highest = p[i];
		}
		//second loop to get second highest in array
		for(int i=0;i<n;i++) {
			temp = secondhighest;
			if(secondhighest < p[i]) secondhighest = p[i];
			if(secondhighest == highest) secondhighest = temp;}
		int[] z = new int [n+1];
		for(int i=0;i<n;++i) {
			z[i] = p[i];}
		for(int i=0; i<z.length; ++i) {
			if(i>=z.length-2)
			if(z[i] == highest) {
				temp=highest-secondhighest;
				z[i] = secondhighest;
				z[i+1] = temp;
			} 
			if(i<z.length-2) {
				if(z[i] == highest) {
					temp=highest-secondhighest;
					z[i] = secondhighest;
					temp2 = z[i+1];
					z[i+1] = temp;
					for(int x=i+2;x+1<z.length-1;++x) {
						temp= z[x];
						z[x] = temp2;
						temp2 = temp;
					}
					//for the last one because i didn't know how to loop it
					temp = z[z.length-2];
					z[z.length-2] = temp2;
					z[z.length-1] = temp;
				}
				}
	}
		System.out.println("Output: " + Arrays.toString(z));
	}

	public void shiftArray (int[] p, int n) {
		Scanner myObj = new Scanner(System.in);
		int temp1;
		int temp2;
		System.out.println("ROT: " + Arrays.toString(p));
		int counter = myObj.nextInt();
		System.out.println("before shifting: " + Arrays.toString(p));
		for(int a=0; a<counter;++a) {
		for(int i=0; i<n-1; i++) {
			temp1 = p[i];
			temp2 = p[n-1];
			p[i] = temp2;
			p[n-1] = temp1;
		}
		System.out.println("\nafter shifting: " + Arrays.toString(p));
	}}
	
	public void matrixSymmetric () {
		Scanner myObj = new Scanner(System.in);
		//create the size from input
        System.out.println("Enter matrix size: ");        
        int rows = myObj.nextInt(); 
        int cols = rows; 
        int matrix[][] = new int[rows][cols];
        int x = 1;
        //inputting the elements into the matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
            	System.out.println("Enter elements " + x +":");
            	x++;
                matrix[i][j] = myObj.nextInt();}}
        //print the matrix
        System.out.println("Matrix :");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]+"\t");}
            System.out.println();}
        //Checking the input if the matrix is symmetric or not
            boolean symmetric = true;
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    if(matrix[i][j] != matrix[j][i]){
                        symmetric = false;
                        break;}}}
            if(symmetric == true){
                System.out.println("The matrix is symmetric");}
            else{
                System.out.println("The matrix is not symmetric");}
	}
	//odd magic square
	public int[][] magicSquare(int n){ 
	     int matrix[][] = new int[n][n];
	     //make all the inside of the magic square into zero
	     for(int i = 0; i<n;++i) {
	    	 for(int j = 0; j<n;++j) {
	    		 matrix[i][j] = 0;}}
	     int i = 0;
	     int currenti;
	     int j = n/2;
	     int currentj;
	     int num = 1;
	     //loop it and change the zero into the number
	     while (num <= n * n) {
	         matrix[i][j] = num;
	         num++;
	         currenti = i;
	         currentj = j;
	         i -= 1;
	         j += 1;
	         if (i == -1) {
	             i = n - 1;
	         }
	         if (j == n) {
	             j = 0;
	         }
	         if (matrix[i][j] != 0) {
	             i= currenti + 1;
	             j = currentj;
	             if (i == -1) {
	                 i = n - 1;
	             }
	         }
	     }
	     //return the multidimensional array for print method
	      return matrix;
	}
	public void printmagicSquare(int[][] array, int n) {
		//print the magic square
	     for (int x = 0; x < n; x++){
	            for (int y = 0; y < n; y++){
	                System.out.print(array[x][y]+"\t");}
	            System.out.println();}
	}
	//doubly even magic square
	public int[][] magicSquare2(int n){
		int matrix[][] = new int [n][n];
		int array[][] = new int [n][n];
		int ascending[][] = new int [n][n];
		int descending[][] = new int [n][n];
		int counter1 = 1;
		int counter2 = 1;
		int total = n*n;
		int number = 1;
	    for(int i = 0; i<n;++i) {
	    	for(int j = 0; j<n;++j) {
	    		ascending[i][j] = number;
	    		number++;
	    		descending[i][j] = total;
	    		total--;
	    		if(counter2==1 || counter2==4) {
		    		if(counter1==1 || counter1==4) {
		    			array[i][j] = 1;
		    			counter1 +=1;
		    			if (counter1==5) counter1=1;}
		    		else if(counter1==2 || counter1==3) {
		    			array[i][j] = 0;
		    			counter1 +=1;
		    			if (counter1==5) counter1=1;}}
	    		else if(counter2==2 || counter2==3) {
		    		if(counter1==1 || counter1==4) {
		    			array[i][j] = 0;
		    			counter1 +=1;
		    			if (counter1==5) counter1=1;}
		    		else if(counter1==2 || counter1==3) {
		    			array[i][j] = 1;
		    			counter1 +=1;
		    			if (counter1==5) counter1=1;}}}
	    	counter2 +=1;
	    	if(counter2 ==5) counter2=1; }
	    for(int i = 0; i<n;++i) {
	    	for(int j = 0; j<n;++j) {
	    		if(array[i][j] == 0) {
	    			matrix[i][j] = descending[i][j];
	    		}
	    		else if(array[i][j] == 1) {
	    			matrix[i][j] = ascending[i][j];
	    		}
	    	}
}
	    return matrix;
}
}
