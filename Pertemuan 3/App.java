import Controller.SiswaController;
import java.util.Scanner;
public class App {
    static Scanner input = new Scanner(System.in);
    static SiswaController siswaController = new SiswaController();
    public static void main(String[] args) throws Exception {
    siswaController.Singkron();
        int pil;
    do {
        
        System.out.println("+------------------------------+");
        System.out.println("|            MENU              |");
        System.out.println("+------------------------------+");
        System.out.println("| 1. Daftarkan Murid           |");
        System.out.println("| 2. Lihat Murid yang Terdaftar|");
        System.out.println("| 3. Update BIodata Murid      |");
        System.out.println("| 4. Hapus Data MUrid          |");
        System.out.println("| 5. exit                      |");
        System.out.println("--------------------------------");
        System.out.print("Masukan pilihan : ");
        pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1 ->{System.out.println("Create");
                    Create();}
            case 2 ->{System.out.println("Read");
                Read();}
            case 3 ->{System.out.println("Update");
                    Update();}
            case 4 ->{System.out.println("Delate");
                    Delete();}
        }
    } while (pil != 5);
    }

    static void Create(){
        System.out.print("Nim : ");
        String Nim = input.nextLine();
        System.out.print("Nama : ");
        String Nama = input.nextLine();
        System.out.print("Alamat : ");
        String Alamat = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        String TglLahir = input.nextLine();
        siswaController.Insert(Nim, Nama, Alamat, TglLahir);   
    }

    static void Read(){
        siswaController.Display();
    }

    static void Update(){
        System.out.print("Nim Siswa yang akan diedit: ");
        String Nim= input.nextLine();
        System.out.print("Nama: ");
        String Nama = input.nextLine();
        System.out.print("Alamat: ");
        String Alamat = input.nextLine();
        siswaController.Update(Nim, Nama, Alamat);
    }

    static void Delete(){
        System.out.print("Nim yang mau dihapus: ");
        String Nim = input.nextLine();
        siswaController.Delete(Nim);
    }
}
