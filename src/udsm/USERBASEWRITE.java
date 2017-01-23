// handle local User account Validation send it toward DBX 
package udsm;
public class USERBASEWRITE {

    final String User;
    final String PASS_k;
 

    USERBASEWRITE (String User,String PASS_k){
   
    this.User = User; 
    this.PASS_k = PASS_k;   
    } 
    String G_user(){
    return User;
    }
    String G_PASS(){
    return PASS_k;
    }
    String  arg_handle (){
        return "nothing"; 
    } 
}
 
    
   //void USERBASESORT(){
    //}
    
    /*   void S_PASS(){
         this.PASS_k = PASS_k;
    }
    
    void S_user(String User){
        this.User = User;
    
    }
 */
    












 