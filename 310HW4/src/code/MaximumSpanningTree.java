package code;

import java.util.ArrayList;
import java.util.List;

public class MaximumSpanningTree {


	public static int maxTree(int[][] graph) {
		List<Integer> vertices = new ArrayList<Integer>();
			vertices.add(0);
		List<Edge> edges = new ArrayList<Edge>();
		
		//check each edge for a maximum edge weight, then add the new vertex and edge
		for(int i = 0; i <= graph.length - 1; i++) {
			Edge nextEdge = maxEdge(vertices, edges, graph);
			if(nextEdge == null) {
				break;
			}
			vertices.add(nextEdge.v2);
			edges.add(nextEdge);
			System.out.println("edge from " + nextEdge.v1 + " to " + nextEdge.v2);

		}
		
		int treeValue = 0;
		for(Edge e : edges) {
			treeValue += graph[e.v1][e.v2];
		}
		
		return treeValue;
	}
	
	
	public static class Edge{
		public Edge(int v1, int v2) {
				this.v1 = v1;
				this.v2 = v2;

		}
		public int v1;
		public int v2;
	}
	
	/*
	 * check each vertex pair to find the ones where one is already in the solution and one is not, check to see if their weight
	 * (will be zero if no edge) is the maximum one, and return the edge with the greatest weight
	 */
	private static Edge maxEdge(List<Integer> vertices, List<Edge> edges, int[][] graph) {
		double maxValue = Double.NEGATIVE_INFINITY;
		Edge nextEdge = null;
		for(int v : vertices) {
			for(int i = 0; i<graph.length; i++) {
				if(!vertices.contains(i)) {
					if(graph[v][i] > maxValue) {
						maxValue = graph[v][i];
						nextEdge = new Edge(v,i);

					}
				}
			}
		}
		return nextEdge;
	}
	
}

