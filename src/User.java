public class User {

 private String firstName;
 private  String lastName;
 private String email;
 private  int password;

 User(String firstName,String lastName, String email,int password) {
     this.setFirstName(firstName);
     this.setLastName(lastName);
     this.setEmail(email);
     this.setPassword(password);
 }
 //get methods
 public String getFirstName(){
 return firstName;
 }
 public String getLastName(){
     return lastName;
 }
 public String getEmail(){
     return email;
 }
 public int getPassword(){
     return password;
 }

 // set methods
 public void setFirstName(String firstName){
 this.firstName =firstName;
 }
    public void setLastName(String lastName){
    this.lastName = lastName;
    }
    public void setEmail(String email){
      this.email = email;
    }
    public void setPassword(int password){
       this.password = password;
    }
}
