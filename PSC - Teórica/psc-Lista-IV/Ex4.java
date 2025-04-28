public class Ex4 {
    public static void main(String[] args) {
        float A = 80000, B = 200000, cA = 0.03f, cB = 0.015f, Ai = 0, Bi = 0;
        int t = 0;
        Ai = A  * cA;
        Bi = B * cB;
        while (A < B) {
            t++;
            A += Ai;
            B += Bi;
            Ai = A * cA;
            Bi = B * cB;
        }
        System.out.println("Tempo necessario para A superar B: "+ t + " Anos");
        System.out.println("A: " + A + " B: " + B);
        


    }
}
