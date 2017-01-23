package udsm;
import java.io.*;
import com.dropbox.core.*;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxWriteMode;
import java.util.Locale;
import static udsm.Runtime.Runtime;


class UDSM{
/* @param args */
    /**
     *
     * @param args
     * @throws IOException
     * @throws DbxException
     */

    //DBX Layer
    public static void main (String[] args) throws IOException, DbxException
    {
        final String KEY="htko8t7yhv5mb49";  //Uninheritable 
        final String SCRET_Auth ="atexpu0am01v2gp";  //
    
        BufferedReader US = new BufferedReader (new FileReader("UserRepo.txt"));
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String code_in;
        String Oauth; 
        DbxAppInfo App_Auth; 
        DbxRequestConfig File_config;
        DbxWebAuthNoRedirect DROPB_AUTH;
        
        App_Auth = new DbxAppInfo(KEY, SCRET_Auth);
        File_config = new DbxRequestConfig("UDSM/1.0", Locale.getDefault().toString());   
        DROPB_AUTH = new DbxWebAuthNoRedirect(File_config, App_Auth);
         
        String User_str, pass_str; 
	for (int i = 0; i<2;){	
	System.out.println("Input name"); 
            User_str = br.readLine();
                i++;
                }
                for (int i = 0; i<1;){         
	  System.out.println("Input pass"); 
                pass_str = br.readLine();
                    i++;
                    }
                Runtime();    
                String URL_AUTH = DROPB_AUTH.start();
                System.out.println(URL_AUTH);                 
                System.out.println(URL_AUTH.length()); 
                //Instanciate multiple client access streams
            code_in =  new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
            DbxAuthFinish authFinish = DROPB_AUTH.finish(code_in);
            Oauth = authFinish.accessToken;    
            DbxClient cilent_ACCESS = new DbxClient (File_config, Oauth);   
                System.out.println(Oauth); 
                
            //***effluent data***     
            File IOFile = new File("UserConsole.txt");
            int IOFileL = (int) IOFile.length();
                System.out.println (IOFileL);
            FileInputStream IOStream = new FileInputStream(IOFile);
            try{
                DbxEntry.File uploadFile;
                uploadFile = cilent_ACCESS.uploadFile("/User_Repo.txt", DbxWriteMode.add(),IOStream.length(),IOStream);
                System.out.println("content Uploaded:" + uploadFile.toString());
                    }finally{
                            IOStream.close(); 
                }
      

    FileOutputStream efferentStream  =  new FileOutputStream("UserRepo");
    try{
    DbxEntry.File DownloadContent = cilent_ACCESS.getFile("/",null, efferentStream);
//file Function

}
finally{
        efferentStream.close(); 

}



    
    
    }
    }




//String read Stream;
/*Seattle is more northerly than New York City            
T
Rhode Island has a greater population than Mongolia             
F
The island of Borneo is occupied by three countries             
T
Mount Kilimanjaro is higher than Denali         
F
Memphis is the state capital of Tennessee               
F
The Maldives has the lowest high point of any country           
T
Japan has the world's highest life expectancy           
F
The world's tallest waterfall is in Venezuela           
T
The currency of Switzerland is the Euro         
F
China borders the same number of countries as Russia            
T
Shanghai has a greater population than Beijing
T
Russia is the world's largest oil producer    
T
The Sahara Desert has a greater area than USA 
F
Cyprus is the only country to depict its map on its flag        
F
Australia's flag contains more stars than New Zealand's 
T
Uruguay has a greater population than Paraguay  
F
Vanuatu has a greater area than Nauru   
T
Madrid is more easterly than London     
F
Greenland is on the Eurasian tectonic plate     
F
The Nile River is more than double the length of the Volga      
F
Johannesburg is one of South Africa's three capital cities      
F
Iowa has a greater area than Greece             
T
Lake Victoria is larger than Lake Superior              
F
Transnistria is a disputed territory in Moldova         
T
Over a quarter of adults in Swaziland have HIV/AIDS             
T
*/