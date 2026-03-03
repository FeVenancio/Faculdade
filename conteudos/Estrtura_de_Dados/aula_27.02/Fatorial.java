public class Fatorial {
    
    public int fatorial(int fatorial) {
        if (fatorial == 1) {
            return 1;
        }
        return fatorial * fatorial(fatorial - 1);
    }
}
