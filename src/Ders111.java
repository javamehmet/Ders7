import java.util.Scanner;

public class Ders111 {


    public static String [][] liste=null; // global variable

    public static void ekle(String ...paramater)
    {

        if(liste==null)
        {
            liste= new String[1][6];
            liste[0]=paramater;
        }
        else{

            String geciciListe[][] = liste;
            liste = new String[geciciListe.length+1][6];

            for(int i=0;i<geciciListe.length;i++)
                liste[i]=geciciListe[i];

            liste[liste.length-1]=paramater;



        }



    }

    public static void sil(int no)
    {

        listele(liste);

        int index = aramaByNo(String.valueOf(no));

        if(index>=0) {
            String geciciListe[][] = liste;

            liste = new String[geciciListe.length - 1][6];

            int sayac = 0;
            for (int i = 0; i < geciciListe.length; i++) {
                if (i != index) {
                    liste[sayac] = geciciListe[i];
                    sayac++;
                }
            }
        }
        else
        {
            System.out.println("Liste boş veya no bulunamadı!");
        }


    }

    public static void guncelle(int no,String ...parameter)
    {

    }

    public static int aramaByNo(String no)
    {

        for(int i=0;i<liste.length;i++){
            if(liste[i][0].equals(no))
                return i;
        }

        return -1;
    }

    public static String [][] arama(String parametre)
    {

        return null;
    }

    public static void listele(String [][] parametreListe)
    {
        System.out.println("<-----Liste----->");

        for(String [] ss : parametreListe) {
            for (String s : ss)
                System.out.print(s + " ");
            System.out.println();
        }
    }

    public static void  siralama()
    {
        /*
        double [] dizi = new double[liste.length];

        for (int i=0;i<liste.length;i++)
                dizi[i] =Double.valueOf(liste[i][6]);


        for(int i=0;i<dizi.length;i++)
        {

            for(int j=i;j<dizi.length;j++)
            {
                if(dizi[i]>dizi[j])
                {
                    double gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }

            }
        }

        */

        for(int i=0;i<liste.length;i++)
        {

            for(int j=i;j<liste.length;j++)
            {

                if(Double.valueOf(liste[i][6])>Double.valueOf(liste[j][6]))
                {
                    String gecici [] = liste[i];
                    liste[i]=liste[j];
                    liste[j]=gecici;
                }

            }


        }

    }

    public static double ortalama(String vize,String finalNotu)
    {

        double v= Double.valueOf(vize);
        double f= Double.valueOf(finalNotu);
        return v*0.3+f*0.7;

    }

    public static double canHesapla()
    {

        return 0;

    }





    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        while(true)
        {

            System.out.println("İşlem : 1 Ekle, 2 Sil, 3 Güncelle, 4 Arama, 5 Ortalama, 6 Sonuç, 7 Sırala ");

            int secim=scanner.nextInt();

            if(secim==1)
            {
                String [] parametre = new String[6];
                System.out.println("No, Adı, Soyadı, Bölüm, Vize, Final :");
               // 1 Erdem Elibol Bilgisayar 10 20
                parametre[0]= scanner.next();
                parametre[1]= scanner.next();
                parametre[2]= scanner.next();
                parametre[3]= scanner.next();
                parametre[4]= scanner.next();
                parametre[5]= scanner.next();
                ekle(parametre);
            }
            else if(secim==2)
            {

                System.out.println("Silinecek No giriniz :");
                int no =scanner.nextInt();
                sil(no);

            }
            else if(secim==5)
            {

                String  geciciListe [][] =liste;

                liste=new String[geciciListe.length][7];

                int sayac=0;
                for (String  [] ss : geciciListe)
                {
                    double ortalama =ortalama(ss[4],ss[5]);

                    String [] satir=new String[7];
                    for(int i=0;i<ss.length;i++)
                    {
                        satir[i]=ss[i];
                    }
                    satir[6]=String.valueOf(ortalama);

                    liste[sayac]=satir;
                    sayac++;


                }



            }
            else if(secim==7)
            {
                siralama();


            }



            listele(liste);








        String kelime=" Java Developer ";

        kelime.length();
        kelime.charAt(0);








        }




    }


}
