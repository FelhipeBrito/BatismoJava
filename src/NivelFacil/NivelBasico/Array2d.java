package NivelFacil.NivelBasico;

public class Array2d {
    public static void main(String[] args) {
        String[][] array2d = new String[3][3];

        array2d[0][0] = "Konoha";
        array2d[0][1] = "naruto";
        array2d[0][2] = "sasuke";

        array2d[1][0] = "Névoa";
        array2d[1][1] = "Zabuza";
        array2d[1][2] = "outro";

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                System.out.println(array2d[0][0]);

            }
        }

    }
}
