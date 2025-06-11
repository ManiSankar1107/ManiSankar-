import java.util.*;
public class Phone{
    public static void main(String[] args){
        HashMap<string,Long> map=new HashMap<>();
        map.put("Mani",234567890L);
        map.put("kesava",1234567L);
        map.put("teja",23456724L);
        map.put("azize",93921236L);
        map.put("charan",2364828L);
        map.put("mubarak",76854863L);
        map.put("rehmat",345668790L);
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter the requirements 1 for name,2 for number");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                  System.out.println("Enter  the name:");
                  String name=sc.next();
                  if(map.containsKey(name)){
                    System.out.println("The number of"+name+"is"+map.get(name));
                  }
                  else{
                    System.out.println("the number not found");
                  }
                  break; 
                case 2:
                System.out.println("enter the number:");
                long number=sc.nextLong();
                boolean found = false;
                for(Map.Entry<String,Long> entry :map.entrySet()) {
                    if(entry.getValue() == number) {
                        System.out.println("The name corresponding to the number " +number+"is " + entry.getKey());
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println("Number not found in the contact list.");
                }
                break;

        }

    }