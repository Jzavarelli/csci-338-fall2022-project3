import java.io.*;
import java.util.*;

public class GraphBuilder 
{
    public GraphBuilder() { }

    public GraphBuilder(int n, int version) throws IOException
    {
        // Graph Versioning Setup
        String fileName = ("graph" + version + ".txt");

        // Required Placeholder Lines
        String firstLine = ("numVert " + n);
        String secondLine = ("vertex numNeighbors neighbor1 neighbor 2 ...");

        final int UPPEREDGE = (int) (n / 3.68);
        final int LOWEREDGE = (int) (n / 8.98);

        final int UPPERTOTAL = (n);
        final int LOWERTOTAL = (0);

        // String that will create the document as a whole.
        /* documentFill will add the vertex, then number of neighbors between 50 < Edges < 150, which will be followed by a list of randomly
         * selected edges in our total number of vertices. (random_edge = 0 < edge < n)
         */
        String documentFill;
        BufferedWriter writeOutput = null;

        try
        {
            // File Creation
            File file = new File(fileName);
            writeOutput = new BufferedWriter(new FileWriter(file));

            // File Writer
            writeOutput.write(firstLine);
            writeOutput.newLine();
            writeOutput.write(secondLine);
            writeOutput.newLine();

            // Number Generator
            for (int i = 0; i < UPPERTOTAL; i++)
            {
                writeOutput.write(i + " ");

                int randEdgeCount = (int) (Math.random() * (UPPEREDGE - LOWEREDGE)) + LOWEREDGE;
                writeOutput.write(randEdgeCount + " ");

                int[] edgeList = new int[randEdgeCount];

                for (int j = 0; j < randEdgeCount;)
                {
                    int randEdge = (int) (Math.random() * (UPPERTOTAL - LOWERTOTAL)) + LOWERTOTAL;

                    if (!Arrays.asList(edgeList).contains(randEdge))
                    {
                        edgeList[j] = randEdge;
                        j++;
                    }
                    else
                    {
                        while(Arrays.asList(edgeList).contains(randEdge))
                        {
                            randEdge = (int) (Math.random() * (UPPERTOTAL - LOWERTOTAL)) + LOWERTOTAL;
                        }

                        edgeList[j] = randEdge;
                        j++;
                    }

                }

                Arrays.sort(edgeList);

                for (int k = 0; k < edgeList.length; k++)
                {
                    writeOutput.write(edgeList[k] + " ");
                }

                writeOutput.newLine();
            }
        }
        catch (IOException err)
        {
            err.getStackTrace();
        }
        finally /* Error Prevention -> So Writer Cannot return NULL */
        {
            if (writeOutput != null)
            {
                try
                {
                    writeOutput.close();
                }
                catch (IOException err)
                {
                    err.getStackTrace();
                }
            }
        }
    }


    public static void main(String[] args)
    {
        int graphLength; /* This is the length, number of vertices, of the current graph. */
        int graphVersion; /* This is the current graph being built. */

        // Input System
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter the number of vertices for your randomly generated graph: ");
        graphLength = inputScan.nextInt();

        System.out.println("Enter the current version of the graph you generate: ");
        graphVersion = inputScan.nextInt();

        try
        {
            GraphBuilder graph = new GraphBuilder(graphLength, graphVersion);
        }
        catch (IOException err)
        {
            err.getStackTrace();
        }

        inputScan.close();
    }
    
}
