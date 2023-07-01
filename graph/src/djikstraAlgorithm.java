import java.io.*;
import java.util.*;
public class djikstraAlgorithm {




        static class Edge {
            int src;
            int nbr;
            int wt;

            Edge(int src, int nbr, int wt) {
                this.src = src;
                this.nbr = nbr;
                this.wt = wt;
            }
        }
        static class Pair implements Comparable<Pair>{
            int vtx ;
            String psf;
            int csf;

            Pair(int vtx ,String psf , int csf){
                this.vtx = vtx;
                this.psf = psf;
                this.csf =csf;
            }
            public int compareTo(Pair o){
                return this.csf - o.csf;
            }
        }


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int vtces = Integer.parseInt(br.readLine());
            ArrayList<Edge>[] graph = new ArrayList[vtces];
            for (int i = 0; i < vtces; i++) {
                graph[i] = new ArrayList<>();
            }

            int edges = Integer.parseInt(br.readLine());
            for (int i = 0; i < edges; i++) {
                String[] parts = br.readLine().split(" ");
                int v1 = Integer.parseInt(parts[0]);
                int v2 = Integer.parseInt(parts[1]);
                int wt = Integer.parseInt(parts[2]);
                graph[v1].add(new Edge(v1, v2, wt));
                graph[v2].add(new Edge(v2, v1, wt));
            }

            // write your code here
            int  src = Integer.parseInt(br.readLine());
            PriorityQueue<Pair> pq = new PriorityQueue<>();

            pq.add(new Pair(src , src +"" ,0));

            boolean[]visited = new boolean[vtces];

            while(pq.size()>0){
                //remove
                Pair rem = pq.remove();

                //mark
                if(visited[rem.vtx] == true){
                    continue;
                }
                visited[rem.vtx] = true;

                //print or we'll say work
//                if(rem.par !=-1){
                    System.out.println("[" +rem.vtx +"-" + rem.psf +"@" + rem.csf+"]");
//                }

                //add neighbour
                for(int i = 0 ; i < graph[rem.vtx].size() ;i++){
                    Edge e = graph[rem.vtx].get(i);
                    if(visited[e.nbr] == false){
                        pq.add(new Pair(e.nbr , rem.psf + e.nbr,  rem.csf +e.wt));
                    }
                }
            }

        }

    }

