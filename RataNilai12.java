import java.util.Scanner;
public class RataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1, j, nilaiMhs;
        float nilai, totalNilai, rataNilai;
        
        while (i <= 5) {
        System.out.println("Input nilai mahasiswa ke - " + i);
        totalNilai=0;
        for (j=1;j<=5;j++){
           
        System.out.print("Nilai ke- " + j + " = " );
        nilaiMhs = sc.nextInt();
        totalNilai += nilaiMhs;
        
        }
        rataNilai = totalNilai/5;
        System.out.println("rata rata nilai mahasiswa ke - " +i+ " adalah " + rataNilai);
        i++;
    }
    }
    
}
