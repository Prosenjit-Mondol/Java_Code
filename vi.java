/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Ha;

class ex{
    public ex() throws Exception {
        throw new Exception ("ex Constractor exception ");
    }
}
public class vi {
    public static void main(String[] args) {
        try{
            ex e=new ex();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
