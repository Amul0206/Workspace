// package Java.Day10;

// import java.text.DateFormat.Field;

// public class DemoReflections {
//    public static void main(String[] args) {
//         Student s = new Student();

//         Class<Student> c = (Class<Student>) s.getClass();
        
//         Field [] fields = c.getDeclaredFields();
//         for(Field field : fields){
//             System.out.println(field.getName());
//             System.out.println(field.getType());

//             if(field.getName().equals("rollno")){
//                 field.setAccesible(true);
//                 field.setInt(s,10);
//             }
//         }
//         System.out.println(s);
//         System.out.println("Constructor Info");
//         Constructor [] cons = c.getDeclaredConstructors();
//         for(Constructor con : cons){
//             sSystem.out.println(con.getParameterCount());
//             if(con.getParameterCount()==2)
//         }
//    }
   
    
// }
