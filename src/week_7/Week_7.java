
package week_7;

import java.util.Scanner;

public class Week_7{

   public static void main(String[] args) {
        //tipe data
        String nama1;
        int nim1;
        float IPK1;
        //Array Objekj
        memasukan[] data = new memasukan[10];
        memasukan[] copy = new memasukan[10];
        //Scanner
        Scanner A = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        int pil, pil2, index=1;
        
        while (true) {            
            data[index] = new memasukan();
            System.out.println("Tugas Tentang Class Object");
            System.out.println("----------------------------");
            System.out.println("1.Input Data");
            System.out.println("2.Tampil Data");
            System.out.println("3.sorting ");
            System.out.println("4.keuar");
            System.out.print("pilih : "); 
            pil = A.nextInt();
            switch(pil)
            {
                case 1 :
                    System.out.println("Data Ke-"+index);
                    System.out.print("Masukan Nama : ");
                    nama1 = x.nextLine();
                    data[index].setNama(nama1);
                    System.out.print("Masukan NIM  : ");
                    nim1 = A.nextInt();
                    data[index].setNim(nim1);
                    System.out.print("Masukan IPK  : ");
                    IPK1 = A.nextFloat();
                    data[index].setIpk(IPK1);
                    index++;
                    break;
                    
                case 2 :
                    for (int i = 1; i < index; i++) {
                        System.out.println("Data ke-"+i);
                        System.out.println("Nama : "+data[i].getNama());
                        System.out.println("NIM  : "+data[i].getNim());
                        System.out.println("Ipk  : "+data[i].getIpk()); 
                    }
                    break;
                case 3 :
                    
                   do{
                       for (int i = 1; i <=index; i++) {
                            copy[i]=data[i]; 
                       }
                    System.out.println("1.sorting by Name");
                    System.out.println("2.sorting by NIM");
                    System.out.println("3.sorting by Ipk");
                    System.out.println("4.kembali ke Awal");
                    System.out.print("pilihan : ");
                    pil2 = A.nextInt();
                    switch(pil2)
                    {
                        case 1 :
                             for (int i = 1; i < index; i++) {
                                for (int j = 1; j < index; j++) {
                                    memasukan elem = copy[j];
                                    int p = copy[j].getNama().compareTo(copy[j+1].getNama());
//                                     if(copy[j].getNim() > copy[j+1].getNim())
                                    if(p < 0)
                                    {
                                        copy[j] = copy[j+1];
                                        copy[j+1] = elem;
                                    }

                                }

                            }
                            for (int i = 1; i < index; i++) {
                                System.out.println("Data ke-"+i);
                                System.out.println("Nama : "+copy[i+1].getNama());
                                System.out.println("NIM  : "+copy[i+1].getNim());
                                System.out.println("Ipk  : "+copy[i+1].getIpk());
                                
                            }
                            
                            
                            break;
                        case 2 :
                            for (int i = 1; i < index; i++) {
                                for (int j = 1; j < index; j++) {
                                    memasukan elem = copy[j];
                                    if(copy[j].getNim() > copy[j+1].getNim())
                                    {
                                        copy[j] = copy[j+1];
                                        copy[j+1] = elem;
                                    }

                                }

                            }
                            for (int i = 1; i < index; i++) {
                                System.out.println("Data ke-"+i);
                                System.out.println("Nama : "+copy[i+1].getNama());
                                System.out.println("NIM  : "+copy[i+1].getNim());
                                System.out.println("Ipk  : "+copy[i+1].getIpk());
                                
                            }
                             
                            break;
                        case 3 :
                            for (int i = 1; i < index; i++) {
                                for (int j = 1; j < index; j++) {
                                    memasukan elem = copy[j];
                                    if(copy[j].getIpk() > copy[j+1].getIpk())
                                    {
                                        copy[j] = copy[j+1];
                                        copy[j+1] = elem;
                                    }

                                }

                            }
                            for (int i = 1; i < index; i++) {
                                System.out.println("Data ke-"+i);
                                System.out.println("Nama : "+copy[i+1].getNama());
                                System.out.println("NIM  : "+copy[i+1].getNim());
                                System.out.println("Ipk  : "+copy[i+1].getIpk());
                                
                            }
                       
                            break;    
                    }
                    } while(pil2!=4);
                  break;
                case 4 : System.exit(0);
            }
            
        }                   
    }
    
}
