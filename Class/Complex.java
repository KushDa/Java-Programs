class Complex {
  int real;
  int imag;

  Complex(int r, int i) {
    real = r;
    imag = i;
  }

  Complex ADD(int a, Complex s2) {
    return new Complex(a + s2.real, s2.imag);
  }

  Complex ADD(Complex s1, Complex s2) {
    return new Complex(s1.real + s2.real, s1.imag + s2.imag);
  }

  void display() {
    System.out.println(real + " + " + imag + "i");
  }

  public static void main(String[] args) {

    Complex s1 = new Complex(10, 5);
    Complex s2 = new Complex(20, 8);

    Complex result1 = s1.ADD(5, s2);

    Complex result2 = s1.ADD(s1, s2);

    System.out.println("ADD(a, s2):");
    result1.display();

    System.out.println("ADD(s1, s2):");
    result2.display();
    }
}