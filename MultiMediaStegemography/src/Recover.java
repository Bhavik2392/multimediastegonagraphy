

import java.io.FileInputStream;
import java.io.PrintStream;

class Recover
{
  public String pass;
  public String msg = "";

  public void Recover(String img)
    throws Exception
  {
    this.pass = "";
    FileInputStream f1 = new FileInputStream(img);

    f1.skip(54L);
    int len = 0;

    for (int i = 0; i < 32; i++)
    {
      int[] a1 = new int[8];
      for (int k = 0; k < 8; k++) {
        a1[k] = f1.read();
      }
      int r = Recov(a1);
      this.pass += (char)r;
    }
    this.pass = this.pass.trim();

    len = 0;
    int p = 1;
    for (int i = 0; i < 32; i++)
    {
      int n = f1.read();
      int d = n % 2;
      len += d * p;
      p *= 2;
    }

    System.out.println("Length=" + len);

    for (int i = 0; i < len; i++)
    {
      int[] a1 = new int[8];
      for (int k = 0; k < 8; k++) {
        a1[k] = f1.read();
      }
      int r = Recov(a1);
      this.msg += (char)r;
    }

    f1.close();
  }

  public int Recov(int[] a1)
  {
    int e = 0; int p = 1;
    for (int i = 0; i < 8; i++)
    {
      int d = a1[i] % 2;
      e += d * p;
      p *= 2;
    }

    return e;
  }
}