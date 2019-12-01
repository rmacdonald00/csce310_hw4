package code;

public class MainClass {

	public static void main(String[] args) {

//tests for Maximum Spanning Tree
		System.out.println("Maximum Spanning Tree Tests: ");

	// adjacency matrix for the first graph on problem 6
		int[][] matrix1 = new int[5][5];

		matrix1[0][0] = 0;
		matrix1[0][1] = 5;
		matrix1[0][2] = 0;
		matrix1[0][3] = 6;
		matrix1[0][4] = 0;

		matrix1[1][0] = 5;
		matrix1[1][1] = 0;
		matrix1[1][2] = 1;
		matrix1[1][3] = 3;
		matrix1[1][4] = 0;

		matrix1[2][0] = 0;
		matrix1[2][1] = 1;
		matrix1[2][2] = 0;
		matrix1[2][3] = 4;
		matrix1[2][4] = 6;

		matrix1[3][0] = 6;
		matrix1[3][1] = 3;
		matrix1[3][2] = 4;
		matrix1[3][3] = 0;
		matrix1[3][4] = 2;

		matrix1[4][0] = 0;
		matrix1[4][1] = 0;
		matrix1[4][2] = 6;
		matrix1[4][3] = 2;
		matrix1[4][4] = 0;

	// this is the first matrix from problem 4
		int[][] matrix2 = new int[5][5];
		
		matrix2[0][0] = 0;
		matrix2[0][1] = 5;
		matrix2[0][2] = 7;
		matrix2[0][3] = 0;
		matrix2[0][4] = 2;

		matrix2[1][0] = 5;
		matrix2[1][1] = 0;
		matrix2[1][2] = 0;
		matrix2[1][3] = 6;
		matrix2[1][4] = 3;

		matrix2[2][0] = 7;
		matrix2[2][1] = 0;
		matrix2[2][2] = 0;
		matrix2[2][3] = 4;
		matrix2[2][4] = 4;

		matrix2[3][0] = 0;
		matrix2[3][1] = 6;
		matrix2[3][2] = 4;
		matrix2[3][3] = 0;
		matrix2[3][4] = 5;

		matrix2[4][0] = 2;
		matrix2[4][1] = 3;
		matrix2[4][2] = 4;
		matrix2[4][3] = 5;
		matrix2[4][4] = 0;

	// this is the first matrix from problem 4 with all of e's edges flipped negative
		int[][] matrix3 = new int[5][5];
		
		matrix3[0][0] = 0;
		matrix3[0][1] = 5;
		matrix3[0][2] = 7;
		matrix3[0][3] = 0;
		matrix3[0][4] = -2;

		matrix3[1][0] = 5;
		matrix3[1][1] = 0;
		matrix3[1][2] = 0;
		matrix3[1][3] = 6;
		matrix3[1][4] = -3;

		matrix3[2][0] = 7;
		matrix3[2][1] = 0;
		matrix3[2][2] = 0;
		matrix3[2][3] = 4;
		matrix3[2][4] = -4;

		matrix3[3][0] = 0;
		matrix3[3][1] = 6;
		matrix3[3][2] = 4;
		matrix3[3][3] = 0;
		matrix3[3][4] = -5;

		matrix3[4][0] = -2;
		matrix3[4][1] = -3;
		matrix3[4][2] = -4;
		matrix3[4][3] = -5;
		matrix3[4][4] = 0;

	//this is a matrix of size 1
		int[][] matrix4 = new int[1][1];
		matrix4[0][0] = 5;

		int maxResult1 = MaximumSpanningTree.maxTree(matrix1);
		System.out.println("the value of the tree of matrix 1 is: " + maxResult1);

		int maxResult2 = MaximumSpanningTree.maxTree(matrix2);
		System.out.println("the value of the tree of matrix 2 is: " + maxResult2);

		int maxResult3 = MaximumSpanningTree.maxTree(matrix3);
		System.out.println("the value of the tree of matrix 3 is: " + maxResult3);

		int maxResult4 = MaximumSpanningTree.maxTree(matrix4);
		System.out.println("the value of the tree of matrix 4 is: " + maxResult4);

//tests for Dijkstra's Algorithm
		System.out.print("\n");
		System.out.println("Dijkstra's Algorithm Tests: ");
		
		// using same matrices as above
		
		//comparing to node e
		double[] minResult1 = DijkstrasMinDistance.Dijkstras(matrix1, 4);
		System.out.println("the distance values of matrix1 to node 4 are: ");
		for (int i = 0; i < minResult1.length; i++) {
			System.out.println(minResult1[i]);
		}

		//comparing to node c
		double[] minResult2 = DijkstrasMinDistance.Dijkstras(matrix2, 2);
		System.out.println("the distance values of matrix2 to node 2 are: ");
		for (int i = 0; i < minResult2.length; i++) {
			System.out.println(minResult2[i]);
		}

		//comparing to the only node
		double[] minResult4 = DijkstrasMinDistance.Dijkstras(matrix4, 0);
		System.out.println("the distance values of matrix4 to node 0 are: ");
		for (int i = 0; i < minResult4.length; i++) {
			System.out.println(minResult4[i]);
		}

	}

}
