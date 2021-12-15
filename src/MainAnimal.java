import Animals.Animal;
import init.Dog;
import init.Frog;
import init.Kitten;
import init.Tomcat;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal
{
   public static Scanner s;
    public static void main(String[] args) {
        int _NumBerAnimal = 0;
        int tb = 0;
        String Name = "",Age ="",Sex = "";
        Animal a = null;
        int kq,kq2;
        String chuoi,chuoi2,chuoi3;
        ArrayList<Animal> dogs = new ArrayList<>();
        ArrayList<Animal> Frogs = new ArrayList<>();
        ArrayList<Animal> TomCats = new ArrayList<>();
        ArrayList<Animal> Kittens = new ArrayList<>();
        do {
            System.out.println("Xin nhập số lượng con vật ");
            Scanner s = new Scanner(System.in);
            chuoi = s.nextLine();
            kq = isCheck(chuoi);
            if(kq == 0)
            {
                System.out.println("Xin vui lòng nhập lại ");
            }
            if(kq == 1)
            {
                _NumBerAnimal = Integer.parseInt(chuoi);
            }
        }while (kq == 0);
        for(int i = 0; i < _NumBerAnimal;i++) {
            s = new Scanner(System.in);

            System.out.println("\nCho con vật " +  String.valueOf(i));
            System.out.println("\n0 Con Chó \n1 Con Mèo \n2 Con Ếch");
            do {
                int c;
                s = new Scanner(System.in);
                chuoi2 = s.nextLine();
                kq = isCheck(chuoi2);
                if (kq == 0) {
                    System.out.println("\nXin vui lòng nhập lại");
                }
                if (kq == 1) {
                    c = Integer.parseInt(chuoi2);
                    switch (c) {
                        case 0:
                            System.out.println("\nXin nhập tên con vật thứ " + String.valueOf(i));
                            Name = s.nextLine();
                            int kqt = 0;
                            String _Age;
                            do {
                                System.out.println("\nXin nhập số tuổi con vật thứ " + String.valueOf(i));
                                _Age = s.nextLine();
                                kqt = isCheck(_Age);
                                if(kqt == 0)
                                {
                                    System.out.println("\nXin vui lòng nhập lại tuổi ");
                                }
                                if(kqt == 1)
                                {
                                    Age = _Age;
                                }
                            }while (kqt == 0);
                            System.out.println("\nXin nhập giới tinh");
                            Sex = s.nextLine();
                            a = new Dog(Name, Age, Sex);
                            dogs.add(a);
                            break;
                        case 1:
                            int chon;
                            System.out.println("\nVui lòng chọn con vật");
                            System.out.println("\n0 Kitten \n1 Tomcat");
                            do {
                                s = new Scanner(System.in);
                                chuoi3 = s.nextLine();
                                kq2 = isCheck(chuoi3);
                                if(kq2 == 0)
                                {
                                    System.out.println("\nXin vui lòng nhập lại");
                                }
                                if(kq2 == 1)
                                {
                                    chon = Integer.parseInt(chuoi3);
                                    switch (chon)
                                    {
                                        case 0:
                                            System.out.println("\nXin nhập tên con vật thứ " + String.valueOf(i));
                                            Name = s.nextLine();
                                            int kqt1 = 0;
                                            String _Age1;
                                            do {
                                                System.out.println("\nXin nhập số tuổi con vật thứ " + String.valueOf(i));
                                                _Age1 = s.nextLine();
                                                kqt1 = isCheck(_Age1);
                                                if(kqt1 == 0)
                                                {
                                                    System.out.println("\nXin vui lòng nhập lại tuổi ");
                                                }
                                                if(kqt1 == 1)
                                                {
                                                    Age = _Age1;
                                                }
                                            }while (kqt1 == 0);
                                            a = new Kitten(Name,Age);
                                            Kittens.add(a);
                                            break;
                                        case 1:
                                            System.out.println("\nXin nhập tên con vật thứ " + String.valueOf(i));
                                            Name = s.nextLine();
                                            int kqt2 = 0;
                                            String _Age2;
                                            do {
                                                System.out.println("\nXin nhập số tuổi con vật thứ " + String.valueOf(i));
                                                _Age2 = s.nextLine();
                                                kqt2 = isCheck(_Age2);
                                                if(kqt2 == 0)
                                                {
                                                    System.out.println("\nXin vui lòng nhập lại tuổi ");
                                                }
                                                if(kqt2 == 1)
                                                {
                                                    Age = _Age2;
                                                }
                                            }while (kqt2 == 0);
                                            a = new Tomcat(Name,Age);
                                            TomCats.add(a);
                                            break;
                                    }
                                }
                            }while (kq2 == 0);
                            break;
                        case 2:
                            System.out.println("\nXin nhập tên con vật thứ " + String.valueOf(i));
                            Name = s.nextLine();
                            int kqt3 = 0;
                            String _Age3;
                            do {
                                System.out.println("\nXin nhập số tuổi con vật thứ " + String.valueOf(i));
                                _Age3 = s.nextLine();
                                kqt = isCheck(_Age3);
                                if(kqt3 == 0)
                                {
                                    System.out.println("\nXin vui lòng nhập lại tuổi ");
                                }
                                if(kqt3 == 1)
                                {
                                    Age = _Age3;
                                }
                            }while (kqt3 == 0);
                            System.out.println("\nXin nhập giới tinh");
                            Sex = s.nextLine();
                            a = new Frog(Name,Age,Sex);
                            Frogs.add(a);
                            break;
                        case 3:

                            break;
                    }
                }
            } while (kq == 0);
        }
        if(dogs.size() != 0)
        {
            System.out.println("\nDanh sách Chó");
            for(int j = 0; j < dogs.size();j++)
            {
                System.out.println("\nSTT : " + String.valueOf(j));
                tb += Integer.parseInt(dogs.get(j).get_Age());
                dogs.get(j).output_array();
            }
            System.out.println("Trung bình tuổi các con vật: " +Sum(tb,dogs.size()));
        }
        if(Frogs.size() != 0)
        {
            System.out.println("\nDanh sách Ếch");
            for(int j = 0; j < dogs.size();j++)
            {
                System.out.println("\nSTT : " + String.valueOf(j));
                tb += Integer.parseInt(Frogs.get(j).get_Age());
                Frogs.get(j).output_array();
            }
            System.out.println("Trung bình tuổi các con vật: " +Sum(tb,Frogs.size()));
        }
        if(TomCats.size() != 0)
        {
            System.out.println("\nDanh sách Kitten");
            for(int j = 0; j < dogs.size();j++)
            {
                System.out.println("\nSTT : " + String.valueOf(j));
               tb += Integer.parseInt(TomCats.get(j).get_Age());
                TomCats.get(j).output_array();
            }
            System.out.println("Trung bình tuổi các con vật: " + Sum(tb,TomCats.size()));
        }
        if(Kittens.size() != 0)
        {
            System.out.println("\nDanh sách Kitten");
            for(int j = 0; j < dogs.size();j++)
            {
                System.out.println("\nSTT : " + String.valueOf(j));
                tb += Integer.parseInt(Kittens.get(j).get_Age());
                Kittens.get(j).output_array();
            }
            System.out.println("Trung bình tuổi các con vật: " + Sum(tb,Kittens.size()));
        }

    }
    static int Sum(int a,int b)
    {
        return a/b;
    }

    static int isCheck(String k)
    {
        String C = "1234567890";
        for(int i = 0;i < k.length();i++)
        {
            for(int j = 0;j < C.length();j++)
            {
                if(k.charAt(i) == C.charAt(j) )
                {
                    return 1;
                }
            }
        }
        return 0;
    }

}
