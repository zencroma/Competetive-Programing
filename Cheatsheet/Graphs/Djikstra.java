package Graphs;
import java.util.*;
public class Djikstra {
    private int distance[];
    private Queue<Integer>q;
    private Set<Integer>set;
    private int jumlah_node;
    private int[][]adjacent_matrix;
    public Djikstra(int jumlah_node) {
        this.jumlah_node= jumlah_node;
        distance = new int[jumlah_node+1];
        q = new LinkedList<Integer>();
        adjacent_matrix= new int[jumlah_node+1][jumlah_node+1];
    }

    public void djikstra_algo(int adjacent_matrix[][],int asal) {
        int evalNode;
        for (int i = 0; i <= adjacent_matrix.length-1; i++) {
            for (int j = 0; j <= adjacent_matrix.length-1; j++) {
                adjacent_matrix[i][j] = adjacent_matrix[i][j];
            }
        }
        for (int i = 0; i <= adjacent_matrix.length-1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        q.add(asal);
        distance[asal] = 0;

        while (!q.isEmpty()) {
            evalNode = getNodeMinDis();
            set.add(evalNode);
            evalNeighbours(evalNode);
        }
    }

    private void evalNeighbours(int evalNode) {
        int edgeDis = -1;
        int newDis = -1;

        for (int destination = 0; destination <= jumlah_node; destination++) {
            if (!set.contains(destination)) {
                if(adjacent_matrix[evalNode][destination] != Integer.MAX_VALUE){
                    edgeDis = adjacent_matrix[evalNode][destination];
                    newDis = distance[evalNode] + edgeDis;
                    if (newDis < distance[destination]) {
                        distance[destination] = newDis;
                    }
                    q.add(destination);
                }
            }
        }
    }

    private int getNodeMinDis() {
        int min;
        int node =0;
        Iterator<Integer> iterator = q.iterator();
        node = iterator.next();
        min = distance[node];
        for (int i = 0; i < distance.length; i++) {
            if (q.contains(i)) {
                if (distance[i]<=min) {
                    min = distance[i];
                    node = i;
                }
            }
        }
        q.remove(node);
        return node;
    }

    public static void main(String[] args) {
        int adjacent_matrix[][];
        int jumlah_vertex;
        int asal = 0;
        Scanner in = new Scanner(System.in);

        try {
            jumlah_vertex = in.nextInt();
            adjacent_matrix = new int [jumlah_vertex+1][jumlah_vertex+1];
            //berat graf
            for (int i = 0; i < adjacent_matrix.length-1; i++) {
               for (int j = 0; j < adjacent_matrix.length-1; j++) {
                adjacent_matrix[i][j] = in.nextInt();
                if (i==j) {
                    adjacent_matrix [i][j] = 0;
                    continue;
                }
                if (adjacent_matrix[i][j] ==0) {
                    adjacent_matrix[i][j] = Integer.MAX_VALUE;
                }
               }
            }

            asal = in.nextInt();
            Djikstra djikstraQ = new Djikstra(jumlah_vertex);
            djikstraQ.djikstra_algo(adjacent_matrix, asal);
            //shortest path

            for (int i = 0; i < djikstraQ.distance.length-1; i++) {
                System.out.println(asal +" ke "+i+" adalah "+ djikstraQ.distance[i]);
            }
        } catch (InputMismatchException input) {
            // TODO: handle exception
            System.out.println("Salah format");
        }
        in.close();
    }
}
