import java.io.*;
//import java.io.BufferedReader;
public class UDSMTESTprog
{
    static void main (String[] args) throws IOException
    {

      BufferedReader US = new BufferedReader (new FileReader ("UserRepo.txt"));
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	if (!US.ready ())
	{
	    System.out.println ("file not read");
	}

	String a;
	String x;
	System.out.println (RWFile ());

	/*for (int i = 0 ; i < 1 ;)
	{
	    a = br.readLine ();

	}*/
    }
    static String RWFile ()
    {
	File R = new File ("UserRepo.txt");
	String S = R.getAbsolutePath ();
	return S;

    }
}
