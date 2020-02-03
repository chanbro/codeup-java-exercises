import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();
        String[] adjectives = {"grandiose", "sulky", "infamous", "striped", "cruel", "careless", "statuesque", "permissible", "previous", "overrated"};

        String[] nouns = {"instruction", "bathroom", "error", "strategy", "awareness", "connection", "explanation", "depression", "method", "soup"};

        System.out.println(server.nameGenerator(adjectives, nouns));
    }

   private int randomAdj = (int) (Math.random() * 10);
    private int randomNoun = (int) (Math.random() * 10);

    public String nameGenerator(String[] adj, String[] noun){
        return adj[randomAdj] + "-" + noun[randomNoun];
    }

}
