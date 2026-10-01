public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            String url ="https://www.google.com/search?sca_esv=7a028c5b25de53dd&sxsrf=APpeQnu5XHWZRnGW3cAfgUZdLCOq4LcKkw:1790234772390&udm=2&fbs=ABfTbFUDadgeu2mn4mYJ8iEZ1GUDd8ABuXxNzQEi57SWOuuPdcURz3vM2j0dknRjZr5tESjRZlWxtHZPI_s9Tv5zfxnnqmeUogUhwx1VgK6zi3Q_A-F_X_mSHsIDSNPTH-XepJA5bTTxeyUIco1gG-PabUk2RbkTjzg_bcL7v8CVMGDe5LgMiL-AMODaErfPbXHJXZhCg0Yj&q=maeb&sa=X&ved=2ahUKEwi_u7Cd2IaXAxVAnP0HHeL5MtMQtKgLegQIGRAB#sv=CAMSXhoyKhBlLUVyWjVTU2Uxd0YtTkZNMg5Fclo1U1NlMXdGLU5GTToOZ1NtY2FLdTVrWmNtYk0gBCokCg5qOWpOLUZiZEx0YzdLTRIQZS1Fclo1U1NlMXdGLU5GTRgAMAEYByDtl5C6DUoIEAEYASABKAE";

            String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

            String rutaEdge = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
            ProcessBuilder chrome = new ProcessBuilder(rutaChrome, url);
            chrome.start();

            ProcessBuilder edge = new ProcessBuilder(rutaEdge,url);
            edge.start();

        } catch (Exception e) {
        }
    }
}
