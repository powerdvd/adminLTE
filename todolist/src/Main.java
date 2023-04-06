import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void layarkosong(){
        int i;
        for (i=1; i<=10; i++){
            System.out.println();
        }
    }

    public static void hasil(ArrayList todolist){
        int i;
        for (i=1; i<=todolist.size(); i++){
            System.out.println(i+ " " + todolist.get(i-1));
        }
    }
    public static void main(String[] args) throws IOException {


        /*System.out.println("Enter ASCII character or press 'q' to exit:");

        int input;
        do {
            input = System.in.read(); // membaca input sebagai byte
            char ch = (char) input; // mengonversi byte menjadi karakter ASCII
            System.out.println("ASCII code: " + input + " Character: " + ch);

        } while (input != 'q');*/

        int pilihan;
        ArrayList<String> todolist = new ArrayList<>();

        do {

            System.out.println("Todo List");
            System.out.println("\n1. Tambah");
            System.out.println("2. Ubah");
            System.out.println("3. Hapus");
            System.out.println("4. Keluar");
            System.out.print("\nPilihan : ");
            Scanner tb_pilihan = new Scanner(System.in);
            pilihan = tb_pilihan.nextInt();
            if (pilihan !=4){
                layarkosong();
                if (pilihan == 1){
                    System.out.println("Tulis daftar kegiatan kamu");
                    Scanner tb_todolist = new Scanner(System.in);

                    todolist.add(tb_todolist.nextLine());
                    hasil(todolist);
                }else if (pilihan ==2 ){
                    hasil(todolist);
                    System.out.print("\nPilih nomor yang akah di ubah");
                    Scanner tb_index = new Scanner(System.in);
                    int index = tb_index.nextInt();
                    System.out.println("Tuliskan aktifitas baru");
                    Scanner tb_new_todolist = new Scanner(System.in);
                    String new_todolist = tb_new_todolist.nextLine();
                    try {
                        todolist.set(index - 1, new_todolist);
                    }
                    catch(Exception e){
                        System.out.println("Nomor urut tidak ada");
                    }
                    hasil(todolist);
                }else if (pilihan ==3 ){
                    hasil(todolist);
                    System.out.print("\nPilih nomor yang akah dihapus ");
                    Scanner tb_index = new Scanner(System.in);
                    int index = tb_index.nextInt();
                    try {
                        todolist.remove(index - 1);
                    }
                    catch(Exception e){
                        System.out.println("Nomor urut tidak ada");
                    }
                    hasil(todolist);
                }
            }
        } while (pilihan != 4);
    }
}