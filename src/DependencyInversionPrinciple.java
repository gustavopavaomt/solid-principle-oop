public class DependencyInversionPrinciple {

    //Módulos de alto nível não devem depender de módulos de baixo nível.
    // Ambos devem depender de abstrações.

    interface MessageService {
        void sendMessage(String message);
    }

    class EmailService implements MessageService {
        public void sendMessage(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    class Notification {
        private MessageService messageService;

        public Notification(MessageService messageService) {
            this.messageService = messageService;
        }

        public void notifyUser(String message) {
            messageService.sendMessage(message);
        }
    }

    // Uso
    MessageService emailService = new EmailService();
    Notification notification = new Notification(emailService);
  //  notification.notifyUser("Hello, SOLID Principles!");

}
