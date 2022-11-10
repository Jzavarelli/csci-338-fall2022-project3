
/**
 * @author Jace Zavarelli
 * @author Jaden Schultz
 */

 // Graph Object Type -> Two Dimensional Array [Vertice_#] [neighborVertice_1, neighborVertice_2, ...]

public class GraphToolBox 
{
    // return an array containing the vertex numbers of an optimal VC.
    /* Vertex Cover = Given a graph G = (V, E) and int 'k' less than or equal to the number of Vertices, is there a
     *                complement of Vertices' that is the subset of Vertices, with the number of the complement of
     *                Vertices' less than or equal to 'k', such that each edge in E contains an end point in the 
     *                complement of Vertices'?
    */

    // We have a set of Vertices that cover our graph, the complement of V acts as a checking mechaism. We
    // will take all our Vertices and make sure that there are not two Vertices that are "unmarked" and adjacent to each other.
    // i.e. we will make sure that every edge in E has an end point in the complement of Vertices.
    public static int[] exactVC(Graph inputGraph) 
    {
        int[] vertexArray = {};

        return vertexArray;
    }

    
    // return (in polynomial time) an array containing the vertex numbers of a VC.
    /* Claim: Vertex Cover "is an element" of NP.
     * Proof: Build a polynomial time verifier.
     * 
     * [Number of Vertices = n], [Complement of Vertices = V']
     *          M = on input <<G, k>, V'>, where the complement of Vertices' is a subset of Vertices.
     * [O(1)]         1. Test if the "number of" V' is "less than or equal to" k, reject if not.
     * [O(n^2)]       2. For each edge e = (a, b) in E,
     * [O(n)]             2.1. Test if a "is an element of" V' or b "is an element of" V', reject if neither.
     * [O(1)]         3. Accept.
     * 
     *          For the "number of" Vertices "equal" to n, M runs in O(n^3) time, therefore VC "is an element of" NP.
    */

    //
    public static int[] inexactVC(Graph inputGraph) 
    {
        int[] vertexPolyArray = {};

        return vertexPolyArray;
    }

    
    // return an array containing the vertex numbers of an optimal IS.
    /* Independent Set = Given a graph G = (V, E) and int 'k' is less than or equal to the number of Vertices, is there
     *                   a subset of the complement of Vertices' of size greater than or equal to 'k', such that no two 
     *                   vertices are an element of the complement of Vertices' are adjacent?
    */

    // An Independent Set is when we check the Vertices for independent Vertices, i.e. a Vertice that has no adjacent vertices.
    // We will determine an independent set, vertice, by taking the complement of our Vertices and seeing if any are adjacent.
    public static int[] optimalIS(Graph inputGraph) 
    {
        int[] isoVertexArr = {};

        return isoVertexArr;
    }

    
    // return (in polynomial time) an array containing the vertex numbers of a IS.
    /* Claim: Independent Set "is an element" of NP.
     * Proof: Build a polynomial time verifier.
     * 
     * [Number of Vertices = n], [Complement of Vertices = V']
     *          M = on input <<G, k>, V'>, where the complement of Vertices' is a subset of Vertices.
     * [O(1)]         1. Test if the "number of" V' is "less than or equal to" k, reject if not.
     * [O(n^2)]       2. For each pair of vertices v1, v2 in V',
     * [O(n^2)]             2.1. Test if (v1, v2) "is an elment of" E and reject if it is.
     * [O(1)]         3. Accept.
     * 
     *          For the "number of" Vertices "equal" to n, M runs in O(n^4) time, therefore IS "is an element of" NP.
    */

    //
    public static int[] inexactIS(Graph inputGraph)
    {
        int[] isoVertexPolyArr = {};

        return isoVertexPolyArr;
    }
}
