public class fungsi {
    static int[][] royalGarden = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    static int[] profit = new int[royalGarden.length];
    public static void main(String[] args) {
        rincianStock();
        pendapatan();
        perubahanStok();
    }

    public static void rincianStock (){
        System.out.println("CATATAN STOCK");
        System.out.println("=".repeat(50));
        System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
        for (int n = 0; n < royalGarden.length; n++ ) {
            System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n+1, royalGarden[n][0], royalGarden[n][1], royalGarden[n][2], royalGarden[n][3]);
        }
    }

    public static void pendapatan (){
        System.out.println("");
        System.out.println("PENDAPATAN ROYAL GARDEN");
        System.out.println("=".repeat(50));
        for (int i = 0; i < royalGarden.length; i++) {
            for (int j = 0; j < royalGarden[i].length; j++) {
                profit[i] += royalGarden[i][j] * harga[j];
            }
            System.out.println("Pendapatan Royal Garden " + (i+1) + ": " + profit[i]);
        }
    }

    public static void perubahanStok (){
        System.out.println();
        System.out.println("ROYAL GARDEN 4 - PERUBAHAN STOK BUNGA");
        System.out.println("=".repeat(50));
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] tumbuhanMati = {1, 2, 0, 5};
        int[] sisatumbuhan = new int[royalGarden.length];
        for (int i = 0; i < sisatumbuhan.length; i++) {
            sisatumbuhan[i] = royalGarden[3][i] - tumbuhanMati[i];
        }
        System.out.println("\t\tstock  tumbuhan mati  tumbuhan tersisa");
        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-10s\t%d\t     %d\t          %d\n", 
                              bunga[i], royalGarden[3][i], 
                              tumbuhanMati[i], sisatumbuhan[i]);
        }
        
    }
}