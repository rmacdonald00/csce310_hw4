package code;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasMinDistance {

	
	public static double[] Dijkstras(int[][] graph, int s) {
		
		Vertex[] vertices = new Vertex[graph.length];
		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>(); 
		
		//initialize each vertex with a distance of infinity and a previous node of null and add it to the priority queue
		for(int i = 0; i< graph.length; i++) {
			vertices[i] = new Vertex(Double.POSITIVE_INFINITY, null, i);
			q.add(vertices[i]);
		}
		
		//update the source and give it a distance of 0 from itself
		q.remove(vertices[s]);
		vertices[s].updateDist(0);
		q.add(vertices[s]);
		
		ArrayList<Vertex> addedVerts = new ArrayList<Vertex>();
		
		for(int i = 0; i<graph.length; i++) {
			//take of the next min element from the priority queue, and then compare all of its neighbors and see if adding u 
			//creates a new fastest path; if so, update the distance and previous nodes of each v
			Vertex u = q.remove();
			addedVerts.add(u);
			for(Vertex v : vertices) {
				if(!addedVerts.contains(v) && graph[u.name][v.name] != 0) {
					if(u.dist+graph[u.name][v.name] < v.dist) {
						v.dist = u.dist+graph[u.name][v.name];
						v.updatePrev(u);
						q.remove(vertices[v.name]);
						q.add(vertices[v.name]);
					}
				}
			}
		}
		
		//the distance values into an array that has each distance in its corresponding node location
		double[] result = new double[graph.length];
		for(Vertex v : addedVerts) {
			result[v.name] = v.dist;
		}
		return result;
	}
	
	/*
	 * this is a class that represents a vertex
	 * -it contains a distance to the source, a previous node reference, and an integer value to denote which node it is
	 * -they can also be compared by their distance to the source, so a shorter distance means it should come first
	 */
	public static class Vertex implements Comparable<Vertex>{
		double dist;
		Vertex prev;
		int name;
		
		public Vertex(double ds, Vertex ps, int name) {
			dist = ds;
			prev = ps;
			this.name = name;
		}
		
		public void updateDist(double d) {
			this.dist = d;
		}
		
		public void updatePrev(Vertex v) {
			this.prev = v;
		}
		
		public int compareTo(Vertex v2) {
			if(this.dist < v2.dist) {
				return -1;
			}else if(this.dist > v2.dist) {
				return 1;
			}else {
			return 0;
			}
		}
	}
	

}
