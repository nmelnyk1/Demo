public class Sum {
   private int a, b, c;

   void setA(int m) { this.a = m; c = a + b; }
   void setB(int n) { this.b = n; c = a + b; }

   int getA() { return this.a; }
   int getB() { return this.b; }
   int getC() { return this.c; }

   public void sum(int m, int n) {
       this.a = m; this.b = n;
       this.c = m + n;
   }
}
