/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.WeightedGraph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
/**
 *
 * @author abdulghani abied
 */
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Graph<String , DefaultWeightedEdge> swg=new SimpleWeightedGraph(DefaultWeightedEdge.class);
    swg.addVertex("A");
    swg.addVertex("B");
    swg.addVertex("C");
    swg.addVertex("D");
    Graphs.addEdge(swg,"A","B",20);
    Graphs.addEdge(swg,"B","C",30);
    Graphs.addEdge(swg,"A","D",10);
    Graphs.addEdge(swg,"D","C",5);
    
    
    DijkstraShortestPath<String,DefaultWeightedEdge> dig=new DijkstraShortestPath<>(swg);
    GraphPath<String, DefaultWeightedEdge> var=dig.getPath("A", "C");
    System.out.println(var.getWeight());
    System.out.println(var.getVertexList());

    
    
    }
    
}
