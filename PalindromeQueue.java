import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class PalindromeQueue{

    public static void main(String[] args) {

    	System.out.print("Masukkan kata apapun : "); // input untuk memasukkan kata atau kalimat
        Scanner in=new Scanner(System.in); //instansi object class Scanner
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--) { // mengambil nilai kata string ketika dibalik
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) { // perulangan proses input kata atau kalimat untuk menentukan apakah palindrome atau tidak
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Adalah kata palindrom."); // tampilkan hasil output jika kata palindrome
        else
            System.out.println("Bukan kata palindrom."); // tampilkan hasil output jika kata tidak palindrome

    }
}

//Sefrian Arya Isnaida
//A11.2019.11692
//4403