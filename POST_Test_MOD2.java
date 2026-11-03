import javax.swing.JOptionPane;
public class POST_Test_MOD2 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Nama Lengkap :");
        String nim = JOptionPane.showInputDialog("NIM :");
        String prodi = JOptionPane.showInputDialog("Program Studi :");
        String fakultas = JOptionPane.showInputDialog("Fakultas :");

        JOptionPane.showMessageDialog(null,
            "-- HASIL INPUTAN --\n"
            + "Nama          : " + nama + "\n"
            + "NIM           : " + nim + "\n"
            + "Program Studi : " + prodi + "\n"
            + "Fakultas      : " + fakultas,
            "Kartu Tanda Mahasiswa",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
