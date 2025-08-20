import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class vc2m_generate_a_resp {
    static class ConsoleOutput {
        public static void print(String message) {
            System.out.print(message);
        }

        public static void println(String message) {
            System.out.println(message);
        }
    }

    static class Monitor {
        private String monitorName;

        public Monitor(String monitorName) {
            this.monitorName = monitorName;
        }

        public void startMonitoring() {
            ConsoleOutput.println("Monitoring " + monitorName + "...");
            while (true) {
                // Add your monitoring logic here
                ConsoleOutput.print("Status: ");
                // Simulate status update
                ConsoleOutput.println("Online");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleOutput.println("VC2M Responsive CLI Tool Monitor");
        ConsoleOutput.print("Enter monitor name: ");
        String monitorName = scanner.nextLine();
        Monitor monitor = new Monitor(monitorName);
        monitor.startMonitoring();
    }
}