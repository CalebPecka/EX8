package q1.extract_method.refactored;

import java.util.List;

//import q1.extract_method.org.Edge;
//import q1.extract_method.org.Node;

public class A {
   Node m1(List<Node> nodes, String p) {
      extend(nodes, p);  
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extend(edgeList, p);
      return null;
   }
   
   <T extends Graph> void extend(List<T> objs, String p) {
	   for (T obj : objs) {
		   if (obj.contains(p))
			   System.out.println(obj);
	   }
	   
   }
}

class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph{
   
}

class Edge extends Graph{
   
}