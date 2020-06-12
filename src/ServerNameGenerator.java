public class ServerNameGenerator {
    String[] adj = {"disgusting", "juicy", "soggy", "thick", "romantic", "clumsy", "foolish", "shiny", "doubtful" ,"overrated"};
    String[] nouns = {"internet", "oven", "computer", "surgery", "entry", "king", "attitude", "death", "wedding", "song"};

    public static String randomName(String[] adj, String[] nouns){
        int a = (int) (Math.floor(Math.random() * adj.length));
        int n = (int) (Math.floor(Math.random() * nouns.length));
        return adj[a] + " " + nouns[n];
    }

    public static void main(String[] args) {
        ServerNameGenerator nameGenerator = new ServerNameGenerator();
        System.out.println("Here is your Server name: \n" + randomName(nameGenerator.adj, nameGenerator.nouns));
    }
}
